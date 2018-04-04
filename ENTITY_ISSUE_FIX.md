## Issue
Repository duplicate mapping for column
Remove "add insert = false and update = false" errors

## Reason
There were unnecessary mappings in Entity file (When mapping ManyToOne)

## How to fix
1. Close intelij idea
1. Delete .idea folder and data-jpa.iml
1. Reimport maven project (File -> open)
1. Delete Entity classes (Discard warnings when deleting)
1. Go to File -> ProjectStructure
1. Add "JPA" module (use plus icon)
1. Select JPA and set "Default JPA Provider" to "Hibernate"
1. Go to View -> Tool Windows -> Persistence
1. Generate persistence mapping by database schema
>Note: Deselect "Add to Persistence Unit"
1. Fix remaining compiling issues (build project)
1. Run

## Issue in refactoring Log classes
1. When the LogEntity classes are refactored to Log, entitybeanfactory exception coming up. Reason for that is not yet found
