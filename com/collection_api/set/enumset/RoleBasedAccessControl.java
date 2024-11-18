package com.collection_api.set.enumset;

import java.util.EnumSet;

public class RoleBasedAccessControl {

    enum Role {
        ADMIN, MODERATOR, USER, GUEST
    }

    // EnumSet to store roles that have access to a specific resource
    private final EnumSet<Role> accessRoles = EnumSet.noneOf(Role.class);

    public static void main(String[] args) {
        RoleBasedAccessControl accessControl = new RoleBasedAccessControl();

        // Grant access to roles
        accessControl.grantAccess(Role.ADMIN);
        accessControl.grantAccess(Role.MODERATOR);

        // Check access for different roles
        accessControl.checkAccess(Role.ADMIN);
        accessControl.checkAccess(Role.USER);
        accessControl.checkAccess(Role.MODERATOR);
        accessControl.checkAccess(Role.GUEST);

        // Revoke access for a role
        accessControl.revokeAccess(Role.MODERATOR);
        accessControl.checkAccess(Role.MODERATOR);
    }

    // Method to grant access to a role
    public void grantAccess(Role role) {
        accessRoles.add(role);
        System.out.println("Access granted to: " + role);
    }

    // Method to revoke access from a role
    public void revokeAccess(Role role) {
        accessRoles.remove(role);
        System.out.println("Access revoked from: " + role);
    }

    // Method to check if a role has access to the resource
    public void checkAccess(Role role) {
        String message = accessRoles.contains(role) ? "has access" : "does not have access";
        System.out.println("Role " + role + " " + message + " to the resource.");
    }

    // Optional: Method to print all roles with access
    public void printAccessRoles() {
        System.out.println("Roles with access: " + accessRoles);
    }
}
