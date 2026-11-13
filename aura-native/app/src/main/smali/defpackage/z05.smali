.class public final Ldefpackage/z05;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/aw1;
.implements Ldefpackage/g84;


# instance fields
.field public final synthetic n:I

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    iput p1, p0, Ldefpackage/z05;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ldefpackage/xi4;

    .line 10
    .line 11
    const/16 v0, 0xf

    .line 12
    .line 13
    invoke-direct {p1, v0}, Ldefpackage/xi4;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Ldefpackage/z05;->q:Ljava/lang/Object;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 23
    .line 24
    sget-object v0, Ldefpackage/l93;->c:Ldefpackage/kt4;

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Ldefpackage/z05;->o:Ljava/lang/Object;

    .line 30
    .line 31
    new-instance p1, Ljava/lang/Object;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Ldefpackage/i11;Ldefpackage/cf4;Ldefpackage/m11;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Ldefpackage/z05;->n:I

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/z05;->q:Ljava/lang/Object;

    .line 66
    iput-object p2, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 67
    iput-object p3, p0, Ldefpackage/z05;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/im2;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Ldefpackage/z05;->n:I

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p1, p0, Ldefpackage/z05;->q:Ljava/lang/Object;

    .line 70
    new-instance p1, Ldefpackage/dj2;

    invoke-direct {p1, p0}, Ldefpackage/dj2;-><init>(Ldefpackage/z05;)V

    iput-object p1, p0, Ldefpackage/z05;->o:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 39
    iput p4, p0, Ldefpackage/z05;->n:I

    iput-object p1, p0, Ldefpackage/z05;->o:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    iput-object p3, p0, Ldefpackage/z05;->q:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/16 v0, 0x8

    iput v0, p0, Ldefpackage/z05;->n:I

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ldefpackage/sb1;

    invoke-direct {v0}, Ldefpackage/sb1;-><init>()V

    .line 42
    const-string v1, "video/mp2t"

    invoke-static {v1}, Ldefpackage/lw2;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ldefpackage/sb1;->l:Ljava/lang/String;

    .line 43
    invoke-static {p1}, Ldefpackage/lw2;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Ldefpackage/sb1;->m:Ljava/lang/String;

    .line 44
    new-instance p1, Ldefpackage/tb1;

    invoke-direct {p1, v0}, Ldefpackage/tb1;-><init>(Ldefpackage/sb1;)V

    .line 45
    iput-object p1, p0, Ldefpackage/z05;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/GenericDeclaration;Ljava/lang/String;[Ljava/lang/reflect/Type;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ldefpackage/z05;->n:I

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    const-string v0, "bound for type variable"

    invoke-static {p3, v0}, Ldefpackage/b15;->b([Ljava/lang/reflect/Type;Ljava/lang/String;)V

    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    iput-object p1, p0, Ldefpackage/z05;->o:Ljava/lang/Object;

    .line 62
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    iput-object p2, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 64
    invoke-static {p3}, Ldefpackage/yw1;->l([Ljava/lang/Object;)Ldefpackage/gy3;

    move-result-object p1

    iput-object p1, p0, Ldefpackage/z05;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/kx;Ljava/util/concurrent/Executor;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Ldefpackage/z05;->n:I

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Ldefpackage/z05;->o:Ljava/lang/Object;

    .line 50
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    iput-object p2, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 52
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Ldefpackage/z05;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/n05;Ldefpackage/z05;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Ldefpackage/z05;->n:I

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Ldefpackage/z05;->o:Ljava/lang/Object;

    .line 55
    iput-object p2, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 56
    iget-object p1, p1, Ldefpackage/n05;->n:Ljava/lang/Object;

    .line 57
    iput-object p1, p0, Ldefpackage/z05;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/n51;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ldefpackage/z05;->n:I

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Ldefpackage/z05;->o:Ljava/lang/Object;

    return-void
.end method

.method public static e(Ljava/lang/Class;Ldefpackage/kx;)Ldefpackage/z84;
    .locals 1

    .line 1
    :try_start_0
    const-class v0, Ldefpackage/kx;

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ldefpackage/z84;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    const-string p1, "Downloader factory missing"

    .line 24
    .line 25
    invoke-static {p1, p0}, Ldefpackage/mj0;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method


# virtual methods
.method public a(Ldefpackage/be3;)V
    .locals 13

    .line 1
    iget-object v0, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/iu4;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v0, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v1, v0

    .line 13
    check-cast v1, Ldefpackage/iu4;

    .line 14
    .line 15
    monitor-enter v1

    .line 16
    :try_start_0
    iget-wide v2, v1, Ldefpackage/iu4;->c:J

    .line 17
    .line 18
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long v0, v2, v4

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-wide v6, v1, Ldefpackage/iu4;->b:J

    .line 28
    .line 29
    add-long/2addr v2, v6

    .line 30
    :goto_0
    move-wide v7, v2

    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    move-object p0, v0

    .line 34
    goto :goto_3

    .line 35
    :cond_0
    invoke-virtual {v1}, Ldefpackage/iu4;->d()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    goto :goto_0

    .line 40
    :goto_1
    monitor-exit v1

    .line 41
    iget-object v0, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v2, v0

    .line 44
    check-cast v2, Ldefpackage/iu4;

    .line 45
    .line 46
    monitor-enter v2

    .line 47
    :try_start_1
    iget-wide v0, v2, Ldefpackage/iu4;->b:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    .line 49
    monitor-exit v2

    .line 50
    cmp-long v2, v7, v4

    .line 51
    .line 52
    if-eqz v2, :cond_3

    .line 53
    .line 54
    cmp-long v2, v0, v4

    .line 55
    .line 56
    if-nez v2, :cond_1

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_1
    iget-object v2, p0, Ldefpackage/z05;->o:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Ldefpackage/tb1;

    .line 62
    .line 63
    iget-wide v3, v2, Ldefpackage/tb1;->s:J

    .line 64
    .line 65
    cmp-long v3, v0, v3

    .line 66
    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    invoke-virtual {v2}, Ldefpackage/tb1;->a()Ldefpackage/sb1;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    iput-wide v0, v2, Ldefpackage/sb1;->r:J

    .line 74
    .line 75
    new-instance v0, Ldefpackage/tb1;

    .line 76
    .line 77
    invoke-direct {v0, v2}, Ldefpackage/tb1;-><init>(Ldefpackage/sb1;)V

    .line 78
    .line 79
    .line 80
    iput-object v0, p0, Ldefpackage/z05;->o:Ljava/lang/Object;

    .line 81
    .line 82
    iget-object v1, p0, Ldefpackage/z05;->q:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v1, Ldefpackage/wv4;

    .line 85
    .line 86
    invoke-interface {v1, v0}, Ldefpackage/wv4;->g(Ldefpackage/tb1;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    invoke-virtual {p1}, Ldefpackage/be3;->a()I

    .line 90
    .line 91
    .line 92
    move-result v10

    .line 93
    iget-object v0, p0, Ldefpackage/z05;->q:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Ldefpackage/wv4;

    .line 96
    .line 97
    invoke-interface {v0, v10, p1}, Ldefpackage/wv4;->e(ILdefpackage/be3;)V

    .line 98
    .line 99
    .line 100
    iget-object p0, p0, Ldefpackage/z05;->q:Ljava/lang/Object;

    .line 101
    .line 102
    move-object v6, p0

    .line 103
    check-cast v6, Ldefpackage/wv4;

    .line 104
    .line 105
    const/4 v11, 0x0

    .line 106
    const/4 v12, 0x0

    .line 107
    const/4 v9, 0x1

    .line 108
    invoke-interface/range {v6 .. v12}, Ldefpackage/wv4;->a(JIIILdefpackage/vv4;)V

    .line 109
    .line 110
    .line 111
    :cond_3
    :goto_2
    return-void

    .line 112
    :catchall_1
    move-exception v0

    .line 113
    move-object p0, v0

    .line 114
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 115
    throw p0

    .line 116
    :goto_3
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 117
    throw p0
.end method

.method public b(Ldefpackage/iu4;Ldefpackage/m51;Ldefpackage/sy4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p3}, Ldefpackage/sy4;->a()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3}, Ldefpackage/sy4;->b()V

    .line 7
    .line 8
    .line 9
    iget p1, p3, Ldefpackage/sy4;->d:I

    .line 10
    .line 11
    const/4 p3, 0x5

    .line 12
    invoke-interface {p2, p1, p3}, Ldefpackage/m51;->t(II)Ldefpackage/wv4;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Ldefpackage/z05;->q:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object p0, p0, Ldefpackage/z05;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Ldefpackage/tb1;

    .line 21
    .line 22
    invoke-interface {p1, p0}, Ldefpackage/wv4;->g(Ldefpackage/tb1;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public c()I
    .locals 8

    .line 1
    iget-object v0, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    iget-object v1, p0, Ldefpackage/z05;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    invoke-static {v1}, Ldefpackage/vw;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object p0, p0, Ldefpackage/z05;->q:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ldefpackage/qj0;

    .line 16
    .line 17
    const/4 v2, -0x1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/4 v4, 0x0

    .line 26
    move v5, v4

    .line 27
    :goto_0
    if-ge v5, v3, :cond_2

    .line 28
    .line 29
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    check-cast v6, Ldefpackage/wv1;

    .line 34
    .line 35
    :try_start_0
    invoke-interface {v6, v1, p0}, Ldefpackage/wv1;->c(Ljava/nio/ByteBuffer;Ldefpackage/qj0;)I

    .line 36
    .line 37
    .line 38
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    check-cast v7, Ljava/nio/ByteBuffer;

    .line 44
    .line 45
    if-eq v6, v2, :cond_1

    .line 46
    .line 47
    return v6

    .line 48
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 57
    .line 58
    throw p0

    .line 59
    :cond_2
    :goto_1
    return v2
.end method

.method public d(Ldefpackage/tt0;)Ldefpackage/du0;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/z05;->o:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v5, v2

    .line 8
    check-cast v5, Ldefpackage/kx;

    .line 9
    .line 10
    iget-object v7, v1, Ldefpackage/tt0;->o:Landroid/net/Uri;

    .line 11
    .line 12
    iget-object v2, v1, Ldefpackage/tt0;->p:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v7, v2}, Ldefpackage/f35;->J(Landroid/net/Uri;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x1

    .line 20
    const/4 v6, 0x0

    .line 21
    if-eqz v2, :cond_7

    .line 22
    .line 23
    if-eq v2, v4, :cond_7

    .line 24
    .line 25
    const/4 v8, 0x2

    .line 26
    if-eq v2, v8, :cond_7

    .line 27
    .line 28
    const/4 v8, 0x4

    .line 29
    if-ne v2, v8, :cond_6

    .line 30
    .line 31
    iget-object v2, v1, Ldefpackage/tt0;->u:Ldefpackage/rt0;

    .line 32
    .line 33
    move v8, v3

    .line 34
    new-instance v3, Ldefpackage/zq3;

    .line 35
    .line 36
    new-instance v9, Ldefpackage/um2;

    .line 37
    .line 38
    invoke-direct {v9}, Ldefpackage/um2;-><init>()V

    .line 39
    .line 40
    .line 41
    new-instance v10, Ldefpackage/xm2;

    .line 42
    .line 43
    invoke-direct {v10}, Ldefpackage/xm2;-><init>()V

    .line 44
    .line 45
    .line 46
    sget-object v11, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 47
    .line 48
    sget-object v13, Ldefpackage/gy3;->r:Ldefpackage/gy3;

    .line 49
    .line 50
    new-instance v12, Ldefpackage/zm2;

    .line 51
    .line 52
    invoke-direct {v12}, Ldefpackage/zm2;-><init>()V

    .line 53
    .line 54
    .line 55
    sget-object v20, Ldefpackage/cn2;->d:Ldefpackage/cn2;

    .line 56
    .line 57
    move-object v14, v12

    .line 58
    iget-object v12, v1, Ldefpackage/tt0;->s:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v1, v10, Ldefpackage/xm2;->e:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Landroid/net/Uri;

    .line 63
    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    iget-object v1, v10, Ldefpackage/xm2;->d:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Ljava/util/UUID;

    .line 69
    .line 70
    if-eqz v1, :cond_0

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    move v4, v8

    .line 74
    :cond_1
    :goto_0
    invoke-static {v4}, Ldefpackage/rr2;->w(Z)V

    .line 75
    .line 76
    .line 77
    move-object v15, v6

    .line 78
    if-eqz v7, :cond_3

    .line 79
    .line 80
    new-instance v6, Ldefpackage/bn2;

    .line 81
    .line 82
    iget-object v1, v10, Ldefpackage/xm2;->d:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v1, Ljava/util/UUID;

    .line 85
    .line 86
    if-eqz v1, :cond_2

    .line 87
    .line 88
    new-instance v1, Ldefpackage/ym2;

    .line 89
    .line 90
    invoke-direct {v1, v10}, Ldefpackage/ym2;-><init>(Ldefpackage/xm2;)V

    .line 91
    .line 92
    .line 93
    move-object/from16 v23, v9

    .line 94
    .line 95
    move-object v9, v1

    .line 96
    move-object/from16 v1, v23

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    move-object v1, v9

    .line 100
    move-object v9, v15

    .line 101
    :goto_1
    const/4 v8, 0x0

    .line 102
    const/4 v10, 0x0

    .line 103
    move-object v4, v14

    .line 104
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    invoke-direct/range {v6 .. v15}, Ldefpackage/bn2;-><init>(Landroid/net/Uri;Ljava/lang/String;Ldefpackage/ym2;Ldefpackage/sm2;Ljava/util/List;Ljava/lang/String;Ldefpackage/yw1;J)V

    .line 110
    .line 111
    .line 112
    move-object/from16 v17, v6

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_3
    move-object v1, v9

    .line 116
    move-object v4, v14

    .line 117
    move-object/from16 v17, v15

    .line 118
    .line 119
    :goto_2
    new-instance v14, Ldefpackage/gn2;

    .line 120
    .line 121
    new-instance v6, Ldefpackage/wm2;

    .line 122
    .line 123
    invoke-direct {v6, v1}, Ldefpackage/vm2;-><init>(Ldefpackage/um2;)V

    .line 124
    .line 125
    .line 126
    new-instance v1, Ldefpackage/an2;

    .line 127
    .line 128
    invoke-direct {v1, v4}, Ldefpackage/an2;-><init>(Ldefpackage/zm2;)V

    .line 129
    .line 130
    .line 131
    sget-object v19, Ldefpackage/do2;->K:Ldefpackage/do2;

    .line 132
    .line 133
    const-string v15, ""

    .line 134
    .line 135
    move-object/from16 v18, v1

    .line 136
    .line 137
    move-object/from16 v16, v6

    .line 138
    .line 139
    invoke-direct/range {v14 .. v20}, Ldefpackage/gn2;-><init>(Ljava/lang/String;Ldefpackage/wm2;Ldefpackage/bn2;Ldefpackage/an2;Ldefpackage/do2;Ldefpackage/cn2;)V

    .line 140
    .line 141
    .line 142
    iget-object v0, v0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 143
    .line 144
    move-object v6, v0

    .line 145
    check-cast v6, Ljava/util/concurrent/Executor;

    .line 146
    .line 147
    if-eqz v2, :cond_4

    .line 148
    .line 149
    iget-wide v0, v2, Ldefpackage/rt0;->n:J

    .line 150
    .line 151
    :goto_3
    move-wide v7, v0

    .line 152
    goto :goto_4

    .line 153
    :cond_4
    const-wide/16 v0, 0x0

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :goto_4
    if-eqz v2, :cond_5

    .line 157
    .line 158
    iget-wide v0, v2, Ldefpackage/rt0;->o:J

    .line 159
    .line 160
    :goto_5
    move-wide v9, v0

    .line 161
    move-object v4, v14

    .line 162
    goto :goto_6

    .line 163
    :cond_5
    const-wide/16 v0, -0x1

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :goto_6
    invoke-direct/range {v3 .. v10}, Ldefpackage/zq3;-><init>(Ldefpackage/gn2;Ldefpackage/kx;Ljava/util/concurrent/Executor;JJ)V

    .line 167
    .line 168
    .line 169
    return-object v3

    .line 170
    :cond_6
    move-object v15, v6

    .line 171
    const-string v0, "Unsupported type: "

    .line 172
    .line 173
    invoke-static {v2, v0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    return-object v15

    .line 181
    :cond_7
    move v8, v3

    .line 182
    move-object v15, v6

    .line 183
    iget-object v3, v0, Ldefpackage/z05;->q:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v3, Landroid/util/SparseArray;

    .line 186
    .line 187
    invoke-static {v3, v2}, Ldefpackage/f35;->l(Landroid/util/SparseArray;I)Z

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    if-eqz v6, :cond_8

    .line 192
    .line 193
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    check-cast v2, Ldefpackage/z84;

    .line 198
    .line 199
    goto :goto_7

    .line 200
    :cond_8
    :try_start_0
    invoke-virtual {v0, v2, v5}, Ldefpackage/z05;->m(ILdefpackage/kx;)Ldefpackage/z84;

    .line 201
    .line 202
    .line 203
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 204
    :goto_7
    new-instance v3, Ldefpackage/um2;

    .line 205
    .line 206
    invoke-direct {v3}, Ldefpackage/um2;-><init>()V

    .line 207
    .line 208
    .line 209
    new-instance v5, Ldefpackage/xm2;

    .line 210
    .line 211
    invoke-direct {v5}, Ldefpackage/xm2;-><init>()V

    .line 212
    .line 213
    .line 214
    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 215
    .line 216
    sget-object v13, Ldefpackage/gy3;->r:Ldefpackage/gy3;

    .line 217
    .line 218
    new-instance v9, Ldefpackage/zm2;

    .line 219
    .line 220
    invoke-direct {v9}, Ldefpackage/zm2;-><init>()V

    .line 221
    .line 222
    .line 223
    sget-object v22, Ldefpackage/cn2;->d:Ldefpackage/cn2;

    .line 224
    .line 225
    iget-object v10, v1, Ldefpackage/tt0;->q:Ljava/util/List;

    .line 226
    .line 227
    if-eqz v10, :cond_9

    .line 228
    .line 229
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 230
    .line 231
    .line 232
    move-result v11

    .line 233
    if-nez v11, :cond_9

    .line 234
    .line 235
    new-instance v6, Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-direct {v6, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 238
    .line 239
    .line 240
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    :cond_9
    move-object v11, v6

    .line 245
    iget-object v12, v1, Ldefpackage/tt0;->s:Ljava/lang/String;

    .line 246
    .line 247
    iget-object v6, v5, Ldefpackage/xm2;->e:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v6, Landroid/net/Uri;

    .line 250
    .line 251
    if-eqz v6, :cond_b

    .line 252
    .line 253
    iget-object v6, v5, Ldefpackage/xm2;->d:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v6, Ljava/util/UUID;

    .line 256
    .line 257
    if-eqz v6, :cond_a

    .line 258
    .line 259
    goto :goto_8

    .line 260
    :cond_a
    move v4, v8

    .line 261
    :cond_b
    :goto_8
    invoke-static {v4}, Ldefpackage/rr2;->w(Z)V

    .line 262
    .line 263
    .line 264
    if-eqz v7, :cond_d

    .line 265
    .line 266
    new-instance v6, Ldefpackage/bn2;

    .line 267
    .line 268
    iget-object v4, v5, Ldefpackage/xm2;->d:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v4, Ljava/util/UUID;

    .line 271
    .line 272
    if-eqz v4, :cond_c

    .line 273
    .line 274
    new-instance v4, Ldefpackage/ym2;

    .line 275
    .line 276
    invoke-direct {v4, v5}, Ldefpackage/ym2;-><init>(Ldefpackage/xm2;)V

    .line 277
    .line 278
    .line 279
    move-object/from16 v23, v9

    .line 280
    .line 281
    move-object v9, v4

    .line 282
    move-object/from16 v4, v23

    .line 283
    .line 284
    goto :goto_9

    .line 285
    :cond_c
    move-object v4, v9

    .line 286
    move-object v9, v15

    .line 287
    :goto_9
    const/4 v8, 0x0

    .line 288
    const/4 v10, 0x0

    .line 289
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    invoke-direct/range {v6 .. v15}, Ldefpackage/bn2;-><init>(Landroid/net/Uri;Ljava/lang/String;Ldefpackage/ym2;Ldefpackage/sm2;Ljava/util/List;Ljava/lang/String;Ldefpackage/yw1;J)V

    .line 295
    .line 296
    .line 297
    move-object/from16 v19, v6

    .line 298
    .line 299
    goto :goto_a

    .line 300
    :cond_d
    move-object v4, v9

    .line 301
    move-object/from16 v19, v15

    .line 302
    .line 303
    :goto_a
    new-instance v16, Ldefpackage/gn2;

    .line 304
    .line 305
    new-instance v5, Ldefpackage/wm2;

    .line 306
    .line 307
    invoke-direct {v5, v3}, Ldefpackage/vm2;-><init>(Ldefpackage/um2;)V

    .line 308
    .line 309
    .line 310
    new-instance v3, Ldefpackage/an2;

    .line 311
    .line 312
    invoke-direct {v3, v4}, Ldefpackage/an2;-><init>(Ldefpackage/zm2;)V

    .line 313
    .line 314
    .line 315
    sget-object v21, Ldefpackage/do2;->K:Ldefpackage/do2;

    .line 316
    .line 317
    const-string v17, ""

    .line 318
    .line 319
    move-object/from16 v20, v3

    .line 320
    .line 321
    move-object/from16 v18, v5

    .line 322
    .line 323
    invoke-direct/range {v16 .. v22}, Ldefpackage/gn2;-><init>(Ljava/lang/String;Ldefpackage/wm2;Ldefpackage/bn2;Ldefpackage/an2;Ldefpackage/do2;Ldefpackage/cn2;)V

    .line 324
    .line 325
    .line 326
    iget-object v1, v1, Ldefpackage/tt0;->v:Ldefpackage/st0;

    .line 327
    .line 328
    if-eqz v1, :cond_e

    .line 329
    .line 330
    iget-wide v3, v1, Ldefpackage/st0;->n:J

    .line 331
    .line 332
    move-object v5, v2

    .line 333
    check-cast v5, Ldefpackage/lm1;

    .line 334
    .line 335
    iput-wide v3, v5, Ldefpackage/lm1;->d:J

    .line 336
    .line 337
    iget-wide v3, v1, Ldefpackage/st0;->o:J

    .line 338
    .line 339
    iput-wide v3, v5, Ldefpackage/lm1;->e:J

    .line 340
    .line 341
    :cond_e
    iget-object v0, v0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 342
    .line 343
    move-object v9, v0

    .line 344
    check-cast v9, Ljava/util/concurrent/Executor;

    .line 345
    .line 346
    check-cast v2, Ldefpackage/lm1;

    .line 347
    .line 348
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    new-instance v5, Ldefpackage/mm1;

    .line 352
    .line 353
    iget-object v7, v2, Ldefpackage/lm1;->b:Ldefpackage/en1;

    .line 354
    .line 355
    iget-object v8, v2, Ldefpackage/lm1;->a:Ldefpackage/kx;

    .line 356
    .line 357
    iget-wide v10, v2, Ldefpackage/lm1;->c:J

    .line 358
    .line 359
    iget-wide v12, v2, Ldefpackage/lm1;->d:J

    .line 360
    .line 361
    iget-wide v14, v2, Ldefpackage/lm1;->e:J

    .line 362
    .line 363
    move-object/from16 v6, v16

    .line 364
    .line 365
    invoke-direct/range {v5 .. v15}, Ldefpackage/mm1;-><init>(Ldefpackage/gn2;Ldefpackage/ce3;Ldefpackage/kx;Ljava/util/concurrent/Executor;JJJ)V

    .line 366
    .line 367
    .line 368
    return-object v5

    .line 369
    :catch_0
    move-exception v0

    .line 370
    const-string v1, "Module missing for content type "

    .line 371
    .line 372
    invoke-static {v2, v1}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    invoke-static {v1, v0}, Ldefpackage/mj0;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 377
    .line 378
    .line 379
    return-object v15
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/z05;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    iget-object v0, p0, Ldefpackage/z05;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/lang/reflect/GenericDeclaration;

    .line 14
    .line 15
    iget-object v1, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ljava/lang/String;

    .line 18
    .line 19
    sget-boolean v2, Ldefpackage/y05;->a:Z

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2}, Ljava/lang/reflect/Proxy;->isProxyClass(Ljava/lang/Class;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-static {p1}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    instance-of v2, v2, Ldefpackage/a15;

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-static {p1}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Ldefpackage/a15;

    .line 48
    .line 49
    iget-object p1, p1, Ldefpackage/a15;->a:Ldefpackage/z05;

    .line 50
    .line 51
    iget-object v2, p1, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    iget-object v1, p1, Ldefpackage/z05;->o:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, Ljava/lang/reflect/GenericDeclaration;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    iget-object p0, p0, Ldefpackage/z05;->q:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p0, Ldefpackage/gy3;

    .line 74
    .line 75
    iget-object p1, p1, Ldefpackage/z05;->q:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p1, Ldefpackage/gy3;

    .line 78
    .line 79
    invoke-virtual {p0, p1}, Ldefpackage/yw1;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-eqz p0, :cond_1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    instance-of p0, p1, Ljava/lang/reflect/TypeVariable;

    .line 87
    .line 88
    if-eqz p0, :cond_1

    .line 89
    .line 90
    check-cast p1, Ljava/lang/reflect/TypeVariable;

    .line 91
    .line 92
    invoke-interface {p1}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-eqz p0, :cond_1

    .line 101
    .line 102
    invoke-interface {p1}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    if-eqz p0, :cond_1

    .line 111
    .line 112
    :goto_0
    const/4 p0, 0x1

    .line 113
    goto :goto_1

    .line 114
    :cond_1
    const/4 p0, 0x0

    .line 115
    :goto_1
    return p0

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public f()Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Ldefpackage/te5;->m()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-wide v2, Ldefpackage/nt4;->a:J

    .line 6
    .line 7
    cmp-long v2, v0, v2

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/z05;->q:Ljava/lang/Object;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object p0, p0, Ldefpackage/z05;->o:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ldefpackage/kt4;

    .line 23
    .line 24
    invoke-virtual {p0, v0, v1}, Ldefpackage/kt4;->a(J)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-ltz v0, :cond_1

    .line 29
    .line 30
    iget-object p0, p0, Ldefpackage/kt4;->c:[Ljava/lang/Object;

    .line 31
    .line 32
    aget-object p0, p0, v0

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public g()J
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/z05;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/rk0;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-wide v0, p0, Ldefpackage/rk0;->q:J

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    const-wide/16 v0, -0x1

    .line 11
    .line 12
    return-wide v0
.end method

.method public h(Ldefpackage/ci0;Landroid/net/Uri;Ljava/util/Map;JJLdefpackage/hr3;)V
    .locals 7

    .line 1
    new-instance v1, Ldefpackage/rk0;

    .line 2
    .line 3
    move-object v2, p1

    .line 4
    move-wide v3, p4

    .line 5
    move-wide v5, p6

    .line 6
    invoke-direct/range {v1 .. v6}, Ldefpackage/rk0;-><init>(Ldefpackage/wh0;JJ)V

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, Ldefpackage/z05;->q:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p1, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Ldefpackage/k51;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object p1, p0, Ldefpackage/z05;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Ldefpackage/n51;

    .line 21
    .line 22
    invoke-interface {p1, p2, p3}, Ldefpackage/n51;->e(Landroid/net/Uri;Ljava/util/Map;)[Ldefpackage/k51;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    array-length p3, p1

    .line 27
    sget-object p4, Ldefpackage/yw1;->o:Ldefpackage/vw1;

    .line 28
    .line 29
    const-string p4, "expectedSize"

    .line 30
    .line 31
    invoke-static {p3, p4}, Ldefpackage/uc5;->f(ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    new-instance p4, Ldefpackage/uw1;

    .line 35
    .line 36
    invoke-direct {p4, p3}, Ldefpackage/pw1;-><init>(I)V

    .line 37
    .line 38
    .line 39
    array-length p3, p1

    .line 40
    const/4 p5, 0x1

    .line 41
    const/4 p6, 0x0

    .line 42
    if-ne p3, p5, :cond_1

    .line 43
    .line 44
    aget-object p1, p1, p6

    .line 45
    .line 46
    iput-object p1, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 47
    .line 48
    goto/16 :goto_7

    .line 49
    .line 50
    :cond_1
    array-length p3, p1

    .line 51
    move p7, p6

    .line 52
    :goto_0
    if-ge p7, p3, :cond_7

    .line 53
    .line 54
    aget-object v0, p1, p7

    .line 55
    .line 56
    :try_start_0
    invoke-interface {v0, v1}, Ldefpackage/k51;->c(Ldefpackage/l51;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    iput-object v0, p0, Ldefpackage/z05;->p:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    iput p6, v1, Ldefpackage/rk0;->s:I

    .line 65
    .line 66
    goto :goto_6

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    move-object p1, v0

    .line 69
    goto :goto_3

    .line 70
    :cond_2
    :try_start_1
    invoke-interface {v0}, Ldefpackage/k51;->e()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p4, v0}, Ldefpackage/pw1;->d(Ljava/lang/Iterable;)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Ldefpackage/k51;

    .line 80
    .line 81
    if-nez v0, :cond_4

    .line 82
    .line 83
    iget-wide v5, v1, Ldefpackage/rk0;->q:J

    .line 84
    .line 85
    cmp-long v0, v5, v3

    .line 86
    .line 87
    if-nez v0, :cond_3

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    move v0, p6

    .line 91
    goto :goto_2

    .line 92
    :cond_4
    :goto_1
    move v0, p5

    .line 93
    :goto_2
    invoke-static {v0}, Ldefpackage/rr2;->w(Z)V

    .line 94
    .line 95
    .line 96
    iput p6, v1, Ldefpackage/rk0;->s:I

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :goto_3
    iget-object p0, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p0, Ldefpackage/k51;

    .line 102
    .line 103
    if-nez p0, :cond_6

    .line 104
    .line 105
    iget-wide p2, v1, Ldefpackage/rk0;->q:J

    .line 106
    .line 107
    cmp-long p0, p2, v3

    .line 108
    .line 109
    if-nez p0, :cond_5

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_5
    move p5, p6

    .line 113
    :cond_6
    :goto_4
    invoke-static {p5}, Ldefpackage/rr2;->w(Z)V

    .line 114
    .line 115
    .line 116
    iput p6, v1, Ldefpackage/rk0;->s:I

    .line 117
    .line 118
    throw p1

    .line 119
    :catch_0
    iget-object v0, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, Ldefpackage/k51;

    .line 122
    .line 123
    if-nez v0, :cond_4

    .line 124
    .line 125
    iget-wide v5, v1, Ldefpackage/rk0;->q:J

    .line 126
    .line 127
    cmp-long v0, v5, v3

    .line 128
    .line 129
    if-nez v0, :cond_3

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :goto_5
    add-int/lit8 p7, p7, 0x1

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_7
    :goto_6
    iget-object p3, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast p3, Ldefpackage/k51;

    .line 138
    .line 139
    if-eqz p3, :cond_8

    .line 140
    .line 141
    :goto_7
    iget-object p0, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast p0, Ldefpackage/k51;

    .line 144
    .line 145
    invoke-interface {p0, p8}, Ldefpackage/k51;->f(Ldefpackage/m51;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_8
    new-instance p0, Landroidx/media3/exoplayer/source/UnrecognizedInputFormatException;

    .line 150
    .line 151
    new-instance p3, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    const-string p5, "None of the available extractors ("

    .line 154
    .line 155
    invoke-direct {p3, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    new-instance p5, Ldefpackage/uc0;

    .line 159
    .line 160
    const-string p6, ", "

    .line 161
    .line 162
    invoke-direct {p5, p6}, Ldefpackage/uc0;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-static {p1}, Ldefpackage/yw1;->l([Ljava/lang/Object;)Ldefpackage/gy3;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    new-instance p6, Ldefpackage/kf2;

    .line 170
    .line 171
    const/16 p7, 0xe

    .line 172
    .line 173
    invoke-direct {p6, p7}, Ldefpackage/kf2;-><init>(I)V

    .line 174
    .line 175
    .line 176
    invoke-static {p6, p1}, Ldefpackage/hw;->P(Ldefpackage/eg1;Ljava/util/List;)Ljava/util/AbstractList;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-virtual {p5, p1}, Ldefpackage/uc0;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    const-string p1, ") could read the stream."

    .line 188
    .line 189
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p4}, Ldefpackage/uw1;->f()Ldefpackage/gy3;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/source/UnrecognizedInputFormatException;-><init>(Ljava/lang/String;Ldefpackage/gy3;)V

    .line 204
    .line 205
    .line 206
    throw p0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/z05;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    iget-object v0, p0, Ldefpackage/z05;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/lang/reflect/GenericDeclaration;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object p0, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    xor-int/2addr p0, v0

    .line 28
    return p0

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public i(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/z05;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-static {p0}, Ldefpackage/vw;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, Ldefpackage/uw;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Ldefpackage/uw;-><init>(Ljava/nio/ByteBuffer;)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    invoke-static {v0, p0, p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public j()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/z05;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/kl4;

    .line 4
    .line 5
    invoke-interface {v0}, Ldefpackage/kl4;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Ldefpackage/z05;->q:Ljava/lang/Object;

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ldefpackage/z05;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Ldefpackage/z05;->j()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 29
    return p0
.end method

.method public k()V
    .locals 0

    .line 1
    return-void
.end method

.method public l()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/z05;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    invoke-static {p0}, Ldefpackage/vw;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {v0, p0}, Ldefpackage/kb4;->C(Ljava/util/List;Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public m(ILdefpackage/kx;)Ldefpackage/z84;
    .locals 2

    .line 1
    const-class v0, Ldefpackage/z84;

    .line 2
    .line 3
    if-eqz p1, :cond_2

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq p1, v1, :cond_1

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-ne p1, v1, :cond_0

    .line 10
    .line 11
    const-class v1, Ldefpackage/lm1;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0, p2}, Ldefpackage/z05;->e(Ljava/lang/Class;Ldefpackage/kx;)Ldefpackage/z84;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p0, "Unsupported type: "

    .line 23
    .line 24
    invoke-static {p1, p0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0

    .line 33
    :cond_1
    const-string v1, "androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader$Factory"

    .line 34
    .line 35
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0, p2}, Ldefpackage/z05;->e(Ljava/lang/Class;Ldefpackage/kx;)Ldefpackage/z84;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const-string v1, "androidx.media3.exoplayer.dash.offline.DashDownloader$Factory"

    .line 49
    .line 50
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1, v0}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0, p2}, Ldefpackage/z05;->e(Ljava/lang/Class;Ldefpackage/kx;)Ldefpackage/z84;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    :goto_0
    iget-object p0, p0, Ldefpackage/z05;->q:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, Landroid/util/SparseArray;

    .line 65
    .line 66
    invoke-virtual {p0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-object p2
.end method

.method public n(Ljava/lang/Object;)V
    .locals 5

    .line 1
    invoke-static {}, Ldefpackage/te5;->m()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-wide v2, Ldefpackage/nt4;->a:J

    .line 6
    .line 7
    cmp-long v2, v0, v2

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    iput-object p1, p0, Ldefpackage/z05;->q:Ljava/lang/Object;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v2, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v2

    .line 17
    :try_start_0
    iget-object v3, p0, Ldefpackage/z05;->o:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Ldefpackage/kt4;

    .line 26
    .line 27
    invoke-virtual {v3, v0, v1}, Ldefpackage/kt4;->a(J)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-gez v4, :cond_1

    .line 32
    .line 33
    iget-object p0, p0, Ldefpackage/z05;->o:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 36
    .line 37
    invoke-virtual {v3, v0, v1, p1}, Ldefpackage/kt4;->b(JLjava/lang/Object;)Ldefpackage/kt4;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    monitor-exit v2

    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    :try_start_1
    iget-object p0, v3, Ldefpackage/kt4;->c:[Ljava/lang/Object;

    .line 49
    .line 50
    aput-object p1, p0, v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    .line 52
    monitor-exit v2

    .line 53
    return-void

    .line 54
    :goto_0
    monitor-exit v2

    .line 55
    throw p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/z05;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/lang/String;

    .line 14
    .line 15
    return-object p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
