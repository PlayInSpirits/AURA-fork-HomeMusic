.class public final Ldefpackage/nm1;
.super Ldefpackage/s20;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final M:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public final A:Z

.field public final B:Z

.field public C:Ldefpackage/jw;

.field public D:Ldefpackage/ln1;

.field public E:I

.field public F:Z

.field public volatile G:Z

.field public H:Z

.field public I:Ldefpackage/yw1;

.field public J:Z

.field public K:J

.field public L:Z

.field public final j:J

.field public final k:I

.field public final l:I

.field public final m:Landroid/net/Uri;

.field public final n:Z

.field public final o:I

.field public final p:Ldefpackage/ci0;

.field public final q:Ldefpackage/ii0;

.field public final r:Ldefpackage/jw;

.field public final s:Z

.field public final t:Z

.field public final u:Ldefpackage/iu4;

.field public final v:Ldefpackage/xk0;

.field public final w:Ljava/util/List;

.field public final x:Ldefpackage/ow0;

.field public final y:Ldefpackage/mv1;

.field public final z:Ldefpackage/be3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/nm1;->M:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ldefpackage/xk0;Ldefpackage/ci0;Ldefpackage/ii0;Ldefpackage/tb1;ZLdefpackage/ci0;Ldefpackage/ii0;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLdefpackage/iu4;Ldefpackage/ow0;Ldefpackage/jw;Ldefpackage/mv1;Ldefpackage/be3;ZZLdefpackage/ik3;)V
    .locals 12

    .line 1
    move-object/from16 v0, p7

    .line 2
    .line 3
    const/4 v4, 0x1

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p2

    .line 6
    move-object v3, p3

    .line 7
    move-object/from16 v5, p4

    .line 8
    .line 9
    move/from16 v6, p11

    .line 10
    .line 11
    move-object/from16 v7, p12

    .line 12
    .line 13
    move-wide/from16 v8, p13

    .line 14
    .line 15
    move-wide/from16 v10, p15

    .line 16
    .line 17
    invoke-direct/range {v1 .. v11}, Ldefpackage/s20;-><init>(Ldefpackage/ci0;Ldefpackage/ii0;ILdefpackage/tb1;ILjava/lang/Object;JJ)V

    .line 18
    .line 19
    .line 20
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-wide/from16 p2, p17

    .line 24
    .line 25
    iput-wide p2, p0, Ldefpackage/nm1;->j:J

    .line 26
    .line 27
    move/from16 p2, p5

    .line 28
    .line 29
    iput-boolean p2, p0, Ldefpackage/nm1;->A:Z

    .line 30
    .line 31
    move/from16 p2, p19

    .line 32
    .line 33
    iput p2, p0, Ldefpackage/nm1;->o:I

    .line 34
    .line 35
    if-eqz p20, :cond_0

    .line 36
    .line 37
    sub-long p2, p15, p13

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    :goto_0
    iput-wide p2, p0, Ldefpackage/nm1;->K:J

    .line 46
    .line 47
    move/from16 p2, p21

    .line 48
    .line 49
    iput p2, p0, Ldefpackage/nm1;->l:I

    .line 50
    .line 51
    iput-object v0, p0, Ldefpackage/nm1;->q:Ldefpackage/ii0;

    .line 52
    .line 53
    move-object/from16 p2, p6

    .line 54
    .line 55
    iput-object p2, p0, Ldefpackage/nm1;->p:Ldefpackage/ci0;

    .line 56
    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    const/4 p2, 0x1

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    const/4 p2, 0x0

    .line 62
    :goto_1
    iput-boolean p2, p0, Ldefpackage/nm1;->F:Z

    .line 63
    .line 64
    move/from16 p2, p8

    .line 65
    .line 66
    iput-boolean p2, p0, Ldefpackage/nm1;->B:Z

    .line 67
    .line 68
    move-object/from16 p2, p9

    .line 69
    .line 70
    iput-object p2, p0, Ldefpackage/nm1;->m:Landroid/net/Uri;

    .line 71
    .line 72
    move/from16 p2, p23

    .line 73
    .line 74
    iput-boolean p2, p0, Ldefpackage/nm1;->s:Z

    .line 75
    .line 76
    move-object/from16 p2, p24

    .line 77
    .line 78
    iput-object p2, p0, Ldefpackage/nm1;->u:Ldefpackage/iu4;

    .line 79
    .line 80
    move/from16 p2, p22

    .line 81
    .line 82
    iput-boolean p2, p0, Ldefpackage/nm1;->t:Z

    .line 83
    .line 84
    iput-object p1, p0, Ldefpackage/nm1;->v:Ldefpackage/xk0;

    .line 85
    .line 86
    move-object/from16 p1, p10

    .line 87
    .line 88
    iput-object p1, p0, Ldefpackage/nm1;->w:Ljava/util/List;

    .line 89
    .line 90
    move-object/from16 p1, p25

    .line 91
    .line 92
    iput-object p1, p0, Ldefpackage/nm1;->x:Ldefpackage/ow0;

    .line 93
    .line 94
    move-object/from16 p1, p26

    .line 95
    .line 96
    iput-object p1, p0, Ldefpackage/nm1;->r:Ldefpackage/jw;

    .line 97
    .line 98
    move-object/from16 p1, p27

    .line 99
    .line 100
    iput-object p1, p0, Ldefpackage/nm1;->y:Ldefpackage/mv1;

    .line 101
    .line 102
    move-object/from16 p1, p28

    .line 103
    .line 104
    iput-object p1, p0, Ldefpackage/nm1;->z:Ldefpackage/be3;

    .line 105
    .line 106
    move/from16 p1, p29

    .line 107
    .line 108
    iput-boolean p1, p0, Ldefpackage/nm1;->L:Z

    .line 109
    .line 110
    move/from16 p1, p30

    .line 111
    .line 112
    iput-boolean p1, p0, Ldefpackage/nm1;->n:Z

    .line 113
    .line 114
    sget-object p1, Ldefpackage/yw1;->o:Ldefpackage/vw1;

    .line 115
    .line 116
    sget-object p1, Ldefpackage/gy3;->r:Ldefpackage/gy3;

    .line 117
    .line 118
    iput-object p1, p0, Ldefpackage/nm1;->I:Ldefpackage/yw1;

    .line 119
    .line 120
    sget-object p1, Ldefpackage/nm1;->M:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    iput p1, p0, Ldefpackage/nm1;->k:I

    .line 127
    .line 128
    return-void
.end method

