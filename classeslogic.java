class classeslogic
{
int Id;
String name;
String Course;
String classes;

classeslogic()
{
System.out.println("Default Contructor");
}

classeslogic(String f)
{
classes = f;
}

void Tell(int Id)
{
System.out.println(Id + " " + classes);
}

void Tell(String name, int Id)
{
System.out.println(name + " " + Id + " " + classes);
}

void Tell(String name, int Id, String Course)
{
System.out.println(name + " " + Id + " " + Course + " " + classes);
}
}
