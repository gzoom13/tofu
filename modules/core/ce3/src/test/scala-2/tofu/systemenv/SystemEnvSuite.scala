package tofu.systemenv

import cats.effect.IO
import cats.effect.std.Env
import cats.effect.unsafe.IORuntime
import org.scalatest.OptionValues
import org.scalatest.funsuite.AnyFunSuite

class SystemEnvSuite extends AnyFunSuite with OptionValues {

  implicit val iort = IORuntime.global

  test("check SystemEnv returns environment variable") {
    implicit def env: Env[IO] = Env.make
    implicit def tofuEnv: SystemEnv[IO] = implicitly
    assert(tofuEnv.get("TEST_ENV").unsafeRunSync().value == "EXPECTED_VALUE")
  }

}
