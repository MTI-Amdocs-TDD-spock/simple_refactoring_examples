package examples;

import shared_classes.User;

import java.util.List;

class DecomposeLoopBefore {

    void printProperties(List<User> users) {
        for (int i = 0; i < users.size(); i++) {
            String result = "";
            result += users.get(i).getName();
            result += users.get(i).getAge();
            System.out.println(result);

            // ...
        }
    }

}
