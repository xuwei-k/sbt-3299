val foo = taskKey[Unit]("")
val bar = settingKey[Int]("")

bar := 1
foo := {
  List(42).map { x =>
    if (true) bar.value
  }
}