.method public static d(Ljava/lang/String;)[B
    .locals 4

    .line 1
    invoke-static {p0}, Ldefpackage/rr2;->U(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "0x"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    new-instance v0, Ljava/math/BigInteger;

    .line 19
    .line 20
    const/16 v1, 0x10

    .line 21
    .line 22
    invoke-direct {v0, p0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-array v0, v1, [B

    .line 30
    .line 31
    array-length v2, p0

    .line 32
    if-le v2, v1, :cond_1

    .line 33
    .line 34
    array-length v2, p0

    .line 35
    sub-int/2addr v2, v1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v2, 0x0

    .line 38
    :goto_0
    array-length v3, p0

    .line 39
    sub-int/2addr v1, v3

    .line 40
    add-int/2addr v1, v2

    .line 41
    array-length v3, p0

    .line 42
    sub-int/2addr v3, v2

    .line 43
    invoke-static {p0, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/nm1;->D:Ldefpackage/ln1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldefpackage/nm1;->C:Ldefpackage/jw;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Ldefpackage/nm1;->r:Ldefpackage/jw;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v2, v0, Ldefpackage/jw;->o:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Ldefpackage/k51;

    .line 18
    .line 19
    instance-of v3, v2, Ldefpackage/qy4;

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    instance-of v2, v2, Ldefpackage/oe1;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    :cond_0
    iput-object v0, p0, Ldefpackage/nm1;->C:Ldefpackage/jw;

    .line 28
    .line 29
    iput-boolean v1, p0, Ldefpackage/nm1;->F:Z

    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Ldefpackage/nm1;->q:Ldefpackage/ii0;

    .line 32
    .line 33
    iget-object v2, p0, Ldefpackage/nm1;->p:Ldefpackage/ci0;

    .line 34
    .line 35
    iget-boolean v3, p0, Ldefpackage/nm1;->F:Z

    .line 36
    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-boolean v3, p0, Ldefpackage/nm1;->B:Z

    .line 47
    .line 48
    invoke-virtual {p0, v2, v0, v3, v1}, Ldefpackage/nm1;->c(Ldefpackage/ci0;Ldefpackage/ii0;ZZ)V

    .line 49
    .line 50
    .line 51
    iput v1, p0, Ldefpackage/nm1;->E:I

    .line 52
    .line 53
    iput-boolean v1, p0, Ldefpackage/nm1;->F:Z

    .line 54
    .line 55
    :goto_0
    iget-boolean v0, p0, Ldefpackage/nm1;->G:Z

    .line 56
    .line 57
    if-nez v0, :cond_4

    .line 58
    .line 59
    iget-boolean v0, p0, Ldefpackage/nm1;->t:Z

    .line 60
    .line 61
    const/4 v1, 0x1

    .line 62
    if-nez v0, :cond_3

    .line 63
    .line 64
    iget-object v0, p0, Ldefpackage/s20;->i:Ldefpackage/yl4;

    .line 65
    .line 66
    iget-object v2, p0, Ldefpackage/s20;->b:Ldefpackage/ii0;

    .line 67
    .line 68
    iget-boolean v3, p0, Ldefpackage/nm1;->A:Z

    .line 69
    .line 70
    invoke-virtual {p0, v0, v2, v3, v1}, Ldefpackage/nm1;->c(Ldefpackage/ci0;Ldefpackage/ii0;ZZ)V

    .line 71
    .line 72
    .line 73
    :cond_3
    iget-boolean v0, p0, Ldefpackage/nm1;->G:Z

    .line 74
    .line 75
    xor-int/2addr v0, v1

    .line 76
    iput-boolean v0, p0, Ldefpackage/nm1;->H:Z

    .line 77
    .line 78
    :cond_4
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/nm1;->G:Z

    .line 3
    .line 4
    return-void
.end method

.method public final c(Ldefpackage/ci0;Ldefpackage/ii0;ZZ)V
    .locals 8

    .line 1
    iget v0, p0, Ldefpackage/nm1;->E:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p3, :cond_1

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 p3, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p3, v1

    .line 11
    :goto_0
    move v0, p3

    .line 12
    move-object p3, p2

    .line 13
    goto :goto_2

    .line 14
    :cond_1
    int-to-long v2, v0

    .line 15
    iget-wide v4, p2, Ldefpackage/ii0;->g:J

    .line 16
    .line 17
    const-wide/16 v6, -0x1

    .line 18
    .line 19
    cmp-long p3, v4, v6

    .line 20
    .line 21
    if-nez p3, :cond_2

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_2
    sub-long v6, v4, v2

    .line 25
    .line 26
    :goto_1
    invoke-virtual {p2, v2, v3, v6, v7}, Ldefpackage/ii0;->b(JJ)Ldefpackage/ii0;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    move v0, v1

    .line 31
    :goto_2
    :try_start_0
    invoke-virtual {p0, p1, p3, p4}, Ldefpackage/nm1;->g(Ldefpackage/ci0;Ldefpackage/ii0;Z)Ldefpackage/rk0;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    iget p4, p0, Ldefpackage/nm1;->E:I

    .line 38
    .line 39
    invoke-virtual {p3, p4, v1}, Ldefpackage/rk0;->d(IZ)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    goto :goto_3

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    goto :goto_8

    .line 45
    :cond_3
    :goto_3
    :try_start_1
    iget-boolean p4, p0, Ldefpackage/nm1;->G:Z

    .line 46
    .line 47
    if-nez p4, :cond_4

    .line 48
    .line 49
    iget-object p4, p0, Ldefpackage/nm1;->C:Ldefpackage/jw;

    .line 50
    .line 51
    iget-object p4, p4, Ldefpackage/jw;->o:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p4, Ldefpackage/k51;

    .line 54
    .line 55
    sget-object v0, Ldefpackage/jw;->s:Ldefpackage/t71;

    .line 56
    .line 57
    invoke-interface {p4, p3, v0}, Ldefpackage/k51;->b(Ldefpackage/l51;Ldefpackage/t71;)I

    .line 58
    .line 59
    .line 60
    move-result p4
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 61
    if-nez p4, :cond_4

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :catchall_1
    move-exception p4

    .line 65
    goto :goto_7

    .line 66
    :catch_0
    move-exception p4

    .line 67
    goto :goto_5

    .line 68
    :cond_4
    :try_start_2
    iget-wide p3, p3, Ldefpackage/rk0;->q:J

    .line 69
    .line 70
    :goto_4
    iget-wide v0, p2, Ldefpackage/ii0;->f:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    .line 72
    goto :goto_6

    .line 73
    :goto_5
    :try_start_3
    iget-object v0, p0, Ldefpackage/s20;->d:Ldefpackage/tb1;

    .line 74
    .line 75
    iget v0, v0, Ldefpackage/tb1;->f:I

    .line 76
    .line 77
    and-int/lit16 v0, v0, 0x4000

    .line 78
    .line 79
    if-eqz v0, :cond_5

    .line 80
    .line 81
    iget-object p4, p0, Ldefpackage/nm1;->C:Ldefpackage/jw;

    .line 82
    .line 83
    iget-object p4, p4, Ldefpackage/jw;->o:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p4, Ldefpackage/k51;

    .line 86
    .line 87
    const-wide/16 v0, 0x0

    .line 88
    .line 89
    invoke-interface {p4, v0, v1, v0, v1}, Ldefpackage/k51;->d(JJ)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 90
    .line 91
    .line 92
    :try_start_4
    iget-wide p3, p3, Ldefpackage/rk0;->q:J

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :goto_6
    sub-long/2addr p3, v0

    .line 96
    long-to-int p2, p3

    .line 97
    iput p2, p0, Ldefpackage/nm1;->E:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 98
    .line 99
    invoke-static {p1}, Ldefpackage/fu;->k(Ldefpackage/ci0;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_5
    :try_start_5
    throw p4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 104
    :goto_7
    :try_start_6
    iget-wide v0, p3, Ldefpackage/rk0;->q:J

    .line 105
    .line 106
    iget-wide p2, p2, Ldefpackage/ii0;->f:J

    .line 107
    .line 108
    sub-long/2addr v0, p2

    .line 109
    long-to-int p2, v0

    .line 110
    iput p2, p0, Ldefpackage/nm1;->E:I

    .line 111
    .line 112
    throw p4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 113
    :goto_8
    invoke-static {p1}, Ldefpackage/fu;->k(Ldefpackage/ci0;)V

    .line 114
    .line 115
    .line 116
    throw p0
.end method

.method public final e(I)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldefpackage/nm1;->L:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Ldefpackage/rr2;->w(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ldefpackage/nm1;->I:Ldefpackage/yw1;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-lt p1, v0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_0
    iget-object p0, p0, Ldefpackage/nm1;->I:Ldefpackage/yw1;

    .line 19
    .line 20
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public final f()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Ldefpackage/nm1;->K:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long p0, v0, v2

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public final g(Ldefpackage/ci0;Ldefpackage/ii0;Z)Ldefpackage/rk0;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-interface/range {p1 .. p2}, Ldefpackage/ci0;->b(Ldefpackage/ii0;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v6

    .line 9
    iget-wide v8, v0, Ldefpackage/s20;->g:J

    .line 10
    .line 11
    iget-object v10, v0, Ldefpackage/nm1;->u:Ldefpackage/iu4;

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    :try_start_0
    iget-boolean v2, v0, Ldefpackage/nm1;->s:Z

    .line 16
    .line 17
    invoke-virtual {v10, v2, v8, v9}, Ldefpackage/iu4;->g(ZJ)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception v0

    .line 22
    new-instance v1, Ljava/io/IOException;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    throw v1

    .line 28
    :catch_1
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :cond_0
    :goto_0
    new-instance v2, Ldefpackage/rk0;

    .line 35
    .line 36
    iget-wide v4, v1, Ldefpackage/ii0;->f:J

    .line 37
    .line 38
    move-object/from16 v3, p1

    .line 39
    .line 40
    invoke-direct/range {v2 .. v7}, Ldefpackage/rk0;-><init>(Ldefpackage/wh0;JJ)V

    .line 41
    .line 42
    .line 43
    iget-object v3, v0, Ldefpackage/nm1;->C:Ldefpackage/jw;

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    const/4 v5, 0x0

    .line 47
    if-nez v3, :cond_30

    .line 48
    .line 49
    iget-object v3, v0, Ldefpackage/nm1;->z:Ldefpackage/be3;

    .line 50
    .line 51
    iput v5, v2, Ldefpackage/rk0;->s:I

    .line 52
    .line 53
    const/16 v7, 0x8

    .line 54
    .line 55
    const/16 v13, 0xa

    .line 56
    .line 57
    :try_start_1
    invoke-virtual {v3, v13}, Ldefpackage/be3;->K(I)V

    .line 58
    .line 59
    .line 60
    iget-object v14, v3, Ldefpackage/be3;->a:[B

    .line 61
    .line 62
    invoke-virtual {v2, v14, v5, v13, v5}, Ldefpackage/rk0;->e([BIIZ)Z
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_2

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Ldefpackage/be3;->D()I

    .line 66
    .line 67
    .line 68
    move-result v14

    .line 69
    const v15, 0x494433

    .line 70
    .line 71
    .line 72
    if-eq v14, v15, :cond_1

    .line 73
    .line 74
    const/16 p3, 0x0

    .line 75
    .line 76
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    goto/16 :goto_5

    .line 87
    .line 88
    :cond_1
    const/4 v14, 0x3

    .line 89
    invoke-virtual {v3, v14}, Ldefpackage/be3;->O(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3}, Ldefpackage/be3;->z()I

    .line 93
    .line 94
    .line 95
    move-result v14

    .line 96
    add-int/lit8 v15, v14, 0xa

    .line 97
    .line 98
    const/16 p3, 0x0

    .line 99
    .line 100
    iget-object v6, v3, Ldefpackage/be3;->a:[B

    .line 101
    .line 102
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    array-length v11, v6

    .line 108
    if-le v15, v11, :cond_2

    .line 109
    .line 110
    invoke-virtual {v3, v15}, Ldefpackage/be3;->K(I)V

    .line 111
    .line 112
    .line 113
    iget-object v11, v3, Ldefpackage/be3;->a:[B

    .line 114
    .line 115
    invoke-static {v6, v5, v11, v5, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 116
    .line 117
    .line 118
    :cond_2
    iget-object v6, v3, Ldefpackage/be3;->a:[B

    .line 119
    .line 120
    invoke-virtual {v2, v6, v13, v14, v5}, Ldefpackage/rk0;->e([BIIZ)Z

    .line 121
    .line 122
    .line 123
    iget-object v6, v0, Ldefpackage/nm1;->y:Ldefpackage/mv1;

    .line 124
    .line 125
    iget-object v11, v3, Ldefpackage/be3;->a:[B

    .line 126
    .line 127
    invoke-virtual {v6, v14, v11}, Ldefpackage/mv1;->O(I[B)Ldefpackage/qv2;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    if-nez v6, :cond_3

    .line 132
    .line 133
    :goto_1
    move-wide/from16 v11, v16

    .line 134
    .line 135
    goto :goto_5

    .line 136
    :cond_3
    iget-object v6, v6, Ldefpackage/qv2;->a:[Ldefpackage/pv2;

    .line 137
    .line 138
    array-length v11, v6

    .line 139
    move v12, v5

    .line 140
    :goto_2
    if-ge v12, v11, :cond_6

    .line 141
    .line 142
    aget-object v13, v6, v12

    .line 143
    .line 144
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    move-result-object v14

    .line 148
    const-class v15, Ldefpackage/hq3;

    .line 149
    .line 150
    invoke-virtual {v15, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 151
    .line 152
    .line 153
    move-result v14

    .line 154
    if-eqz v14, :cond_4

    .line 155
    .line 156
    invoke-virtual {v15, v13}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v13

    .line 160
    check-cast v13, Ldefpackage/pv2;

    .line 161
    .line 162
    move-object v14, v13

    .line 163
    check-cast v14, Ldefpackage/hq3;

    .line 164
    .line 165
    iget-object v14, v14, Ldefpackage/hq3;->b:Ljava/lang/String;

    .line 166
    .line 167
    const-string v15, "com.apple.streaming.transportStreamTimestamp"

    .line 168
    .line 169
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v14

    .line 173
    if-eqz v14, :cond_4

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_4
    move-object/from16 v13, p3

    .line 177
    .line 178
    :goto_3
    if-eqz v13, :cond_5

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_5
    add-int/lit8 v12, v12, 0x1

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_6
    move-object/from16 v13, p3

    .line 185
    .line 186
    :goto_4
    check-cast v13, Ldefpackage/hq3;

    .line 187
    .line 188
    if-nez v13, :cond_7

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_7
    iget-object v6, v13, Ldefpackage/hq3;->c:[B

    .line 192
    .line 193
    iget-object v11, v3, Ldefpackage/be3;->a:[B

    .line 194
    .line 195
    invoke-static {v6, v5, v11, v5, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3, v5}, Ldefpackage/be3;->N(I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3, v7}, Ldefpackage/be3;->M(I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v3}, Ldefpackage/be3;->u()J

    .line 205
    .line 206
    .line 207
    move-result-wide v11

    .line 208
    const-wide v13, 0x1ffffffffL

    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    and-long/2addr v11, v13

    .line 214
    goto :goto_5

    .line 215
    :catch_2
    const/16 p3, 0x0

    .line 216
    .line 217
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    goto :goto_1

    .line 223
    :goto_5
    iput v5, v2, Ldefpackage/rk0;->s:I

    .line 224
    .line 225
    iget-object v3, v0, Ldefpackage/nm1;->r:Ldefpackage/jw;

    .line 226
    .line 227
    if-eqz v3, :cond_f

    .line 228
    .line 229
    iget-object v1, v3, Ldefpackage/jw;->o:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v1, Ldefpackage/k51;

    .line 232
    .line 233
    instance-of v6, v1, Ldefpackage/qy4;

    .line 234
    .line 235
    if-nez v6, :cond_9

    .line 236
    .line 237
    instance-of v6, v1, Ldefpackage/oe1;

    .line 238
    .line 239
    if-eqz v6, :cond_8

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_8
    move v6, v5

    .line 243
    goto :goto_7

    .line 244
    :cond_9
    :goto_6
    move v6, v4

    .line 245
    :goto_7
    xor-int/2addr v6, v4

    .line 246
    invoke-static {v6}, Ldefpackage/rr2;->w(Z)V

    .line 247
    .line 248
    .line 249
    instance-of v6, v1, Ldefpackage/x95;

    .line 250
    .line 251
    if-eqz v6, :cond_a

    .line 252
    .line 253
    new-instance v1, Ldefpackage/x95;

    .line 254
    .line 255
    iget-object v6, v3, Ldefpackage/jw;->p:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v6, Ldefpackage/tb1;

    .line 258
    .line 259
    iget-object v6, v6, Ldefpackage/tb1;->d:Ljava/lang/String;

    .line 260
    .line 261
    iget-object v7, v3, Ldefpackage/jw;->q:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v7, Ldefpackage/iu4;

    .line 264
    .line 265
    iget-object v15, v3, Ldefpackage/jw;->r:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v15, Ldefpackage/xn4;

    .line 268
    .line 269
    iget-boolean v13, v3, Ldefpackage/jw;->n:Z

    .line 270
    .line 271
    invoke-direct {v1, v6, v7, v15, v13}, Ldefpackage/x95;-><init>(Ljava/lang/String;Ldefpackage/iu4;Ldefpackage/xn4;Z)V

    .line 272
    .line 273
    .line 274
    :goto_8
    move-object/from16 v19, v1

    .line 275
    .line 276
    goto :goto_9

    .line 277
    :cond_a
    instance-of v6, v1, Ldefpackage/h6;

    .line 278
    .line 279
    if-eqz v6, :cond_b

    .line 280
    .line 281
    new-instance v1, Ldefpackage/h6;

    .line 282
    .line 283
    invoke-direct {v1, v5}, Ldefpackage/h6;-><init>(I)V

    .line 284
    .line 285
    .line 286
    goto :goto_8

    .line 287
    :cond_b
    instance-of v6, v1, Ldefpackage/r2;

    .line 288
    .line 289
    if-eqz v6, :cond_c

    .line 290
    .line 291
    new-instance v1, Ldefpackage/r2;

    .line 292
    .line 293
    invoke-direct {v1}, Ldefpackage/r2;-><init>()V

    .line 294
    .line 295
    .line 296
    goto :goto_8

    .line 297
    :cond_c
    instance-of v6, v1, Ldefpackage/t2;

    .line 298
    .line 299
    if-eqz v6, :cond_d

    .line 300
    .line 301
    new-instance v1, Ldefpackage/t2;

    .line 302
    .line 303
    invoke-direct {v1}, Ldefpackage/t2;-><init>()V

    .line 304
    .line 305
    .line 306
    goto :goto_8

    .line 307
    :cond_d
    instance-of v6, v1, Ldefpackage/ky2;

    .line 308
    .line 309
    if-eqz v6, :cond_e

    .line 310
    .line 311
    new-instance v1, Ldefpackage/ky2;

    .line 312
    .line 313
    invoke-direct {v1, v5}, Ldefpackage/ky2;-><init>(I)V

    .line 314
    .line 315
    .line 316
    goto :goto_8

    .line 317
    :goto_9
    new-instance v18, Ldefpackage/jw;

    .line 318
    .line 319
    iget-object v1, v3, Ldefpackage/jw;->p:Ljava/lang/Object;

    .line 320
    .line 321
    move-object/from16 v20, v1

    .line 322
    .line 323
    check-cast v20, Ldefpackage/tb1;

    .line 324
    .line 325
    iget-object v1, v3, Ldefpackage/jw;->q:Ljava/lang/Object;

    .line 326
    .line 327
    move-object/from16 v21, v1

    .line 328
    .line 329
    check-cast v21, Ldefpackage/iu4;

    .line 330
    .line 331
    iget-object v1, v3, Ldefpackage/jw;->r:Ljava/lang/Object;

    .line 332
    .line 333
    move-object/from16 v22, v1

    .line 334
    .line 335
    check-cast v22, Ldefpackage/xn4;

    .line 336
    .line 337
    iget-boolean v1, v3, Ldefpackage/jw;->n:Z

    .line 338
    .line 339
    move/from16 v23, v1

    .line 340
    .line 341
    invoke-direct/range {v18 .. v23}, Ldefpackage/jw;-><init>(Ldefpackage/k51;Ldefpackage/tb1;Ldefpackage/iu4;Ldefpackage/xn4;Z)V

    .line 342
    .line 343
    .line 344
    move-wide/from16 v30, v8

    .line 345
    .line 346
    move v9, v5

    .line 347
    :goto_a
    move-object/from16 v1, v18

    .line 348
    .line 349
    goto/16 :goto_1d

    .line 350
    .line 351
    :cond_e
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    const-string v1, "Unexpected extractor type for recreation: "

    .line 360
    .line 361
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    return-object p3

    .line 369
    :cond_f
    iget-object v1, v1, Ldefpackage/ii0;->a:Landroid/net/Uri;

    .line 370
    .line 371
    invoke-interface/range {p1 .. p1}, Ldefpackage/ci0;->j()Ljava/util/Map;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    iget-object v6, v0, Ldefpackage/nm1;->v:Ldefpackage/xk0;

    .line 376
    .line 377
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    iget-object v13, v0, Ldefpackage/s20;->d:Ldefpackage/tb1;

    .line 381
    .line 382
    iget-object v14, v13, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 383
    .line 384
    invoke-static {v14}, Ldefpackage/h12;->x(Ljava/lang/String;)I

    .line 385
    .line 386
    .line 387
    move-result v14

    .line 388
    const-string v15, "Content-Type"

    .line 389
    .line 390
    invoke-interface {v3, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    check-cast v3, Ljava/util/List;

    .line 395
    .line 396
    if-eqz v3, :cond_11

    .line 397
    .line 398
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 399
    .line 400
    .line 401
    move-result v15

    .line 402
    if-eqz v15, :cond_10

    .line 403
    .line 404
    goto :goto_b

    .line 405
    :cond_10
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    check-cast v3, Ljava/lang/String;

    .line 410
    .line 411
    goto :goto_c

    .line 412
    :cond_11
    :goto_b
    move-object/from16 v3, p3

    .line 413
    .line 414
    :goto_c
    invoke-static {v3}, Ldefpackage/h12;->x(Ljava/lang/String;)I

    .line 415
    .line 416
    .line 417
    move-result v3

    .line 418
    invoke-static {v1}, Ldefpackage/h12;->y(Landroid/net/Uri;)I

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    new-instance v15, Ljava/util/ArrayList;

    .line 423
    .line 424
    const/4 v7, 0x7

    .line 425
    invoke-direct {v15, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 426
    .line 427
    .line 428
    invoke-static {v14, v15}, Ldefpackage/xk0;->e(ILjava/util/ArrayList;)V

    .line 429
    .line 430
    .line 431
    invoke-static {v3, v15}, Ldefpackage/xk0;->e(ILjava/util/ArrayList;)V

    .line 432
    .line 433
    .line 434
    invoke-static {v1, v15}, Ldefpackage/xk0;->e(ILjava/util/ArrayList;)V

    .line 435
    .line 436
    .line 437
    move v4, v5

    .line 438
    :goto_d
    if-ge v4, v7, :cond_12

    .line 439
    .line 440
    sget-object v19, Ldefpackage/xk0;->q:[I

    .line 441
    .line 442
    aget v7, v19, v4

    .line 443
    .line 444
    invoke-static {v7, v15}, Ldefpackage/xk0;->e(ILjava/util/ArrayList;)V

    .line 445
    .line 446
    .line 447
    add-int/lit8 v4, v4, 0x1

    .line 448
    .line 449
    const/4 v7, 0x7

    .line 450
    goto :goto_d

    .line 451
    :cond_12
    iput v5, v2, Ldefpackage/rk0;->s:I

    .line 452
    .line 453
    move-object/from16 v19, p3

    .line 454
    .line 455
    move v4, v5

    .line 456
    :goto_e
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 457
    .line 458
    .line 459
    move-result v7

    .line 460
    iget-object v5, v0, Ldefpackage/nm1;->u:Ldefpackage/iu4;

    .line 461
    .line 462
    if-ge v4, v7, :cond_29

    .line 463
    .line 464
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v7

    .line 468
    check-cast v7, Ljava/lang/Integer;

    .line 469
    .line 470
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 471
    .line 472
    .line 473
    move-result v7

    .line 474
    move/from16 v20, v4

    .line 475
    .line 476
    if-eqz v7, :cond_25

    .line 477
    .line 478
    const/4 v4, 0x1

    .line 479
    if-eq v7, v4, :cond_24

    .line 480
    .line 481
    const/4 v4, 0x2

    .line 482
    if-eq v7, v4, :cond_23

    .line 483
    .line 484
    const/4 v4, 0x7

    .line 485
    if-eq v7, v4, :cond_22

    .line 486
    .line 487
    iget-object v4, v0, Ldefpackage/nm1;->w:Ljava/util/List;

    .line 488
    .line 489
    sget-object v21, Ldefpackage/xn4;->m:Ldefpackage/xi4;

    .line 490
    .line 491
    move-object/from16 v22, v4

    .line 492
    .line 493
    const/16 v4, 0x8

    .line 494
    .line 495
    if-eq v7, v4, :cond_1a

    .line 496
    .line 497
    const/16 v4, 0xb

    .line 498
    .line 499
    if-eq v7, v4, :cond_14

    .line 500
    .line 501
    const/16 v4, 0xd

    .line 502
    .line 503
    if-eq v7, v4, :cond_13

    .line 504
    .line 505
    move-object v4, v5

    .line 506
    move-wide/from16 v30, v8

    .line 507
    .line 508
    move-object/from16 v23, v15

    .line 509
    .line 510
    move-object/from16 v5, p3

    .line 511
    .line 512
    goto/16 :goto_1b

    .line 513
    .line 514
    :cond_13
    new-instance v4, Ldefpackage/x95;

    .line 515
    .line 516
    move-wide/from16 v30, v8

    .line 517
    .line 518
    iget-object v8, v13, Ldefpackage/tb1;->d:Ljava/lang/String;

    .line 519
    .line 520
    iget-object v9, v6, Ldefpackage/xk0;->p:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast v9, Ldefpackage/om0;

    .line 523
    .line 524
    move-object/from16 v23, v15

    .line 525
    .line 526
    iget-boolean v15, v6, Ldefpackage/xk0;->o:Z

    .line 527
    .line 528
    invoke-direct {v4, v8, v5, v9, v15}, Ldefpackage/x95;-><init>(Ljava/lang/String;Ldefpackage/iu4;Ldefpackage/xn4;Z)V

    .line 529
    .line 530
    .line 531
    move-object/from16 v32, v5

    .line 532
    .line 533
    move-object v5, v4

    .line 534
    move-object/from16 v4, v32

    .line 535
    .line 536
    goto/16 :goto_1b

    .line 537
    .line 538
    :cond_14
    move-wide/from16 v30, v8

    .line 539
    .line 540
    move-object/from16 v23, v15

    .line 541
    .line 542
    iget-object v4, v6, Ldefpackage/xk0;->p:Ljava/lang/Object;

    .line 543
    .line 544
    check-cast v4, Ldefpackage/om0;

    .line 545
    .line 546
    iget-boolean v8, v6, Ldefpackage/xk0;->o:Z

    .line 547
    .line 548
    if-eqz v22, :cond_15

    .line 549
    .line 550
    const/16 v9, 0x30

    .line 551
    .line 552
    move v15, v9

    .line 553
    move-object/from16 v9, v22

    .line 554
    .line 555
    :goto_f
    move-object/from16 v24, v4

    .line 556
    .line 557
    goto :goto_10

    .line 558
    :cond_15
    new-instance v9, Ldefpackage/sb1;

    .line 559
    .line 560
    invoke-direct {v9}, Ldefpackage/sb1;-><init>()V

    .line 561
    .line 562
    .line 563
    const-string v15, "application/cea-608"

    .line 564
    .line 565
    invoke-static {v15}, Ldefpackage/lw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v15

    .line 569
    iput-object v15, v9, Ldefpackage/sb1;->m:Ljava/lang/String;

    .line 570
    .line 571
    new-instance v15, Ldefpackage/tb1;

    .line 572
    .line 573
    invoke-direct {v15, v9}, Ldefpackage/tb1;-><init>(Ldefpackage/sb1;)V

    .line 574
    .line 575
    .line 576
    invoke-static {v15}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 577
    .line 578
    .line 579
    move-result-object v9

    .line 580
    const/16 v15, 0x10

    .line 581
    .line 582
    goto :goto_f

    .line 583
    :goto_10
    iget-object v4, v13, Ldefpackage/tb1;->k:Ljava/lang/String;

    .line 584
    .line 585
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 586
    .line 587
    .line 588
    move-result v22

    .line 589
    move-object/from16 v28, v5

    .line 590
    .line 591
    if-nez v22, :cond_18

    .line 592
    .line 593
    const-string v5, "audio/mp4a-latm"

    .line 594
    .line 595
    invoke-static {v4, v5}, Ldefpackage/lw2;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v5

    .line 599
    if-eqz v5, :cond_16

    .line 600
    .line 601
    goto :goto_11

    .line 602
    :cond_16
    or-int/lit8 v15, v15, 0x2

    .line 603
    .line 604
    :goto_11
    const-string v5, "video/avc"

    .line 605
    .line 606
    invoke-static {v4, v5}, Ldefpackage/lw2;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v4

    .line 610
    if-eqz v4, :cond_17

    .line 611
    .line 612
    goto :goto_12

    .line 613
    :cond_17
    or-int/lit8 v15, v15, 0x4

    .line 614
    .line 615
    :cond_18
    :goto_12
    if-nez v8, :cond_19

    .line 616
    .line 617
    move-object/from16 v27, v21

    .line 618
    .line 619
    goto :goto_13

    .line 620
    :cond_19
    move-object/from16 v27, v24

    .line 621
    .line 622
    :goto_13
    xor-int/lit8 v26, v8, 0x1

    .line 623
    .line 624
    new-instance v24, Ldefpackage/qy4;

    .line 625
    .line 626
    new-instance v4, Ldefpackage/qn0;

    .line 627
    .line 628
    invoke-direct {v4, v9, v15}, Ldefpackage/qn0;-><init>(Ljava/util/List;I)V

    .line 629
    .line 630
    .line 631
    const/16 v25, 0x2

    .line 632
    .line 633
    move-object/from16 v29, v4

    .line 634
    .line 635
    invoke-direct/range {v24 .. v29}, Ldefpackage/qy4;-><init>(IILdefpackage/xn4;Ldefpackage/iu4;Ldefpackage/qn0;)V

    .line 636
    .line 637
    .line 638
    move-object/from16 v4, v28

    .line 639
    .line 640
    move-object/from16 v5, v24

    .line 641
    .line 642
    goto/16 :goto_1b

    .line 643
    .line 644
    :cond_1a
    move-object v4, v5

    .line 645
    move-wide/from16 v30, v8

    .line 646
    .line 647
    move-object/from16 v23, v15

    .line 648
    .line 649
    iget-object v5, v6, Ldefpackage/xk0;->p:Ljava/lang/Object;

    .line 650
    .line 651
    check-cast v5, Ldefpackage/om0;

    .line 652
    .line 653
    iget-boolean v8, v6, Ldefpackage/xk0;->o:Z

    .line 654
    .line 655
    iget-object v9, v13, Ldefpackage/tb1;->l:Ldefpackage/qv2;

    .line 656
    .line 657
    if-nez v9, :cond_1b

    .line 658
    .line 659
    move-object/from16 v24, v5

    .line 660
    .line 661
    move/from16 v26, v8

    .line 662
    .line 663
    goto :goto_17

    .line 664
    :cond_1b
    iget-object v9, v9, Ldefpackage/qv2;->a:[Ldefpackage/pv2;

    .line 665
    .line 666
    array-length v15, v9

    .line 667
    move-object/from16 v24, v5

    .line 668
    .line 669
    const/4 v5, 0x0

    .line 670
    :goto_14
    if-ge v5, v15, :cond_1e

    .line 671
    .line 672
    move/from16 v25, v5

    .line 673
    .line 674
    aget-object v5, v9, v25

    .line 675
    .line 676
    move/from16 v26, v8

    .line 677
    .line 678
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 679
    .line 680
    .line 681
    move-result-object v8

    .line 682
    move-object/from16 v27, v9

    .line 683
    .line 684
    const-class v9, Ldefpackage/nn1;

    .line 685
    .line 686
    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 687
    .line 688
    .line 689
    move-result v8

    .line 690
    if-eqz v8, :cond_1c

    .line 691
    .line 692
    invoke-virtual {v9, v5}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v5

    .line 696
    check-cast v5, Ldefpackage/pv2;

    .line 697
    .line 698
    move-object v8, v5

    .line 699
    check-cast v8, Ldefpackage/nn1;

    .line 700
    .line 701
    iget-object v8, v8, Ldefpackage/nn1;->c:Ljava/util/List;

    .line 702
    .line 703
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 704
    .line 705
    .line 706
    move-result v8

    .line 707
    if-nez v8, :cond_1c

    .line 708
    .line 709
    goto :goto_15

    .line 710
    :cond_1c
    move-object/from16 v5, p3

    .line 711
    .line 712
    :goto_15
    if-eqz v5, :cond_1d

    .line 713
    .line 714
    goto :goto_16

    .line 715
    :cond_1d
    add-int/lit8 v5, v25, 0x1

    .line 716
    .line 717
    move/from16 v8, v26

    .line 718
    .line 719
    move-object/from16 v9, v27

    .line 720
    .line 721
    goto :goto_14

    .line 722
    :cond_1e
    move/from16 v26, v8

    .line 723
    .line 724
    move-object/from16 v5, p3

    .line 725
    .line 726
    :goto_16
    if-eqz v5, :cond_1f

    .line 727
    .line 728
    const/4 v5, 0x4

    .line 729
    goto :goto_18

    .line 730
    :cond_1f
    :goto_17
    const/4 v5, 0x0

    .line 731
    :goto_18
    if-nez v26, :cond_20

    .line 732
    .line 733
    or-int/lit8 v5, v5, 0x20

    .line 734
    .line 735
    move-object/from16 v8, v21

    .line 736
    .line 737
    goto :goto_19

    .line 738
    :cond_20
    move-object/from16 v8, v24

    .line 739
    .line 740
    :goto_19
    new-instance v9, Ldefpackage/oe1;

    .line 741
    .line 742
    if-eqz v22, :cond_21

    .line 743
    .line 744
    move-object/from16 v15, v22

    .line 745
    .line 746
    goto :goto_1a

    .line 747
    :cond_21
    sget-object v15, Ldefpackage/gy3;->r:Ldefpackage/gy3;

    .line 748
    .line 749
    :goto_1a
    invoke-direct {v9, v8, v5, v4, v15}, Ldefpackage/oe1;-><init>(Ldefpackage/xn4;ILdefpackage/iu4;Ljava/util/List;)V

    .line 750
    .line 751
    .line 752
    move-object v5, v9

    .line 753
    goto :goto_1b

    .line 754
    :cond_22
    move-object v4, v5

    .line 755
    move-wide/from16 v30, v8

    .line 756
    .line 757
    move-object/from16 v23, v15

    .line 758
    .line 759
    new-instance v5, Ldefpackage/ky2;

    .line 760
    .line 761
    const-wide/16 v8, 0x0

    .line 762
    .line 763
    invoke-direct {v5, v8, v9}, Ldefpackage/ky2;-><init>(J)V

    .line 764
    .line 765
    .line 766
    goto :goto_1b

    .line 767
    :cond_23
    move-object v4, v5

    .line 768
    move-wide/from16 v30, v8

    .line 769
    .line 770
    move-object/from16 v23, v15

    .line 771
    .line 772
    new-instance v5, Ldefpackage/h6;

    .line 773
    .line 774
    const/4 v8, 0x0

    .line 775
    invoke-direct {v5, v8}, Ldefpackage/h6;-><init>(I)V

    .line 776
    .line 777
    .line 778
    goto :goto_1b

    .line 779
    :cond_24
    move-object v4, v5

    .line 780
    move-wide/from16 v30, v8

    .line 781
    .line 782
    move-object/from16 v23, v15

    .line 783
    .line 784
    new-instance v5, Ldefpackage/t2;

    .line 785
    .line 786
    invoke-direct {v5}, Ldefpackage/t2;-><init>()V

    .line 787
    .line 788
    .line 789
    goto :goto_1b

    .line 790
    :cond_25
    move-object v4, v5

    .line 791
    move-wide/from16 v30, v8

    .line 792
    .line 793
    move-object/from16 v23, v15

    .line 794
    .line 795
    new-instance v5, Ldefpackage/r2;

    .line 796
    .line 797
    invoke-direct {v5}, Ldefpackage/r2;-><init>()V

    .line 798
    .line 799
    .line 800
    :goto_1b
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 801
    .line 802
    .line 803
    :try_start_2
    invoke-interface {v5, v2}, Ldefpackage/k51;->c(Ldefpackage/l51;)Z

    .line 804
    .line 805
    .line 806
    move-result v8
    :try_end_2
    .catch Ljava/io/EOFException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 807
    const/4 v9, 0x0

    .line 808
    iput v9, v2, Ldefpackage/rk0;->s:I

    .line 809
    .line 810
    goto :goto_1c

    .line 811
    :catchall_0
    move-exception v0

    .line 812
    const/4 v9, 0x0

    .line 813
    iput v9, v2, Ldefpackage/rk0;->s:I

    .line 814
    .line 815
    throw v0

    .line 816
    :catch_3
    const/4 v9, 0x0

    .line 817
    iput v9, v2, Ldefpackage/rk0;->s:I

    .line 818
    .line 819
    move v8, v9

    .line 820
    :goto_1c
    if-eqz v8, :cond_26

    .line 821
    .line 822
    new-instance v18, Ldefpackage/jw;

    .line 823
    .line 824
    iget-object v1, v6, Ldefpackage/xk0;->p:Ljava/lang/Object;

    .line 825
    .line 826
    move-object/from16 v22, v1

    .line 827
    .line 828
    check-cast v22, Ldefpackage/om0;

    .line 829
    .line 830
    iget-boolean v1, v6, Ldefpackage/xk0;->o:Z

    .line 831
    .line 832
    move/from16 v23, v1

    .line 833
    .line 834
    move-object/from16 v21, v4

    .line 835
    .line 836
    move-object/from16 v19, v5

    .line 837
    .line 838
    move-object/from16 v20, v13

    .line 839
    .line 840
    invoke-direct/range {v18 .. v23}, Ldefpackage/jw;-><init>(Ldefpackage/k51;Ldefpackage/tb1;Ldefpackage/iu4;Ldefpackage/xn4;Z)V

    .line 841
    .line 842
    .line 843
    goto/16 :goto_a

    .line 844
    .line 845
    :cond_26
    move/from16 v4, v20

    .line 846
    .line 847
    move-object/from16 v20, v13

    .line 848
    .line 849
    if-nez v19, :cond_28

    .line 850
    .line 851
    if-eq v7, v14, :cond_27

    .line 852
    .line 853
    if-eq v7, v3, :cond_27

    .line 854
    .line 855
    if-eq v7, v1, :cond_27

    .line 856
    .line 857
    const/16 v8, 0xb

    .line 858
    .line 859
    if-ne v7, v8, :cond_28

    .line 860
    .line 861
    :cond_27
    move-object/from16 v19, v5

    .line 862
    .line 863
    :cond_28
    add-int/lit8 v4, v4, 0x1

    .line 864
    .line 865
    move v5, v9

    .line 866
    move-object/from16 v13, v20

    .line 867
    .line 868
    move-object/from16 v15, v23

    .line 869
    .line 870
    move-wide/from16 v8, v30

    .line 871
    .line 872
    goto/16 :goto_e

    .line 873
    .line 874
    :cond_29
    move-object/from16 v28, v5

    .line 875
    .line 876
    move-wide/from16 v30, v8

    .line 877
    .line 878
    move-object/from16 v20, v13

    .line 879
    .line 880
    const/4 v9, 0x0

    .line 881
    new-instance v18, Ldefpackage/jw;

    .line 882
    .line 883
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 884
    .line 885
    .line 886
    iget-object v1, v6, Ldefpackage/xk0;->p:Ljava/lang/Object;

    .line 887
    .line 888
    move-object/from16 v22, v1

    .line 889
    .line 890
    check-cast v22, Ldefpackage/om0;

    .line 891
    .line 892
    iget-boolean v1, v6, Ldefpackage/xk0;->o:Z

    .line 893
    .line 894
    move/from16 v23, v1

    .line 895
    .line 896
    move-object/from16 v21, v28

    .line 897
    .line 898
    invoke-direct/range {v18 .. v23}, Ldefpackage/jw;-><init>(Ldefpackage/k51;Ldefpackage/tb1;Ldefpackage/iu4;Ldefpackage/xn4;Z)V

    .line 899
    .line 900
    .line 901
    goto/16 :goto_a

    .line 902
    .line 903
    :goto_1d
    iput-object v1, v0, Ldefpackage/nm1;->C:Ldefpackage/jw;

    .line 904
    .line 905
    iget-object v1, v1, Ldefpackage/jw;->o:Ljava/lang/Object;

    .line 906
    .line 907
    check-cast v1, Ldefpackage/k51;

    .line 908
    .line 909
    instance-of v3, v1, Ldefpackage/h6;

    .line 910
    .line 911
    if-nez v3, :cond_2c

    .line 912
    .line 913
    instance-of v3, v1, Ldefpackage/r2;

    .line 914
    .line 915
    if-nez v3, :cond_2c

    .line 916
    .line 917
    instance-of v3, v1, Ldefpackage/t2;

    .line 918
    .line 919
    if-nez v3, :cond_2c

    .line 920
    .line 921
    instance-of v1, v1, Ldefpackage/ky2;

    .line 922
    .line 923
    if-eqz v1, :cond_2a

    .line 924
    .line 925
    goto :goto_1f

    .line 926
    :cond_2a
    iget-object v1, v0, Ldefpackage/nm1;->D:Ldefpackage/ln1;

    .line 927
    .line 928
    iget-wide v3, v1, Ldefpackage/ln1;->i0:J

    .line 929
    .line 930
    const-wide/16 v5, 0x0

    .line 931
    .line 932
    cmp-long v3, v3, v5

    .line 933
    .line 934
    if-eqz v3, :cond_2f

    .line 935
    .line 936
    iput-wide v5, v1, Ldefpackage/ln1;->i0:J

    .line 937
    .line 938
    iget-object v1, v1, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 939
    .line 940
    array-length v3, v1

    .line 941
    move v8, v9

    .line 942
    :goto_1e
    if-ge v8, v3, :cond_2f

    .line 943
    .line 944
    aget-object v4, v1, v8

    .line 945
    .line 946
    iget-wide v10, v4, Ldefpackage/p44;->F:J

    .line 947
    .line 948
    cmp-long v7, v10, v5

    .line 949
    .line 950
    if-eqz v7, :cond_2b

    .line 951
    .line 952
    iput-wide v5, v4, Ldefpackage/p44;->F:J

    .line 953
    .line 954
    const/4 v7, 0x1

    .line 955
    iput-boolean v7, v4, Ldefpackage/p44;->z:Z

    .line 956
    .line 957
    :cond_2b
    add-int/lit8 v8, v8, 0x1

    .line 958
    .line 959
    goto :goto_1e

    .line 960
    :cond_2c
    :goto_1f
    iget-object v1, v0, Ldefpackage/nm1;->D:Ldefpackage/ln1;

    .line 961
    .line 962
    cmp-long v3, v11, v16

    .line 963
    .line 964
    if-eqz v3, :cond_2d

    .line 965
    .line 966
    invoke-virtual {v10, v11, v12}, Ldefpackage/iu4;->b(J)J

    .line 967
    .line 968
    .line 969
    move-result-wide v3

    .line 970
    goto :goto_20

    .line 971
    :cond_2d
    move-wide/from16 v3, v30

    .line 972
    .line 973
    :goto_20
    iget-wide v5, v1, Ldefpackage/ln1;->i0:J

    .line 974
    .line 975
    cmp-long v5, v5, v3

    .line 976
    .line 977
    if-eqz v5, :cond_2f

    .line 978
    .line 979
    iput-wide v3, v1, Ldefpackage/ln1;->i0:J

    .line 980
    .line 981
    iget-object v1, v1, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 982
    .line 983
    array-length v5, v1

    .line 984
    move v8, v9

    .line 985
    :goto_21
    if-ge v8, v5, :cond_2f

    .line 986
    .line 987
    aget-object v6, v1, v8

    .line 988
    .line 989
    iget-wide v10, v6, Ldefpackage/p44;->F:J

    .line 990
    .line 991
    cmp-long v7, v10, v3

    .line 992
    .line 993
    if-eqz v7, :cond_2e

    .line 994
    .line 995
    iput-wide v3, v6, Ldefpackage/p44;->F:J

    .line 996
    .line 997
    const/4 v7, 0x1

    .line 998
    iput-boolean v7, v6, Ldefpackage/p44;->z:Z

    .line 999
    .line 1000
    :cond_2e
    add-int/lit8 v8, v8, 0x1

    .line 1001
    .line 1002
    goto :goto_21

    .line 1003
    :cond_2f
    iget-object v1, v0, Ldefpackage/nm1;->D:Ldefpackage/ln1;

    .line 1004
    .line 1005
    iget-object v1, v1, Ldefpackage/ln1;->K:Ljava/util/HashSet;

    .line 1006
    .line 1007
    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    .line 1008
    .line 1009
    .line 1010
    iget-object v1, v0, Ldefpackage/nm1;->C:Ldefpackage/jw;

    .line 1011
    .line 1012
    iget-object v3, v0, Ldefpackage/nm1;->D:Ldefpackage/ln1;

    .line 1013
    .line 1014
    iget-object v1, v1, Ldefpackage/jw;->o:Ljava/lang/Object;

    .line 1015
    .line 1016
    check-cast v1, Ldefpackage/k51;

    .line 1017
    .line 1018
    invoke-interface {v1, v3}, Ldefpackage/k51;->f(Ldefpackage/m51;)V

    .line 1019
    .line 1020
    .line 1021
    goto :goto_22

    .line 1022
    :cond_30
    move v9, v5

    .line 1023
    :goto_22
    iget-object v1, v0, Ldefpackage/nm1;->D:Ldefpackage/ln1;

    .line 1024
    .line 1025
    iget-object v3, v1, Ldefpackage/ln1;->j0:Ldefpackage/ow0;

    .line 1026
    .line 1027
    iget-object v0, v0, Ldefpackage/nm1;->x:Ldefpackage/ow0;

    .line 1028
    .line 1029
    invoke-static {v3, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1030
    .line 1031
    .line 1032
    move-result v3

    .line 1033
    if-nez v3, :cond_32

    .line 1034
    .line 1035
    iput-object v0, v1, Ldefpackage/ln1;->j0:Ldefpackage/ow0;

    .line 1036
    .line 1037
    move v5, v9

    .line 1038
    :goto_23
    iget-object v3, v1, Ldefpackage/ln1;->I:[Ldefpackage/kn1;

    .line 1039
    .line 1040
    array-length v4, v3

    .line 1041
    if-ge v5, v4, :cond_32

    .line 1042
    .line 1043
    iget-object v4, v1, Ldefpackage/ln1;->b0:[Z

    .line 1044
    .line 1045
    aget-boolean v4, v4, v5

    .line 1046
    .line 1047
    if-eqz v4, :cond_31

    .line 1048
    .line 1049
    aget-object v3, v3, v5

    .line 1050
    .line 1051
    iput-object v0, v3, Ldefpackage/kn1;->I:Ldefpackage/ow0;

    .line 1052
    .line 1053
    const/4 v7, 0x1

    .line 1054
    iput-boolean v7, v3, Ldefpackage/p44;->z:Z

    .line 1055
    .line 1056
    goto :goto_24

    .line 1057
    :cond_31
    const/4 v7, 0x1

    .line 1058
    :goto_24
    add-int/lit8 v5, v5, 0x1

    .line 1059
    .line 1060
    goto :goto_23

    .line 1061
    :cond_32
    return-object v2
.end method
