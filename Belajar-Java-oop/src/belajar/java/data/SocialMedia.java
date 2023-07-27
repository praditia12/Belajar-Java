package belajar.java.data;

class SocialMedia {
}

final class Instagram extends SocialMedia {
    final void login (String username, String password){   // final method diperuntukan agar method tidak di Override di class turunan

    }

}

// class FakeInstagram extends Instagram {
//    @Override
//    void login(String username, String password) {
//        super.login(username, password);
//    }
// }  ERROR karena final class sudah tidak bisa diwariskan lagi