package io.github.kotlin.fibonacci

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class AndroidFibiTest : DescribeSpec({
    it("test 3rd element") {
        generateFibi().take(3).last() shouldBe 3
    }
})
