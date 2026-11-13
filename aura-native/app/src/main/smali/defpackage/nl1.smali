.class public final Ldefpackage/nl1;
.super Ldefpackage/q1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final transient t:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-static {v0}, Ldefpackage/p60;->b(I)Ldefpackage/p60;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, v0}, Ldefpackage/q1;-><init>(Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    iput v0, p0, Ldefpackage/nl1;->t:I

    .line 12
    .line 13
    iput v0, p0, Ldefpackage/nl1;->t:I

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-super {p0}, Ldefpackage/u1;->a()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/util/Set;

    .line 6
    .line 7
    return-object p0
.end method

.method public final get(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ldefpackage/q1;->get(Ljava/lang/Object;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/util/Set;

    .line 6
    .line 7
    return-object p0
.end method

.method public final i()Ljava/util/Collection;
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/nl1;->t:I

    .line 2
    .line 3
    invoke-static {p0}, Ldefpackage/r60;->a(I)Ldefpackage/r60;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final k(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/p1;

    .line 2
    .line 3
    check-cast p2, Ljava/util/Set;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Ldefpackage/p1;-><init>(Ldefpackage/nl1;Ljava/lang/Object;Ljava/util/Set;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final l(Ljava/lang/Object;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ldefpackage/q1;->get(Ljava/lang/Object;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/util/Set;

    .line 6
    .line 7
    return-object p0
.end method
