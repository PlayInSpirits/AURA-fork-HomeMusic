.class public final Ldefpackage/tf3;
.super Ldefpackage/l2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic n:I

.field public final o:Ldefpackage/nf3;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/nf3;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/tf3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/tf3;->o:Ldefpackage/nf3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/tf3;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/tf3;->o:Ldefpackage/nf3;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget p0, p0, Ldefpackage/nf3;->o:I

    .line 12
    .line 13
    return p0

    .line 14
    :pswitch_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget p0, p0, Ldefpackage/nf3;->o:I

    .line 18
    .line 19
    return p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/tf3;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/tf3;->o:Ldefpackage/nf3;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ldefpackage/nf3;->containsKey(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p0, v0}, Ldefpackage/nf3;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0, p1}, Ldefpackage/nf3;->containsKey(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_2

    .line 55
    .line 56
    const/4 v1, 0x1

    .line 57
    :cond_2
    :goto_0
    return v1

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 6

    .line 1
    iget v0, p0, Ldefpackage/tf3;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldefpackage/uf3;

    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/tf3;->o:Ldefpackage/nf3;

    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/nf3;->n:Ldefpackage/xx4;

    .line 11
    .line 12
    const/16 v1, 0x8

    .line 13
    .line 14
    new-array v2, v1, [Ldefpackage/yx4;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_0
    if-ge v3, v1, :cond_0

    .line 18
    .line 19
    new-instance v4, Ldefpackage/zx4;

    .line 20
    .line 21
    const/4 v5, 0x1

    .line 22
    invoke-direct {v4, v5}, Ldefpackage/zx4;-><init>(I)V

    .line 23
    .line 24
    .line 25
    aput-object v4, v2, v3

    .line 26
    .line 27
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-direct {v0, p0, v2}, Ldefpackage/of3;-><init>(Ldefpackage/xx4;[Ldefpackage/yx4;)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_0
    new-instance v0, Ldefpackage/uf3;

    .line 35
    .line 36
    iget-object p0, p0, Ldefpackage/tf3;->o:Ldefpackage/nf3;

    .line 37
    .line 38
    iget-object p0, p0, Ldefpackage/nf3;->n:Ldefpackage/xx4;

    .line 39
    .line 40
    const/16 v1, 0x8

    .line 41
    .line 42
    new-array v2, v1, [Ldefpackage/yx4;

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    :goto_1
    if-ge v3, v1, :cond_1

    .line 46
    .line 47
    new-instance v4, Ldefpackage/zx4;

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    invoke-direct {v4, v5}, Ldefpackage/zx4;-><init>(I)V

    .line 51
    .line 52
    .line 53
    aput-object v4, v2, v3

    .line 54
    .line 55
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-direct {v0, p0, v2}, Ldefpackage/of3;-><init>(Ldefpackage/xx4;[Ldefpackage/yx4;)V

    .line 59
    .line 60
    .line 61
    return-object v0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
