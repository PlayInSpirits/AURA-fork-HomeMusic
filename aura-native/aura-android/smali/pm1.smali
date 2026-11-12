.class public final Lpm1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lno2;
.implements Lgn1;


# instance fields
.field public final A:I

.field public final B:Lik3;

.field public final C:Lom1;

.field public D:Lmo2;

.field public E:I

.field public F:Ltv4;

.field public G:[Lln1;

.field public H:[Lln1;

.field public I:I

.field public J:Ls80;

.field public final n:Lxk0;

.field public final o:Lal0;

.field public final p:Lzh0;

.field public final q:Lrw4;

.field public final r:Lww0;

.field public final s:Lsw0;

.field public final t:Li80;

.field public final u:Lue1;

.field public final v:Ln9;

.field public final w:Ljava/util/IdentityHashMap;

.field public final x:Lsi1;

.field public final y:Li80;

.field public final z:Z


# direct methods
.method public constructor <init>(Lxk0;Lal0;Lzh0;Lrw4;Lww0;Lsw0;Li80;Lue1;Ln9;Li80;ZILik3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpm1;->n:Lxk0;

    .line 5
    .line 6
    iput-object p2, p0, Lpm1;->o:Lal0;

    .line 7
    .line 8
    iput-object p3, p0, Lpm1;->p:Lzh0;

    .line 9
    .line 10
    iput-object p4, p0, Lpm1;->q:Lrw4;

    .line 11
    .line 12
    iput-object p5, p0, Lpm1;->r:Lww0;

    .line 13
    .line 14
    iput-object p6, p0, Lpm1;->s:Lsw0;

    .line 15
    .line 16
    iput-object p7, p0, Lpm1;->t:Li80;

    .line 17
    .line 18
    iput-object p8, p0, Lpm1;->u:Lue1;

    .line 19
    .line 20
    iput-object p9, p0, Lpm1;->v:Ln9;

    .line 21
    .line 22
    iput-object p10, p0, Lpm1;->y:Li80;

    .line 23
    .line 24
    iput-boolean p11, p0, Lpm1;->z:Z

    .line 25
    .line 26
    iput p12, p0, Lpm1;->A:I

    .line 27
    .line 28
    iput-object p13, p0, Lpm1;->B:Lik3;

    .line 29
    .line 30
    new-instance p1, Lom1;

    .line 31
    .line 32
    const/4 p2, 0x0

    .line 33
    invoke-direct {p1, p2, p0}, Lom1;-><init>(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lpm1;->C:Lom1;

    .line 37
    .line 38
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance p1, Ls80;

    .line 42
    .line 43
    sget-object p3, Lyw1;->o:Lvw1;

    .line 44
    .line 45
    sget-object p3, Lgy3;->r:Lgy3;

    .line 46
    .line 47
    invoke-direct {p1, p3, p3}, Ls80;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lpm1;->J:Ls80;

    .line 51
    .line 52
    new-instance p1, Ljava/util/IdentityHashMap;

    .line 53
    .line 54
    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Lpm1;->w:Ljava/util/IdentityHashMap;

    .line 58
    .line 59
    new-instance p1, Lsi1;

    .line 60
    .line 61
    const/16 p3, 0x1b

    .line 62
    .line 63
    invoke-direct {p1, p3}, Lsi1;-><init>(I)V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Lpm1;->x:Lsi1;

    .line 67
    .line 68
    new-array p1, p2, [Lln1;

    .line 69
    .line 70
    iput-object p1, p0, Lpm1;->G:[Lln1;

    .line 71
    .line 72
    new-array p1, p2, [Lln1;

    .line 73
    .line 74
    iput-object p1, p0, Lpm1;->H:[Lln1;

    .line 75
    .line 76
    return-void
.end method

.method public static j(Ltb1;Ltb1;Z)Ltb1;
    .locals 12

    .line 1
    sget-object v0, Lyw1;->o:Lvw1;

    .line 2
    .line 3
    sget-object v0, Lgy3;->r:Lgy3;

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p1, Ltb1;->k:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p1, Ltb1;->l:Lqv2;

    .line 11
    .line 12
    iget v3, p1, Ltb1;->F:I

    .line 13
    .line 14
    iget v4, p1, Ltb1;->e:I

    .line 15
    .line 16
    iget v5, p1, Ltb1;->f:I

    .line 17
    .line 18
    iget-object v6, p1, Ltb1;->d:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v7, p1, Ltb1;->b:Ljava/lang/String;

    .line 21
    .line 22
    iget-object p1, p1, Ltb1;->c:Lyw1;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object p1, p0, Ltb1;->k:Ljava/lang/String;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-static {v2, p1}, Lf35;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object v2, p0, Ltb1;->l:Lqv2;

    .line 33
    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    iget v3, p0, Ltb1;->F:I

    .line 37
    .line 38
    iget v4, p0, Ltb1;->e:I

    .line 39
    .line 40
    iget v5, p0, Ltb1;->f:I

    .line 41
    .line 42
    iget-object v6, p0, Ltb1;->d:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v7, p0, Ltb1;->b:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v0, p0, Ltb1;->c:Lyw1;

    .line 47
    .line 48
    move-object v11, v0

    .line 49
    move-object v0, p1

    .line 50
    move-object p1, v11

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/4 v4, 0x0

    .line 53
    const/4 v6, 0x0

    .line 54
    move-object v3, v0

    .line 55
    move-object v0, p1

    .line 56
    move-object p1, v3

    .line 57
    move v3, v1

    .line 58
    move v5, v4

    .line 59
    move-object v7, v6

    .line 60
    :goto_0
    invoke-static {v0}, Llw2;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    if-eqz p2, :cond_2

    .line 65
    .line 66
    iget v9, p0, Ltb1;->h:I

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    move v9, v1

    .line 70
    :goto_1
    if-eqz p2, :cond_3

    .line 71
    .line 72
    iget v1, p0, Ltb1;->i:I

    .line 73
    .line 74
    :cond_3
    new-instance p2, Lsb1;

    .line 75
    .line 76
    invoke-direct {p2}, Lsb1;-><init>()V

    .line 77
    .line 78
    .line 79
    iget-object v10, p0, Ltb1;->a:Ljava/lang/String;

    .line 80
    .line 81
    iput-object v10, p2, Lsb1;->a:Ljava/lang/String;

    .line 82
    .line 83
    iput-object v7, p2, Lsb1;->b:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {p1}, Lyw1;->k(Ljava/util/Collection;)Lyw1;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iput-object p1, p2, Lsb1;->c:Lyw1;

    .line 90
    .line 91
    iget-object p0, p0, Ltb1;->m:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {p0}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    iput-object p0, p2, Lsb1;->l:Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {v8}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    iput-object p0, p2, Lsb1;->m:Ljava/lang/String;

    .line 104
    .line 105
    iput-object v0, p2, Lsb1;->j:Ljava/lang/String;

    .line 106
    .line 107
    iput-object v2, p2, Lsb1;->k:Lqv2;

    .line 108
    .line 109
    iput v9, p2, Lsb1;->h:I

    .line 110
    .line 111
    iput v1, p2, Lsb1;->i:I

    .line 112
    .line 113
    iput v3, p2, Lsb1;->E:I

    .line 114
    .line 115
    iput v4, p2, Lsb1;->e:I

    .line 116
    .line 117
    iput v5, p2, Lsb1;->f:I

    .line 118
    .line 119
    iput-object v6, p2, Lsb1;->d:Ljava/lang/String;

    .line 120
    .line 121
    new-instance p0, Ltb1;

    .line 122
    .line 123
    invoke-direct {p0, p2}, Ltb1;-><init>(Lsb1;)V

    .line 124
    .line 125
    .line 126
    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 14

    .line 1
    iget-object v0, p0, Lpm1;->G:[Lln1;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_7

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    iget-object v5, v4, Lln1;->w:Li61;

    .line 11
    .line 12
    iget-object v6, v4, Lln1;->q:Lkm1;

    .line 13
    .line 14
    iget-object v7, v4, Lln1;->A:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v8

    .line 20
    if-eqz v8, :cond_0

    .line 21
    .line 22
    goto/16 :goto_4

    .line 23
    .line 24
    :cond_0
    invoke-static {v7}, Lte5;->w(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    check-cast v7, Lnm1;

    .line 29
    .line 30
    invoke-virtual {v6, v7}, Lkm1;->b(Lnm1;)I

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    iget v9, v7, Lnm1;->o:I

    .line 35
    .line 36
    const/4 v10, 0x1

    .line 37
    if-ne v8, v10, :cond_4

    .line 38
    .line 39
    invoke-virtual {v7}, Lnm1;->f()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-nez v4, :cond_6

    .line 44
    .line 45
    const/4 v4, -0x1

    .line 46
    if-eq v9, v4, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move v10, v2

    .line 50
    :goto_1
    invoke-static {v10}, Lrr2;->w(Z)V

    .line 51
    .line 52
    .line 53
    iget-object v4, v6, Lkm1;->e:[Landroid/net/Uri;

    .line 54
    .line 55
    iget-object v5, v6, Lkm1;->h:Lsv4;

    .line 56
    .line 57
    iget-object v8, v7, Ls20;->d:Ltb1;

    .line 58
    .line 59
    invoke-virtual {v5, v8}, Lsv4;->b(Ltb1;)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    aget-object v4, v4, v5

    .line 64
    .line 65
    iget-object v5, v6, Lkm1;->g:Lal0;

    .line 66
    .line 67
    invoke-virtual {v5, v2, v4}, Lal0;->a(ZLandroid/net/Uri;)Lym1;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v5, v4, Lym1;->r:Lyw1;

    .line 75
    .line 76
    iget-wide v10, v7, Lnm1;->j:J

    .line 77
    .line 78
    iget-wide v12, v4, Lym1;->k:J

    .line 79
    .line 80
    sub-long/2addr v10, v12

    .line 81
    long-to-int v6, v10

    .line 82
    if-gez v6, :cond_2

    .line 83
    .line 84
    const-wide/16 v4, 0x0

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    if-ge v6, v8, :cond_3

    .line 92
    .line 93
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    check-cast v4, Lvm1;

    .line 98
    .line 99
    iget-object v4, v4, Lvm1;->z:Lyw1;

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_3
    iget-object v4, v4, Lym1;->s:Lyw1;

    .line 103
    .line 104
    :goto_2
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    check-cast v4, Ltm1;

    .line 109
    .line 110
    iget-wide v4, v4, Lwm1;->p:J

    .line 111
    .line 112
    :goto_3
    iput-wide v4, v7, Lnm1;->K:J

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_4
    if-nez v8, :cond_5

    .line 116
    .line 117
    iget-object v5, v4, Lln1;->E:Landroid/os/Handler;

    .line 118
    .line 119
    new-instance v6, Lk6;

    .line 120
    .line 121
    const/16 v8, 0x19

    .line 122
    .line 123
    invoke-direct {v6, v8, v4, v7}, Lk6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 127
    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_5
    const/4 v6, 0x2

    .line 131
    if-ne v8, v6, :cond_6

    .line 132
    .line 133
    iget-boolean v4, v4, Lln1;->g0:Z

    .line 134
    .line 135
    if-nez v4, :cond_6

    .line 136
    .line 137
    invoke-virtual {v5}, Li61;->l()Z

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    if-eqz v4, :cond_6

    .line 142
    .line 143
    invoke-virtual {v5}, Li61;->d()V

    .line 144
    .line 145
    .line 146
    :cond_6
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 147
    .line 148
    goto/16 :goto_0

    .line 149
    .line 150
    :cond_7
    iget-object v0, p0, Lpm1;->D:Lmo2;

    .line 151
    .line 152
    invoke-interface {v0, p0}, Lca4;->j(Lda4;)V

    .line 153
    .line 154
    .line 155
    return-void
.end method

.method public final b(Landroid/net/Uri;Lx7;Z)Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lpm1;->G:[Lln1;

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v7, 0x1

    .line 10
    :goto_0
    if-ge v6, v3, :cond_9

    .line 11
    .line 12
    aget-object v8, v2, v6

    .line 13
    .line 14
    iget-object v9, v8, Lln1;->q:Lkm1;

    .line 15
    .line 16
    iget-object v10, v9, Lkm1;->e:[Landroid/net/Uri;

    .line 17
    .line 18
    invoke-static {v10, v1}, Lf35;->m([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v11

    .line 22
    if-nez v11, :cond_0

    .line 23
    .line 24
    move-object/from16 v8, p2

    .line 25
    .line 26
    :goto_1
    const/4 v4, 0x1

    .line 27
    goto/16 :goto_7

    .line 28
    .line 29
    :cond_0
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    if-nez p3, :cond_1

    .line 35
    .line 36
    iget-object v8, v8, Lln1;->v:Li80;

    .line 37
    .line 38
    iget-object v13, v9, Lkm1;->r:Lt41;

    .line 39
    .line 40
    invoke-static {v13}, Luo;->n(Lt41;)Ln50;

    .line 41
    .line 42
    .line 43
    move-result-object v13

    .line 44
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-object/from16 v8, p2

    .line 48
    .line 49
    invoke-static {v13, v8}, Li80;->C(Ln50;Lx7;)Ldd2;

    .line 50
    .line 51
    .line 52
    move-result-object v13

    .line 53
    if-eqz v13, :cond_2

    .line 54
    .line 55
    iget v14, v13, Ldd2;->a:I

    .line 56
    .line 57
    const/4 v15, 0x2

    .line 58
    if-ne v14, v15, :cond_2

    .line 59
    .line 60
    iget-wide v13, v13, Ldd2;->b:J

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_1
    move-object/from16 v8, p2

    .line 64
    .line 65
    :cond_2
    move-wide v13, v11

    .line 66
    :goto_2
    const/4 v15, 0x0

    .line 67
    :goto_3
    array-length v4, v10

    .line 68
    const/4 v5, -0x1

    .line 69
    if-ge v15, v4, :cond_4

    .line 70
    .line 71
    aget-object v4, v10, v15

    .line 72
    .line 73
    invoke-virtual {v4, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_3

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_3
    add-int/lit8 v15, v15, 0x1

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_4
    move v15, v5

    .line 84
    :goto_4
    if-ne v15, v5, :cond_5

    .line 85
    .line 86
    goto :goto_6

    .line 87
    :cond_5
    iget-object v4, v9, Lkm1;->r:Lt41;

    .line 88
    .line 89
    invoke-interface {v4, v15}, Lt41;->t(I)I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-ne v4, v5, :cond_6

    .line 94
    .line 95
    goto :goto_6

    .line 96
    :cond_6
    iput-object v1, v9, Lkm1;->o:Landroid/net/Uri;

    .line 97
    .line 98
    cmp-long v5, v13, v11

    .line 99
    .line 100
    if-eqz v5, :cond_8

    .line 101
    .line 102
    iget-object v5, v9, Lkm1;->r:Lt41;

    .line 103
    .line 104
    invoke-interface {v5, v4, v13, v14}, Lt41;->o(IJ)Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-eqz v4, :cond_8

    .line 109
    .line 110
    iget-object v4, v9, Lkm1;->g:Lal0;

    .line 111
    .line 112
    iget-object v4, v4, Lal0;->q:Ljava/util/HashMap;

    .line 113
    .line 114
    invoke-virtual {v4, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    check-cast v4, Lzk0;

    .line 119
    .line 120
    if-eqz v4, :cond_7

    .line 121
    .line 122
    invoke-static {v4, v13, v14}, Lzk0;->a(Lzk0;J)Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    goto :goto_5

    .line 127
    :cond_7
    const/4 v4, 0x0

    .line 128
    :goto_5
    if-eqz v4, :cond_8

    .line 129
    .line 130
    :goto_6
    goto :goto_1

    .line 131
    :cond_8
    const/4 v4, 0x0

    .line 132
    :goto_7
    and-int/2addr v7, v4

    .line 133
    add-int/lit8 v6, v6, 0x1

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_9
    iget-object v1, v0, Lpm1;->D:Lmo2;

    .line 137
    .line 138
    invoke-interface {v1, v0}, Lca4;->j(Lda4;)V

    .line 139
    .line 140
    .line 141
    return v7
.end method

.method public final c([Lt41;[Z[Lq44;[ZJ)J
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-wide/from16 v4, p5

    .line 8
    .line 9
    array-length v3, v1

    .line 10
    new-array v12, v3, [I

    .line 11
    .line 12
    array-length v3, v1

    .line 13
    new-array v13, v3, [I

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    array-length v6, v1

    .line 17
    iget-object v15, v0, Lpm1;->w:Ljava/util/IdentityHashMap;

    .line 18
    .line 19
    const/4 v7, -0x1

    .line 20
    if-ge v3, v6, :cond_3

    .line 21
    .line 22
    aget-object v6, v2, v3

    .line 23
    .line 24
    if-nez v6, :cond_0

    .line 25
    .line 26
    move v6, v7

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    invoke-virtual {v15, v6}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    check-cast v6, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    :goto_1
    aput v6, v12, v3

    .line 39
    .line 40
    aput v7, v13, v3

    .line 41
    .line 42
    aget-object v6, v1, v3

    .line 43
    .line 44
    if-eqz v6, :cond_2

    .line 45
    .line 46
    invoke-interface {v6}, Lt41;->c()Lsv4;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    const/4 v8, 0x0

    .line 51
    :goto_2
    iget-object v9, v0, Lpm1;->G:[Lln1;

    .line 52
    .line 53
    array-length v10, v9

    .line 54
    if-ge v8, v10, :cond_2

    .line 55
    .line 56
    aget-object v9, v9, v8

    .line 57
    .line 58
    invoke-virtual {v9}, Lln1;->v()V

    .line 59
    .line 60
    .line 61
    iget-object v9, v9, Lln1;->V:Ltv4;

    .line 62
    .line 63
    invoke-virtual {v9, v6}, Ltv4;->b(Lsv4;)I

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    if-eq v9, v7, :cond_1

    .line 68
    .line 69
    aput v8, v13, v3

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_2
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    invoke-virtual {v15}, Ljava/util/IdentityHashMap;->clear()V

    .line 79
    .line 80
    .line 81
    array-length v3, v1

    .line 82
    new-array v6, v3, [Lq44;

    .line 83
    .line 84
    array-length v8, v1

    .line 85
    new-array v9, v8, [Lq44;

    .line 86
    .line 87
    array-length v10, v1

    .line 88
    new-array v11, v10, [Lt41;

    .line 89
    .line 90
    const/16 v16, 0x0

    .line 91
    .line 92
    iget-object v14, v0, Lpm1;->G:[Lln1;

    .line 93
    .line 94
    array-length v14, v14

    .line 95
    new-array v14, v14, [Lln1;

    .line 96
    .line 97
    move/from16 v17, v8

    .line 98
    .line 99
    move/from16 v8, v16

    .line 100
    .line 101
    move/from16 v18, v8

    .line 102
    .line 103
    move/from16 v19, v18

    .line 104
    .line 105
    :goto_4
    iget-object v7, v0, Lpm1;->G:[Lln1;

    .line 106
    .line 107
    array-length v7, v7

    .line 108
    if-ge v8, v7, :cond_2a

    .line 109
    .line 110
    move/from16 v21, v3

    .line 111
    .line 112
    move/from16 v7, v16

    .line 113
    .line 114
    :goto_5
    array-length v3, v1

    .line 115
    move-object/from16 v22, v6

    .line 116
    .line 117
    if-ge v7, v3, :cond_6

    .line 118
    .line 119
    aget v3, v12, v7

    .line 120
    .line 121
    if-ne v3, v8, :cond_4

    .line 122
    .line 123
    aget-object v3, v2, v7

    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_4
    const/4 v3, 0x0

    .line 127
    :goto_6
    aput-object v3, v9, v7

    .line 128
    .line 129
    aget v3, v13, v7

    .line 130
    .line 131
    if-ne v3, v8, :cond_5

    .line 132
    .line 133
    aget-object v6, v1, v7

    .line 134
    .line 135
    goto :goto_7

    .line 136
    :cond_5
    const/4 v6, 0x0

    .line 137
    :goto_7
    aput-object v6, v11, v7

    .line 138
    .line 139
    add-int/lit8 v7, v7, 0x1

    .line 140
    .line 141
    move-object/from16 v6, v22

    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_6
    iget-object v3, v0, Lpm1;->G:[Lln1;

    .line 145
    .line 146
    aget-object v3, v3, v8

    .line 147
    .line 148
    iget-object v7, v3, Lln1;->w:Li61;

    .line 149
    .line 150
    move/from16 v23, v8

    .line 151
    .line 152
    iget-object v8, v3, Lln1;->q:Lkm1;

    .line 153
    .line 154
    const/16 v24, 0x0

    .line 155
    .line 156
    iget-object v6, v8, Lkm1;->e:[Landroid/net/Uri;

    .line 157
    .line 158
    move-object/from16 v25, v6

    .line 159
    .line 160
    iget-object v6, v8, Lkm1;->g:Lal0;

    .line 161
    .line 162
    move-object/from16 v26, v7

    .line 163
    .line 164
    iget-object v7, v3, Lln1;->A:Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-virtual {v3}, Lln1;->v()V

    .line 167
    .line 168
    .line 169
    move-object/from16 v27, v7

    .line 170
    .line 171
    iget v7, v3, Lln1;->R:I

    .line 172
    .line 173
    move/from16 v28, v7

    .line 174
    .line 175
    move-object/from16 v29, v9

    .line 176
    .line 177
    move/from16 v7, v16

    .line 178
    .line 179
    :goto_8
    if-ge v7, v10, :cond_a

    .line 180
    .line 181
    aget-object v30, v29, v7

    .line 182
    .line 183
    const/16 v31, 0x1

    .line 184
    .line 185
    move-object/from16 v9, v30

    .line 186
    .line 187
    check-cast v9, Lhn1;

    .line 188
    .line 189
    if-eqz v9, :cond_8

    .line 190
    .line 191
    aget-object v30, v11, v7

    .line 192
    .line 193
    if-eqz v30, :cond_7

    .line 194
    .line 195
    aget-boolean v30, p2, v7

    .line 196
    .line 197
    if-nez v30, :cond_8

    .line 198
    .line 199
    :cond_7
    move/from16 v30, v7

    .line 200
    .line 201
    goto :goto_9

    .line 202
    :cond_8
    move/from16 v30, v7

    .line 203
    .line 204
    move-object/from16 v32, v11

    .line 205
    .line 206
    const/4 v11, -0x1

    .line 207
    goto :goto_a

    .line 208
    :goto_9
    iget v7, v3, Lln1;->R:I

    .line 209
    .line 210
    add-int/lit8 v7, v7, -0x1

    .line 211
    .line 212
    iput v7, v3, Lln1;->R:I

    .line 213
    .line 214
    iget v7, v9, Lhn1;->p:I

    .line 215
    .line 216
    move-object/from16 v32, v11

    .line 217
    .line 218
    const/4 v11, -0x1

    .line 219
    if-eq v7, v11, :cond_9

    .line 220
    .line 221
    iget-object v7, v9, Lhn1;->o:Lln1;

    .line 222
    .line 223
    iget v11, v9, Lhn1;->n:I

    .line 224
    .line 225
    invoke-virtual {v7}, Lln1;->v()V

    .line 226
    .line 227
    .line 228
    move/from16 v31, v11

    .line 229
    .line 230
    iget-object v11, v7, Lln1;->X:[I

    .line 231
    .line 232
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    iget-object v11, v7, Lln1;->X:[I

    .line 236
    .line 237
    aget v11, v11, v31

    .line 238
    .line 239
    move/from16 v31, v11

    .line 240
    .line 241
    iget-object v11, v7, Lln1;->a0:[Z

    .line 242
    .line 243
    aget-boolean v11, v11, v31

    .line 244
    .line 245
    invoke-static {v11}, Lrr2;->w(Z)V

    .line 246
    .line 247
    .line 248
    iget-object v7, v7, Lln1;->a0:[Z

    .line 249
    .line 250
    aput-boolean v16, v7, v31

    .line 251
    .line 252
    const/4 v11, -0x1

    .line 253
    iput v11, v9, Lhn1;->p:I

    .line 254
    .line 255
    :cond_9
    aput-object v24, v29, v30

    .line 256
    .line 257
    :goto_a
    add-int/lit8 v7, v30, 0x1

    .line 258
    .line 259
    move-object/from16 v11, v32

    .line 260
    .line 261
    goto :goto_8

    .line 262
    :cond_a
    move-object/from16 v32, v11

    .line 263
    .line 264
    const/4 v11, -0x1

    .line 265
    const/16 v31, 0x1

    .line 266
    .line 267
    if-nez v19, :cond_b

    .line 268
    .line 269
    iget-boolean v7, v3, Lln1;->f0:Z

    .line 270
    .line 271
    if-eqz v7, :cond_d

    .line 272
    .line 273
    if-nez v28, :cond_c

    .line 274
    .line 275
    :cond_b
    move-object/from16 v20, v12

    .line 276
    .line 277
    goto :goto_c

    .line 278
    :cond_c
    move-object/from16 v20, v12

    .line 279
    .line 280
    goto :goto_b

    .line 281
    :cond_d
    move-object/from16 v20, v12

    .line 282
    .line 283
    iget-wide v11, v3, Lln1;->c0:J

    .line 284
    .line 285
    cmp-long v9, v4, v11

    .line 286
    .line 287
    if-eqz v9, :cond_e

    .line 288
    .line 289
    goto :goto_c

    .line 290
    :cond_e
    :goto_b
    move/from16 v9, v16

    .line 291
    .line 292
    goto :goto_d

    .line 293
    :goto_c
    move/from16 v9, v31

    .line 294
    .line 295
    :goto_d
    iget-object v11, v8, Lkm1;->r:Lt41;

    .line 296
    .line 297
    move v12, v9

    .line 298
    move-object v7, v11

    .line 299
    move/from16 v9, v16

    .line 300
    .line 301
    :goto_e
    if-ge v9, v10, :cond_14

    .line 302
    .line 303
    move/from16 v30, v9

    .line 304
    .line 305
    aget-object v9, v32, v30

    .line 306
    .line 307
    if-nez v9, :cond_f

    .line 308
    .line 309
    move/from16 v33, v10

    .line 310
    .line 311
    goto :goto_10

    .line 312
    :cond_f
    move/from16 v33, v10

    .line 313
    .line 314
    iget-object v10, v3, Lln1;->V:Ltv4;

    .line 315
    .line 316
    move/from16 v34, v12

    .line 317
    .line 318
    invoke-interface {v9}, Lt41;->c()Lsv4;

    .line 319
    .line 320
    .line 321
    move-result-object v12

    .line 322
    invoke-virtual {v10, v12}, Ltv4;->b(Lsv4;)I

    .line 323
    .line 324
    .line 325
    move-result v10

    .line 326
    iget v12, v3, Lln1;->Y:I

    .line 327
    .line 328
    if-ne v10, v12, :cond_11

    .line 329
    .line 330
    iget-object v7, v8, Lkm1;->r:Lt41;

    .line 331
    .line 332
    invoke-interface {v7}, Lt41;->l()I

    .line 333
    .line 334
    .line 335
    move-result v7

    .line 336
    aget-object v7, v25, v7

    .line 337
    .line 338
    iget-object v12, v6, Lal0;->q:Ljava/util/HashMap;

    .line 339
    .line 340
    invoke-virtual {v12, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v7

    .line 344
    check-cast v7, Lzk0;

    .line 345
    .line 346
    if-eqz v7, :cond_10

    .line 347
    .line 348
    move/from16 v12, v16

    .line 349
    .line 350
    iput-boolean v12, v7, Lzk0;->x:Z

    .line 351
    .line 352
    :cond_10
    iput-object v9, v8, Lkm1;->r:Lt41;

    .line 353
    .line 354
    move-object v7, v9

    .line 355
    :cond_11
    aget-object v9, v29, v30

    .line 356
    .line 357
    if-nez v9, :cond_13

    .line 358
    .line 359
    iget v9, v3, Lln1;->R:I

    .line 360
    .line 361
    add-int/lit8 v9, v9, 0x1

    .line 362
    .line 363
    iput v9, v3, Lln1;->R:I

    .line 364
    .line 365
    new-instance v9, Lhn1;

    .line 366
    .line 367
    invoke-direct {v9, v3, v10}, Lhn1;-><init>(Lln1;I)V

    .line 368
    .line 369
    .line 370
    aput-object v9, v29, v30

    .line 371
    .line 372
    aput-boolean v31, p4, v30

    .line 373
    .line 374
    iget-object v12, v3, Lln1;->X:[I

    .line 375
    .line 376
    if-eqz v12, :cond_13

    .line 377
    .line 378
    invoke-virtual {v9}, Lhn1;->a()V

    .line 379
    .line 380
    .line 381
    if-nez v34, :cond_13

    .line 382
    .line 383
    iget-object v9, v3, Lln1;->I:[Lkn1;

    .line 384
    .line 385
    iget-object v12, v3, Lln1;->X:[I

    .line 386
    .line 387
    aget v10, v12, v10

    .line 388
    .line 389
    aget-object v9, v9, v10

    .line 390
    .line 391
    invoke-virtual {v9}, Lp44;->o()I

    .line 392
    .line 393
    .line 394
    move-result v10

    .line 395
    if-eqz v10, :cond_12

    .line 396
    .line 397
    move/from16 v10, v31

    .line 398
    .line 399
    invoke-virtual {v9, v10, v4, v5}, Lp44;->z(ZJ)Z

    .line 400
    .line 401
    .line 402
    move-result v9

    .line 403
    if-nez v9, :cond_12

    .line 404
    .line 405
    const/4 v9, 0x1

    .line 406
    goto :goto_f

    .line 407
    :cond_12
    const/4 v9, 0x0

    .line 408
    :goto_f
    move v12, v9

    .line 409
    goto :goto_10

    .line 410
    :cond_13
    move/from16 v12, v34

    .line 411
    .line 412
    :goto_10
    add-int/lit8 v9, v30, 0x1

    .line 413
    .line 414
    move/from16 v10, v33

    .line 415
    .line 416
    const/16 v16, 0x0

    .line 417
    .line 418
    const/16 v31, 0x1

    .line 419
    .line 420
    goto :goto_e

    .line 421
    :cond_14
    move/from16 v33, v10

    .line 422
    .line 423
    move/from16 v34, v12

    .line 424
    .line 425
    iget v9, v3, Lln1;->R:I

    .line 426
    .line 427
    if-nez v9, :cond_18

    .line 428
    .line 429
    iget-object v7, v8, Lkm1;->r:Lt41;

    .line 430
    .line 431
    invoke-interface {v7}, Lt41;->l()I

    .line 432
    .line 433
    .line 434
    move-result v7

    .line 435
    aget-object v7, v25, v7

    .line 436
    .line 437
    iget-object v6, v6, Lal0;->q:Ljava/util/HashMap;

    .line 438
    .line 439
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v6

    .line 443
    check-cast v6, Lzk0;

    .line 444
    .line 445
    if-eqz v6, :cond_15

    .line 446
    .line 447
    const/4 v12, 0x0

    .line 448
    iput-boolean v12, v6, Lzk0;->x:Z

    .line 449
    .line 450
    :cond_15
    move-object/from16 v6, v24

    .line 451
    .line 452
    iput-object v6, v8, Lkm1;->n:Landroidx/media3/exoplayer/source/BehindLiveWindowException;

    .line 453
    .line 454
    iput-object v6, v3, Lln1;->T:Ltb1;

    .line 455
    .line 456
    const/4 v10, 0x1

    .line 457
    iput-boolean v10, v3, Lln1;->e0:Z

    .line 458
    .line 459
    invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->clear()V

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v26 .. v26}, Li61;->l()Z

    .line 463
    .line 464
    .line 465
    move-result v6

    .line 466
    if-eqz v6, :cond_17

    .line 467
    .line 468
    iget-boolean v6, v3, Lln1;->P:Z

    .line 469
    .line 470
    if-eqz v6, :cond_16

    .line 471
    .line 472
    iget-object v6, v3, Lln1;->I:[Lkn1;

    .line 473
    .line 474
    array-length v7, v6

    .line 475
    const/4 v9, 0x0

    .line 476
    :goto_11
    if-ge v9, v7, :cond_16

    .line 477
    .line 478
    aget-object v11, v6, v9

    .line 479
    .line 480
    invoke-virtual {v11}, Lp44;->j()V

    .line 481
    .line 482
    .line 483
    add-int/lit8 v9, v9, 0x1

    .line 484
    .line 485
    goto :goto_11

    .line 486
    :cond_16
    invoke-virtual/range {v26 .. v26}, Li61;->d()V

    .line 487
    .line 488
    .line 489
    goto :goto_12

    .line 490
    :cond_17
    invoke-virtual {v3}, Lln1;->I()V

    .line 491
    .line 492
    .line 493
    :goto_12
    move-object v12, v8

    .line 494
    move/from16 v6, v17

    .line 495
    .line 496
    move/from16 v35, v21

    .line 497
    .line 498
    move-object/from16 v36, v22

    .line 499
    .line 500
    move/from16 v38, v23

    .line 501
    .line 502
    move/from16 v9, v34

    .line 503
    .line 504
    const/16 v28, -0x1

    .line 505
    .line 506
    move-object/from16 v17, v13

    .line 507
    .line 508
    move-object/from16 v21, v14

    .line 509
    .line 510
    move-object v13, v3

    .line 511
    goto/16 :goto_17

    .line 512
    .line 513
    :cond_18
    const/4 v10, 0x1

    .line 514
    invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->isEmpty()Z

    .line 515
    .line 516
    .line 517
    move-result v6

    .line 518
    if-nez v6, :cond_1c

    .line 519
    .line 520
    invoke-static {v7, v11}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    move-result v6

    .line 524
    if-nez v6, :cond_1c

    .line 525
    .line 526
    iget-boolean v6, v3, Lln1;->f0:Z

    .line 527
    .line 528
    if-nez v6, :cond_1b

    .line 529
    .line 530
    const-wide/16 v11, 0x0

    .line 531
    .line 532
    cmp-long v6, v4, v11

    .line 533
    .line 534
    if-gez v6, :cond_19

    .line 535
    .line 536
    neg-long v11, v4

    .line 537
    :cond_19
    invoke-virtual {v3}, Lln1;->C()Lnm1;

    .line 538
    .line 539
    .line 540
    move-result-object v6

    .line 541
    move-wide/from16 v24, v11

    .line 542
    .line 543
    invoke-virtual {v8, v6, v4, v5}, Lkm1;->a(Lnm1;J)[Lxj2;

    .line 544
    .line 545
    .line 546
    move-result-object v11

    .line 547
    move-object v12, v8

    .line 548
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    move/from16 v31, v10

    .line 554
    .line 555
    iget-object v10, v3, Lln1;->B:Ljava/util/List;

    .line 556
    .line 557
    move/from16 v37, v17

    .line 558
    .line 559
    move/from16 v35, v21

    .line 560
    .line 561
    move-object/from16 v36, v22

    .line 562
    .line 563
    move/from16 v38, v23

    .line 564
    .line 565
    const/16 v28, -0x1

    .line 566
    .line 567
    move-object/from16 v17, v13

    .line 568
    .line 569
    move-object/from16 v21, v14

    .line 570
    .line 571
    move-object v13, v3

    .line 572
    move-object v14, v6

    .line 573
    move-object v3, v7

    .line 574
    move-wide/from16 v6, v24

    .line 575
    .line 576
    invoke-interface/range {v3 .. v11}, Lt41;->b(JJJLjava/util/List;[Lxj2;)V

    .line 577
    .line 578
    .line 579
    iget-object v6, v12, Lkm1;->h:Lsv4;

    .line 580
    .line 581
    iget-object v7, v14, Ls20;->d:Ltb1;

    .line 582
    .line 583
    invoke-virtual {v6, v7}, Lsv4;->b(Ltb1;)I

    .line 584
    .line 585
    .line 586
    move-result v6

    .line 587
    invoke-interface {v3}, Lt41;->l()I

    .line 588
    .line 589
    .line 590
    move-result v3

    .line 591
    if-eq v3, v6, :cond_1a

    .line 592
    .line 593
    const/4 v10, 0x1

    .line 594
    goto :goto_13

    .line 595
    :cond_1a
    const/4 v10, 0x1

    .line 596
    goto :goto_14

    .line 597
    :cond_1b
    move-object v12, v8

    .line 598
    move/from16 v37, v17

    .line 599
    .line 600
    move/from16 v35, v21

    .line 601
    .line 602
    move-object/from16 v36, v22

    .line 603
    .line 604
    move/from16 v38, v23

    .line 605
    .line 606
    const/16 v28, -0x1

    .line 607
    .line 608
    move-object/from16 v17, v13

    .line 609
    .line 610
    move-object/from16 v21, v14

    .line 611
    .line 612
    move-object v13, v3

    .line 613
    :goto_13
    iput-boolean v10, v13, Lln1;->e0:Z

    .line 614
    .line 615
    move v3, v10

    .line 616
    move v9, v3

    .line 617
    goto :goto_15

    .line 618
    :cond_1c
    move-object v12, v8

    .line 619
    move/from16 v37, v17

    .line 620
    .line 621
    move/from16 v35, v21

    .line 622
    .line 623
    move-object/from16 v36, v22

    .line 624
    .line 625
    move/from16 v38, v23

    .line 626
    .line 627
    const/16 v28, -0x1

    .line 628
    .line 629
    move-object/from16 v17, v13

    .line 630
    .line 631
    move-object/from16 v21, v14

    .line 632
    .line 633
    move-object v13, v3

    .line 634
    :goto_14
    move/from16 v3, v19

    .line 635
    .line 636
    move/from16 v9, v34

    .line 637
    .line 638
    :goto_15
    if-eqz v9, :cond_1e

    .line 639
    .line 640
    invoke-virtual {v13, v3, v4, v5}, Lln1;->J(ZJ)Z

    .line 641
    .line 642
    .line 643
    move/from16 v6, v37

    .line 644
    .line 645
    const/4 v3, 0x0

    .line 646
    :goto_16
    if-ge v3, v6, :cond_1f

    .line 647
    .line 648
    aget-object v7, v29, v3

    .line 649
    .line 650
    if-eqz v7, :cond_1d

    .line 651
    .line 652
    aput-boolean v10, p4, v3

    .line 653
    .line 654
    :cond_1d
    add-int/lit8 v3, v3, 0x1

    .line 655
    .line 656
    const/4 v10, 0x1

    .line 657
    goto :goto_16

    .line 658
    :cond_1e
    move/from16 v6, v37

    .line 659
    .line 660
    :cond_1f
    :goto_17
    iget-object v3, v13, Lln1;->F:Ljava/util/ArrayList;

    .line 661
    .line 662
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 663
    .line 664
    .line 665
    const/4 v7, 0x0

    .line 666
    :goto_18
    if-ge v7, v6, :cond_21

    .line 667
    .line 668
    aget-object v8, v29, v7

    .line 669
    .line 670
    if-eqz v8, :cond_20

    .line 671
    .line 672
    check-cast v8, Lhn1;

    .line 673
    .line 674
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 675
    .line 676
    .line 677
    :cond_20
    add-int/lit8 v7, v7, 0x1

    .line 678
    .line 679
    goto :goto_18

    .line 680
    :cond_21
    const/4 v10, 0x1

    .line 681
    iput-boolean v10, v13, Lln1;->f0:Z

    .line 682
    .line 683
    const/4 v3, 0x0

    .line 684
    const/4 v7, 0x0

    .line 685
    :goto_19
    array-length v8, v1

    .line 686
    if-ge v3, v8, :cond_25

    .line 687
    .line 688
    aget-object v8, v29, v3

    .line 689
    .line 690
    aget v10, v17, v3

    .line 691
    .line 692
    move/from16 v11, v38

    .line 693
    .line 694
    if-ne v10, v11, :cond_22

    .line 695
    .line 696
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 697
    .line 698
    .line 699
    move-object/from16 v10, v36

    .line 700
    .line 701
    aput-object v8, v10, v3

    .line 702
    .line 703
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 704
    .line 705
    .line 706
    move-result-object v7

    .line 707
    invoke-virtual {v15, v8, v7}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    const/4 v7, 0x1

    .line 711
    goto :goto_1b

    .line 712
    :cond_22
    move-object/from16 v10, v36

    .line 713
    .line 714
    aget v14, v20, v3

    .line 715
    .line 716
    if-ne v14, v11, :cond_24

    .line 717
    .line 718
    if-nez v8, :cond_23

    .line 719
    .line 720
    const/4 v8, 0x1

    .line 721
    goto :goto_1a

    .line 722
    :cond_23
    const/4 v8, 0x0

    .line 723
    :goto_1a
    invoke-static {v8}, Lrr2;->w(Z)V

    .line 724
    .line 725
    .line 726
    :cond_24
    :goto_1b
    add-int/lit8 v3, v3, 0x1

    .line 727
    .line 728
    move-object/from16 v36, v10

    .line 729
    .line 730
    move/from16 v38, v11

    .line 731
    .line 732
    goto :goto_19

    .line 733
    :cond_25
    move-object/from16 v10, v36

    .line 734
    .line 735
    move/from16 v11, v38

    .line 736
    .line 737
    move/from16 v3, v18

    .line 738
    .line 739
    if-eqz v7, :cond_29

    .line 740
    .line 741
    aput-object v13, v21, v3

    .line 742
    .line 743
    add-int/lit8 v18, v3, 0x1

    .line 744
    .line 745
    if-nez v3, :cond_27

    .line 746
    .line 747
    const/4 v3, 0x1

    .line 748
    iput-boolean v3, v12, Lkm1;->l:Z

    .line 749
    .line 750
    if-nez v9, :cond_26

    .line 751
    .line 752
    iget-object v7, v0, Lpm1;->H:[Lln1;

    .line 753
    .line 754
    array-length v8, v7

    .line 755
    if-eqz v8, :cond_26

    .line 756
    .line 757
    const/16 v16, 0x0

    .line 758
    .line 759
    aget-object v7, v7, v16

    .line 760
    .line 761
    if-eq v13, v7, :cond_29

    .line 762
    .line 763
    :cond_26
    iget-object v7, v0, Lpm1;->x:Lsi1;

    .line 764
    .line 765
    iget-object v7, v7, Lsi1;->o:Ljava/lang/Object;

    .line 766
    .line 767
    check-cast v7, Landroid/util/SparseArray;

    .line 768
    .line 769
    invoke-virtual {v7}, Landroid/util/SparseArray;->clear()V

    .line 770
    .line 771
    .line 772
    move/from16 v19, v3

    .line 773
    .line 774
    goto :goto_1d

    .line 775
    :cond_27
    const/4 v3, 0x1

    .line 776
    iget v7, v0, Lpm1;->I:I

    .line 777
    .line 778
    if-ge v11, v7, :cond_28

    .line 779
    .line 780
    move v9, v3

    .line 781
    goto :goto_1c

    .line 782
    :cond_28
    const/4 v9, 0x0

    .line 783
    :goto_1c
    iput-boolean v9, v12, Lkm1;->l:Z

    .line 784
    .line 785
    :cond_29
    :goto_1d
    add-int/lit8 v8, v11, 0x1

    .line 786
    .line 787
    move-object/from16 v13, v17

    .line 788
    .line 789
    move-object/from16 v12, v20

    .line 790
    .line 791
    move-object/from16 v14, v21

    .line 792
    .line 793
    move-object/from16 v9, v29

    .line 794
    .line 795
    move-object/from16 v11, v32

    .line 796
    .line 797
    move/from16 v3, v35

    .line 798
    .line 799
    const/16 v16, 0x0

    .line 800
    .line 801
    move/from16 v17, v6

    .line 802
    .line 803
    move-object v6, v10

    .line 804
    move/from16 v10, v33

    .line 805
    .line 806
    goto/16 :goto_4

    .line 807
    .line 808
    :cond_2a
    move v7, v3

    .line 809
    move-object v10, v6

    .line 810
    move-object/from16 v21, v14

    .line 811
    .line 812
    move/from16 v12, v16

    .line 813
    .line 814
    move/from16 v3, v18

    .line 815
    .line 816
    invoke-static {v10, v12, v2, v12, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 817
    .line 818
    .line 819
    move-object/from16 v1, v21

    .line 820
    .line 821
    invoke-static {v3, v1}, Lf35;->S(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v1

    .line 825
    check-cast v1, [Lln1;

    .line 826
    .line 827
    iput-object v1, v0, Lpm1;->H:[Lln1;

    .line 828
    .line 829
    invoke-static {v1}, Lyw1;->l([Ljava/lang/Object;)Lgy3;

    .line 830
    .line 831
    .line 832
    move-result-object v1

    .line 833
    new-instance v2, Lmj0;

    .line 834
    .line 835
    const/16 v3, 0x1b

    .line 836
    .line 837
    invoke-direct {v2, v3}, Lmj0;-><init>(I)V

    .line 838
    .line 839
    .line 840
    invoke-static {v2, v1}, Lhw;->P(Leg1;Ljava/util/List;)Ljava/util/AbstractList;

    .line 841
    .line 842
    .line 843
    move-result-object v2

    .line 844
    iget-object v3, v0, Lpm1;->y:Li80;

    .line 845
    .line 846
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 847
    .line 848
    .line 849
    new-instance v3, Ls80;

    .line 850
    .line 851
    invoke-direct {v3, v1, v2}, Ls80;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 852
    .line 853
    .line 854
    iput-object v3, v0, Lpm1;->J:Ls80;

    .line 855
    .line 856
    return-wide v4
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-object p0, p0, Lpm1;->J:Ls80;

    .line 2
    .line 3
    invoke-virtual {p0}, Ls80;->d()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final e(JLn84;)J
    .locals 12

    .line 1
    iget-object p0, p0, Lpm1;->H:[Lln1;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_4

    .line 6
    .line 7
    aget-object v2, p0, v1

    .line 8
    .line 9
    iget v3, v2, Lln1;->N:I

    .line 10
    .line 11
    const/4 v4, 0x2

    .line 12
    if-ne v3, v4, :cond_3

    .line 13
    .line 14
    iget-object p0, v2, Lln1;->q:Lkm1;

    .line 15
    .line 16
    iget-object v0, p0, Lkm1;->g:Lal0;

    .line 17
    .line 18
    iget-object v1, p0, Lkm1;->r:Lt41;

    .line 19
    .line 20
    invoke-interface {v1}, Lt41;->d()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iget-object v2, p0, Lkm1;->e:[Landroid/net/Uri;

    .line 25
    .line 26
    array-length v3, v2

    .line 27
    const/4 v4, 0x1

    .line 28
    if-ge v1, v3, :cond_0

    .line 29
    .line 30
    const/4 v3, -0x1

    .line 31
    if-eq v1, v3, :cond_0

    .line 32
    .line 33
    iget-object p0, p0, Lkm1;->r:Lt41;

    .line 34
    .line 35
    invoke-interface {p0}, Lt41;->l()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    aget-object p0, v2, p0

    .line 40
    .line 41
    invoke-virtual {v0, v4, p0}, Lal0;->a(ZLandroid/net/Uri;)Lym1;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    const/4 p0, 0x0

    .line 47
    :goto_1
    if-eqz p0, :cond_4

    .line 48
    .line 49
    iget-object v1, p0, Lym1;->r:Lyw1;

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_1
    iget-wide v2, p0, Lym1;->h:J

    .line 59
    .line 60
    iget-wide v5, v0, Lal0;->A:J

    .line 61
    .line 62
    sub-long/2addr v2, v5

    .line 63
    sub-long v6, p1, v2

    .line 64
    .line 65
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {v1, p1, v4}, Lf35;->d(Ljava/util/List;Ljava/lang/Long;Z)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    check-cast p2, Lvm1;

    .line 78
    .line 79
    iget-wide v8, p2, Lwm1;->r:J

    .line 80
    .line 81
    iget-boolean p0, p0, Ldn1;->c:Z

    .line 82
    .line 83
    if-eqz p0, :cond_2

    .line 84
    .line 85
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    sub-int/2addr p0, v4

    .line 90
    if-eq p1, p0, :cond_2

    .line 91
    .line 92
    add-int/2addr p1, v4

    .line 93
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, Lvm1;

    .line 98
    .line 99
    iget-wide p0, p0, Lwm1;->r:J

    .line 100
    .line 101
    move-wide v10, p0

    .line 102
    :goto_2
    move-object v5, p3

    .line 103
    goto :goto_3

    .line 104
    :cond_2
    move-wide v10, v8

    .line 105
    goto :goto_2

    .line 106
    :goto_3
    invoke-virtual/range {v5 .. v11}, Ln84;->a(JJJ)J

    .line 107
    .line 108
    .line 109
    move-result-wide p0

    .line 110
    add-long/2addr p0, v2

    .line 111
    return-wide p0

    .line 112
    :cond_3
    move-object v5, p3

    .line 113
    add-int/lit8 v1, v1, 0x1

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_4
    :goto_4
    return-wide p1
.end method

.method public final f()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lpm1;->J:Ls80;

    .line 2
    .line 3
    invoke-virtual {p0}, Ls80;->f()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final g(Ljava/lang/String;I[Landroid/net/Uri;[Ltb1;Ltb1;Ljava/util/List;Ljava/util/Map;J)Lln1;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lkm1;

    .line 4
    .line 5
    iget-object v8, v0, Lpm1;->x:Lsi1;

    .line 6
    .line 7
    iget-object v10, v0, Lpm1;->B:Lik3;

    .line 8
    .line 9
    iget-object v2, v0, Lpm1;->n:Lxk0;

    .line 10
    .line 11
    iget-object v3, v0, Lpm1;->o:Lal0;

    .line 12
    .line 13
    iget-object v6, v0, Lpm1;->p:Lzh0;

    .line 14
    .line 15
    iget-object v7, v0, Lpm1;->q:Lrw4;

    .line 16
    .line 17
    move-object/from16 v4, p3

    .line 18
    .line 19
    move-object/from16 v5, p4

    .line 20
    .line 21
    move-object/from16 v9, p6

    .line 22
    .line 23
    invoke-direct/range {v1 .. v10}, Lkm1;-><init>(Lxk0;Lal0;[Landroid/net/Uri;[Ltb1;Lzh0;Lrw4;Lsi1;Ljava/util/List;Lik3;)V

    .line 24
    .line 25
    .line 26
    new-instance v2, Lln1;

    .line 27
    .line 28
    iget v14, v0, Lpm1;->A:I

    .line 29
    .line 30
    const/4 v15, 0x0

    .line 31
    iget-object v3, v0, Lpm1;->C:Lom1;

    .line 32
    .line 33
    iget-object v6, v0, Lpm1;->v:Ln9;

    .line 34
    .line 35
    iget-object v10, v0, Lpm1;->r:Lww0;

    .line 36
    .line 37
    iget-object v11, v0, Lpm1;->s:Lsw0;

    .line 38
    .line 39
    iget-object v12, v0, Lpm1;->t:Li80;

    .line 40
    .line 41
    iget-object v13, v0, Lpm1;->u:Lue1;

    .line 42
    .line 43
    move-object/from16 v9, p5

    .line 44
    .line 45
    move-object/from16 v5, p7

    .line 46
    .line 47
    move-wide/from16 v7, p8

    .line 48
    .line 49
    move-object v4, v1

    .line 50
    move-object v0, v2

    .line 51
    move-object/from16 v1, p1

    .line 52
    .line 53
    move/from16 v2, p2

    .line 54
    .line 55
    invoke-direct/range {v0 .. v15}, Lln1;-><init>(Ljava/lang/String;ILom1;Lkm1;Ljava/util/Map;Ln9;JLtb1;Lww0;Lsw0;Li80;Lue1;ILty3;)V

    .line 56
    .line 57
    .line 58
    return-object v0
.end method

.method public final h()V
    .locals 4

    .line 1
    iget-object p0, p0, Lpm1;->G:[Lln1;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_2

    .line 6
    .line 7
    aget-object v2, p0, v1

    .line 8
    .line 9
    invoke-virtual {v2}, Lln1;->G()V

    .line 10
    .line 11
    .line 12
    iget-boolean v3, v2, Lln1;->g0:Z

    .line 13
    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    iget-boolean v2, v2, Lln1;->Q:Z

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    const-string p0, "Loading finished before preparation is complete."

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-static {v0, p0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    throw p0

    .line 29
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    return-void
.end method

.method public final i(J)J
    .locals 4

    .line 1
    iget-object v0, p0, Lpm1;->H:[Lln1;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-lez v1, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aget-object v0, v0, v1

    .line 8
    .line 9
    invoke-virtual {v0, v1, p1, p2}, Lln1;->J(ZJ)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    :goto_0
    iget-object v2, p0, Lpm1;->H:[Lln1;

    .line 15
    .line 16
    array-length v3, v2

    .line 17
    if-ge v1, v3, :cond_0

    .line 18
    .line 19
    aget-object v2, v2, v1

    .line 20
    .line 21
    invoke-virtual {v2, v0, p1, p2}, Lln1;->J(ZJ)Z

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object p0, p0, Lpm1;->x:Lsi1;

    .line 30
    .line 31
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Landroid/util/SparseArray;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/util/SparseArray;->clear()V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-wide p1
.end method

.method public final k(ZJ)V
    .locals 8

    .line 1
    iget-object p0, p0, Lpm1;->H:[Lln1;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    if-ge v2, v0, :cond_2

    .line 7
    .line 8
    aget-object v3, p0, v2

    .line 9
    .line 10
    iget-boolean v4, v3, Lln1;->P:Z

    .line 11
    .line 12
    if-eqz v4, :cond_1

    .line 13
    .line 14
    invoke-virtual {v3}, Lln1;->E()Z

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    iget-object v4, v3, Lln1;->I:[Lkn1;

    .line 22
    .line 23
    array-length v4, v4

    .line 24
    move v5, v1

    .line 25
    :goto_1
    if-ge v5, v4, :cond_1

    .line 26
    .line 27
    iget-object v6, v3, Lln1;->I:[Lkn1;

    .line 28
    .line 29
    aget-object v6, v6, v5

    .line 30
    .line 31
    iget-object v7, v3, Lln1;->a0:[Z

    .line 32
    .line 33
    aget-boolean v7, v7, v5

    .line 34
    .line 35
    invoke-virtual {v6, p2, p3, p1, v7}, Lp44;->i(JZZ)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v5, v5, 0x1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-void
.end method

.method public final l()J
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide v0
.end method

.method public final m(Lmo2;J)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iput-object v1, v0, Lpm1;->D:Lmo2;

    .line 6
    .line 7
    iget-object v1, v0, Lpm1;->o:Lal0;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v2, v1, Lal0;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 13
    .line 14
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    iget-object v10, v1, Lal0;->w:Lcn1;

    .line 18
    .line 19
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v11, v10, Lcn1;->f:Ljava/util/List;

    .line 23
    .line 24
    iget-object v1, v10, Lcn1;->e:Ljava/util/List;

    .line 25
    .line 26
    sget-object v7, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    iget-object v12, v10, Lcn1;->g:Ljava/util/List;

    .line 33
    .line 34
    const/4 v13, 0x0

    .line 35
    iput v13, v0, Lpm1;->E:I

    .line 36
    .line 37
    new-instance v14, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance v15, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    iget-object v3, v0, Lpm1;->n:Lxk0;

    .line 48
    .line 49
    iget-boolean v4, v0, Lpm1;->z:Z

    .line 50
    .line 51
    if-nez v2, :cond_14

    .line 52
    .line 53
    iget-object v2, v10, Lcn1;->h:Ltb1;

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    new-array v8, v6, [I

    .line 60
    .line 61
    move/from16 p1, v13

    .line 62
    .line 63
    move/from16 v9, p1

    .line 64
    .line 65
    move/from16 v16, v9

    .line 66
    .line 67
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    move-object/from16 v18, v12

    .line 72
    .line 73
    if-ge v9, v5, :cond_3

    .line 74
    .line 75
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    check-cast v5, Lbn1;

    .line 80
    .line 81
    iget-object v5, v5, Lbn1;->b:Ltb1;

    .line 82
    .line 83
    iget v12, v5, Ltb1;->v:I

    .line 84
    .line 85
    iget-object v5, v5, Ltb1;->k:Ljava/lang/String;

    .line 86
    .line 87
    if-gtz v12, :cond_0

    .line 88
    .line 89
    const/4 v12, 0x2

    .line 90
    invoke-static {v12, v5}, Lf35;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v20

    .line 94
    if-eqz v20, :cond_1

    .line 95
    .line 96
    :cond_0
    const/16 v19, 0x2

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    const/4 v12, 0x1

    .line 100
    invoke-static {v12, v5}, Lf35;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    if-eqz v5, :cond_2

    .line 105
    .line 106
    aput v12, v8, v9

    .line 107
    .line 108
    add-int/lit8 v13, v13, 0x1

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_2
    const/4 v5, -0x1

    .line 112
    aput v5, v8, v9

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :goto_1
    aput v19, v8, v9

    .line 116
    .line 117
    add-int/lit8 v16, v16, 0x1

    .line 118
    .line 119
    :goto_2
    add-int/lit8 v9, v9, 0x1

    .line 120
    .line 121
    move-object/from16 v12, v18

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_3
    if-lez v16, :cond_4

    .line 125
    .line 126
    move/from16 v6, p1

    .line 127
    .line 128
    move-object v9, v3

    .line 129
    move/from16 v12, v16

    .line 130
    .line 131
    const/4 v5, 0x1

    .line 132
    goto :goto_3

    .line 133
    :cond_4
    if-ge v13, v6, :cond_5

    .line 134
    .line 135
    sub-int/2addr v6, v13

    .line 136
    move/from16 v5, p1

    .line 137
    .line 138
    move-object v9, v3

    .line 139
    move v12, v6

    .line 140
    const/4 v6, 0x1

    .line 141
    goto :goto_3

    .line 142
    :cond_5
    move/from16 v5, p1

    .line 143
    .line 144
    move-object v9, v3

    .line 145
    move v12, v6

    .line 146
    move v6, v5

    .line 147
    :goto_3
    new-array v3, v12, [Landroid/net/Uri;

    .line 148
    .line 149
    move v13, v4

    .line 150
    new-array v4, v12, [Ltb1;

    .line 151
    .line 152
    move/from16 v16, v13

    .line 153
    .line 154
    new-array v13, v12, [I

    .line 155
    .line 156
    move/from16 v0, p1

    .line 157
    .line 158
    move/from16 v20, v0

    .line 159
    .line 160
    move-object/from16 v21, v2

    .line 161
    .line 162
    :goto_4
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    if-ge v0, v2, :cond_9

    .line 167
    .line 168
    if-eqz v5, :cond_6

    .line 169
    .line 170
    aget v2, v8, v0

    .line 171
    .line 172
    move-object/from16 v22, v3

    .line 173
    .line 174
    const/4 v3, 0x2

    .line 175
    if-ne v2, v3, :cond_8

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_6
    move-object/from16 v22, v3

    .line 179
    .line 180
    :goto_5
    if-eqz v6, :cond_7

    .line 181
    .line 182
    aget v2, v8, v0

    .line 183
    .line 184
    const/4 v3, 0x1

    .line 185
    if-eq v2, v3, :cond_8

    .line 186
    .line 187
    :cond_7
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    check-cast v2, Lbn1;

    .line 192
    .line 193
    iget-object v3, v2, Lbn1;->a:Landroid/net/Uri;

    .line 194
    .line 195
    aput-object v3, v22, v20

    .line 196
    .line 197
    iget-object v2, v2, Lbn1;->b:Ltb1;

    .line 198
    .line 199
    aput-object v2, v4, v20

    .line 200
    .line 201
    add-int/lit8 v2, v20, 0x1

    .line 202
    .line 203
    aput v0, v13, v20

    .line 204
    .line 205
    move/from16 v20, v2

    .line 206
    .line 207
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 208
    .line 209
    move-object/from16 v3, v22

    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_9
    move-object/from16 v22, v3

    .line 213
    .line 214
    aget-object v0, v4, p1

    .line 215
    .line 216
    iget-object v0, v0, Ltb1;->k:Ljava/lang/String;

    .line 217
    .line 218
    const/4 v3, 0x2

    .line 219
    invoke-static {v3, v0}, Lf35;->u(ILjava/lang/String;)I

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    const/4 v3, 0x1

    .line 224
    invoke-static {v3, v0}, Lf35;->u(ILjava/lang/String;)I

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eq v0, v3, :cond_a

    .line 229
    .line 230
    if-nez v0, :cond_b

    .line 231
    .line 232
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    if-eqz v2, :cond_b

    .line 237
    .line 238
    :cond_a
    if-gt v1, v3, :cond_b

    .line 239
    .line 240
    add-int v2, v0, v1

    .line 241
    .line 242
    if-lez v2, :cond_b

    .line 243
    .line 244
    move/from16 v17, v3

    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_b
    move/from16 v17, p1

    .line 248
    .line 249
    :goto_6
    if-nez v5, :cond_c

    .line 250
    .line 251
    if-lez v0, :cond_c

    .line 252
    .line 253
    move v2, v3

    .line 254
    goto :goto_7

    .line 255
    :cond_c
    move/from16 v2, p1

    .line 256
    .line 257
    :goto_7
    iget-object v5, v10, Lcn1;->h:Ltb1;

    .line 258
    .line 259
    iget-object v6, v10, Lcn1;->i:Ljava/util/List;

    .line 260
    .line 261
    move v8, v1

    .line 262
    const-string v1, "main"

    .line 263
    .line 264
    move-object/from16 v23, v9

    .line 265
    .line 266
    move-object/from16 v20, v11

    .line 267
    .line 268
    move/from16 v24, v16

    .line 269
    .line 270
    move-object/from16 v11, v21

    .line 271
    .line 272
    move-object/from16 v3, v22

    .line 273
    .line 274
    move/from16 v22, v0

    .line 275
    .line 276
    move/from16 v21, v8

    .line 277
    .line 278
    move-object/from16 v0, p0

    .line 279
    .line 280
    move-wide/from16 v8, p2

    .line 281
    .line 282
    invoke-virtual/range {v0 .. v9}, Lpm1;->g(Ljava/lang/String;I[Landroid/net/Uri;[Ltb1;Ltb1;Ljava/util/List;Ljava/util/Map;J)Lln1;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    invoke-virtual {v15, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    if-eqz v24, :cond_13

    .line 293
    .line 294
    if-eqz v17, :cond_13

    .line 295
    .line 296
    new-instance v0, Ljava/util/ArrayList;

    .line 297
    .line 298
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 299
    .line 300
    .line 301
    if-lez v21, :cond_11

    .line 302
    .line 303
    new-array v3, v12, [Ltb1;

    .line 304
    .line 305
    move/from16 v5, p1

    .line 306
    .line 307
    :goto_8
    if-ge v5, v12, :cond_d

    .line 308
    .line 309
    aget-object v6, v4, v5

    .line 310
    .line 311
    iget-object v8, v6, Ltb1;->k:Ljava/lang/String;

    .line 312
    .line 313
    const/4 v9, 0x2

    .line 314
    invoke-static {v9, v8}, Lf35;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v8

    .line 318
    invoke-static {v8}, Llw2;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v13

    .line 322
    new-instance v9, Lsb1;

    .line 323
    .line 324
    invoke-direct {v9}, Lsb1;-><init>()V

    .line 325
    .line 326
    .line 327
    move-object/from16 v17, v4

    .line 328
    .line 329
    iget-object v4, v6, Ltb1;->a:Ljava/lang/String;

    .line 330
    .line 331
    iput-object v4, v9, Lsb1;->a:Ljava/lang/String;

    .line 332
    .line 333
    iget-object v4, v6, Ltb1;->b:Ljava/lang/String;

    .line 334
    .line 335
    iput-object v4, v9, Lsb1;->b:Ljava/lang/String;

    .line 336
    .line 337
    iget-object v4, v6, Ltb1;->c:Lyw1;

    .line 338
    .line 339
    invoke-static {v4}, Lyw1;->k(Ljava/util/Collection;)Lyw1;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    iput-object v4, v9, Lsb1;->c:Lyw1;

    .line 344
    .line 345
    iget-object v4, v6, Ltb1;->m:Ljava/lang/String;

    .line 346
    .line 347
    invoke-static {v4}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v4

    .line 351
    iput-object v4, v9, Lsb1;->l:Ljava/lang/String;

    .line 352
    .line 353
    invoke-static {v13}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v4

    .line 357
    iput-object v4, v9, Lsb1;->m:Ljava/lang/String;

    .line 358
    .line 359
    iput-object v8, v9, Lsb1;->j:Ljava/lang/String;

    .line 360
    .line 361
    iget-object v4, v6, Ltb1;->l:Lqv2;

    .line 362
    .line 363
    iput-object v4, v9, Lsb1;->k:Lqv2;

    .line 364
    .line 365
    iget v4, v6, Ltb1;->h:I

    .line 366
    .line 367
    iput v4, v9, Lsb1;->h:I

    .line 368
    .line 369
    iget v4, v6, Ltb1;->i:I

    .line 370
    .line 371
    iput v4, v9, Lsb1;->i:I

    .line 372
    .line 373
    iget v4, v6, Ltb1;->u:I

    .line 374
    .line 375
    iput v4, v9, Lsb1;->t:I

    .line 376
    .line 377
    iget v4, v6, Ltb1;->v:I

    .line 378
    .line 379
    iput v4, v9, Lsb1;->u:I

    .line 380
    .line 381
    iget v4, v6, Ltb1;->y:F

    .line 382
    .line 383
    iput v4, v9, Lsb1;->x:F

    .line 384
    .line 385
    iget v4, v6, Ltb1;->e:I

    .line 386
    .line 387
    iput v4, v9, Lsb1;->e:I

    .line 388
    .line 389
    iget v4, v6, Ltb1;->f:I

    .line 390
    .line 391
    iput v4, v9, Lsb1;->f:I

    .line 392
    .line 393
    new-instance v4, Ltb1;

    .line 394
    .line 395
    invoke-direct {v4, v9}, Ltb1;-><init>(Lsb1;)V

    .line 396
    .line 397
    .line 398
    aput-object v4, v3, v5

    .line 399
    .line 400
    add-int/lit8 v5, v5, 0x1

    .line 401
    .line 402
    move-object/from16 v4, v17

    .line 403
    .line 404
    goto :goto_8

    .line 405
    :cond_d
    move-object/from16 v17, v4

    .line 406
    .line 407
    new-instance v4, Lsv4;

    .line 408
    .line 409
    invoke-direct {v4, v1, v3}, Lsv4;-><init>(Ljava/lang/String;[Ltb1;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    if-lez v22, :cond_f

    .line 416
    .line 417
    if-nez v11, :cond_e

    .line 418
    .line 419
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->isEmpty()Z

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    if-eqz v1, :cond_f

    .line 424
    .line 425
    :cond_e
    new-instance v1, Lsv4;

    .line 426
    .line 427
    aget-object v3, v17, p1

    .line 428
    .line 429
    move/from16 v4, p1

    .line 430
    .line 431
    invoke-static {v3, v11, v4}, Lpm1;->j(Ltb1;Ltb1;Z)Ltb1;

    .line 432
    .line 433
    .line 434
    move-result-object v3

    .line 435
    filled-new-array {v3}, [Ltb1;

    .line 436
    .line 437
    .line 438
    move-result-object v3

    .line 439
    const-string v4, "main:audio"

    .line 440
    .line 441
    invoke-direct {v1, v4, v3}, Lsv4;-><init>(Ljava/lang/String;[Ltb1;)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    :cond_f
    iget-object v1, v10, Lcn1;->i:Ljava/util/List;

    .line 448
    .line 449
    if-eqz v1, :cond_10

    .line 450
    .line 451
    const/4 v3, 0x0

    .line 452
    :goto_9
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 453
    .line 454
    .line 455
    move-result v4

    .line 456
    if-ge v3, v4, :cond_10

    .line 457
    .line 458
    const-string v4, "main:cc:"

    .line 459
    .line 460
    invoke-static {v3, v4}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v4

    .line 464
    new-instance v5, Lsv4;

    .line 465
    .line 466
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v6

    .line 470
    check-cast v6, Ltb1;

    .line 471
    .line 472
    move-object/from16 v10, v23

    .line 473
    .line 474
    invoke-virtual {v10, v6}, Lxk0;->i(Ltb1;)Ltb1;

    .line 475
    .line 476
    .line 477
    move-result-object v6

    .line 478
    filled-new-array {v6}, [Ltb1;

    .line 479
    .line 480
    .line 481
    move-result-object v6

    .line 482
    invoke-direct {v5, v4, v6}, Lsv4;-><init>(Ljava/lang/String;[Ltb1;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    add-int/lit8 v3, v3, 0x1

    .line 489
    .line 490
    goto :goto_9

    .line 491
    :cond_10
    move-object/from16 v10, v23

    .line 492
    .line 493
    goto :goto_b

    .line 494
    :cond_11
    move-object/from16 v17, v4

    .line 495
    .line 496
    move-object/from16 v10, v23

    .line 497
    .line 498
    new-array v3, v12, [Ltb1;

    .line 499
    .line 500
    const/4 v4, 0x0

    .line 501
    :goto_a
    if-ge v4, v12, :cond_12

    .line 502
    .line 503
    aget-object v5, v17, v4

    .line 504
    .line 505
    const/4 v6, 0x1

    .line 506
    invoke-static {v5, v11, v6}, Lpm1;->j(Ltb1;Ltb1;Z)Ltb1;

    .line 507
    .line 508
    .line 509
    move-result-object v5

    .line 510
    aput-object v5, v3, v4

    .line 511
    .line 512
    add-int/lit8 v4, v4, 0x1

    .line 513
    .line 514
    goto :goto_a

    .line 515
    :cond_12
    new-instance v4, Lsv4;

    .line 516
    .line 517
    invoke-direct {v4, v1, v3}, Lsv4;-><init>(Ljava/lang/String;[Ltb1;)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    :goto_b
    new-instance v1, Lsv4;

    .line 524
    .line 525
    new-instance v3, Lsb1;

    .line 526
    .line 527
    invoke-direct {v3}, Lsb1;-><init>()V

    .line 528
    .line 529
    .line 530
    const-string v4, "ID3"

    .line 531
    .line 532
    iput-object v4, v3, Lsb1;->a:Ljava/lang/String;

    .line 533
    .line 534
    const-string v4, "application/id3"

    .line 535
    .line 536
    invoke-static {v4}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v4

    .line 540
    iput-object v4, v3, Lsb1;->m:Ljava/lang/String;

    .line 541
    .line 542
    new-instance v4, Ltb1;

    .line 543
    .line 544
    invoke-direct {v4, v3}, Ltb1;-><init>(Lsb1;)V

    .line 545
    .line 546
    .line 547
    filled-new-array {v4}, [Ltb1;

    .line 548
    .line 549
    .line 550
    move-result-object v3

    .line 551
    const-string v4, "main:id3"

    .line 552
    .line 553
    invoke-direct {v1, v4, v3}, Lsv4;-><init>(Ljava/lang/String;[Ltb1;)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    const/4 v4, 0x0

    .line 560
    new-array v3, v4, [Lsv4;

    .line 561
    .line 562
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v3

    .line 566
    check-cast v3, [Lsv4;

    .line 567
    .line 568
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 569
    .line 570
    .line 571
    move-result v0

    .line 572
    filled-new-array {v0}, [I

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    invoke-virtual {v2, v3, v0}, Lln1;->H([Lsv4;[I)V

    .line 577
    .line 578
    .line 579
    goto :goto_c

    .line 580
    :cond_13
    move-object/from16 v10, v23

    .line 581
    .line 582
    goto :goto_c

    .line 583
    :cond_14
    move-object v10, v3

    .line 584
    move/from16 v24, v4

    .line 585
    .line 586
    move-object/from16 v20, v11

    .line 587
    .line 588
    move-object/from16 v18, v12

    .line 589
    .line 590
    :goto_c
    new-instance v11, Ljava/util/ArrayList;

    .line 591
    .line 592
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->size()I

    .line 593
    .line 594
    .line 595
    move-result v0

    .line 596
    invoke-direct {v11, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 597
    .line 598
    .line 599
    new-instance v12, Ljava/util/ArrayList;

    .line 600
    .line 601
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->size()I

    .line 602
    .line 603
    .line 604
    move-result v0

    .line 605
    invoke-direct {v12, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 606
    .line 607
    .line 608
    new-instance v13, Ljava/util/ArrayList;

    .line 609
    .line 610
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->size()I

    .line 611
    .line 612
    .line 613
    move-result v0

    .line 614
    invoke-direct {v13, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 615
    .line 616
    .line 617
    new-instance v0, Ljava/util/HashSet;

    .line 618
    .line 619
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 620
    .line 621
    .line 622
    const/4 v1, 0x0

    .line 623
    :goto_d
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->size()I

    .line 624
    .line 625
    .line 626
    move-result v2

    .line 627
    if-ge v1, v2, :cond_1a

    .line 628
    .line 629
    move-object/from16 v2, v20

    .line 630
    .line 631
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v3

    .line 635
    check-cast v3, Lan1;

    .line 636
    .line 637
    iget-object v3, v3, Lan1;->c:Ljava/lang/String;

    .line 638
    .line 639
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    move-result v4

    .line 643
    if-nez v4, :cond_15

    .line 644
    .line 645
    move-object/from16 v19, v0

    .line 646
    .line 647
    move/from16 v21, v1

    .line 648
    .line 649
    move-object/from16 v20, v2

    .line 650
    .line 651
    move-object/from16 v0, p0

    .line 652
    .line 653
    goto/16 :goto_10

    .line 654
    .line 655
    :cond_15
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v13}, Ljava/util/ArrayList;->clear()V

    .line 662
    .line 663
    .line 664
    const/4 v4, 0x0

    .line 665
    const/16 v17, 0x1

    .line 666
    .line 667
    :goto_e
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 668
    .line 669
    .line 670
    move-result v5

    .line 671
    if-ge v4, v5, :cond_18

    .line 672
    .line 673
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v5

    .line 677
    check-cast v5, Lan1;

    .line 678
    .line 679
    iget-object v5, v5, Lan1;->c:Ljava/lang/String;

    .line 680
    .line 681
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 682
    .line 683
    .line 684
    move-result v5

    .line 685
    if-eqz v5, :cond_17

    .line 686
    .line 687
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v5

    .line 691
    check-cast v5, Lan1;

    .line 692
    .line 693
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 694
    .line 695
    .line 696
    move-result-object v6

    .line 697
    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 698
    .line 699
    .line 700
    iget-object v6, v5, Lan1;->a:Landroid/net/Uri;

    .line 701
    .line 702
    iget-object v5, v5, Lan1;->b:Ltb1;

    .line 703
    .line 704
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 708
    .line 709
    .line 710
    iget-object v5, v5, Ltb1;->k:Ljava/lang/String;

    .line 711
    .line 712
    const/4 v6, 0x1

    .line 713
    invoke-static {v6, v5}, Lf35;->u(ILjava/lang/String;)I

    .line 714
    .line 715
    .line 716
    move-result v5

    .line 717
    if-ne v5, v6, :cond_16

    .line 718
    .line 719
    const/4 v5, 0x1

    .line 720
    goto :goto_f

    .line 721
    :cond_16
    const/4 v5, 0x0

    .line 722
    :goto_f
    and-int v5, v17, v5

    .line 723
    .line 724
    move/from16 v17, v5

    .line 725
    .line 726
    :cond_17
    add-int/lit8 v4, v4, 0x1

    .line 727
    .line 728
    goto :goto_e

    .line 729
    :cond_18
    const-string v4, "audio:"

    .line 730
    .line 731
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 732
    .line 733
    .line 734
    move-result-object v3

    .line 735
    const/4 v4, 0x0

    .line 736
    new-array v5, v4, [Landroid/net/Uri;

    .line 737
    .line 738
    sget-object v6, Lf35;->a:Ljava/lang/String;

    .line 739
    .line 740
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object v5

    .line 744
    check-cast v5, [Landroid/net/Uri;

    .line 745
    .line 746
    new-array v6, v4, [Ltb1;

    .line 747
    .line 748
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v4

    .line 752
    check-cast v4, [Ltb1;

    .line 753
    .line 754
    move v6, v1

    .line 755
    move-object v1, v3

    .line 756
    move-object v3, v5

    .line 757
    const/4 v5, 0x0

    .line 758
    move v8, v6

    .line 759
    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 760
    .line 761
    move-object/from16 v20, v2

    .line 762
    .line 763
    const/4 v2, 0x1

    .line 764
    move-object/from16 v19, v0

    .line 765
    .line 766
    move/from16 v21, v8

    .line 767
    .line 768
    move-object/from16 v0, p0

    .line 769
    .line 770
    move-wide/from16 v8, p2

    .line 771
    .line 772
    invoke-virtual/range {v0 .. v9}, Lpm1;->g(Ljava/lang/String;I[Landroid/net/Uri;[Ltb1;Ltb1;Ljava/util/List;Ljava/util/Map;J)Lln1;

    .line 773
    .line 774
    .line 775
    move-result-object v2

    .line 776
    invoke-static {v13}, Ljz4;->N(Ljava/util/Collection;)[I

    .line 777
    .line 778
    .line 779
    move-result-object v3

    .line 780
    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 781
    .line 782
    .line 783
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 784
    .line 785
    .line 786
    if-eqz v24, :cond_19

    .line 787
    .line 788
    if-eqz v17, :cond_19

    .line 789
    .line 790
    const/4 v4, 0x0

    .line 791
    new-array v3, v4, [Ltb1;

    .line 792
    .line 793
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 794
    .line 795
    .line 796
    move-result-object v3

    .line 797
    check-cast v3, [Ltb1;

    .line 798
    .line 799
    new-instance v5, Lsv4;

    .line 800
    .line 801
    invoke-direct {v5, v1, v3}, Lsv4;-><init>(Ljava/lang/String;[Ltb1;)V

    .line 802
    .line 803
    .line 804
    filled-new-array {v5}, [Lsv4;

    .line 805
    .line 806
    .line 807
    move-result-object v1

    .line 808
    new-array v3, v4, [I

    .line 809
    .line 810
    invoke-virtual {v2, v1, v3}, Lln1;->H([Lsv4;[I)V

    .line 811
    .line 812
    .line 813
    :cond_19
    :goto_10
    add-int/lit8 v1, v21, 0x1

    .line 814
    .line 815
    move-object/from16 v0, v19

    .line 816
    .line 817
    goto/16 :goto_d

    .line 818
    .line 819
    :cond_1a
    move-object/from16 v0, p0

    .line 820
    .line 821
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 822
    .line 823
    .line 824
    move-result v1

    .line 825
    iput v1, v0, Lpm1;->I:I

    .line 826
    .line 827
    new-instance v11, Ljava/util/ArrayList;

    .line 828
    .line 829
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    .line 830
    .line 831
    .line 832
    move-result v1

    .line 833
    invoke-direct {v11, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 834
    .line 835
    .line 836
    new-instance v12, Ljava/util/ArrayList;

    .line 837
    .line 838
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    .line 839
    .line 840
    .line 841
    move-result v1

    .line 842
    invoke-direct {v12, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 843
    .line 844
    .line 845
    new-instance v13, Ljava/util/ArrayList;

    .line 846
    .line 847
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    .line 848
    .line 849
    .line 850
    move-result v1

    .line 851
    invoke-direct {v13, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 852
    .line 853
    .line 854
    new-instance v1, Ljava/util/HashSet;

    .line 855
    .line 856
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 857
    .line 858
    .line 859
    const/4 v2, 0x0

    .line 860
    :goto_11
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    .line 861
    .line 862
    .line 863
    move-result v3

    .line 864
    if-ge v2, v3, :cond_1f

    .line 865
    .line 866
    move-object/from16 v3, v18

    .line 867
    .line 868
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 869
    .line 870
    .line 871
    move-result-object v4

    .line 872
    check-cast v4, Lan1;

    .line 873
    .line 874
    iget-object v4, v4, Lan1;->c:Ljava/lang/String;

    .line 875
    .line 876
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 877
    .line 878
    .line 879
    move-result v5

    .line 880
    if-nez v5, :cond_1b

    .line 881
    .line 882
    move-object/from16 v17, v1

    .line 883
    .line 884
    move/from16 v19, v2

    .line 885
    .line 886
    move-object/from16 v18, v3

    .line 887
    .line 888
    const/4 v4, 0x0

    .line 889
    goto/16 :goto_14

    .line 890
    .line 891
    :cond_1b
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    .line 892
    .line 893
    .line 894
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    .line 895
    .line 896
    .line 897
    invoke-virtual {v13}, Ljava/util/ArrayList;->clear()V

    .line 898
    .line 899
    .line 900
    const/4 v5, 0x0

    .line 901
    :goto_12
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 902
    .line 903
    .line 904
    move-result v6

    .line 905
    if-ge v5, v6, :cond_1d

    .line 906
    .line 907
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    move-result-object v6

    .line 911
    check-cast v6, Lan1;

    .line 912
    .line 913
    iget-object v6, v6, Lan1;->c:Ljava/lang/String;

    .line 914
    .line 915
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 916
    .line 917
    .line 918
    move-result v6

    .line 919
    if-eqz v6, :cond_1c

    .line 920
    .line 921
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    move-result-object v6

    .line 925
    check-cast v6, Lan1;

    .line 926
    .line 927
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 928
    .line 929
    .line 930
    move-result-object v8

    .line 931
    invoke-virtual {v13, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 932
    .line 933
    .line 934
    iget-object v8, v6, Lan1;->a:Landroid/net/Uri;

    .line 935
    .line 936
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 937
    .line 938
    .line 939
    iget-object v6, v6, Lan1;->b:Ltb1;

    .line 940
    .line 941
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 942
    .line 943
    .line 944
    :cond_1c
    add-int/lit8 v5, v5, 0x1

    .line 945
    .line 946
    goto :goto_12

    .line 947
    :cond_1d
    const-string v5, "subtitle:"

    .line 948
    .line 949
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 950
    .line 951
    .line 952
    move-result-object v4

    .line 953
    const/4 v5, 0x0

    .line 954
    new-array v6, v5, [Ltb1;

    .line 955
    .line 956
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    move-result-object v6

    .line 960
    check-cast v6, [Ltb1;

    .line 961
    .line 962
    new-array v8, v5, [Landroid/net/Uri;

    .line 963
    .line 964
    sget-object v5, Lf35;->a:Ljava/lang/String;

    .line 965
    .line 966
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    move-result-object v5

    .line 970
    check-cast v5, [Landroid/net/Uri;

    .line 971
    .line 972
    sget-object v8, Lyw1;->o:Lvw1;

    .line 973
    .line 974
    move-object v8, v1

    .line 975
    move-object v1, v4

    .line 976
    move-object v4, v6

    .line 977
    sget-object v6, Lgy3;->r:Lgy3;

    .line 978
    .line 979
    move v9, v2

    .line 980
    const/4 v2, 0x3

    .line 981
    move-object/from16 v18, v3

    .line 982
    .line 983
    move-object v3, v5

    .line 984
    const/4 v5, 0x0

    .line 985
    move-object/from16 v17, v8

    .line 986
    .line 987
    move/from16 v19, v9

    .line 988
    .line 989
    move-wide/from16 v8, p2

    .line 990
    .line 991
    invoke-virtual/range {v0 .. v9}, Lpm1;->g(Ljava/lang/String;I[Landroid/net/Uri;[Ltb1;Ltb1;Ljava/util/List;Ljava/util/Map;J)Lln1;

    .line 992
    .line 993
    .line 994
    move-result-object v2

    .line 995
    invoke-static {v13}, Ljz4;->N(Ljava/util/Collection;)[I

    .line 996
    .line 997
    .line 998
    move-result-object v3

    .line 999
    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1003
    .line 1004
    .line 1005
    array-length v3, v4

    .line 1006
    new-array v5, v3, [Ltb1;

    .line 1007
    .line 1008
    const/4 v6, 0x0

    .line 1009
    :goto_13
    if-ge v6, v3, :cond_1e

    .line 1010
    .line 1011
    aget-object v8, v4, v6

    .line 1012
    .line 1013
    invoke-virtual {v10, v8}, Lxk0;->i(Ltb1;)Ltb1;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v8

    .line 1017
    aput-object v8, v5, v6

    .line 1018
    .line 1019
    add-int/lit8 v6, v6, 0x1

    .line 1020
    .line 1021
    goto :goto_13

    .line 1022
    :cond_1e
    new-instance v3, Lsv4;

    .line 1023
    .line 1024
    invoke-direct {v3, v1, v5}, Lsv4;-><init>(Ljava/lang/String;[Ltb1;)V

    .line 1025
    .line 1026
    .line 1027
    filled-new-array {v3}, [Lsv4;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v1

    .line 1031
    const/4 v4, 0x0

    .line 1032
    new-array v3, v4, [I

    .line 1033
    .line 1034
    invoke-virtual {v2, v1, v3}, Lln1;->H([Lsv4;[I)V

    .line 1035
    .line 1036
    .line 1037
    :goto_14
    add-int/lit8 v2, v19, 0x1

    .line 1038
    .line 1039
    move-object/from16 v1, v17

    .line 1040
    .line 1041
    goto/16 :goto_11

    .line 1042
    .line 1043
    :cond_1f
    const/4 v4, 0x0

    .line 1044
    new-array v1, v4, [Lln1;

    .line 1045
    .line 1046
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v1

    .line 1050
    check-cast v1, [Lln1;

    .line 1051
    .line 1052
    iput-object v1, v0, Lpm1;->G:[Lln1;

    .line 1053
    .line 1054
    new-array v1, v4, [[I

    .line 1055
    .line 1056
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v1

    .line 1060
    check-cast v1, [[I

    .line 1061
    .line 1062
    iget-object v1, v0, Lpm1;->G:[Lln1;

    .line 1063
    .line 1064
    array-length v1, v1

    .line 1065
    iput v1, v0, Lpm1;->E:I

    .line 1066
    .line 1067
    move v1, v4

    .line 1068
    :goto_15
    iget v2, v0, Lpm1;->I:I

    .line 1069
    .line 1070
    iget-object v3, v0, Lpm1;->G:[Lln1;

    .line 1071
    .line 1072
    if-ge v1, v2, :cond_20

    .line 1073
    .line 1074
    aget-object v2, v3, v1

    .line 1075
    .line 1076
    iget-object v2, v2, Lln1;->q:Lkm1;

    .line 1077
    .line 1078
    const/4 v6, 0x1

    .line 1079
    iput-boolean v6, v2, Lkm1;->l:Z

    .line 1080
    .line 1081
    add-int/lit8 v1, v1, 0x1

    .line 1082
    .line 1083
    goto :goto_15

    .line 1084
    :cond_20
    array-length v1, v3

    .line 1085
    move v13, v4

    .line 1086
    :goto_16
    if-ge v13, v1, :cond_22

    .line 1087
    .line 1088
    aget-object v2, v3, v13

    .line 1089
    .line 1090
    iget-boolean v4, v2, Lln1;->Q:Z

    .line 1091
    .line 1092
    if-nez v4, :cond_21

    .line 1093
    .line 1094
    new-instance v4, Lod2;

    .line 1095
    .line 1096
    invoke-direct {v4}, Lod2;-><init>()V

    .line 1097
    .line 1098
    .line 1099
    iget-wide v5, v2, Lln1;->c0:J

    .line 1100
    .line 1101
    iput-wide v5, v4, Lod2;->a:J

    .line 1102
    .line 1103
    new-instance v5, Lpd2;

    .line 1104
    .line 1105
    invoke-direct {v5, v4}, Lpd2;-><init>(Lod2;)V

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v2, v5}, Lln1;->o(Lpd2;)Z

    .line 1109
    .line 1110
    .line 1111
    :cond_21
    add-int/lit8 v13, v13, 0x1

    .line 1112
    .line 1113
    goto :goto_16

    .line 1114
    :cond_22
    iget-object v1, v0, Lpm1;->G:[Lln1;

    .line 1115
    .line 1116
    iput-object v1, v0, Lpm1;->H:[Lln1;

    .line 1117
    .line 1118
    return-void
.end method

.method public final n()Ltv4;
    .locals 0

    .line 1
    iget-object p0, p0, Lpm1;->F:Ltv4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final o(Lpd2;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lpm1;->F:Ltv4;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object p0, p0, Lpm1;->G:[Lln1;

    .line 6
    .line 7
    array-length p1, p0

    .line 8
    const/4 v0, 0x0

    .line 9
    move v1, v0

    .line 10
    :goto_0
    if-ge v1, p1, :cond_1

    .line 11
    .line 12
    aget-object v2, p0, v1

    .line 13
    .line 14
    iget-boolean v3, v2, Lln1;->Q:Z

    .line 15
    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    new-instance v3, Lod2;

    .line 19
    .line 20
    invoke-direct {v3}, Lod2;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-wide v4, v2, Lln1;->c0:J

    .line 24
    .line 25
    iput-wide v4, v3, Lod2;->a:J

    .line 26
    .line 27
    new-instance v4, Lpd2;

    .line 28
    .line 29
    invoke-direct {v4, v3}, Lpd2;-><init>(Lod2;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v4}, Lln1;->o(Lpd2;)Z

    .line 33
    .line 34
    .line 35
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return v0

    .line 39
    :cond_2
    iget-object p0, p0, Lpm1;->J:Ls80;

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Ls80;->o(Lpd2;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0
.end method

.method public final q()J
    .locals 2

    .line 1
    iget-object p0, p0, Lpm1;->J:Ls80;

    .line 2
    .line 3
    invoke-virtual {p0}, Ls80;->q()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final u(J)V
    .locals 0

    .line 1
    iget-object p0, p0, Lpm1;->J:Ls80;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ls80;->u(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
