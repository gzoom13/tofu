package tofu

import cats.effect.std.Env

package object systemenv {

  implicit def systemEnvForCe3Env[F[_]](implicit env: Env[F]): SystemEnv[F] =
    new SystemEnvForCe3Env(env)
}
