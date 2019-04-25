package com.atlassian.interviews.uag.memory;

import com.atlassian.interviews.uag.api.Group;
import com.atlassian.interviews.uag.api.GroupService;
import com.atlassian.interviews.uag.api.MembershipService;
import com.atlassian.interviews.uag.api.User;
import com.atlassian.interviews.uag.api.UserService;
import com.atlassian.interviews.uag.core.ServiceFactory;
import com.atlassian.interviews.uag.core.Services;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Collections;

public class MemoryGroupServiceTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    private GroupService groupService;
    private MembershipService membershipService;
    private UserService userService;

    @Before
    public void setUp() {
        final Services services = ServiceFactory.createServices();
        groupService = services.getGroupService();
        userService = services.getUserService();
        membershipService = services.getMembershipService();
    }

    @Test
    public void testCreateGroup_duplicate() {
        final Group hackers = new Group("hackers");
        groupService.create(hackers);

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Group hackers already exists");
        groupService.create(hackers);
    }


    @Test
    public void testCreateGroup_npe() {
        thrown.expect(NullPointerException.class);
        groupService.create(null);
    }

    @Test
    public void testCreateGroup_ok() {
        assertNull("hackers should not exist yet", groupService.findByName("hackers"));
        Services services;
        final Group hackers = new Group("hackers");
        groupService.create(hackers);

        assertEquals("hackers should exist now", hackers, groupService.findByName("hackers"));
    }


    @Test
    public void testCreateOldGroup_userExists() {

        final Group hackers = new Group("hackers");
        groupService.create(hackers);
        final User fred = new User("fred");
        final User bred = new User("bred");
        userService.create(fred);
        userService.create(bred);
        membershipService.addUserToGroup(fred, hackers);
        membershipService.addUserToGroup(bred, hackers);

        groupService.delete(hackers);

        groupService.create(hackers);
        assertEquals("User stays in group even after group Creation", Collections.emptySet(), (membershipService.getUsersInGroup(hackers)));

    }

    @Test
    public void testDeleteGroup_notExists() {
        assertNull("hackers should not exist yet", groupService.findByName("hackers"));

        final Group hackers = new Group("hackers");
        groupService.delete(hackers);

        assertNull("hackers still should not exist", groupService.findByName("hackers"));
    }

    @Test
    public void testDeleteGroup_npe() {
        thrown.expect(NullPointerException.class);
        groupService.delete(null);
    }

    @Test
    public void testDeleteGroup_ok() {
        final Group hackers = new Group("hackers");

        groupService.create(hackers);
        assertEquals("hackers should exist", hackers, groupService.findByName("hackers"));

        groupService.delete(hackers);
        assertNull("hackers should be deleted", groupService.findByName("hackers"));
    }
}
