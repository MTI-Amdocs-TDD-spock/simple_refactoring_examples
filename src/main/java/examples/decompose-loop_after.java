package examples;

import java.util.List;
import shared_classes.User;

class DecomposeLoopAfter{
    void printProperties(List<User> users) {
        for (User user : users) {
            System.out.println(getProperties(user));

            // ...
        }
    }

    String getProperties(User user)  {
        return user.getName() + " " + user.getAge();
    }
}

