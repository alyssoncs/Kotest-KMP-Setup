package io.github.kotlin.fibonacci

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import kotlin.test.assertEquals

class LinuxFibiTest : DescribeSpec({
    it("test 3rd element") {
        generateFibi().take(3).last() shouldBe 8
    }
})
