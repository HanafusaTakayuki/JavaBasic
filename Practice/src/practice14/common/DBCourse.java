package practice14.common;

public class DBCourse implements Course{

	@Override
	public String getCourseName() {
		return PREFIX + "DB基礎";
	}

	@Override
	public String[] getCourseUnit() {
		String[] courseUnit = {
			"DB基礎",
			"SQL基礎",
			"正規化",
			"SQL応用"
		};
		return courseUnit;
	}
}
