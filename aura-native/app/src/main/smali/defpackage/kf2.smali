.class public final synthetic Ldefpackage/kf2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/qc2;
.implements Ldefpackage/eg1;
.implements Ldefpackage/px;
.implements Ldefpackage/ez;
.implements Ldefpackage/ks0;


# static fields
.field public static final o:Ldefpackage/kf2;

.field public static final p:Ldefpackage/kf2;


# instance fields
.field public final synthetic n:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/kf2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldefpackage/kf2;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldefpackage/kf2;->o:Ldefpackage/kf2;

    .line 8
    .line 9
    new-instance v0, Ldefpackage/kf2;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Ldefpackage/kf2;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Ldefpackage/kf2;->p:Ldefpackage/kf2;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/kf2;->n:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic c()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public static synthetic e(Ljava/lang/Object;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    throw v0
.end method

.method public static synthetic f(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/gson/JsonIOException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw v0
.end method

.method public static synthetic g(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public static synthetic h(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public static synthetic i(Ljava/lang/String;II)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1
.end method

.method public static synthetic j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0
.end method

.method public static synthetic k()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ClassCastException;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public static synthetic l(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1
.end method

.method public static synthetic m(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public static synthetic n(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public static synthetic o(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    throw v0
.end method


# virtual methods
.method public a(ZZLjava/lang/String;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Ldefpackage/jk2;->e(ZZLjava/lang/String;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget p0, p0, Ldefpackage/kf2;->n:I

    .line 2
    .line 3
    sparse-switch p0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ldefpackage/lg0;

    .line 7
    .line 8
    iget-wide p0, p1, Ldefpackage/lg0;->b:J

    .line 9
    .line 10
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    cmp-long v0, p0, v0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const-wide/16 p0, 0x0

    .line 20
    .line 21
    :cond_0
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :sswitch_0
    check-cast p1, Ldefpackage/ig0;

    .line 27
    .line 28
    iget p0, p1, Ldefpackage/ig0;->r:I

    .line 29
    .line 30
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :sswitch_1
    check-cast p1, Ldefpackage/k51;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x1a -> :sswitch_0
    .end sparse-switch
.end method

.method public b(D)D
    .locals 10

    .line 1
    iget p0, p0, Ldefpackage/kf2;->n:I

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    const-wide v2, 0x3fb3d0722149b580L    # 0.07739938080495357

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    const-wide v4, 0x3faab1232f514a03L    # 0.05213270142180095

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    const-wide v6, 0x3fee54edcd0aeb60L    # 0.9478672985781991

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    packed-switch p0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    sget-object p0, Ldefpackage/s50;->a:[F

    .line 24
    .line 25
    sget-object p0, Ldefpackage/s50;->d:Ldefpackage/sw4;

    .line 26
    .line 27
    invoke-static {p0, p1, p2}, Ldefpackage/s50;->c(Ldefpackage/sw4;D)D

    .line 28
    .line 29
    .line 30
    move-result-wide p0

    .line 31
    return-wide p0

    .line 32
    :pswitch_0
    sget-object p0, Ldefpackage/s50;->a:[F

    .line 33
    .line 34
    sget-object p0, Ldefpackage/s50;->d:Ldefpackage/sw4;

    .line 35
    .line 36
    invoke-static {p0, p1, p2}, Ldefpackage/s50;->d(Ldefpackage/sw4;D)D

    .line 37
    .line 38
    .line 39
    move-result-wide p0

    .line 40
    return-wide p0

    .line 41
    :pswitch_1
    sget-object p0, Ldefpackage/s50;->a:[F

    .line 42
    .line 43
    sget-object p0, Ldefpackage/s50;->c:Ldefpackage/sw4;

    .line 44
    .line 45
    invoke-static {p0, p1, p2}, Ldefpackage/s50;->a(Ldefpackage/sw4;D)D

    .line 46
    .line 47
    .line 48
    move-result-wide p0

    .line 49
    return-wide p0

    .line 50
    :pswitch_2
    sget-object p0, Ldefpackage/s50;->a:[F

    .line 51
    .line 52
    sget-object p0, Ldefpackage/s50;->c:Ldefpackage/sw4;

    .line 53
    .line 54
    invoke-static {p0, p1, p2}, Ldefpackage/s50;->b(Ldefpackage/sw4;D)D

    .line 55
    .line 56
    .line 57
    move-result-wide p0

    .line 58
    return-wide p0

    .line 59
    :pswitch_3
    cmpg-double p0, p1, v0

    .line 60
    .line 61
    if-gez p0, :cond_0

    .line 62
    .line 63
    neg-double v0, p1

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    move-wide v0, p1

    .line 66
    :goto_0
    const-wide v8, 0x3fa4b5dcc63f1412L    # 0.04045

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    cmpl-double p0, v0, v8

    .line 72
    .line 73
    if-ltz p0, :cond_1

    .line 74
    .line 75
    mul-double/2addr v6, v0

    .line 76
    add-double/2addr v6, v4

    .line 77
    const-wide v0, 0x4003333333333333L    # 2.4

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 83
    .line 84
    .line 85
    move-result-wide v0

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    mul-double/2addr v0, v2

    .line 88
    :goto_1
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->copySign(DD)D

    .line 89
    .line 90
    .line 91
    move-result-wide p0

    .line 92
    return-wide p0

    .line 93
    :pswitch_4
    cmpg-double p0, p1, v0

    .line 94
    .line 95
    if-gez p0, :cond_2

    .line 96
    .line 97
    neg-double v0, p1

    .line 98
    goto :goto_2

    .line 99
    :cond_2
    move-wide v0, p1

    .line 100
    :goto_2
    const-wide v8, 0x3f69a5c61c57a063L    # 0.0031308049535603718

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    cmpl-double p0, v0, v8

    .line 106
    .line 107
    if-ltz p0, :cond_3

    .line 108
    .line 109
    const-wide v2, 0x3fdaaaaaaaaaaaabL    # 0.4166666666666667

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 115
    .line 116
    .line 117
    move-result-wide v0

    .line 118
    sub-double/2addr v0, v4

    .line 119
    div-double/2addr v0, v6

    .line 120
    goto :goto_3

    .line 121
    :cond_3
    div-double/2addr v0, v2

    .line 122
    :goto_3
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->copySign(DD)D

    .line 123
    .line 124
    .line 125
    move-result-wide p0

    .line 126
    return-wide p0

    .line 127
    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public cancel()V
    .locals 0

    .line 1
    return-void
.end method

.method public d(Ldefpackage/ii0;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p1, Ldefpackage/ii0;->h:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-object p0, p1, Ldefpackage/ii0;->a:Landroid/net/Uri;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 12

    .line 1
    iget p0, p0, Ldefpackage/kf2;->n:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ldefpackage/oj0;

    .line 7
    .line 8
    iget-object p0, p1, Ldefpackage/oj0;->a:Ldefpackage/tj0;

    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/tj0;->n:Ldefpackage/rm;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-interface {p0}, Ldefpackage/rm;->s()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :pswitch_0
    check-cast p1, Ldefpackage/pj0;

    .line 19
    .line 20
    iget-object p0, p1, Ldefpackage/pj0;->b:Ldefpackage/tj0;

    .line 21
    .line 22
    iget-object v0, p0, Ldefpackage/tj0;->j:Ldefpackage/pj0;

    .line 23
    .line 24
    if-eq p1, v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p1, 0x1

    .line 28
    iput-boolean p1, p0, Ldefpackage/tj0;->N:Z

    .line 29
    .line 30
    :goto_0
    return-void

    .line 31
    :pswitch_1
    check-cast p1, Ldefpackage/pj0;

    .line 32
    .line 33
    iget-object p0, p1, Ldefpackage/pj0;->b:Ldefpackage/tj0;

    .line 34
    .line 35
    iget-object v0, p0, Ldefpackage/tj0;->j:Ldefpackage/pj0;

    .line 36
    .line 37
    if-eq p1, v0, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    iget-object p1, p0, Ldefpackage/tj0;->n:Ldefpackage/rm;

    .line 41
    .line 42
    if-eqz p1, :cond_3

    .line 43
    .line 44
    iget-boolean p0, p0, Ldefpackage/tj0;->O:Z

    .line 45
    .line 46
    if-eqz p0, :cond_3

    .line 47
    .line 48
    invoke-interface {p1}, Ldefpackage/rm;->x()V

    .line 49
    .line 50
    .line 51
    :cond_3
    :goto_1
    return-void

    .line 52
    :pswitch_2
    check-cast p1, Ldefpackage/pj0;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    sget-object p0, Ldefpackage/tj0;->c0:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndDecrement()I

    .line 60
    .line 61
    .line 62
    iget-object p0, p1, Ldefpackage/pj0;->b:Ldefpackage/tj0;

    .line 63
    .line 64
    iget-object p0, p0, Ldefpackage/tj0;->n:Ldefpackage/rm;

    .line 65
    .line 66
    if-eqz p0, :cond_4

    .line 67
    .line 68
    new-instance v0, Ldefpackage/pa;

    .line 69
    .line 70
    iget-object p1, p1, Ldefpackage/pj0;->a:Ldefpackage/em;

    .line 71
    .line 72
    iget p1, p1, Ldefpackage/em;->a:I

    .line 73
    .line 74
    const/16 p1, 0xf

    .line 75
    .line 76
    invoke-direct {v0, p1}, Ldefpackage/pa;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {p0, v0}, Ldefpackage/rm;->f(Ldefpackage/pa;)V

    .line 80
    .line 81
    .line 82
    :cond_4
    return-void

    .line 83
    :pswitch_3
    check-cast p1, Ldefpackage/pj0;

    .line 84
    .line 85
    iget-object p0, p1, Ldefpackage/pj0;->b:Ldefpackage/tj0;

    .line 86
    .line 87
    iget-object v0, p0, Ldefpackage/tj0;->j:Ldefpackage/pj0;

    .line 88
    .line 89
    if-eq p1, v0, :cond_5

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_5
    iget-object p1, p0, Ldefpackage/tj0;->n:Ldefpackage/rm;

    .line 93
    .line 94
    if-eqz p1, :cond_7

    .line 95
    .line 96
    iget-object p1, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 97
    .line 98
    iget v0, p1, Ldefpackage/qj0;->b:I

    .line 99
    .line 100
    const/4 v1, -0x1

    .line 101
    if-eq v0, v1, :cond_6

    .line 102
    .line 103
    iget-object p1, p1, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p1, Ldefpackage/em;

    .line 106
    .line 107
    iget p1, p1, Ldefpackage/em;->f:I

    .line 108
    .line 109
    div-int/2addr p1, v0

    .line 110
    int-to-long v0, p1

    .line 111
    iget-object p1, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    iget-object p1, p1, Ldefpackage/an;->a:Landroid/media/AudioTrack;

    .line 117
    .line 118
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getSampleRate()I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    invoke-static {p1, v0, v1}, Ldefpackage/f35;->Y(IJ)J

    .line 123
    .line 124
    .line 125
    move-result-wide v0

    .line 126
    goto :goto_2

    .line 127
    :cond_6
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    :goto_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 133
    .line 134
    .line 135
    move-result-wide v2

    .line 136
    iget-wide v4, p0, Ldefpackage/tj0;->W:J

    .line 137
    .line 138
    sub-long v10, v2, v4

    .line 139
    .line 140
    iget-object v6, p0, Ldefpackage/tj0;->n:Ldefpackage/rm;

    .line 141
    .line 142
    iget-object p0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 143
    .line 144
    iget-object p0, p0, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p0, Ldefpackage/em;

    .line 147
    .line 148
    iget v7, p0, Ldefpackage/em;->f:I

    .line 149
    .line 150
    invoke-static {v0, v1}, Ldefpackage/f35;->i0(J)J

    .line 151
    .line 152
    .line 153
    move-result-wide v8

    .line 154
    invoke-interface/range {v6 .. v11}, Ldefpackage/rm;->q(IJJ)V

    .line 155
    .line 156
    .line 157
    :cond_7
    :goto_3
    return-void

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
