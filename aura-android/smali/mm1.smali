.class public final Lmm1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldu0;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Lii0;

.field public final d:Lce3;

.field public final e:Ljava/util/ArrayList;

.field public final f:Lkx;

.field public final g:Lse4;

.field public final h:Lpx;

.field public final i:Ljava/util/concurrent/Executor;

.field public final j:J

.field public final k:Ljava/util/ArrayList;

.field public volatile l:Z


# direct methods
.method public constructor <init>(Lgn2;Lce3;Lkx;Ljava/util/concurrent/Executor;JJJ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lgn2;->b:Lbn2;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v0, p1, Lbn2;->a:Landroid/net/Uri;

    .line 10
    .line 11
    invoke-static {v0}, Lmm1;->d(Landroid/net/Uri;)Lii0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lmm1;->c:Lii0;

    .line 16
    .line 17
    iput-object p2, p0, Lmm1;->d:Lce3;

    .line 18
    .line 19
    new-instance p2, Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object p1, p1, Lbn2;->e:Ljava/util/List;

    .line 22
    .line 23
    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, Lmm1;->e:Ljava/util/ArrayList;

    .line 27
    .line 28
    iput-object p3, p0, Lmm1;->f:Lkx;

    .line 29
    .line 30
    iput-object p4, p0, Lmm1;->i:Ljava/util/concurrent/Executor;

    .line 31
    .line 32
    iput-wide p7, p0, Lmm1;->a:J

    .line 33
    .line 34
    iput-wide p9, p0, Lmm1;->b:J

    .line 35
    .line 36
    iget-object p1, p3, Lkx;->n:Lse4;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lmm1;->g:Lse4;

    .line 42
    .line 43
    iget-object p1, p3, Lkx;->p:Lpx;

    .line 44
    .line 45
    iput-object p1, p0, Lmm1;->h:Lpx;

    .line 46
    .line 47
    new-instance p1, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lmm1;->k:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-static {p5, p6}, Lf35;->Q(J)J

    .line 55
    .line 56
    .line 57
    move-result-wide p1

    .line 58
    iput-wide p1, p0, Lmm1;->j:J

    .line 59
    .line 60
    return-void
.end method

.method public static c(Lym1;Lvm1;Ljava/util/HashSet;Ljava/util/ArrayList;)V
    .locals 9

    .line 1
    iget-object v0, p0, Ldn1;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-wide v1, p0, Lym1;->h:J

    .line 4
    .line 5
    iget-wide v3, p1, Lwm1;->r:J

    .line 6
    .line 7
    add-long/2addr v1, v3

    .line 8
    iget-object p0, p1, Lwm1;->t:Ljava/lang/String;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-static {v0, p0}, Ljz4;->H(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p2, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    new-instance p2, Lx84;

    .line 23
    .line 24
    invoke-static {p0}, Lmm1;->d(Landroid/net/Uri;)Lii0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {p2, v1, v2, p0}, Lx84;-><init>(JLii0;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object p0, p1, Lwm1;->n:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, p0}, Ljz4;->H(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    new-instance v3, Lii0;

    .line 41
    .line 42
    iget-wide v5, p1, Lwm1;->v:J

    .line 43
    .line 44
    iget-wide v7, p1, Lwm1;->w:J

    .line 45
    .line 46
    invoke-direct/range {v3 .. v8}, Lii0;-><init>(Landroid/net/Uri;JJ)V

    .line 47
    .line 48
    .line 49
    new-instance p0, Lx84;

    .line 50
    .line 51
    invoke-direct {p0, v1, v2, v3}, Lx84;-><init>(JLii0;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public static d(Landroid/net/Uri;)Lii0;
    .locals 13

    .line 1
    sget-object v6, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    const-string v0, "The uri must be set."

    .line 4
    .line 5
    invoke-static {p0, v0}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lii0;

    .line 9
    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    const/4 v5, 0x0

    .line 14
    const-wide/16 v7, 0x0

    .line 15
    .line 16
    const-wide/16 v9, -0x1

    .line 17
    .line 18
    const/4 v11, 0x0

    .line 19
    const/4 v12, 0x1

    .line 20
    move-object v1, p0

    .line 21
    invoke-direct/range {v0 .. v12}, Lii0;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public static g(Ljava/util/ArrayList;Lpx;J)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    move v3, v2

    .line 10
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    if-ge v2, v4, :cond_3

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    check-cast v4, Lx84;

    .line 21
    .line 22
    iget-object v5, v4, Lx84;->o:Lii0;

    .line 23
    .line 24
    move-object/from16 v6, p1

    .line 25
    .line 26
    invoke-interface {v6, v5}, Lpx;->d(Lii0;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    check-cast v8, Ljava/lang/Integer;

    .line 35
    .line 36
    if-nez v8, :cond_0

    .line 37
    .line 38
    const/4 v9, 0x0

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    check-cast v9, Lx84;

    .line 49
    .line 50
    :goto_1
    if-eqz v9, :cond_2

    .line 51
    .line 52
    iget-wide v10, v9, Lx84;->n:J

    .line 53
    .line 54
    iget-object v9, v9, Lx84;->o:Lii0;

    .line 55
    .line 56
    iget-wide v12, v4, Lx84;->n:J

    .line 57
    .line 58
    add-long v14, v10, p2

    .line 59
    .line 60
    cmp-long v12, v12, v14

    .line 61
    .line 62
    if-gtz v12, :cond_2

    .line 63
    .line 64
    iget-object v12, v9, Lii0;->a:Landroid/net/Uri;

    .line 65
    .line 66
    iget-wide v13, v9, Lii0;->g:J

    .line 67
    .line 68
    iget-object v15, v5, Lii0;->a:Landroid/net/Uri;

    .line 69
    .line 70
    invoke-virtual {v12, v15}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v12

    .line 74
    if-eqz v12, :cond_2

    .line 75
    .line 76
    const-wide/16 v15, -0x1

    .line 77
    .line 78
    cmp-long v12, v13, v15

    .line 79
    .line 80
    if-eqz v12, :cond_2

    .line 81
    .line 82
    move-wide/from16 v17, v13

    .line 83
    .line 84
    iget-wide v12, v9, Lii0;->f:J

    .line 85
    .line 86
    add-long v12, v12, v17

    .line 87
    .line 88
    move-wide/from16 v19, v12

    .line 89
    .line 90
    iget-wide v12, v5, Lii0;->f:J

    .line 91
    .line 92
    cmp-long v12, v19, v12

    .line 93
    .line 94
    if-nez v12, :cond_2

    .line 95
    .line 96
    iget-object v12, v9, Lii0;->h:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v13, v5, Lii0;->h:Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {v12, v13}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v12

    .line 104
    if-eqz v12, :cond_2

    .line 105
    .line 106
    iget v12, v9, Lii0;->i:I

    .line 107
    .line 108
    iget v13, v5, Lii0;->i:I

    .line 109
    .line 110
    if-ne v12, v13, :cond_2

    .line 111
    .line 112
    iget v12, v9, Lii0;->c:I

    .line 113
    .line 114
    iget v13, v5, Lii0;->c:I

    .line 115
    .line 116
    if-ne v12, v13, :cond_2

    .line 117
    .line 118
    iget-object v12, v9, Lii0;->e:Ljava/util/Map;

    .line 119
    .line 120
    iget-object v13, v5, Lii0;->e:Ljava/util/Map;

    .line 121
    .line 122
    invoke-interface {v12, v13}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v12

    .line 126
    if-eqz v12, :cond_2

    .line 127
    .line 128
    iget-wide v4, v5, Lii0;->g:J

    .line 129
    .line 130
    cmp-long v7, v4, v15

    .line 131
    .line 132
    if-nez v7, :cond_1

    .line 133
    .line 134
    :goto_2
    move-wide v4, v15

    .line 135
    goto :goto_3

    .line 136
    :cond_1
    add-long v15, v17, v4

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :goto_3
    const-wide/16 v12, 0x0

    .line 140
    .line 141
    invoke-virtual {v9, v12, v13, v4, v5}, Lii0;->b(JJ)Lii0;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    new-instance v7, Lx84;

    .line 153
    .line 154
    invoke-direct {v7, v10, v11, v4}, Lx84;-><init>(JLii0;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v5, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    invoke-virtual {v1, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v3, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    add-int/lit8 v3, v3, 0x1

    .line 172
    .line 173
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 174
    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    invoke-static {v0, v3, v1}, Lf35;->X(Ljava/util/ArrayList;II)V

    .line 182
    .line 183
    .line 184
    return-void
.end method


# virtual methods
.method public final a(Lkt0;)V
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    new-instance v2, Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v3, Ljava/util/ArrayDeque;

    .line 9
    .line 10
    invoke-direct {v3}, Ljava/util/ArrayDeque;-><init>()V

    .line 11
    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x1

    .line 15
    :try_start_0
    iget-object v0, v1, Lmm1;->f:Lkx;

    .line 16
    .line 17
    invoke-virtual {v0}, Lkx;->b()Llx;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v6, v1, Lmm1;->c:Lii0;

    .line 22
    .line 23
    invoke-virtual {v1, v0, v6, v4}, Lmm1;->e(Llx;Lii0;Z)Ldn1;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    iget-object v7, v1, Lmm1;->e:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    if-nez v7, :cond_0

    .line 34
    .line 35
    iget-object v7, v1, Lmm1;->e:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v6, v7}, Ldn1;->a(Ljava/util/List;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    check-cast v6, Ldn1;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    goto/16 :goto_a

    .line 46
    .line 47
    :cond_0
    :goto_0
    invoke-virtual {v1, v0, v6, v4}, Lmm1;->f(Llx;Ldn1;Z)Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    iget-object v6, v1, Lmm1;->h:Lpx;

    .line 55
    .line 56
    iget-wide v7, v1, Lmm1;->j:J

    .line 57
    .line 58
    invoke-static {v0, v6, v7, v8}, Lmm1;->g(Ljava/util/ArrayList;Lpx;J)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result v13

    .line 65
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    sub-int/2addr v6, v5

    .line 70
    const-wide/16 v7, 0x0

    .line 71
    .line 72
    move/from16 v16, v4

    .line 73
    .line 74
    move-wide v11, v7

    .line 75
    move-wide v14, v11

    .line 76
    :goto_1
    if-ltz v6, :cond_5

    .line 77
    .line 78
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    check-cast v7, Lx84;

    .line 83
    .line 84
    iget-object v7, v7, Lx84;->o:Lii0;

    .line 85
    .line 86
    iget-object v8, v1, Lmm1;->h:Lpx;

    .line 87
    .line 88
    invoke-interface {v8, v7}, Lpx;->d(Lii0;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    iget-wide v9, v7, Lii0;->g:J

    .line 93
    .line 94
    const-wide/16 v23, -0x1

    .line 95
    .line 96
    cmp-long v17, v9, v23

    .line 97
    .line 98
    if-nez v17, :cond_1

    .line 99
    .line 100
    iget-object v4, v1, Lmm1;->g:Lse4;

    .line 101
    .line 102
    invoke-virtual {v4, v8}, Lse4;->i(Ljava/lang/String;)Lyj0;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-static {v4}, Lnd0;->a(Lnd0;)J

    .line 107
    .line 108
    .line 109
    move-result-wide v17

    .line 110
    cmp-long v4, v17, v23

    .line 111
    .line 112
    if-eqz v4, :cond_1

    .line 113
    .line 114
    iget-wide v9, v7, Lii0;->f:J

    .line 115
    .line 116
    sub-long v9, v17, v9

    .line 117
    .line 118
    :cond_1
    move-wide/from16 v20, v9

    .line 119
    .line 120
    iget-object v4, v1, Lmm1;->g:Lse4;

    .line 121
    .line 122
    iget-wide v9, v7, Lii0;->f:J

    .line 123
    .line 124
    move-object/from16 v17, v4

    .line 125
    .line 126
    move-object/from16 v22, v8

    .line 127
    .line 128
    move-wide/from16 v18, v9

    .line 129
    .line 130
    invoke-virtual/range {v17 .. v22}, Lse4;->g(JJLjava/lang/String;)J

    .line 131
    .line 132
    .line 133
    move-result-wide v7

    .line 134
    add-long/2addr v14, v7

    .line 135
    cmp-long v4, v20, v23

    .line 136
    .line 137
    if-eqz v4, :cond_3

    .line 138
    .line 139
    cmp-long v4, v20, v7

    .line 140
    .line 141
    if-nez v4, :cond_2

    .line 142
    .line 143
    add-int/lit8 v16, v16, 0x1

    .line 144
    .line 145
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    :cond_2
    cmp-long v4, v11, v23

    .line 149
    .line 150
    if-eqz v4, :cond_4

    .line 151
    .line 152
    add-long v11, v11, v20

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_3
    move-wide/from16 v11, v23

    .line 156
    .line 157
    :cond_4
    :goto_2
    add-int/lit8 v6, v6, -0x1

    .line 158
    .line 159
    const/4 v4, 0x0

    .line 160
    goto :goto_1

    .line 161
    :cond_5
    new-instance v9, Lw84;

    .line 162
    .line 163
    move-object/from16 v10, p1

    .line 164
    .line 165
    invoke-direct/range {v9 .. v16}, Lw84;-><init>(Lkt0;JIJI)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->addAll(Ljava/util/Collection;)Z

    .line 169
    .line 170
    .line 171
    :goto_3
    iget-boolean v0, v1, Lmm1;->l:Z

    .line 172
    .line 173
    if-nez v0, :cond_c

    .line 174
    .line 175
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-nez v0, :cond_c

    .line 180
    .line 181
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-nez v0, :cond_6

    .line 186
    .line 187
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    check-cast v0, Ly84;

    .line 192
    .line 193
    iget-object v4, v0, Ly84;->v:Llx;

    .line 194
    .line 195
    iget-object v0, v0, Ly84;->x:[B

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_6
    iget-object v0, v1, Lmm1;->f:Lkx;

    .line 199
    .line 200
    invoke-virtual {v0}, Lkx;->b()Llx;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    const/high16 v0, 0x20000

    .line 205
    .line 206
    new-array v0, v0, [B

    .line 207
    .line 208
    :goto_4
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    check-cast v6, Lx84;

    .line 213
    .line 214
    new-instance v7, Ly84;

    .line 215
    .line 216
    invoke-direct {v7, v6, v4, v9, v0}, Ly84;-><init>(Lx84;Llx;Lw84;[B)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1, v7}, Lmm1;->b(Lw34;)V

    .line 220
    .line 221
    .line 222
    iget-object v0, v1, Lmm1;->i:Ljava/util/concurrent/Executor;

    .line 223
    .line 224
    invoke-interface {v0, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 225
    .line 226
    .line 227
    iget-object v0, v1, Lmm1;->k:Ljava/util/ArrayList;

    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    sub-int/2addr v0, v5

    .line 234
    move v4, v0

    .line 235
    :goto_5
    if-ltz v4, :cond_b

    .line 236
    .line 237
    iget-object v0, v1, Lmm1;->k:Ljava/util/ArrayList;

    .line 238
    .line 239
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    move-object v6, v0

    .line 244
    check-cast v6, Ly84;

    .line 245
    .line 246
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    if-nez v0, :cond_7

    .line 251
    .line 252
    iget-object v8, v6, Lw34;->o:Lq90;

    .line 253
    .line 254
    monitor-enter v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 255
    :try_start_1
    iget-boolean v0, v8, Lq90;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 256
    .line 257
    :try_start_2
    monitor-exit v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 258
    if-eqz v0, :cond_8

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :catchall_1
    move-exception v0

    .line 262
    :try_start_3
    monitor-exit v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 263
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 264
    :cond_7
    :goto_6
    :try_start_5
    invoke-virtual {v6}, Lw34;->get()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1, v4}, Lmm1;->h(I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v3, v6}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 271
    .line 272
    .line 273
    goto :goto_7

    .line 274
    :catch_0
    move-exception v0

    .line 275
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    instance-of v8, v0, Landroidx/media3/common/PriorityTaskManager$PriorityTooLowException;

    .line 283
    .line 284
    if-eqz v8, :cond_9

    .line 285
    .line 286
    iget-object v0, v6, Ly84;->u:Lx84;

    .line 287
    .line 288
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v1, v4}, Lmm1;->h(I)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v3, v6}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    :cond_8
    :goto_7
    add-int/lit8 v4, v4, -0x1

    .line 298
    .line 299
    goto :goto_5

    .line 300
    :cond_9
    instance-of v2, v0, Ljava/io/IOException;

    .line 301
    .line 302
    if-nez v2, :cond_a

    .line 303
    .line 304
    throw v0

    .line 305
    :cond_a
    check-cast v0, Ljava/io/IOException;

    .line 306
    .line 307
    throw v0

    .line 308
    :cond_b
    iget-object v0, v7, Lw34;->n:Lq90;

    .line 309
    .line 310
    invoke-virtual {v0}, Lq90;->b()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 311
    .line 312
    .line 313
    goto/16 :goto_3

    .line 314
    .line 315
    :cond_c
    const/4 v4, 0x0

    .line 316
    :goto_8
    iget-object v0, v1, Lmm1;->k:Ljava/util/ArrayList;

    .line 317
    .line 318
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 319
    .line 320
    .line 321
    move-result v0

    .line 322
    iget-object v2, v1, Lmm1;->k:Ljava/util/ArrayList;

    .line 323
    .line 324
    if-ge v4, v0, :cond_d

    .line 325
    .line 326
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    check-cast v0, Lw34;

    .line 331
    .line 332
    invoke-virtual {v0, v5}, Lw34;->cancel(Z)Z

    .line 333
    .line 334
    .line 335
    add-int/lit8 v4, v4, 0x1

    .line 336
    .line 337
    goto :goto_8

    .line 338
    :cond_d
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    sub-int/2addr v0, v5

    .line 343
    :goto_9
    if-ltz v0, :cond_e

    .line 344
    .line 345
    iget-object v2, v1, Lmm1;->k:Ljava/util/ArrayList;

    .line 346
    .line 347
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    check-cast v2, Lw34;

    .line 352
    .line 353
    invoke-virtual {v2}, Lw34;->a()V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v1, v0}, Lmm1;->h(I)V

    .line 357
    .line 358
    .line 359
    add-int/lit8 v0, v0, -0x1

    .line 360
    .line 361
    goto :goto_9

    .line 362
    :cond_e
    return-void

    .line 363
    :goto_a
    const/4 v4, 0x0

    .line 364
    :goto_b
    iget-object v2, v1, Lmm1;->k:Ljava/util/ArrayList;

    .line 365
    .line 366
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    iget-object v3, v1, Lmm1;->k:Ljava/util/ArrayList;

    .line 371
    .line 372
    if-ge v4, v2, :cond_f

    .line 373
    .line 374
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    check-cast v2, Lw34;

    .line 379
    .line 380
    invoke-virtual {v2, v5}, Lw34;->cancel(Z)Z

    .line 381
    .line 382
    .line 383
    add-int/lit8 v4, v4, 0x1

    .line 384
    .line 385
    goto :goto_b

    .line 386
    :cond_f
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 387
    .line 388
    .line 389
    move-result v2

    .line 390
    sub-int/2addr v2, v5

    .line 391
    :goto_c
    if-ltz v2, :cond_10

    .line 392
    .line 393
    iget-object v3, v1, Lmm1;->k:Ljava/util/ArrayList;

    .line 394
    .line 395
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v3

    .line 399
    check-cast v3, Lw34;

    .line 400
    .line 401
    invoke-virtual {v3}, Lw34;->a()V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v1, v2}, Lmm1;->h(I)V

    .line 405
    .line 406
    .line 407
    add-int/lit8 v2, v2, -0x1

    .line 408
    .line 409
    goto :goto_c

    .line 410
    :cond_10
    throw v0
.end method

.method public final b(Lw34;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lmm1;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lmm1;->l:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lmm1;->k:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p0, Ljava/lang/InterruptedException;

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/InterruptedException;-><init>()V

    .line 20
    .line 21
    .line 22
    throw p0

    .line 23
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p0
.end method

.method public final cancel()V
    .locals 4

    .line 1
    iget-object v0, p0, Lmm1;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lmm1;->l:Z

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    iget-object v3, p0, Lmm1;->k:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-ge v2, v3, :cond_0

    .line 15
    .line 16
    iget-object v3, p0, Lmm1;->k:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Lw34;

    .line 23
    .line 24
    invoke-virtual {v3, v1}, Lw34;->cancel(Z)Z

    .line 25
    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    monitor-exit v0

    .line 33
    return-void

    .line 34
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    throw p0
.end method

.method public final e(Llx;Lii0;Z)Ldn1;
    .locals 3

    .line 1
    if-eqz p3, :cond_1

    .line 2
    .line 3
    new-instance p3, Lv84;

    .line 4
    .line 5
    invoke-direct {p3, p0, p1, p2}, Lv84;-><init>(Lmm1;Llx;Lii0;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3}, Lw34;->run()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p3}, Lw34;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    goto :goto_1

    .line 16
    :catch_0
    move-exception p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    instance-of p2, p1, Ljava/io/IOException;

    .line 25
    .line 26
    if-nez p2, :cond_0

    .line 27
    .line 28
    sget-object p1, Lf35;->a:Ljava/lang/String;

    .line 29
    .line 30
    throw p0

    .line 31
    :cond_0
    check-cast p1, Ljava/io/IOException;

    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    :goto_0
    iget-boolean p3, p0, Lmm1;->l:Z

    .line 35
    .line 36
    if-nez p3, :cond_4

    .line 37
    .line 38
    new-instance p3, Lv84;

    .line 39
    .line 40
    invoke-direct {p3, p0, p1, p2}, Lv84;-><init>(Lmm1;Llx;Lii0;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p3}, Lmm1;->b(Lw34;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lmm1;->i:Ljava/util/concurrent/Executor;

    .line 47
    .line 48
    invoke-interface {v0, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 49
    .line 50
    .line 51
    :try_start_1
    invoke-virtual {p3}, Lw34;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    invoke-virtual {p3}, Lw34;->a()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p3}, Lmm1;->i(Lw34;)V

    .line 59
    .line 60
    .line 61
    move-object p0, p1

    .line 62
    :goto_1
    check-cast p0, Ldn1;

    .line 63
    .line 64
    return-object p0

    .line 65
    :catchall_0
    move-exception p1

    .line 66
    goto :goto_2

    .line 67
    :catch_1
    move-exception v0

    .line 68
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    instance-of v2, v1, Landroidx/media3/common/PriorityTaskManager$PriorityTooLowException;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 76
    .line 77
    if-eqz v2, :cond_2

    .line 78
    .line 79
    invoke-virtual {p3}, Lw34;->a()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, p3}, Lmm1;->i(Lw34;)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    :try_start_3
    instance-of p1, v1, Ljava/io/IOException;

    .line 87
    .line 88
    if-nez p1, :cond_3

    .line 89
    .line 90
    sget-object p1, Lf35;->a:Ljava/lang/String;

    .line 91
    .line 92
    throw v0

    .line 93
    :cond_3
    check-cast v1, Ljava/io/IOException;

    .line 94
    .line 95
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 96
    :goto_2
    invoke-virtual {p3}, Lw34;->a()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, p3}, Lmm1;->i(Lw34;)V

    .line 100
    .line 101
    .line 102
    throw p1

    .line 103
    :cond_4
    new-instance p0, Ljava/lang/InterruptedException;

    .line 104
    .line 105
    invoke-direct {p0}, Ljava/lang/InterruptedException;-><init>()V

    .line 106
    .line 107
    .line 108
    throw p0
.end method

.method public final f(Llx;Ldn1;Z)Ljava/util/ArrayList;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    new-instance v3, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    instance-of v4, v0, Lcn1;

    .line 13
    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    check-cast v0, Lcn1;

    .line 17
    .line 18
    iget-object v0, v0, Lcn1;->d:Ljava/util/List;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    if-ge v4, v6, :cond_1

    .line 26
    .line 27
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    check-cast v6, Landroid/net/Uri;

    .line 32
    .line 33
    invoke-static {v6}, Lmm1;->d(Landroid/net/Uri;)Lii0;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    add-int/lit8 v4, v4, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object v0, v0, Ldn1;->a:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, Lmm1;->d(Landroid/net/Uri;)Lii0;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    new-instance v6, Ljava/util/HashSet;

    .line 62
    .line 63
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    const/4 v0, 0x0

    .line 71
    :goto_1
    if-ge v0, v7, :cond_9

    .line 72
    .line 73
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    add-int/lit8 v9, v0, 0x1

    .line 78
    .line 79
    check-cast v8, Lii0;

    .line 80
    .line 81
    new-instance v0, Lx84;

    .line 82
    .line 83
    const-wide/16 v10, 0x0

    .line 84
    .line 85
    invoke-direct {v0, v10, v11, v8}, Lx84;-><init>(JLii0;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-object/from16 v12, p1

    .line 92
    .line 93
    :try_start_0
    invoke-virtual {v1, v12, v8, v2}, Lmm1;->e(Llx;Lii0;Z)Ldn1;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Lym1;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    .line 99
    iget-object v8, v0, Lym1;->r:Lyw1;

    .line 100
    .line 101
    if-eqz v2, :cond_2

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_2
    iget-wide v10, v1, Lmm1;->a:J

    .line 105
    .line 106
    :goto_2
    if-eqz v2, :cond_3

    .line 107
    .line 108
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_3
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    iget-wide v13, v1, Lmm1;->b:J

    .line 125
    .line 126
    :goto_3
    const/16 v17, 0x0

    .line 127
    .line 128
    move-wide/from16 v18, v15

    .line 129
    .line 130
    move-object/from16 v5, v17

    .line 131
    .line 132
    const/4 v15, 0x0

    .line 133
    :goto_4
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-ge v15, v1, :cond_7

    .line 138
    .line 139
    invoke-interface {v8, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    check-cast v1, Lvm1;

    .line 144
    .line 145
    move-object/from16 v16, v3

    .line 146
    .line 147
    iget-wide v2, v0, Lym1;->h:J

    .line 148
    .line 149
    move-wide/from16 v20, v2

    .line 150
    .line 151
    iget-wide v2, v1, Lwm1;->r:J

    .line 152
    .line 153
    add-long v2, v20, v2

    .line 154
    .line 155
    move-wide/from16 v20, v2

    .line 156
    .line 157
    iget-wide v2, v1, Lwm1;->p:J

    .line 158
    .line 159
    add-long v2, v20, v2

    .line 160
    .line 161
    cmp-long v2, v2, v10

    .line 162
    .line 163
    if-gtz v2, :cond_4

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_4
    cmp-long v2, v13, v18

    .line 167
    .line 168
    if-eqz v2, :cond_5

    .line 169
    .line 170
    add-long v2, v10, v13

    .line 171
    .line 172
    cmp-long v2, v20, v2

    .line 173
    .line 174
    if-ltz v2, :cond_5

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_5
    iget-object v2, v1, Lwm1;->o:Lvm1;

    .line 178
    .line 179
    if-eqz v2, :cond_6

    .line 180
    .line 181
    if-eq v2, v5, :cond_6

    .line 182
    .line 183
    invoke-static {v0, v2, v6, v4}, Lmm1;->c(Lym1;Lvm1;Ljava/util/HashSet;Ljava/util/ArrayList;)V

    .line 184
    .line 185
    .line 186
    move-object v5, v2

    .line 187
    :cond_6
    invoke-static {v0, v1, v6, v4}, Lmm1;->c(Lym1;Lvm1;Ljava/util/HashSet;Ljava/util/ArrayList;)V

    .line 188
    .line 189
    .line 190
    :goto_5
    add-int/lit8 v15, v15, 0x1

    .line 191
    .line 192
    move/from16 v2, p3

    .line 193
    .line 194
    move-object/from16 v3, v16

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_7
    move-object/from16 v16, v3

    .line 198
    .line 199
    :goto_6
    move-object/from16 v1, p0

    .line 200
    .line 201
    move/from16 v2, p3

    .line 202
    .line 203
    move v0, v9

    .line 204
    move-object/from16 v3, v16

    .line 205
    .line 206
    goto/16 :goto_1

    .line 207
    .line 208
    :catch_0
    move-exception v0

    .line 209
    move-object/from16 v16, v3

    .line 210
    .line 211
    if-eqz p3, :cond_8

    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_8
    throw v0

    .line 215
    :cond_9
    return-object v4
.end method

.method public final h(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lmm1;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Lmm1;->k:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p0
.end method

.method public final i(Lw34;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lmm1;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Lmm1;->k:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p0
.end method

.method public final remove()V
    .locals 7

    .line 1
    iget-object v0, p0, Lmm1;->g:Lse4;

    .line 2
    .line 3
    iget-object v1, p0, Lmm1;->h:Lpx;

    .line 4
    .line 5
    iget-object v2, p0, Lmm1;->c:Lii0;

    .line 6
    .line 7
    iget-object v3, p0, Lmm1;->f:Lkx;

    .line 8
    .line 9
    iget v4, v3, Lkx;->s:I

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    or-int/2addr v4, v5

    .line 13
    const/4 v6, 0x0

    .line 14
    invoke-virtual {v3, v6, v4}, Lkx;->c(Lci0;I)Llx;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    :try_start_0
    invoke-virtual {p0, v3, v2, v5}, Lmm1;->e(Llx;Lii0;Z)Ldn1;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {p0, v3, v4, v5}, Lmm1;->f(Llx;Ldn1;Z)Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const/4 v3, 0x0

    .line 27
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-ge v3, v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Lx84;

    .line 38
    .line 39
    iget-object v4, v4, Lx84;->o:Lii0;

    .line 40
    .line 41
    invoke-interface {v1, v4}, Lpx;->d(Lii0;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v0, v4}, Lse4;->m(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    goto :goto_3

    .line 53
    :cond_0
    invoke-interface {v1, v2}, Lpx;->d(Lii0;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {v0, p0}, Lse4;->m(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :catch_0
    :goto_1
    invoke-interface {v1, v2}, Lpx;->d(Lii0;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {v0, p0}, Lse4;->m(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :catch_1
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :goto_2
    return-void

    .line 78
    :goto_3
    invoke-interface {v1, v2}, Lpx;->d(Lii0;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v0, v1}, Lse4;->m(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p0
.end method
