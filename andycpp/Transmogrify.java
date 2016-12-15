package andycpp;

abstract class Actor {
	public abstract void act();
}

class HappyActor extends Actor {
	public void act() {
		System.out.println("HappyActor");
	}
}

class SadActor extends Actor {
	public void act() {
		System.out.println("SadActor");
	}
}

class Stage {
	public Actor act = new HappyActor();
	public void change() {
		act = new SadActor();
	}
	public void performPlay() {
		act.act();
	}
}

public class Transmogrify {
	public static void main(String[] args) {
		Stage s = new Stage();
		s.performPlay();
		System.out.println("3333");
		s.change();
		System.out.println("2222222");
		s.performPlay();
	}
}
