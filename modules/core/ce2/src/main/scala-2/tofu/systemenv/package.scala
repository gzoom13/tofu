package tofu

import cats.effect.Sync

package object systemenv {

  implicit def systemEnvForCe2[F[_]: Sync]: SystemEnv[F] =
    new SystemEnvForCe2(Sync[F])
}
