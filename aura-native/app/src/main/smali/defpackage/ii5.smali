.class public final Ldefpackage/ii5;
.super Ldefpackage/gi5;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic q:Ldefpackage/ji5;


# direct methods
.method public constructor <init>(Ldefpackage/ji5;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/ii5;->q:Ldefpackage/ji5;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Ljava/util/Map$Entry;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Ljava/util/Map$Entry;

    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/ii5;->q:Ldefpackage/ji5;

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, v0}, Ldefpackage/ji5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :cond_0
    return v1
.end method

.method public final e()Ldefpackage/o15;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/gi5;->i()Ldefpackage/ei5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Ldefpackage/ei5;->k(I)Ldefpackage/xh5;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ii5;->q:Ldefpackage/ji5;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/fi5;->a()Ldefpackage/gi5;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Ldefpackage/gh0;->M(Ldefpackage/gi5;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/gi5;->i()Ldefpackage/ei5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Ldefpackage/ei5;->k(I)Ldefpackage/xh5;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final j()Ldefpackage/ei5;
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/hi5;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ldefpackage/hi5;-><init>(Ldefpackage/ii5;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ii5;->q:Ldefpackage/ji5;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/ji5;->q:Ldefpackage/ei5;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method
