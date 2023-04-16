package tofu.systemenv

import cats.effect.IO
import org.scalatest.OptionValues
import org.scalatest.funsuite.AnyFunSuite

class SystemEnvSuite extends AnyFunSuite with OptionValues {

  test("check SystemEnv returns environment variable") {
    def tofuEnv: SystemEnv[IO] = implicitly
    assert(tofuEnv.get("TEST_ENV").unsafeRunSync().value == "EXPECTED_VALUE")
  }

}
