.class public Lbm2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lrk2;


# instance fields
.field public A:Landroid/view/Surface;

.field public B:Landroid/view/SurfaceHolder;

.field public C:Lpf4;

.field public D:Lpu1;

.field public E:Landroid/media/session/MediaController;

.field public F:J

.field public G:J

.field public H:Llk3;

.field public I:Landroid/os/Bundle;

.field public final a:Lsk2;

.field public final b:Lyk;

.field public final c:Lmm2;

.field public final d:Landroid/content/Context;

.field public final e:Lcb4;

.field public final f:Landroid/os/Bundle;

.field public final g:Lil2;

.field public final h:Lam2;

.field public final i:Ltc2;

.field public final j:Lrf2;

.field public final k:Lqi;

.field public final l:Landroid/util/SparseArray;

.field public final m:Landroid/os/Handler;

.field public n:Lcb4;

.field public o:Lyl2;

.field public p:Z

.field public q:Llk3;

.field public r:Landroid/app/PendingIntent;

.field public s:Lyw1;

.field public t:Lyw1;

.field public u:Lgy3;

.field public v:Lgy3;

.field public w:Lwa4;

.field public x:Lmi3;

.field public y:Lmi3;

.field public z:Lmi3;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lsk2;Lcb4;Landroid/os/Bundle;Landroid/os/Looper;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Llk3;->H:Llk3;

    .line 5
    .line 6
    iput-object v0, p0, Lbm2;->q:Llk3;

    .line 7
    .line 8
    sget-object v0, Lpf4;->c:Lpf4;

    .line 9
    .line 10
    iput-object v0, p0, Lbm2;->C:Lpf4;

    .line 11
    .line 12
    sget-object v0, Lwa4;->b:Lwa4;

    .line 13
    .line 14
    iput-object v0, p0, Lbm2;->w:Lwa4;

    .line 15
    .line 16
    sget-object v0, Lgy3;->r:Lgy3;

    .line 17
    .line 18
    iput-object v0, p0, Lbm2;->s:Lyw1;

    .line 19
    .line 20
    iput-object v0, p0, Lbm2;->t:Lyw1;

    .line 21
    .line 22
    iput-object v0, p0, Lbm2;->u:Lgy3;

    .line 23
    .line 24
    iput-object v0, p0, Lbm2;->v:Lgy3;

    .line 25
    .line 26
    sget-object v0, Lmi3;->b:Lmi3;

    .line 27
    .line 28
    iput-object v0, p0, Lbm2;->x:Lmi3;

    .line 29
    .line 30
    iput-object v0, p0, Lbm2;->y:Lmi3;

    .line 31
    .line 32
    invoke-static {v0, v0}, Lbm2;->Y0(Lmi3;Lmi3;)Lmi3;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lbm2;->z:Lmi3;

    .line 37
    .line 38
    new-instance v0, Ltc2;

    .line 39
    .line 40
    new-instance v1, Lcl2;

    .line 41
    .line 42
    const/16 v2, 0x11

    .line 43
    .line 44
    invoke-direct {v1, p0, v2}, Lcl2;-><init>(Lbm2;I)V

    .line 45
    .line 46
    .line 47
    sget-object v2, Lvp4;->a:Lvp4;

    .line 48
    .line 49
    invoke-direct {v0, p5, v2, v1}, Ltc2;-><init>(Landroid/os/Looper;Lvp4;Lrc2;)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lbm2;->i:Ltc2;

    .line 53
    .line 54
    new-instance v0, Landroid/os/Handler;

    .line 55
    .line 56
    invoke-direct {v0, p5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, Lbm2;->m:Landroid/os/Handler;

    .line 60
    .line 61
    iput-object p2, p0, Lbm2;->a:Lsk2;

    .line 62
    .line 63
    const-string p2, "context must not be null"

    .line 64
    .line 65
    invoke-static {p1, p2}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string p2, "token must not be null"

    .line 69
    .line 70
    invoke-static {p3, p2}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lbm2;->d:Landroid/content/Context;

    .line 74
    .line 75
    new-instance p1, Lyk;

    .line 76
    .line 77
    invoke-direct {p1}, Lyk;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object p1, p0, Lbm2;->b:Lyk;

    .line 81
    .line 82
    new-instance p1, Lmm2;

    .line 83
    .line 84
    invoke-direct {p1, p0}, Lmm2;-><init>(Lbm2;)V

    .line 85
    .line 86
    .line 87
    iput-object p1, p0, Lbm2;->c:Lmm2;

    .line 88
    .line 89
    new-instance p1, Lqi;

    .line 90
    .line 91
    const/4 p2, 0x0

    .line 92
    invoke-direct {p1, p2}, Lqi;-><init>(I)V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, Lbm2;->k:Lqi;

    .line 96
    .line 97
    iput-object p3, p0, Lbm2;->e:Lcb4;

    .line 98
    .line 99
    iput-object p4, p0, Lbm2;->f:Landroid/os/Bundle;

    .line 100
    .line 101
    new-instance p1, Lil2;

    .line 102
    .line 103
    invoke-direct {p1, p0}, Lil2;-><init>(Lbm2;)V

    .line 104
    .line 105
    .line 106
    iput-object p1, p0, Lbm2;->g:Lil2;

    .line 107
    .line 108
    new-instance p1, Lam2;

    .line 109
    .line 110
    invoke-direct {p1, p0}, Lam2;-><init>(Lbm2;)V

    .line 111
    .line 112
    .line 113
    iput-object p1, p0, Lbm2;->h:Lam2;

    .line 114
    .line 115
    sget-object p1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 116
    .line 117
    iput-object p1, p0, Lbm2;->I:Landroid/os/Bundle;

    .line 118
    .line 119
    iget-object p1, p3, Lcb4;->a:Lbb4;

    .line 120
    .line 121
    invoke-interface {p1}, Lbb4;->getType()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-nez p1, :cond_0

    .line 126
    .line 127
    const/4 p1, 0x0

    .line 128
    goto :goto_0

    .line 129
    :cond_0
    new-instance p1, Lyl2;

    .line 130
    .line 131
    invoke-direct {p1, p0, p4}, Lyl2;-><init>(Lbm2;Landroid/os/Bundle;)V

    .line 132
    .line 133
    .line 134
    :goto_0
    iput-object p1, p0, Lbm2;->o:Lyl2;

    .line 135
    .line 136
    new-instance p1, Lrf2;

    .line 137
    .line 138
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 139
    .line 140
    .line 141
    iput-object p0, p1, Lrf2;->o:Ljava/lang/Object;

    .line 142
    .line 143
    new-instance p2, Landroid/os/Handler;

    .line 144
    .line 145
    new-instance p3, Lgt0;

    .line 146
    .line 147
    const/4 p4, 0x2

    .line 148
    invoke-direct {p3, p4, p1}, Lgt0;-><init>(ILjava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-direct {p2, p5, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 152
    .line 153
    .line 154
    iput-object p2, p1, Lrf2;->n:Ljava/lang/Object;

    .line 155
    .line 156
    iput-object p1, p0, Lbm2;->j:Lrf2;

    .line 157
    .line 158
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    iput-wide p1, p0, Lbm2;->F:J

    .line 164
    .line 165
    iput-wide p1, p0, Lbm2;->G:J

    .line 166
    .line 167
    new-instance p1, Landroid/util/SparseArray;

    .line 168
    .line 169
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 170
    .line 171
    .line 172
    iput-object p1, p0, Lbm2;->l:Landroid/util/SparseArray;

    .line 173
    .line 174
    return-void
.end method

.method public static Y0(Lmi3;Lmi3;)Lmi3;
    .locals 2

    .line 1
    invoke-static {p0, p1}, Lju2;->d(Lmi3;Lmi3;)Lmi3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/16 p1, 0x20

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lmi3;->a(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v0, Lxk0;

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-direct {v0, v1}, Lxk0;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lmi3;->a:Lw71;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Lxk0;->c(Lw71;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lxk0;->b(I)V

    .line 26
    .line 27
    .line 28
    new-instance p0, Lmi3;

    .line 29
    .line 30
    invoke-virtual {v0}, Lxk0;->f()Lw71;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {p0, p1}, Lmi3;-><init>(Lw71;)V

    .line 35
    .line 36
    .line 37
    return-object p0
.end method

.method public static Z0(Ljava/util/ArrayList;Ljava/util/ArrayList;)Lau4;
    .locals 4

    .line 1
    new-instance v0, Lau4;

    .line 2
    .line 3
    new-instance v1, Luw1;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    invoke-direct {v1, v2}, Lpw1;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, p0}, Lpw1;->d(Ljava/lang/Iterable;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Luw1;->f()Lgy3;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v3, Luw1;

    .line 17
    .line 18
    invoke-direct {v3, v2}, Lpw1;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, p1}, Lpw1;->d(Ljava/lang/Iterable;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3}, Luw1;->f()Lgy3;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    sget-object v2, Lju2;->a:Lhd5;

    .line 33
    .line 34
    new-array v2, p0, [I

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    :goto_0
    if-ge v3, p0, :cond_0

    .line 38
    .line 39
    aput v3, v2, v3

    .line 40
    .line 41
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-direct {v0, v1, p1, v2}, Lau4;-><init>(Lgy3;Lgy3;[I)V

    .line 45
    .line 46
    .line 47
    return-object v0
.end method

.method public static e1(Llk3;)I
    .locals 0

    .line 1
    iget-object p0, p0, Llk3;->c:Lza4;

    .line 2
    .line 3
    iget-object p0, p0, Lza4;->a:Lpi3;

    .line 4
    .line 5
    iget p0, p0, Lpi3;->b:I

    .line 6
    .line 7
    return p0
.end method

.method public static i1(Llk3;ILjava/util/List;JJ)Llk3;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Llk3;->j:Lcu4;

    .line 6
    .line 7
    iget-object v3, v0, Llk3;->c:Lza4;

    .line 8
    .line 9
    new-instance v4, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v5, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    move v7, v6

    .line 21
    :goto_0
    invoke-virtual {v2}, Lcu4;->o()I

    .line 22
    .line 23
    .line 24
    move-result v8

    .line 25
    if-ge v7, v8, :cond_0

    .line 26
    .line 27
    new-instance v8, Lbu4;

    .line 28
    .line 29
    invoke-direct {v8}, Lbu4;-><init>()V

    .line 30
    .line 31
    .line 32
    const-wide/16 v9, 0x0

    .line 33
    .line 34
    invoke-virtual {v2, v7, v8, v9, v10}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    add-int/lit8 v7, v7, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move v7, v6

    .line 45
    :goto_1
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    if-ge v7, v8, :cond_1

    .line 50
    .line 51
    add-int v8, v7, v1

    .line 52
    .line 53
    move-object/from16 v9, p2

    .line 54
    .line 55
    invoke-interface {v9, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    move-object v13, v10

    .line 60
    check-cast v13, Lgn2;

    .line 61
    .line 62
    new-instance v11, Lbu4;

    .line 63
    .line 64
    invoke-direct {v11}, Lbu4;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v12

    .line 71
    const/16 v29, -0x1

    .line 72
    .line 73
    const-wide/16 v30, 0x0

    .line 74
    .line 75
    const/4 v14, 0x0

    .line 76
    const-wide/16 v15, 0x0

    .line 77
    .line 78
    const-wide/16 v17, 0x0

    .line 79
    .line 80
    const-wide/16 v19, 0x0

    .line 81
    .line 82
    const/16 v21, 0x1

    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/16 v23, 0x0

    .line 87
    .line 88
    const-wide/16 v24, 0x0

    .line 89
    .line 90
    const-wide v26, -0x7fffffffffffffffL    # -4.9E-324

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    const/16 v28, -0x1

    .line 96
    .line 97
    invoke-virtual/range {v11 .. v31}, Lbu4;->b(Ljava/lang/Object;Lgn2;Ljava/lang/Object;JJJZZLan2;JJIIJ)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v8, v11}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    add-int/lit8 v7, v7, 0x1

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_1
    move-object/from16 v9, p2

    .line 107
    .line 108
    invoke-static {v2, v4, v5}, Lbm2;->q1(Lcu4;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 109
    .line 110
    .line 111
    invoke-static {v4, v5}, Lbm2;->Z0(Ljava/util/ArrayList;Ljava/util/ArrayList;)Lau4;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    iget-object v4, v0, Llk3;->j:Lcu4;

    .line 116
    .line 117
    invoke-virtual {v4}, Lcu4;->p()Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_2

    .line 122
    .line 123
    move v3, v6

    .line 124
    goto :goto_4

    .line 125
    :cond_2
    iget-object v4, v3, Lza4;->a:Lpi3;

    .line 126
    .line 127
    iget v4, v4, Lpi3;->b:I

    .line 128
    .line 129
    if-lt v4, v1, :cond_3

    .line 130
    .line 131
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    add-int/2addr v5, v4

    .line 136
    move v6, v5

    .line 137
    goto :goto_2

    .line 138
    :cond_3
    move v6, v4

    .line 139
    :goto_2
    iget-object v3, v3, Lza4;->a:Lpi3;

    .line 140
    .line 141
    iget v3, v3, Lpi3;->e:I

    .line 142
    .line 143
    if-lt v3, v1, :cond_4

    .line 144
    .line 145
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    add-int/2addr v1, v3

    .line 150
    goto :goto_3

    .line 151
    :cond_4
    move v1, v3

    .line 152
    :goto_3
    move v3, v1

    .line 153
    :goto_4
    const/4 v8, 0x5

    .line 154
    move-wide/from16 v4, p3

    .line 155
    .line 156
    move-object v1, v2

    .line 157
    move v2, v6

    .line 158
    move-wide/from16 v6, p5

    .line 159
    .line 160
    invoke-static/range {v0 .. v8}, Lbm2;->k1(Llk3;Lau4;IIJJI)Llk3;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    return-object v0
.end method

.method public static j1(Llk3;IIZJJ)Llk3;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v9, p1

    .line 4
    .line 5
    move/from16 v10, p2

    .line 6
    .line 7
    iget-object v11, v0, Llk3;->j:Lcu4;

    .line 8
    .line 9
    iget-boolean v1, v0, Llk3;->i:Z

    .line 10
    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v3, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    move v5, v4

    .line 23
    :goto_0
    invoke-virtual {v11}, Lcu4;->o()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    const-wide/16 v7, 0x0

    .line 28
    .line 29
    if-ge v5, v6, :cond_2

    .line 30
    .line 31
    if-lt v5, v9, :cond_0

    .line 32
    .line 33
    if-lt v5, v10, :cond_1

    .line 34
    .line 35
    :cond_0
    new-instance v6, Lbu4;

    .line 36
    .line 37
    invoke-direct {v6}, Lbu4;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v11, v5, v6, v7, v8}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-static {v11, v2, v3}, Lbm2;->q1(Lcu4;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v2, v3}, Lbm2;->Z0(Ljava/util/ArrayList;Ljava/util/ArrayList;)Lau4;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    iget-object v3, v0, Llk3;->c:Lza4;

    .line 58
    .line 59
    iget-object v3, v3, Lza4;->a:Lpi3;

    .line 60
    .line 61
    iget v12, v3, Lpi3;->b:I

    .line 62
    .line 63
    iget v3, v3, Lpi3;->e:I

    .line 64
    .line 65
    new-instance v5, Lbu4;

    .line 66
    .line 67
    invoke-direct {v5}, Lbu4;-><init>()V

    .line 68
    .line 69
    .line 70
    if-lt v12, v9, :cond_3

    .line 71
    .line 72
    if-ge v12, v10, :cond_3

    .line 73
    .line 74
    const/4 v6, 0x1

    .line 75
    goto :goto_1

    .line 76
    :cond_3
    move v6, v4

    .line 77
    :goto_1
    invoke-virtual {v2}, Lcu4;->p()Z

    .line 78
    .line 79
    .line 80
    move-result v14

    .line 81
    const/4 v15, -0x1

    .line 82
    if-eqz v14, :cond_4

    .line 83
    .line 84
    move v3, v4

    .line 85
    move v13, v15

    .line 86
    const/16 v16, 0x1

    .line 87
    .line 88
    goto :goto_8

    .line 89
    :cond_4
    if-eqz v6, :cond_b

    .line 90
    .line 91
    iget v3, v0, Llk3;->h:I

    .line 92
    .line 93
    invoke-virtual {v11}, Lcu4;->o()I

    .line 94
    .line 95
    .line 96
    move-result v14

    .line 97
    move v13, v12

    .line 98
    const/16 v16, 0x1

    .line 99
    .line 100
    :goto_2
    if-ge v4, v14, :cond_7

    .line 101
    .line 102
    invoke-virtual {v11, v13, v3, v1}, Lcu4;->e(IIZ)I

    .line 103
    .line 104
    .line 105
    move-result v13

    .line 106
    if-ne v13, v15, :cond_5

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_5
    if-lt v13, v9, :cond_8

    .line 110
    .line 111
    if-lt v13, v10, :cond_6

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_7
    :goto_3
    move v13, v15

    .line 118
    :cond_8
    :goto_4
    if-ne v13, v15, :cond_9

    .line 119
    .line 120
    invoke-virtual {v2, v1}, Lau4;->a(Z)I

    .line 121
    .line 122
    .line 123
    move-result v13

    .line 124
    goto :goto_5

    .line 125
    :cond_9
    if-lt v13, v10, :cond_a

    .line 126
    .line 127
    sub-int v1, v10, v9

    .line 128
    .line 129
    sub-int/2addr v13, v1

    .line 130
    :cond_a
    :goto_5
    invoke-virtual {v2, v13, v5, v7, v8}, Lau4;->m(ILbu4;J)Lbu4;

    .line 131
    .line 132
    .line 133
    iget v4, v5, Lbu4;->m:I

    .line 134
    .line 135
    :goto_6
    move v3, v4

    .line 136
    goto :goto_8

    .line 137
    :cond_b
    const/16 v16, 0x1

    .line 138
    .line 139
    if-lt v12, v10, :cond_e

    .line 140
    .line 141
    sub-int v1, v10, v9

    .line 142
    .line 143
    sub-int v13, v12, v1

    .line 144
    .line 145
    if-ne v3, v15, :cond_d

    .line 146
    .line 147
    :cond_c
    move v4, v3

    .line 148
    goto :goto_6

    .line 149
    :cond_d
    move v1, v9

    .line 150
    :goto_7
    if-ge v1, v10, :cond_c

    .line 151
    .line 152
    new-instance v4, Lbu4;

    .line 153
    .line 154
    invoke-direct {v4}, Lbu4;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v11, v1, v4}, Lcu4;->n(ILbu4;)V

    .line 158
    .line 159
    .line 160
    iget v5, v4, Lbu4;->n:I

    .line 161
    .line 162
    iget v4, v4, Lbu4;->m:I

    .line 163
    .line 164
    sub-int/2addr v5, v4

    .line 165
    add-int/lit8 v5, v5, 0x1

    .line 166
    .line 167
    sub-int/2addr v3, v5

    .line 168
    add-int/lit8 v1, v1, 0x1

    .line 169
    .line 170
    goto :goto_7

    .line 171
    :cond_e
    move v13, v12

    .line 172
    :goto_8
    const/4 v14, 0x4

    .line 173
    if-eqz v6, :cond_11

    .line 174
    .line 175
    if-ne v13, v15, :cond_f

    .line 176
    .line 177
    sget-object v1, Lza4;->k:Lpi3;

    .line 178
    .line 179
    sget-object v3, Lza4;->l:Lza4;

    .line 180
    .line 181
    invoke-static {v0, v2, v1, v3, v14}, Lbm2;->l1(Llk3;Lcu4;Lpi3;Lza4;I)Llk3;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    goto/16 :goto_9

    .line 186
    .line 187
    :cond_f
    if-eqz p3, :cond_10

    .line 188
    .line 189
    const/4 v8, 0x4

    .line 190
    move-wide/from16 v4, p4

    .line 191
    .line 192
    move-wide/from16 v6, p6

    .line 193
    .line 194
    move-object v1, v2

    .line 195
    move v2, v13

    .line 196
    invoke-static/range {v0 .. v8}, Lbm2;->k1(Llk3;Lau4;IIJJI)Llk3;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    goto/16 :goto_9

    .line 201
    .line 202
    :cond_10
    move-object v1, v2

    .line 203
    move v2, v13

    .line 204
    new-instance v4, Lbu4;

    .line 205
    .line 206
    invoke-direct {v4}, Lbu4;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1, v2, v4, v7, v8}, Lau4;->m(ILbu4;J)Lbu4;

    .line 210
    .line 211
    .line 212
    iget-wide v5, v4, Lbu4;->k:J

    .line 213
    .line 214
    invoke-static {v5, v6}, Lf35;->i0(J)J

    .line 215
    .line 216
    .line 217
    move-result-wide v24

    .line 218
    iget-wide v5, v4, Lbu4;->l:J

    .line 219
    .line 220
    invoke-static {v5, v6}, Lf35;->i0(J)J

    .line 221
    .line 222
    .line 223
    move-result-wide v5

    .line 224
    new-instance v17, Lpi3;

    .line 225
    .line 226
    iget-object v4, v4, Lbu4;->b:Lgn2;

    .line 227
    .line 228
    const/16 v27, -0x1

    .line 229
    .line 230
    const/16 v28, -0x1

    .line 231
    .line 232
    const/16 v18, 0x0

    .line 233
    .line 234
    const/16 v21, 0x0

    .line 235
    .line 236
    move-wide/from16 v23, v24

    .line 237
    .line 238
    move-wide/from16 v25, v23

    .line 239
    .line 240
    move/from16 v19, v2

    .line 241
    .line 242
    move/from16 v22, v3

    .line 243
    .line 244
    move-object/from16 v20, v4

    .line 245
    .line 246
    invoke-direct/range {v17 .. v28}, Lpi3;-><init>(Ljava/lang/Object;ILgn2;Ljava/lang/Object;IJJII)V

    .line 247
    .line 248
    .line 249
    move-wide/from16 v2, v23

    .line 250
    .line 251
    new-instance v4, Lza4;

    .line 252
    .line 253
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 254
    .line 255
    .line 256
    move-result-wide v20

    .line 257
    invoke-static {v2, v3, v5, v6}, Lju2;->b(JJ)I

    .line 258
    .line 259
    .line 260
    move-result v26

    .line 261
    const-wide/16 v27, 0x0

    .line 262
    .line 263
    const-wide v29, -0x7fffffffffffffffL    # -4.9E-324

    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    const/16 v19, 0x0

    .line 269
    .line 270
    move-wide/from16 v31, v5

    .line 271
    .line 272
    move-wide/from16 v33, v2

    .line 273
    .line 274
    move-wide/from16 v24, v2

    .line 275
    .line 276
    move-wide/from16 v22, v5

    .line 277
    .line 278
    move-object/from16 v18, v17

    .line 279
    .line 280
    move-object/from16 v17, v4

    .line 281
    .line 282
    invoke-direct/range {v17 .. v34}, Lza4;-><init>(Lpi3;ZJJJIJJJJ)V

    .line 283
    .line 284
    .line 285
    move-object/from16 v3, v17

    .line 286
    .line 287
    move-object/from16 v2, v18

    .line 288
    .line 289
    invoke-static {v0, v1, v2, v3, v14}, Lbm2;->l1(Llk3;Lcu4;Lpi3;Lza4;I)Llk3;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    goto :goto_9

    .line 294
    :cond_11
    move-object v1, v2

    .line 295
    move v2, v13

    .line 296
    const/4 v8, 0x4

    .line 297
    move-wide/from16 v4, p4

    .line 298
    .line 299
    move-wide/from16 v6, p6

    .line 300
    .line 301
    invoke-static/range {v0 .. v8}, Lbm2;->k1(Llk3;Lau4;IIJJI)Llk3;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    :goto_9
    iget v1, v0, Llk3;->A:I

    .line 306
    .line 307
    move/from16 v2, v16

    .line 308
    .line 309
    if-eq v1, v2, :cond_12

    .line 310
    .line 311
    if-eq v1, v14, :cond_12

    .line 312
    .line 313
    if-ge v9, v10, :cond_12

    .line 314
    .line 315
    invoke-virtual {v11}, Lcu4;->o()I

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    if-ne v10, v1, :cond_12

    .line 320
    .line 321
    if-lt v12, v9, :cond_12

    .line 322
    .line 323
    const/4 v1, 0x0

    .line 324
    invoke-virtual {v0, v14, v1}, Llk3;->f(ILandroidx/media3/common/PlaybackException;)Llk3;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    :cond_12
    return-object v0
.end method

.method public static k1(Llk3;Lau4;IIJJI)Llk3;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    new-instance v2, Lpi3;

    .line 6
    .line 7
    new-instance v3, Lbu4;

    .line 8
    .line 9
    invoke-direct {v3}, Lbu4;-><init>()V

    .line 10
    .line 11
    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    move/from16 v6, p2

    .line 15
    .line 16
    invoke-virtual {v1, v6, v3, v4, v5}, Lau4;->m(ILbu4;J)Lbu4;

    .line 17
    .line 18
    .line 19
    iget-object v5, v3, Lbu4;->b:Lgn2;

    .line 20
    .line 21
    iget-object v3, v0, Llk3;->c:Lza4;

    .line 22
    .line 23
    iget-object v3, v3, Lza4;->a:Lpi3;

    .line 24
    .line 25
    iget v12, v3, Lpi3;->h:I

    .line 26
    .line 27
    iget v13, v3, Lpi3;->i:I

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    move/from16 v4, p2

    .line 32
    .line 33
    move/from16 v7, p3

    .line 34
    .line 35
    move-wide/from16 v8, p4

    .line 36
    .line 37
    move-wide/from16 v10, p6

    .line 38
    .line 39
    invoke-direct/range {v2 .. v13}, Lpi3;-><init>(Ljava/lang/Object;ILgn2;Ljava/lang/Object;IJJII)V

    .line 40
    .line 41
    .line 42
    new-instance v3, Lza4;

    .line 43
    .line 44
    iget-object v4, v0, Llk3;->c:Lza4;

    .line 45
    .line 46
    iget-boolean v5, v4, Lza4;->b:Z

    .line 47
    .line 48
    move v7, v5

    .line 49
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 50
    .line 51
    .line 52
    move-result-wide v5

    .line 53
    move v9, v7

    .line 54
    iget-wide v7, v4, Lza4;->d:J

    .line 55
    .line 56
    move v11, v9

    .line 57
    iget-wide v9, v4, Lza4;->e:J

    .line 58
    .line 59
    move v12, v11

    .line 60
    iget v11, v4, Lza4;->f:I

    .line 61
    .line 62
    move v14, v12

    .line 63
    iget-wide v12, v4, Lza4;->g:J

    .line 64
    .line 65
    move/from16 v16, v14

    .line 66
    .line 67
    iget-wide v14, v4, Lza4;->h:J

    .line 68
    .line 69
    move-object/from16 p2, v2

    .line 70
    .line 71
    move-object/from16 p3, v3

    .line 72
    .line 73
    iget-wide v2, v4, Lza4;->i:J

    .line 74
    .line 75
    move-wide/from16 v17, v2

    .line 76
    .line 77
    iget-wide v2, v4, Lza4;->j:J

    .line 78
    .line 79
    move/from16 v4, v16

    .line 80
    .line 81
    move-wide/from16 v16, v17

    .line 82
    .line 83
    move-wide/from16 v18, v2

    .line 84
    .line 85
    move-object/from16 v3, p2

    .line 86
    .line 87
    move-object/from16 v2, p3

    .line 88
    .line 89
    invoke-direct/range {v2 .. v19}, Lza4;-><init>(Lpi3;ZJJJIJJJJ)V

    .line 90
    .line 91
    .line 92
    move-object v4, v2

    .line 93
    move/from16 v2, p8

    .line 94
    .line 95
    invoke-static {v0, v1, v3, v4, v2}, Lbm2;->l1(Llk3;Lcu4;Lpi3;Lza4;I)Llk3;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    return-object v0
.end method

.method public static l1(Llk3;Lcu4;Lpi3;Lza4;I)Llk3;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Llk3;->a:Landroidx/media3/common/PlaybackException;

    .line 4
    .line 5
    iget v2, v0, Llk3;->b:I

    .line 6
    .line 7
    iget-object v3, v0, Llk3;->c:Lza4;

    .line 8
    .line 9
    iget-object v7, v0, Llk3;->g:Lqh3;

    .line 10
    .line 11
    iget v8, v0, Llk3;->h:I

    .line 12
    .line 13
    iget-boolean v9, v0, Llk3;->i:Z

    .line 14
    .line 15
    iget v12, v0, Llk3;->k:I

    .line 16
    .line 17
    iget-object v10, v0, Llk3;->l:Ls55;

    .line 18
    .line 19
    iget-object v13, v0, Llk3;->m:Ldo2;

    .line 20
    .line 21
    iget v14, v0, Llk3;->n:F

    .line 22
    .line 23
    iget v15, v0, Llk3;->o:F

    .line 24
    .line 25
    iget v4, v0, Llk3;->p:I

    .line 26
    .line 27
    iget-object v5, v0, Llk3;->q:Lil;

    .line 28
    .line 29
    iget-object v6, v0, Llk3;->r:Ljg0;

    .line 30
    .line 31
    iget-object v11, v0, Llk3;->s:Lhp0;

    .line 32
    .line 33
    move-object/from16 v16, v1

    .line 34
    .line 35
    iget v1, v0, Llk3;->t:I

    .line 36
    .line 37
    move/from16 v20, v1

    .line 38
    .line 39
    iget-boolean v1, v0, Llk3;->u:Z

    .line 40
    .line 41
    move/from16 v21, v1

    .line 42
    .line 43
    iget-boolean v1, v0, Llk3;->v:Z

    .line 44
    .line 45
    move/from16 v22, v1

    .line 46
    .line 47
    iget v1, v0, Llk3;->w:I

    .line 48
    .line 49
    move/from16 v23, v1

    .line 50
    .line 51
    iget-boolean v1, v0, Llk3;->x:Z

    .line 52
    .line 53
    move/from16 v26, v1

    .line 54
    .line 55
    iget-boolean v1, v0, Llk3;->y:Z

    .line 56
    .line 57
    move/from16 v27, v1

    .line 58
    .line 59
    iget v1, v0, Llk3;->z:I

    .line 60
    .line 61
    move/from16 v24, v1

    .line 62
    .line 63
    iget v1, v0, Llk3;->A:I

    .line 64
    .line 65
    move/from16 v25, v1

    .line 66
    .line 67
    iget-object v1, v0, Llk3;->B:Ldo2;

    .line 68
    .line 69
    move-object/from16 v28, v1

    .line 70
    .line 71
    move/from16 v17, v2

    .line 72
    .line 73
    iget-wide v1, v0, Llk3;->C:J

    .line 74
    .line 75
    move-wide/from16 v29, v1

    .line 76
    .line 77
    iget-wide v1, v0, Llk3;->D:J

    .line 78
    .line 79
    move-wide/from16 v31, v1

    .line 80
    .line 81
    iget-wide v1, v0, Llk3;->E:J

    .line 82
    .line 83
    move-wide/from16 v33, v1

    .line 84
    .line 85
    iget-object v1, v0, Llk3;->F:Ljw4;

    .line 86
    .line 87
    iget-object v0, v0, Llk3;->G:Lcw4;

    .line 88
    .line 89
    iget-object v2, v3, Lza4;->a:Lpi3;

    .line 90
    .line 91
    invoke-virtual/range {p1 .. p1}, Lcu4;->p()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-nez v3, :cond_1

    .line 96
    .line 97
    move-object/from16 v3, p3

    .line 98
    .line 99
    move-object/from16 v36, v0

    .line 100
    .line 101
    iget-object v0, v3, Lza4;->a:Lpi3;

    .line 102
    .line 103
    iget v0, v0, Lpi3;->b:I

    .line 104
    .line 105
    move-object/from16 v35, v1

    .line 106
    .line 107
    invoke-virtual/range {p1 .. p1}, Lcu4;->o()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-ge v0, v1, :cond_0

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_0
    const/4 v0, 0x0

    .line 115
    goto :goto_1

    .line 116
    :cond_1
    move-object/from16 v3, p3

    .line 117
    .line 118
    move-object/from16 v36, v0

    .line 119
    .line 120
    move-object/from16 v35, v1

    .line 121
    .line 122
    :goto_0
    const/4 v0, 0x1

    .line 123
    :goto_1
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 124
    .line 125
    .line 126
    new-instance v0, Llk3;

    .line 127
    .line 128
    move v1, v4

    .line 129
    move-object v4, v2

    .line 130
    move/from16 v2, v17

    .line 131
    .line 132
    move/from16 v17, v1

    .line 133
    .line 134
    move-object/from16 v18, v6

    .line 135
    .line 136
    move-object/from16 v19, v11

    .line 137
    .line 138
    move-object/from16 v1, v16

    .line 139
    .line 140
    move-object/from16 v11, p1

    .line 141
    .line 142
    move/from16 v6, p4

    .line 143
    .line 144
    move-object/from16 v16, v5

    .line 145
    .line 146
    move-object/from16 v5, p2

    .line 147
    .line 148
    invoke-direct/range {v0 .. v36}, Llk3;-><init>(Landroidx/media3/common/PlaybackException;ILza4;Lpi3;Lpi3;ILqh3;IZLs55;Lcu4;ILdo2;FFLil;ILjg0;Lhp0;IZZIIIZZLdo2;JJJLjw4;Lcw4;)V

    .line 149
    .line 150
    .line 151
    return-object v0
.end method

.method public static q1(Lcu4;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    move v4, v0

    .line 3
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-ge v4, v1, :cond_3

    .line 8
    .line 9
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lbu4;

    .line 14
    .line 15
    iget v2, v1, Lbu4;->m:I

    .line 16
    .line 17
    iget v3, v1, Lbu4;->n:I

    .line 18
    .line 19
    const/4 v5, -0x1

    .line 20
    if-eq v2, v5, :cond_1

    .line 21
    .line 22
    if-ne v3, v5, :cond_0

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    iput v5, v1, Lbu4;->m:I

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    sub-int v6, v3, v2

    .line 36
    .line 37
    add-int/2addr v6, v5

    .line 38
    iput v6, v1, Lbu4;->n:I

    .line 39
    .line 40
    :goto_1
    if-gt v2, v3, :cond_2

    .line 41
    .line 42
    new-instance v1, Lzt4;

    .line 43
    .line 44
    invoke-direct {v1}, Lzt4;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v2, v1, v0}, Lcu4;->f(ILzt4;Z)Lzt4;

    .line 48
    .line 49
    .line 50
    iput v4, v1, Lzt4;->c:I

    .line 51
    .line 52
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    :goto_2
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    iput v2, v1, Lbu4;->m:I

    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    iput v2, v1, Lbu4;->n:I

    .line 69
    .line 70
    new-instance v1, Lzt4;

    .line 71
    .line 72
    invoke-direct {v1}, Lzt4;-><init>()V

    .line 73
    .line 74
    .line 75
    sget-object v9, Lz5;->f:Lz5;

    .line 76
    .line 77
    const/4 v10, 0x1

    .line 78
    const/4 v2, 0x0

    .line 79
    const/4 v3, 0x0

    .line 80
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    const-wide/16 v7, 0x0

    .line 86
    .line 87
    invoke-virtual/range {v1 .. v10}, Lzt4;->i(Ljava/lang/Object;Ljava/lang/Object;IJJLz5;Z)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    return-void
.end method

.method public static t1(Lgy3;Ljava/util/List;Landroid/os/Bundle;Lwa4;Lmi3;)Lgy3;
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1, p3, p4}, Lj60;->g(Ljava/util/List;Lwa4;Lmi3;)Lgy3;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p1, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS"

    .line 13
    .line 14
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/4 p3, 0x0

    .line 19
    const/4 v0, 0x1

    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x6

    .line 23
    const/4 v1, 0x7

    .line 24
    filled-new-array {p1, v1}, [I

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object v1, p4, Lmi3;->a:Lw71;

    .line 29
    .line 30
    invoke-virtual {v1, p1}, Lw71;->a([I)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    move p1, v0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move p1, p3

    .line 39
    :goto_0
    const-string v1, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT"

    .line 40
    .line 41
    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-nez p2, :cond_2

    .line 46
    .line 47
    const/16 p2, 0x8

    .line 48
    .line 49
    const/16 v1, 0x9

    .line 50
    .line 51
    filled-new-array {p2, v1}, [I

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    iget-object p4, p4, Lmi3;->a:Lw71;

    .line 56
    .line 57
    invoke-virtual {p4, p2}, Lw71;->a([I)Z

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    if-nez p2, :cond_2

    .line 62
    .line 63
    move p3, v0

    .line 64
    :cond_2
    invoke-static {p0, p1, p3}, Lj60;->j(Ljava/util/List;ZZ)Lgy3;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method

.method public static u1(Ljava/util/List;Ljava/util/List;Lwa4;Lmi3;Landroid/os/Bundle;)Lgy3;
    .locals 1

    .line 1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1, p3, p4}, Lj60;->k(Ljava/util/List;Lmi3;Landroid/os/Bundle;)Lgy3;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_0
    invoke-static {p0, p2, p3}, Lj60;->g(Ljava/util/List;Lwa4;Lmi3;)Lgy3;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method


# virtual methods
.method public final A()V
    .locals 3

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v0, Lcl2;

    .line 10
    .line 11
    const/4 v1, 0x7

    .line 12
    invoke-direct {v0, p0, v1}, Lcl2;-><init>(Lbm2;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lbm2;->w()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, -0x1

    .line 23
    if-eq v0, v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Lbm2;->w()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0, v1, v2}, Lbm2;->v1(IJ)V

    .line 35
    .line 36
    .line 37
    :cond_1
    :goto_0
    return-void
.end method

.method public final A0()V
    .locals 3

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lcl2;

    .line 11
    .line 12
    const/16 v1, 0xd

    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, Lcl2;-><init>(Lbm2;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 21
    .line 22
    iget v1, v0, Llk3;->n:F

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    cmpl-float v1, v1, v2

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Llk3;->p(F)Llk3;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lbm2;->q:Llk3;

    .line 34
    .line 35
    new-instance v0, Ler1;

    .line 36
    .line 37
    const/16 v1, 0x14

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ler1;-><init>(I)V

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, Lbm2;->i:Ltc2;

    .line 43
    .line 44
    const/16 v1, 0x16

    .line 45
    .line 46
    invoke-virtual {p0, v1, v0}, Ltc2;->c(ILqc2;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ltc2;->b()V

    .line 50
    .line 51
    .line 52
    :cond_1
    :goto_0
    return-void
.end method

.method public final A1(Llk3;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 7

    .line 1
    iget-object v1, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iput-object p1, p0, Lbm2;->q:Llk3;

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    move-object v2, p1

    .line 7
    move-object v3, p2

    .line 8
    move-object v4, p3

    .line 9
    move-object v5, p4

    .line 10
    move-object v6, p5

    .line 11
    invoke-virtual/range {v0 .. v6}, Lbm2;->n1(Llk3;Llk3;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final B()F
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget p0, p0, Llk3;->n:F

    .line 4
    .line 5
    return p0
.end method

.method public final B0(Lgn2;)V
    .locals 8

    .line 1
    const/16 v0, 0x1f

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lgl2;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {v0, p0, p1, v1}, Lgl2;-><init>(Lbm2;Lgn2;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/4 v4, -0x1

    .line 24
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    const/4 v7, 0x1

    .line 30
    move-object v2, p0

    .line 31
    invoke-virtual/range {v2 .. v7}, Lbm2;->x1(Ljava/util/List;IJZ)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final C()V
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Lcl2;

    .line 10
    .line 11
    const/16 v1, 0x9

    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, Lcl2;-><init>(Lbm2;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 20
    .line 21
    invoke-static {v0}, Lbm2;->e1(Llk3;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0, v1, v2}, Lbm2;->v1(IJ)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final C0()V
    .locals 3

    .line 1
    const/16 v0, 0x1a

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lcl2;

    .line 11
    .line 12
    const/16 v1, 0xc

    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, Lcl2;-><init>(Lbm2;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 21
    .line 22
    iget v1, v0, Llk3;->t:I

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    iget-object v2, v0, Llk3;->s:Lhp0;

    .line 27
    .line 28
    iget v2, v2, Lhp0;->c:I

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    if-gt v1, v2, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    return-void

    .line 36
    :cond_2
    :goto_1
    iget-boolean v2, v0, Llk3;->u:Z

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Llk3;->c(IZ)Llk3;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lbm2;->q:Llk3;

    .line 43
    .line 44
    new-instance v0, Lkl2;

    .line 45
    .line 46
    const/4 v2, 0x4

    .line 47
    invoke-direct {v0, p0, v1, v2}, Lkl2;-><init>(Lbm2;II)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, Lbm2;->i:Ltc2;

    .line 51
    .line 52
    const/16 v1, 0x1e

    .line 53
    .line 54
    invoke-virtual {p0, v1, v0}, Ltc2;->c(ILqc2;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ltc2;->b()V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final D()Lil;
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object p0, p0, Llk3;->q:Lil;

    .line 4
    .line 5
    return-object p0
.end method

.method public final D0()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-boolean p0, p0, Llk3;->i:Z

    .line 4
    .line 5
    return p0
.end method

.method public final E(IZ)V
    .locals 1

    .line 1
    const/16 v0, 0x22

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Ltl2;

    .line 11
    .line 12
    invoke-direct {v0, p0, p2, p1}, Ltl2;-><init>(Lbm2;ZI)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lbm2;->q:Llk3;

    .line 19
    .line 20
    iget-boolean v0, p1, Llk3;->u:Z

    .line 21
    .line 22
    if-eq v0, p2, :cond_1

    .line 23
    .line 24
    iget v0, p1, Llk3;->t:I

    .line 25
    .line 26
    invoke-virtual {p1, v0, p2}, Llk3;->c(IZ)Llk3;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lbm2;->q:Llk3;

    .line 31
    .line 32
    new-instance p1, Ljl2;

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    invoke-direct {p1, p0, p2, v0}, Ljl2;-><init>(Lbm2;ZI)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lbm2;->i:Ltc2;

    .line 39
    .line 40
    const/16 p2, 0x1e

    .line 41
    .line 42
    invoke-virtual {p0, p2, p1}, Ltc2;->c(ILqc2;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Ltc2;->b()V

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_0
    return-void
.end method

.method public final E0()Lcw4;
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object p0, p0, Llk3;->G:Lcw4;

    .line 4
    .line 5
    return-object p0
.end method

.method public final F()Lhp0;
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object p0, p0, Llk3;->s:Lhp0;

    .line 4
    .line 5
    return-object p0
.end method

.method public final F0()J
    .locals 2

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object p0, p0, Llk3;->c:Lza4;

    .line 4
    .line 5
    iget-wide v0, p0, Lza4;->j:J

    .line 6
    .line 7
    return-wide v0
.end method

.method public final G()V
    .locals 3

    .line 1
    const/16 v0, 0x1a

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lcl2;

    .line 11
    .line 12
    const/16 v1, 0xf

    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, Lcl2;-><init>(Lbm2;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 21
    .line 22
    iget v1, v0, Llk3;->t:I

    .line 23
    .line 24
    add-int/lit8 v1, v1, -0x1

    .line 25
    .line 26
    iget-object v2, v0, Llk3;->s:Lhp0;

    .line 27
    .line 28
    iget v2, v2, Lhp0;->b:I

    .line 29
    .line 30
    if-lt v1, v2, :cond_1

    .line 31
    .line 32
    iget-boolean v2, v0, Llk3;->u:Z

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Llk3;->c(IZ)Llk3;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lbm2;->q:Llk3;

    .line 39
    .line 40
    new-instance v0, Lkl2;

    .line 41
    .line 42
    const/16 v2, 0x9

    .line 43
    .line 44
    invoke-direct {v0, p0, v1, v2}, Lkl2;-><init>(Lbm2;II)V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, Lbm2;->i:Ltc2;

    .line 48
    .line 49
    const/16 v1, 0x1e

    .line 50
    .line 51
    invoke-virtual {p0, v1, v0}, Ltc2;->c(ILqc2;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ltc2;->b()V

    .line 55
    .line 56
    .line 57
    :cond_1
    :goto_0
    return-void
.end method

.method public final G0(I)V
    .locals 3

    .line 1
    const/16 v0, 0x19

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lkl2;

    .line 11
    .line 12
    const/4 v1, 0x7

    .line 13
    invoke-direct {v0, p0, p1, v1}, Lkl2;-><init>(Lbm2;II)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 20
    .line 21
    iget-object v1, v0, Llk3;->s:Lhp0;

    .line 22
    .line 23
    iget v2, v0, Llk3;->t:I

    .line 24
    .line 25
    if-eq v2, p1, :cond_2

    .line 26
    .line 27
    iget v2, v1, Lhp0;->b:I

    .line 28
    .line 29
    if-gt v2, p1, :cond_2

    .line 30
    .line 31
    iget v1, v1, Lhp0;->c:I

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    if-gt p1, v1, :cond_2

    .line 36
    .line 37
    :cond_1
    iget-boolean v1, v0, Llk3;->u:Z

    .line 38
    .line 39
    invoke-virtual {v0, p1, v1}, Llk3;->c(IZ)Llk3;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lbm2;->q:Llk3;

    .line 44
    .line 45
    new-instance v0, Lkl2;

    .line 46
    .line 47
    const/16 v1, 0x8

    .line 48
    .line 49
    invoke-direct {v0, p0, p1, v1}, Lkl2;-><init>(Lbm2;II)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, Lbm2;->i:Ltc2;

    .line 53
    .line 54
    const/16 p1, 0x1e

    .line 55
    .line 56
    invoke-virtual {p0, p1, v0}, Ltc2;->c(ILqc2;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Ltc2;->b()V

    .line 60
    .line 61
    .line 62
    :cond_2
    :goto_0
    return-void
.end method

.method public final H(II)V
    .locals 2

    .line 1
    const/16 v0, 0x21

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lnl2;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, p0, p1, p2, v1}, Lnl2;-><init>(Lbm2;III)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 17
    .line 18
    .line 19
    iget-object p2, p0, Lbm2;->q:Llk3;

    .line 20
    .line 21
    iget-object v0, p2, Llk3;->s:Lhp0;

    .line 22
    .line 23
    iget v1, p2, Llk3;->t:I

    .line 24
    .line 25
    if-eq v1, p1, :cond_2

    .line 26
    .line 27
    iget v1, v0, Lhp0;->b:I

    .line 28
    .line 29
    if-gt v1, p1, :cond_2

    .line 30
    .line 31
    iget v0, v0, Lhp0;->c:I

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    if-gt p1, v0, :cond_2

    .line 36
    .line 37
    :cond_1
    iget-boolean v0, p2, Llk3;->u:Z

    .line 38
    .line 39
    invoke-virtual {p2, p1, v0}, Llk3;->c(IZ)Llk3;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    iput-object p2, p0, Lbm2;->q:Llk3;

    .line 44
    .line 45
    new-instance p2, Lkl2;

    .line 46
    .line 47
    const/4 v0, 0x3

    .line 48
    invoke-direct {p2, p0, p1, v0}, Lkl2;-><init>(Lbm2;II)V

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, Lbm2;->i:Ltc2;

    .line 52
    .line 53
    const/16 p1, 0x1e

    .line 54
    .line 55
    invoke-virtual {p0, p1, p2}, Ltc2;->c(ILqc2;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Ltc2;->b()V

    .line 59
    .line 60
    .line 61
    :cond_2
    :goto_0
    return-void
.end method

.method public final H0()V
    .locals 7

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lcl2;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {v0, p0, v1}, Lcl2;-><init>(Lbm2;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 20
    .line 21
    iget-object v0, v0, Llk3;->j:Lcu4;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_3

    .line 28
    .line 29
    invoke-virtual {p0}, Lbm2;->k()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0}, Lbm2;->f0()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0}, Lbm2;->j0()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-virtual {p0, v0, v2, v3}, Lbm2;->v1(IJ)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    iget-object v1, p0, Lbm2;->q:Llk3;

    .line 56
    .line 57
    invoke-static {v1}, Lbm2;->e1(Llk3;)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    new-instance v4, Lbu4;

    .line 62
    .line 63
    invoke-direct {v4}, Lbu4;-><init>()V

    .line 64
    .line 65
    .line 66
    const-wide/16 v5, 0x0

    .line 67
    .line 68
    invoke-virtual {v0, v1, v4, v5, v6}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iget-boolean v1, v0, Lbu4;->h:Z

    .line 73
    .line 74
    if-eqz v1, :cond_3

    .line 75
    .line 76
    invoke-virtual {v0}, Lbu4;->a()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 83
    .line 84
    invoke-static {v0}, Lbm2;->e1(Llk3;)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    invoke-virtual {p0, v0, v2, v3}, Lbm2;->v1(IJ)V

    .line 89
    .line 90
    .line 91
    :cond_3
    :goto_0
    return-void
.end method

.method public final I()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbm2;->w()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, -0x1

    .line 6
    if-eq p0, v0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public final I0()V
    .locals 2

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lcl2;

    .line 11
    .line 12
    const/16 v1, 0x8

    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, Lcl2;-><init>(Lbm2;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 21
    .line 22
    iget-wide v0, v0, Llk3;->D:J

    .line 23
    .line 24
    invoke-virtual {p0, v0, v1}, Lbm2;->w1(J)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final J(I)V
    .locals 2

    .line 1
    const/16 v0, 0x22

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lkl2;

    .line 11
    .line 12
    const/4 v1, 0x5

    .line 13
    invoke-direct {v0, p0, p1, v1}, Lkl2;-><init>(Lbm2;II)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lbm2;->q:Llk3;

    .line 20
    .line 21
    iget v0, p1, Llk3;->t:I

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    iget-object v1, p1, Llk3;->s:Lhp0;

    .line 26
    .line 27
    iget v1, v1, Lhp0;->c:I

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    if-gt v0, v1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    :goto_0
    return-void

    .line 35
    :cond_2
    :goto_1
    iget-boolean v1, p1, Llk3;->u:Z

    .line 36
    .line 37
    invoke-virtual {p1, v0, v1}, Llk3;->c(IZ)Llk3;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lbm2;->q:Llk3;

    .line 42
    .line 43
    new-instance p1, Lkl2;

    .line 44
    .line 45
    const/4 v1, 0x6

    .line 46
    invoke-direct {p1, p0, v0, v1}, Lkl2;-><init>(Lbm2;II)V

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Lbm2;->i:Ltc2;

    .line 50
    .line 51
    const/16 v0, 0x1e

    .line 52
    .line 53
    invoke-virtual {p0, v0, p1}, Ltc2;->c(ILqc2;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Ltc2;->b()V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final J0()V
    .locals 2

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lcl2;

    .line 11
    .line 12
    const/16 v1, 0xb

    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, Lcl2;-><init>(Lbm2;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 21
    .line 22
    iget-wide v0, v0, Llk3;->C:J

    .line 23
    .line 24
    neg-long v0, v0

    .line 25
    invoke-virtual {p0, v0, v1}, Lbm2;->w1(J)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final K()I
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object p0, p0, Llk3;->c:Lza4;

    .line 4
    .line 5
    iget-object p0, p0, Lza4;->a:Lpi3;

    .line 6
    .line 7
    iget p0, p0, Lpi3;->i:I

    .line 8
    .line 9
    return p0
.end method

.method public final K0()Ldo2;
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object p0, p0, Llk3;->B:Ldo2;

    .line 4
    .line 5
    return-object p0
.end method

.method public final L(IILjava/util/List;)V
    .locals 7

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    if-ltz p1, :cond_1

    .line 11
    .line 12
    if-gt p1, p2, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-static {v0}, Lrr2;->l(Z)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lhl2;

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    move-object v2, p0

    .line 24
    move v4, p1

    .line 25
    move v5, p2

    .line 26
    move-object v3, p3

    .line 27
    invoke-direct/range {v1 .. v6}, Lhl2;-><init>(Ljava/lang/Object;Ljava/lang/Object;III)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v1}, Lbm2;->b1(Lxl2;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v4, v5, v3}, Lbm2;->s1(IILjava/util/List;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final L0(Ljava/util/List;)V
    .locals 9

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lef0;

    .line 11
    .line 12
    move-object v1, p1

    .line 13
    check-cast v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v2, 0xb

    .line 16
    .line 17
    invoke-direct {v0, v2, p0, v1}, Lef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 21
    .line 22
    .line 23
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    const/4 v8, 0x1

    .line 29
    const/4 v5, -0x1

    .line 30
    move-object v3, p0

    .line 31
    move-object v4, p1

    .line 32
    invoke-virtual/range {v3 .. v8}, Lbm2;->x1(Ljava/util/List;IJZ)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final M(Lcw4;)V
    .locals 2

    .line 1
    const/16 v0, 0x1d

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lef0;

    .line 11
    .line 12
    const/16 v1, 0x10

    .line 13
    .line 14
    invoke-direct {v0, v1, p0, p1}, Lef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 21
    .line 22
    iget-object v1, v0, Llk3;->G:Lcw4;

    .line 23
    .line 24
    if-eq p1, v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Llk3;->o(Lcw4;)Llk3;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lbm2;->q:Llk3;

    .line 31
    .line 32
    new-instance v0, Ly31;

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    invoke-direct {v0, p1, v1}, Ly31;-><init>(Lcw4;I)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lbm2;->i:Ltc2;

    .line 39
    .line 40
    const/16 p1, 0x13

    .line 41
    .line 42
    invoke-virtual {p0, p1, v0}, Ltc2;->c(ILqc2;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Ltc2;->b()V

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_0
    return-void
.end method

.method public final M0()J
    .locals 7

    .line 1
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-wide v1, p0, Lbm2;->F:J

    .line 4
    .line 5
    iget-wide v3, p0, Lbm2;->G:J

    .line 6
    .line 7
    invoke-virtual {p0}, Lbm2;->f1()Lsk2;

    .line 8
    .line 9
    .line 10
    move-result-object v5

    .line 11
    iget-wide v5, v5, Lsk2;->g:J

    .line 12
    .line 13
    invoke-static/range {v0 .. v6}, Lju2;->c(Llk3;JJJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iput-wide v0, p0, Lbm2;->F:J

    .line 18
    .line 19
    return-wide v0
.end method

.method public final N(I)V
    .locals 2

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    if-ltz p1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-static {v0}, Lrr2;->l(Z)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lkl2;

    .line 19
    .line 20
    const/16 v1, 0xb

    .line 21
    .line 22
    invoke-direct {v0, p0, p1, v1}, Lkl2;-><init>(Lbm2;II)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v0, p1, 0x1

    .line 29
    .line 30
    invoke-virtual {p0, p1, v0}, Lbm2;->r1(II)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final N0(Ljava/util/List;I)V
    .locals 2

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    if-ltz p2, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-static {v0}, Lrr2;->l(Z)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lvl2;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, p0, p2, p1, v1}, Lvl2;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lbm2;->W0(Ljava/util/List;I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final O(J)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Lll2;

    .line 10
    .line 11
    invoke-direct {v0, p1, p2, p0}, Lll2;-><init>(JLjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 18
    .line 19
    invoke-static {v0}, Lbm2;->e1(Llk3;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p0, v0, p1, p2}, Lbm2;->v1(IJ)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final O0()J
    .locals 2

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-wide v0, p0, Llk3;->C:J

    .line 4
    .line 5
    return-wide v0
.end method

.method public final P(II)V
    .locals 2

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    if-ltz p1, :cond_1

    .line 11
    .line 12
    if-lt p2, p1, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-static {v0}, Lrr2;->l(Z)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lnl2;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, p0, p1, p2, v1}, Lnl2;-><init>(Lbm2;III)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1, p2}, Lbm2;->r1(II)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final P0()Lwa4;
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->w:Lwa4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final Q(Landroid/view/SurfaceHolder;)V
    .locals 4

    .line 1
    const/16 v0, 0x1b

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez p1, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {p0}, Lbm2;->X0()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1, v2, v2}, Lbm2;->z1(Landroid/view/Surface;II)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v2, v2}, Lbm2;->p1(II)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    iget-object v0, p0, Lbm2;->B:Landroid/view/SurfaceHolder;

    .line 32
    .line 33
    if-ne v0, p1, :cond_3

    .line 34
    .line 35
    :goto_0
    return-void

    .line 36
    :cond_3
    invoke-virtual {p0}, Lbm2;->X0()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lbm2;->B:Landroid/view/SurfaceHolder;

    .line 40
    .line 41
    iget-object v0, p0, Lbm2;->h:Lam2;

    .line 42
    .line 43
    invoke-interface {p1, v0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_4

    .line 57
    .line 58
    iput-object v0, p0, Lbm2;->A:Landroid/view/Surface;

    .line 59
    .line 60
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-virtual {p0, v0, v1, v2}, Lbm2;->z1(Landroid/view/Surface;II)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    invoke-virtual {p0, v0, p1}, Lbm2;->p1(II)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_4
    iput-object v1, p0, Lbm2;->A:Landroid/view/Surface;

    .line 88
    .line 89
    invoke-virtual {p0, v1, v2, v2}, Lbm2;->z1(Landroid/view/Surface;II)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v2, v2}, Lbm2;->p1(II)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final Q0()Lyw1;
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->u:Lgy3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final R(F)V
    .locals 3

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lrl2;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, p0, p1, v1}, Lrl2;-><init>(Ljava/lang/Object;FI)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 20
    .line 21
    iget v2, v0, Llk3;->n:F

    .line 22
    .line 23
    cmpl-float v2, v2, p1

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Llk3;->p(F)Llk3;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lbm2;->q:Llk3;

    .line 32
    .line 33
    new-instance v0, Lw31;

    .line 34
    .line 35
    invoke-direct {v0, v1, p1}, Lw31;-><init>(IF)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lbm2;->i:Ltc2;

    .line 39
    .line 40
    const/16 p1, 0x16

    .line 41
    .line 42
    invoke-virtual {p0, p1, v0}, Ltc2;->c(ILqc2;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Ltc2;->b()V

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_0
    return-void
.end method

.method public final R0()V
    .locals 8

    .line 1
    iget-object v0, p0, Lbm2;->e:Lcb4;

    .line 2
    .line 3
    iget-object v1, v0, Lcb4;->a:Lbb4;

    .line 4
    .line 5
    iget-object v2, v0, Lcb4;->a:Lbb4;

    .line 6
    .line 7
    invoke-interface {v1}, Lbb4;->getType()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const-string v3, "MCImplBase"

    .line 12
    .line 13
    iget-object v4, p0, Lbm2;->d:Landroid/content/Context;

    .line 14
    .line 15
    iget-object v5, p0, Lbm2;->f:Landroid/os/Bundle;

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Lbm2;->o:Lyl2;

    .line 21
    .line 22
    invoke-interface {v2}, Lbb4;->c()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    check-cast v0, Landroid/os/IBinder;

    .line 30
    .line 31
    sget v1, Lkt2;->k:I

    .line 32
    .line 33
    const-string v1, "androidx.media3.session.IMediaSession"

    .line 34
    .line 35
    invoke-interface {v0, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    instance-of v2, v1, Lpu1;

    .line 42
    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    check-cast v1, Lpu1;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance v1, Lnu1;

    .line 49
    .line 50
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v0, v1, Lnu1;->e:Landroid/os/IBinder;

    .line 54
    .line 55
    :goto_0
    iget-object v0, p0, Lbm2;->b:Lyk;

    .line 56
    .line 57
    invoke-virtual {v0}, Lyk;->s()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    new-instance v2, Lja0;

    .line 62
    .line 63
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    iget-object v7, p0, Lbm2;->a:Lsk2;

    .line 72
    .line 73
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-direct {v2, v4, v6, v5}, Lja0;-><init>(Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 77
    .line 78
    .line 79
    :try_start_0
    iget-object v4, p0, Lbm2;->c:Lmm2;

    .line 80
    .line 81
    invoke-virtual {v2}, Lja0;->b()Landroid/os/Bundle;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-interface {v1, v4, v0, v2}, Lpu1;->n0(Lju1;ILandroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :catch_0
    move-exception v0

    .line 90
    const-string v1, "Failed to call connection request."

    .line 91
    .line 92
    invoke-static {v3, v1, v0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_1
    new-instance v1, Lyl2;

    .line 97
    .line 98
    invoke-direct {v1, p0, v5}, Lyl2;-><init>(Lbm2;Landroid/os/Bundle;)V

    .line 99
    .line 100
    .line 101
    iput-object v1, p0, Lbm2;->o:Lyl2;

    .line 102
    .line 103
    const-string v1, "bind to "

    .line 104
    .line 105
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 106
    .line 107
    const/16 v6, 0x1d

    .line 108
    .line 109
    if-lt v5, v6, :cond_2

    .line 110
    .line 111
    const/16 v5, 0x1001

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_2
    const/4 v5, 0x1

    .line 115
    :goto_1
    new-instance v6, Landroid/content/Intent;

    .line 116
    .line 117
    const-string v7, "androidx.media3.session.MediaSessionService"

    .line 118
    .line 119
    invoke-direct {v6, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v2}, Lbb4;->g()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    invoke-interface {v2}, Lbb4;->d()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v6, v7, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 131
    .line 132
    .line 133
    :try_start_1
    iget-object v2, p0, Lbm2;->o:Lyl2;

    .line 134
    .line 135
    invoke-virtual {v4, v6, v2, v5}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_3

    .line 140
    .line 141
    return-void

    .line 142
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string v4, " failed"

    .line 151
    .line 152
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-static {v3, v2}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :catch_1
    move-exception v2

    .line 164
    new-instance v4, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string v0, " not allowed"

    .line 173
    .line 174
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-static {v3, v0, v2}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 182
    .line 183
    .line 184
    :goto_2
    invoke-virtual {p0}, Lbm2;->f1()Lsk2;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {p0}, Lbm2;->f1()Lsk2;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    new-instance v1, Lqa1;

    .line 196
    .line 197
    const/16 v2, 0x12

    .line 198
    .line 199
    invoke-direct {v1, v2, p0}, Lqa1;-><init>(ILjava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v1}, Lsk2;->a1(Ljava/lang/Runnable;)V

    .line 203
    .line 204
    .line 205
    return-void
.end method

.method public final S()V
    .locals 8

    .line 1
    const/4 v0, 0x7

    .line 2
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v0, Lcl2;

    .line 10
    .line 11
    const/16 v1, 0x10

    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, Lcl2;-><init>(Lbm2;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 20
    .line 21
    iget-object v0, v0, Llk3;->j:Lcu4;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_4

    .line 28
    .line 29
    invoke-virtual {p0}, Lbm2;->k()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0}, Lbm2;->I()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iget-object v2, p0, Lbm2;->q:Llk3;

    .line 41
    .line 42
    invoke-static {v2}, Lbm2;->e1(Llk3;)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    new-instance v3, Lbu4;

    .line 47
    .line 48
    invoke-direct {v3}, Lbu4;-><init>()V

    .line 49
    .line 50
    .line 51
    const-wide/16 v4, 0x0

    .line 52
    .line 53
    invoke-virtual {v0, v2, v3, v4, v5}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iget-boolean v2, v0, Lbu4;->h:Z

    .line 58
    .line 59
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    invoke-virtual {v0}, Lbu4;->a()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    if-eqz v1, :cond_4

    .line 73
    .line 74
    invoke-virtual {p0}, Lbm2;->w()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-virtual {p0, v0, v6, v7}, Lbm2;->v1(IJ)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_2
    if-eqz v1, :cond_3

    .line 83
    .line 84
    invoke-virtual {p0}, Lbm2;->M0()J

    .line 85
    .line 86
    .line 87
    move-result-wide v0

    .line 88
    iget-object v2, p0, Lbm2;->q:Llk3;

    .line 89
    .line 90
    iget-wide v2, v2, Llk3;->E:J

    .line 91
    .line 92
    cmp-long v0, v0, v2

    .line 93
    .line 94
    if-gtz v0, :cond_3

    .line 95
    .line 96
    invoke-virtual {p0}, Lbm2;->w()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    invoke-virtual {p0, v0, v6, v7}, Lbm2;->v1(IJ)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_3
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 105
    .line 106
    invoke-static {v0}, Lbm2;->e1(Llk3;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    invoke-virtual {p0, v0, v4, v5}, Lbm2;->v1(IJ)V

    .line 111
    .line 112
    .line 113
    :cond_4
    :goto_0
    return-void
.end method

.method public final S0()Landroid/os/Bundle;
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->f:Landroid/os/Bundle;

    .line 2
    .line 3
    return-object p0
.end method

.method public final T(Ljava/util/List;IJ)V
    .locals 8

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v1, Lml2;

    .line 11
    .line 12
    move-object v2, p0

    .line 13
    move-object v3, p1

    .line 14
    move v4, p2

    .line 15
    move-wide v5, p3

    .line 16
    invoke-direct/range {v1 .. v6}, Lml2;-><init>(Lbm2;Ljava/util/List;IJ)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v1}, Lbm2;->b1(Lxl2;)V

    .line 20
    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    invoke-virtual/range {v2 .. v7}, Lbm2;->x1(Ljava/util/List;IJZ)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final T0(Lva4;Landroid/os/Bundle;)Lic2;
    .locals 2

    .line 1
    iget-object v0, p0, Lbm2;->n:Lcb4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Lcb4;->a:Lbb4;

    .line 7
    .line 8
    invoke-interface {v0}, Lbb4;->f()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x7

    .line 13
    if-lt v0, v1, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lbm2;->n:Lcb4;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Lcb4;->a:Lbb4;

    .line 21
    .line 22
    invoke-interface {v0}, Lbb4;->f()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-ge v0, v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0, p1, p2}, Lbm2;->T0(Lva4;Landroid/os/Bundle;)Lic2;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_0
    new-instance v0, Ldl2;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-direct {v0, p0, p1, p2, v1}, Ldl2;-><init>(Lbm2;Lva4;Landroid/os/Bundle;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1, v0}, Lbm2;->d1(Lva4;Lxl2;)Lic2;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_1
    new-instance v0, Ldl2;

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-direct {v0, p0, p1, p2, v1}, Ldl2;-><init>(Lbm2;Lva4;Landroid/os/Bundle;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p1, v0}, Lbm2;->d1(Lva4;Lxl2;)Lic2;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method

.method public final U()Landroidx/media3/common/PlaybackException;
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object p0, p0, Llk3;->a:Landroidx/media3/common/PlaybackException;

    .line 4
    .line 5
    return-object p0
.end method

.method public final U0(Lgn2;)V
    .locals 2

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lgl2;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-direct {v0, p0, p1, v1}, Lgl2;-><init>(Lbm2;Lgn2;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 20
    .line 21
    iget-object v0, v0, Llk3;->j:Lcu4;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcu4;->o()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1, v0}, Lbm2;->W0(Ljava/util/List;I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final V(Z)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const-string p0, "MCImplBase"

    .line 11
    .line 12
    const-string p1, "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground."

    .line 13
    .line 14
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :cond_1
    new-instance v0, Ljl2;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, p0, p1, v1}, Ljl2;-><init>(Lbm2;ZI)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lbm2;->y1(Z)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final V0(Ljava/util/List;)V
    .locals 8

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lfl2;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {v0, p0, p1, v1}, Lfl2;-><init>(Lbm2;Ljava/util/List;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 17
    .line 18
    .line 19
    const/4 v4, -0x1

    .line 20
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    const/4 v7, 0x1

    .line 26
    move-object v2, p0

    .line 27
    move-object v3, p1

    .line 28
    invoke-virtual/range {v2 .. v7}, Lbm2;->x1(Ljava/util/List;IJZ)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final W(I)V
    .locals 2

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    if-ltz p1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-static {v0}, Lrr2;->l(Z)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lkl2;

    .line 19
    .line 20
    const/16 v1, 0xa

    .line 21
    .line 22
    invoke-direct {v0, p0, p1, v1}, Lkl2;-><init>(Lbm2;II)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 26
    .line 27
    .line 28
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1, v0, v1}, Lbm2;->v1(IJ)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final W0(Ljava/util/List;I)V
    .locals 13

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 9
    .line 10
    iget-object v0, v0, Llk3;->j:Lcu4;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v3, -0x1

    .line 25
    move-object v1, p0

    .line 26
    move-object v2, p1

    .line 27
    invoke-virtual/range {v1 .. v6}, Lbm2;->x1(Ljava/util/List;IJZ)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    move-object v1, p0

    .line 32
    move-object v2, p1

    .line 33
    iget-object p0, v1, Lbm2;->q:Llk3;

    .line 34
    .line 35
    iget-object p0, p0, Llk3;->j:Lcu4;

    .line 36
    .line 37
    invoke-virtual {p0}, Lcu4;->o()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    invoke-static {p2, p0}, Ljava/lang/Math;->min(II)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    move-object v4, v2

    .line 46
    iget-object v2, v1, Lbm2;->q:Llk3;

    .line 47
    .line 48
    invoke-virtual {v1}, Lbm2;->M0()J

    .line 49
    .line 50
    .line 51
    move-result-wide v5

    .line 52
    invoke-virtual {v1}, Lbm2;->Z()J

    .line 53
    .line 54
    .line 55
    move-result-wide v7

    .line 56
    invoke-static/range {v2 .. v8}, Lbm2;->i1(Llk3;ILjava/util/List;JJ)Llk3;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    iget-object p0, v1, Lbm2;->q:Llk3;

    .line 61
    .line 62
    iget-object p0, p0, Llk3;->j:Lcu4;

    .line 63
    .line 64
    invoke-virtual {p0}, Lcu4;->p()Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_2

    .line 69
    .line 70
    const/4 p0, 0x3

    .line 71
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    :goto_0
    move-object v12, p0

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    const/4 p0, 0x0

    .line 78
    goto :goto_0

    .line 79
    :goto_1
    const/4 p0, 0x0

    .line 80
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    const/4 v10, 0x0

    .line 85
    const/4 v11, 0x0

    .line 86
    move-object v7, v1

    .line 87
    invoke-virtual/range {v7 .. v12}, Lbm2;->A1(Llk3;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public final X()J
    .locals 2

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-wide v0, p0, Llk3;->D:J

    .line 4
    .line 5
    return-wide v0
.end method

.method public final X0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lbm2;->B:Landroid/view/SurfaceHolder;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v2, p0, Lbm2;->h:Lam2;

    .line 7
    .line 8
    invoke-interface {v0, v2}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, Lbm2;->B:Landroid/view/SurfaceHolder;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lbm2;->A:Landroid/view/Surface;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iput-object v1, p0, Lbm2;->A:Landroid/view/Surface;

    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final Y()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->D:Lpu1;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final Z()J
    .locals 2

    .line 1
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object v0, v0, Llk3;->c:Lza4;

    .line 4
    .line 5
    iget-boolean v1, v0, Lza4;->b:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lbm2;->M0()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0

    .line 14
    :cond_0
    iget-object p0, v0, Lza4;->a:Lpi3;

    .line 15
    .line 16
    iget-wide v0, p0, Lpi3;->g:J

    .line 17
    .line 18
    return-wide v0
.end method

.method public final a()V
    .locals 6

    .line 1
    iget-object v0, p0, Lbm2;->D:Lpu1;

    .line 2
    .line 3
    iget-boolean v1, p0, Lbm2;->p:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, p0, Lbm2;->p:Z

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    iput-object v2, p0, Lbm2;->n:Lcb4;

    .line 14
    .line 15
    iget-object v3, p0, Lbm2;->m:Landroid/os/Handler;

    .line 16
    .line 17
    invoke-virtual {v3, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lbm2;->X0()V

    .line 21
    .line 22
    .line 23
    iget-object v3, p0, Lbm2;->j:Lrf2;

    .line 24
    .line 25
    iget-object v4, v3, Lrf2;->n:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, Landroid/os/Handler;

    .line 28
    .line 29
    invoke-virtual {v4, v1}, Landroid/os/Handler;->hasMessages(I)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    :try_start_0
    iget-object v1, v3, Lrf2;->o:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Lbm2;

    .line 38
    .line 39
    iget-object v3, v1, Lbm2;->D:Lpu1;

    .line 40
    .line 41
    iget-object v1, v1, Lbm2;->c:Lmm2;

    .line 42
    .line 43
    invoke-interface {v3, v1}, Lpu1;->p0(Lju1;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catch_0
    const-string v1, "MCImplBase"

    .line 48
    .line 49
    const-string v3, "Error in sending flushCommandQueue"

    .line 50
    .line 51
    invoke-static {v1, v3}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    invoke-virtual {v4, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iput-object v2, p0, Lbm2;->D:Lpu1;

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    iget-object v3, p0, Lbm2;->b:Lyk;

    .line 63
    .line 64
    invoke-virtual {v3}, Lyk;->s()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    :try_start_1
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    iget-object v5, p0, Lbm2;->g:Lil2;

    .line 73
    .line 74
    invoke-interface {v4, v5, v1}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 75
    .line 76
    .line 77
    iget-object v4, p0, Lbm2;->c:Lmm2;

    .line 78
    .line 79
    invoke-interface {v0, v4, v3}, Lpu1;->j0(Lju1;I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 80
    .line 81
    .line 82
    :catch_1
    :cond_2
    iget-object v0, p0, Lbm2;->i:Ltc2;

    .line 83
    .line 84
    invoke-virtual {v0}, Ltc2;->d()V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lbm2;->b:Lyk;

    .line 88
    .line 89
    new-instance v3, Lsl2;

    .line 90
    .line 91
    invoke-direct {v3, p0, v1}, Lsl2;-><init>(Lbm2;I)V

    .line 92
    .line 93
    .line 94
    iget-object p0, v0, Lyk;->q:Ljava/lang/Object;

    .line 95
    .line 96
    monitor-enter p0

    .line 97
    :try_start_2
    invoke-static {v2}, Lf35;->p(Lnk2;)Landroid/os/Handler;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iput-object v1, v0, Lyk;->t:Ljava/lang/Object;

    .line 102
    .line 103
    iput-object v3, v0, Lyk;->s:Ljava/lang/Object;

    .line 104
    .line 105
    iget-object v2, v0, Lyk;->r:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v2, Loi;

    .line 108
    .line 109
    invoke-virtual {v2}, Lyd4;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_3

    .line 114
    .line 115
    invoke-virtual {v0}, Lyk;->a()V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :catchall_0
    move-exception v0

    .line 120
    goto :goto_3

    .line 121
    :cond_3
    new-instance v2, Ljq3;

    .line 122
    .line 123
    const/4 v3, 0x6

    .line 124
    invoke-direct {v2, v3, v0}, Ljq3;-><init>(ILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    const-wide/16 v3, 0x7530

    .line 128
    .line 129
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 130
    .line 131
    .line 132
    :goto_1
    monitor-exit p0

    .line 133
    :goto_2
    return-void

    .line 134
    :goto_3
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 135
    throw v0
.end method

.method public final a0()V
    .locals 5

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 11
    .line 12
    iget v0, v0, Llk3;->o:F

    .line 13
    .line 14
    new-instance v1, Lrl2;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-direct {v1, p0, v0, v2}, Lrl2;-><init>(Ljava/lang/Object;FI)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lbm2;->b1(Lxl2;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lbm2;->q:Llk3;

    .line 24
    .line 25
    iget v3, v1, Llk3;->n:F

    .line 26
    .line 27
    iget v4, v1, Llk3;->o:F

    .line 28
    .line 29
    cmpl-float v4, v3, v4

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    cmpl-float v3, v3, v4

    .line 35
    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Llk3;->p(F)Llk3;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iput-object v1, p0, Lbm2;->q:Llk3;

    .line 43
    .line 44
    new-instance v1, Lw31;

    .line 45
    .line 46
    invoke-direct {v1, v2, v0}, Lw31;-><init>(IF)V

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Lbm2;->i:Ltc2;

    .line 50
    .line 51
    const/16 v0, 0x16

    .line 52
    .line 53
    invoke-virtual {p0, v0, v1}, Ltc2;->c(ILqc2;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Ltc2;->b()V

    .line 57
    .line 58
    .line 59
    :cond_1
    :goto_0
    return-void
.end method

.method public final a1(Lpu1;Lxl2;Z)Lic2;
    .locals 4

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v1, 0x1f

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lbm2;->E:Landroid/media/session/MediaController;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/media/session/MediaController;->getTransportControls()Landroid/media/session/MediaController$TransportControls;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v0, v1, v2}, Landroid/media/session/MediaController$TransportControls;->sendCustomAction(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    new-instance v0, Lab4;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-direct {v0, v1}, Lab4;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lbm2;->b:Lyk;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lyk;->j(Ljava/lang/Object;)Lea4;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget v2, v0, Lea4;->u:I

    .line 36
    .line 37
    iget-object v3, p0, Lbm2;->k:Lqi;

    .line 38
    .line 39
    if-eqz p3, :cond_2

    .line 40
    .line 41
    invoke-virtual {v3}, Lqi;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    if-eqz p3, :cond_1

    .line 46
    .line 47
    iget-object p3, p0, Lbm2;->q:Llk3;

    .line 48
    .line 49
    iput-object p3, p0, Lbm2;->H:Llk3;

    .line 50
    .line 51
    :cond_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {v3, p0}, Lqi;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :cond_2
    :try_start_0
    invoke-interface {p2, p1, v2}, Lxl2;->d(Lpu1;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    return-object v0

    .line 62
    :catch_0
    move-exception p0

    .line 63
    const-string p1, "MCImplBase"

    .line 64
    .line 65
    const-string p2, "Cannot connect to the service or the session is gone"

    .line 66
    .line 67
    invoke-static {p1, p2, p0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {v3, p0}, Lqi;->remove(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    new-instance p0, Lab4;

    .line 78
    .line 79
    const/16 p1, -0x64

    .line 80
    .line 81
    invoke-direct {p0, p1}, Lab4;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v2, p0}, Lyk;->y(ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    return-object v0

    .line 88
    :cond_3
    new-instance p0, Lab4;

    .line 89
    .line 90
    const/4 p1, -0x4

    .line 91
    invoke-direct {p0, p1}, Lab4;-><init>(I)V

    .line 92
    .line 93
    .line 94
    new-instance p1, Lmw1;

    .line 95
    .line 96
    invoke-direct {p1, p0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-object p1
.end method

.method public final b()V
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v1, Lcl2;

    .line 10
    .line 11
    const/4 v2, 0x6

    .line 12
    invoke-direct {v1, p0, v2}, Lcl2;-><init>(Lbm2;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lbm2;->b1(Lxl2;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lbm2;->q:Llk3;

    .line 19
    .line 20
    iget v2, v1, Llk3;->A:I

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    if-ne v2, v3, :cond_2

    .line 24
    .line 25
    iget-object v2, v1, Llk3;->j:Lcu4;

    .line 26
    .line 27
    invoke-virtual {v2}, Lcu4;->p()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    :cond_1
    const/4 v2, 0x0

    .line 35
    invoke-virtual {v1, v0, v2}, Llk3;->f(ILandroidx/media3/common/PlaybackException;)Llk3;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x0

    .line 41
    const/4 v5, 0x0

    .line 42
    const/4 v6, 0x0

    .line 43
    move-object v3, p0

    .line 44
    invoke-virtual/range {v3 .. v8}, Lbm2;->A1(Llk3;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    :goto_0
    return-void
.end method

.method public final b0()J
    .locals 2

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object p0, p0, Llk3;->c:Lza4;

    .line 4
    .line 5
    iget-wide v0, p0, Lza4;->e:J

    .line 6
    .line 7
    return-wide v0
.end method

.method public final b1(Lxl2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lbm2;->j:Lrf2;

    .line 2
    .line 3
    iget-object v1, v0, Lrf2;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/os/Handler;

    .line 6
    .line 7
    iget-object v0, v0, Lrf2;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lbm2;

    .line 10
    .line 11
    iget-object v0, v0, Lbm2;->D:Lpu1;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Landroid/os/Handler;->hasMessages(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lbm2;->D:Lpu1;

    .line 26
    .line 27
    invoke-virtual {p0, v0, p1, v2}, Lbm2;->a1(Lpu1;Lxl2;Z)Lic2;

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Lcl2;

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    invoke-direct {v0, p0, v1}, Lcl2;-><init>(Lbm2;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p0, v0}, Lbm2;->y1(Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final c0()V
    .locals 3

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lcl2;

    .line 11
    .line 12
    const/16 v1, 0xe

    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, Lcl2;-><init>(Lbm2;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lbm2;->j0()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v1, -0x1

    .line 25
    if-eq v0, v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Lbm2;->j0()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0, v1, v2}, Lbm2;->v1(IJ)V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    return-void
.end method

.method public final c1(Lxl2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lbm2;->j:Lrf2;

    .line 2
    .line 3
    iget-object v1, v0, Lrf2;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/os/Handler;

    .line 6
    .line 7
    iget-object v0, v0, Lrf2;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lbm2;

    .line 10
    .line 11
    iget-object v0, v0, Lbm2;->D:Lpu1;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Landroid/os/Handler;->hasMessages(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lbm2;->D:Lpu1;

    .line 26
    .line 27
    invoke-virtual {p0, v0, p1, v2}, Lbm2;->a1(Lpu1;Lxl2;Z)Lic2;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :try_start_0
    invoke-static {p1}, Lf92;->v(Lic2;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catch_0
    move-exception v0

    .line 36
    instance-of v1, p1, Lea4;

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    check-cast p1, Lea4;

    .line 41
    .line 42
    iget p1, p1, Lea4;->u:I

    .line 43
    .line 44
    iget-object v1, p0, Lbm2;->k:Lqi;

    .line 45
    .line 46
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v1, v2}, Lqi;->remove(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    new-instance v1, Lab4;

    .line 54
    .line 55
    const/4 v2, -0x1

    .line 56
    invoke-direct {v1, v2}, Lab4;-><init>(I)V

    .line 57
    .line 58
    .line 59
    iget-object p0, p0, Lbm2;->b:Lyk;

    .line 60
    .line 61
    invoke-virtual {p0, p1, v1}, Lyk;->y(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    const-string p0, "MCImplBase"

    .line 65
    .line 66
    const-string p1, "Synchronous command takes too long on the session side."

    .line 67
    .line 68
    invoke-static {p0, p1, v0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :catch_1
    move-exception p0

    .line 73
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    throw p1
.end method

.method public final d(Lqh3;)V
    .locals 2

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lef0;

    .line 11
    .line 12
    const/16 v1, 0xe

    .line 13
    .line 14
    invoke-direct {v0, v1, p0, p1}, Lef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 21
    .line 22
    iget-object v0, v0, Llk3;->g:Lqh3;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lqh3;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Llk3;->e(Lqh3;)Llk3;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lbm2;->q:Llk3;

    .line 37
    .line 38
    new-instance v0, Lql2;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-direct {v0, p1, v1}, Lql2;-><init>(Lqh3;I)V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, Lbm2;->i:Ltc2;

    .line 45
    .line 46
    const/16 p1, 0xc

    .line 47
    .line 48
    invoke-virtual {p0, p1, v0}, Ltc2;->c(ILqc2;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ltc2;->b()V

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    return-void
.end method

.method public final d0(I)V
    .locals 2

    .line 1
    const/16 v0, 0x22

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lkl2;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, p0, p1, v1}, Lkl2;-><init>(Lbm2;II)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lbm2;->q:Llk3;

    .line 20
    .line 21
    iget v0, p1, Llk3;->t:I

    .line 22
    .line 23
    sub-int/2addr v0, v1

    .line 24
    iget-object v1, p1, Llk3;->s:Lhp0;

    .line 25
    .line 26
    iget v1, v1, Lhp0;->b:I

    .line 27
    .line 28
    if-lt v0, v1, :cond_1

    .line 29
    .line 30
    iget-boolean v1, p1, Llk3;->u:Z

    .line 31
    .line 32
    invoke-virtual {p1, v0, v1}, Llk3;->c(IZ)Llk3;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lbm2;->q:Llk3;

    .line 37
    .line 38
    new-instance p1, Lkl2;

    .line 39
    .line 40
    const/4 v1, 0x2

    .line 41
    invoke-direct {p1, p0, v0, v1}, Lkl2;-><init>(Lbm2;II)V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, Lbm2;->i:Ltc2;

    .line 45
    .line 46
    const/16 v0, 0x1e

    .line 47
    .line 48
    invoke-virtual {p0, v0, p1}, Ltc2;->c(ILqc2;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ltc2;->b()V

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    return-void
.end method

.method public final d1(Lva4;Lxl2;)Lic2;
    .locals 3

    .line 1
    iget v0, p1, Lva4;->a:I

    .line 2
    .line 3
    iget-object v1, p1, Lva4;->b:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v2

    .line 11
    :goto_0
    invoke-static {v0}, Lrr2;->l(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lbm2;->w:Lwa4;

    .line 15
    .line 16
    iget-object v0, v0, Lwa4;->a:Ljx1;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lrw1;->contains(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    invoke-static {v1}, Lj60;->n(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    const-string p1, "Controller isn\'t allowed to call custom session command:"

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string v0, "MCImplBase"

    .line 37
    .line 38
    invoke-static {v0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-object p1, p0, Lbm2;->D:Lpu1;

    .line 44
    .line 45
    :goto_1
    invoke-virtual {p0, p1, p2, v2}, Lbm2;->a1(Lpu1;Lxl2;Z)Lic2;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public final e(F)V
    .locals 2

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lrl2;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {v0, p0, p1, v1}, Lrl2;-><init>(Ljava/lang/Object;FI)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 20
    .line 21
    iget-object v0, v0, Llk3;->g:Lqh3;

    .line 22
    .line 23
    iget v1, v0, Lqh3;->a:F

    .line 24
    .line 25
    cmpl-float v1, v1, p1

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    new-instance v1, Lqh3;

    .line 30
    .line 31
    iget v0, v0, Lqh3;->b:F

    .line 32
    .line 33
    invoke-direct {v1, p1, v0}, Lqh3;-><init>(FF)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lbm2;->q:Llk3;

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Llk3;->e(Lqh3;)Llk3;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Lbm2;->q:Llk3;

    .line 43
    .line 44
    new-instance p1, Lql2;

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    invoke-direct {p1, v1, v0}, Lql2;-><init>(Lqh3;I)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, Lbm2;->i:Ltc2;

    .line 51
    .line 52
    const/16 v0, 0xc

    .line 53
    .line 54
    invoke-virtual {p0, v0, p1}, Ltc2;->c(ILqc2;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ltc2;->b()V

    .line 58
    .line 59
    .line 60
    :cond_1
    :goto_0
    return-void
.end method

.method public final e0()Ljw4;
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object p0, p0, Llk3;->F:Ljw4;

    .line 4
    .line 5
    return-object p0
.end method

.method public final f()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-boolean p0, p0, Llk3;->y:Z

    .line 4
    .line 5
    return p0
.end method

.method public final f0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbm2;->j0()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, -0x1

    .line 6
    if-eq p0, v0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public f1()Lsk2;
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->a:Lsk2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()I
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget p0, p0, Llk3;->A:I

    .line 4
    .line 5
    return p0
.end method

.method public final g0()Ldo2;
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object p0, p0, Llk3;->m:Ldo2;

    .line 4
    .line 5
    return-object p0
.end method

.method public final g1(IJLcu4;)Ldd2;
    .locals 5

    .line 1
    invoke-virtual {p4}, Lcu4;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Lbu4;

    .line 9
    .line 10
    invoke-direct {v0}, Lbu4;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lzt4;

    .line 14
    .line 15
    invoke-direct {v1}, Lzt4;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v2, -0x1

    .line 19
    if-eq p1, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p4}, Lcu4;->o()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-lt p1, v2, :cond_2

    .line 26
    .line 27
    :cond_1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 28
    .line 29
    iget-boolean p0, p0, Llk3;->i:Z

    .line 30
    .line 31
    invoke-virtual {p4, p0}, Lcu4;->a(Z)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    const-wide/16 p2, 0x0

    .line 36
    .line 37
    invoke-virtual {p4, p1, v0, p2, p3}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iget-wide p2, p0, Lbu4;->k:J

    .line 42
    .line 43
    invoke-static {p2, p3}, Lf35;->i0(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide p2

    .line 47
    :cond_2
    invoke-static {p2, p3}, Lf35;->Q(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p2

    .line 51
    invoke-virtual {p4}, Lcu4;->o()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-static {p1, p0}, Lrr2;->q(II)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p4, p1, v0}, Lcu4;->n(ILbu4;)V

    .line 59
    .line 60
    .line 61
    const-wide p0, -0x7fffffffffffffffL    # -4.9E-324

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    cmp-long v2, p2, p0

    .line 67
    .line 68
    if-nez v2, :cond_3

    .line 69
    .line 70
    iget-wide p2, v0, Lbu4;->k:J

    .line 71
    .line 72
    cmp-long p0, p2, p0

    .line 73
    .line 74
    if-nez p0, :cond_3

    .line 75
    .line 76
    :goto_0
    const/4 p0, 0x0

    .line 77
    return-object p0

    .line 78
    :cond_3
    iget p0, v0, Lbu4;->m:I

    .line 79
    .line 80
    const/4 p1, 0x0

    .line 81
    invoke-virtual {p4, p0, v1, p1}, Lcu4;->f(ILzt4;Z)Lzt4;

    .line 82
    .line 83
    .line 84
    :goto_1
    iget v2, v0, Lbu4;->n:I

    .line 85
    .line 86
    if-ge p0, v2, :cond_4

    .line 87
    .line 88
    iget-wide v2, v1, Lzt4;->e:J

    .line 89
    .line 90
    cmp-long v2, v2, p2

    .line 91
    .line 92
    if-eqz v2, :cond_4

    .line 93
    .line 94
    add-int/lit8 v2, p0, 0x1

    .line 95
    .line 96
    invoke-virtual {p4, v2, v1, p1}, Lcu4;->f(ILzt4;Z)Lzt4;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    iget-wide v3, v3, Lzt4;->e:J

    .line 101
    .line 102
    cmp-long v3, v3, p2

    .line 103
    .line 104
    if-gtz v3, :cond_4

    .line 105
    .line 106
    move p0, v2

    .line 107
    goto :goto_1

    .line 108
    :cond_4
    invoke-virtual {p4, p0, v1, p1}, Lcu4;->f(ILzt4;Z)Lzt4;

    .line 109
    .line 110
    .line 111
    iget-wide v0, v1, Lzt4;->e:J

    .line 112
    .line 113
    sub-long/2addr p2, v0

    .line 114
    new-instance p4, Ldd2;

    .line 115
    .line 116
    invoke-direct {p4, p0, p2, p3, p1}, Ldd2;-><init>(IJZ)V

    .line 117
    .line 118
    .line 119
    return-object p4
.end method

.method public final getDuration()J
    .locals 2

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object p0, p0, Llk3;->c:Lza4;

    .line 4
    .line 5
    iget-wide v0, p0, Lza4;->d:J

    .line 6
    .line 7
    return-wide v0
.end method

.method public final h()I
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget p0, p0, Llk3;->h:I

    .line 4
    .line 5
    return p0
.end method

.method public final h0()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-boolean p0, p0, Llk3;->x:Z

    .line 4
    .line 5
    return p0
.end method

.method public final h1(I)Z
    .locals 1

    .line 1
    iget-object p0, p0, Lbm2;->z:Lmi3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lmi3;->a(I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const-string p0, "MCImplBase"

    .line 10
    .line 11
    const-string v0, "Controller isn\'t allowed to call command= "

    .line 12
    .line 13
    invoke-static {p1, v0, p0}, Lxa3;->m(ILjava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method public final i()Lqh3;
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object p0, p0, Llk3;->g:Lqh3;

    .line 4
    .line 5
    return-object p0
.end method

.method public final i0()Ljg0;
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object p0, p0, Llk3;->r:Ljg0;

    .line 4
    .line 5
    return-object p0
.end method

.method public final j()I
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget p0, p0, Llk3;->t:I

    .line 4
    .line 5
    return p0
.end method

.method public final j0()I
    .locals 4

    .line 1
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object v0, v0, Llk3;->j:Lcu4;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 p0, -0x1

    .line 12
    return p0

    .line 13
    :cond_0
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 14
    .line 15
    iget-object v1, v0, Llk3;->j:Lcu4;

    .line 16
    .line 17
    invoke-static {v0}, Lbm2;->e1(Llk3;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 22
    .line 23
    iget v2, p0, Llk3;->h:I

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    if-ne v2, v3, :cond_1

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    :cond_1
    iget-boolean p0, p0, Llk3;->i:Z

    .line 30
    .line 31
    invoke-virtual {v1, v0, v2, p0}, Lcu4;->e(IIZ)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0
.end method

.method public final k()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object p0, p0, Llk3;->c:Lza4;

    .line 4
    .line 5
    iget-boolean p0, p0, Lza4;->b:Z

    .line 6
    .line 7
    return p0
.end method

.method public final k0(Lil;Z)V
    .locals 1

    .line 1
    const/16 v0, 0x23

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lwl2;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1, p2}, Lwl2;-><init>(Lbm2;Lil;Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 16
    .line 17
    .line 18
    iget-object p2, p0, Lbm2;->q:Llk3;

    .line 19
    .line 20
    iget-object p2, p2, Llk3;->q:Lil;

    .line 21
    .line 22
    invoke-virtual {p2, p1}, Lil;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-nez p2, :cond_1

    .line 27
    .line 28
    iget-object p2, p0, Lbm2;->q:Llk3;

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Llk3;->a(Lil;)Llk3;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    iput-object p2, p0, Lbm2;->q:Llk3;

    .line 35
    .line 36
    new-instance p2, Lx31;

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    invoke-direct {p2, p1, v0}, Lx31;-><init>(Lil;I)V

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, Lbm2;->i:Ltc2;

    .line 43
    .line 44
    const/16 p1, 0x14

    .line 45
    .line 46
    invoke-virtual {p0, p1, p2}, Ltc2;->c(ILqc2;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ltc2;->b()V

    .line 50
    .line 51
    .line 52
    :cond_1
    :goto_0
    return-void
.end method

.method public final l()J
    .locals 2

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object p0, p0, Llk3;->c:Lza4;

    .line 4
    .line 5
    iget-wide v0, p0, Lza4;->h:J

    .line 6
    .line 7
    return-wide v0
.end method

.method public final l0(Ldo2;)V
    .locals 2

    .line 1
    const/16 v0, 0x13

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lef0;

    .line 11
    .line 12
    const/16 v1, 0xd

    .line 13
    .line 14
    invoke-direct {v0, v1, p0, p1}, Lef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 21
    .line 22
    iget-object v0, v0, Llk3;->m:Ldo2;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ldo2;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Llk3;->g(Ldo2;)Llk3;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lbm2;->q:Llk3;

    .line 37
    .line 38
    new-instance v0, Lr31;

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    invoke-direct {v0, p1, v1}, Lr31;-><init>(Ldo2;I)V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, Lbm2;->i:Ltc2;

    .line 45
    .line 46
    const/16 p1, 0xf

    .line 47
    .line 48
    invoke-virtual {p0, p1, v0}, Ltc2;->c(ILqc2;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ltc2;->b()V

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    return-void
.end method

.method public final m()J
    .locals 2

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object p0, p0, Llk3;->c:Lza4;

    .line 4
    .line 5
    iget-wide v0, p0, Lza4;->g:J

    .line 6
    .line 7
    return-wide v0
.end method

.method public final m0()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const-string p0, "MCImplBase"

    .line 9
    .line 10
    const-string v0, "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground."

    .line 11
    .line 12
    invoke-static {p0, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v1, Lcl2;

    .line 17
    .line 18
    const/4 v2, 0x4

    .line 19
    invoke-direct {v1, p0, v2}, Lcl2;-><init>(Lbm2;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lbm2;->b1(Lxl2;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lbm2;->y1(Z)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final m1(III)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lbm2;->q:Llk3;

    .line 6
    .line 7
    iget-object v2, v2, Llk3;->j:Lcu4;

    .line 8
    .line 9
    invoke-virtual {v2}, Lcu4;->o()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    move/from16 v4, p2

    .line 14
    .line 15
    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    sub-int v5, v4, v1

    .line 20
    .line 21
    sub-int v6, v3, v5

    .line 22
    .line 23
    move/from16 v7, p3

    .line 24
    .line 25
    invoke-static {v7, v6}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-ge v1, v3, :cond_5

    .line 30
    .line 31
    if-eq v1, v4, :cond_5

    .line 32
    .line 33
    if-ne v1, v6, :cond_0

    .line 34
    .line 35
    goto/16 :goto_3

    .line 36
    .line 37
    :cond_0
    new-instance v7, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance v8, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    const/4 v9, 0x0

    .line 48
    move v10, v9

    .line 49
    :goto_0
    const-wide/16 v11, 0x0

    .line 50
    .line 51
    if-ge v10, v3, :cond_1

    .line 52
    .line 53
    new-instance v13, Lbu4;

    .line 54
    .line 55
    invoke-direct {v13}, Lbu4;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v10, v13, v11, v12}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 59
    .line 60
    .line 61
    move-result-object v11

    .line 62
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    add-int/lit8 v10, v10, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-static {v7, v1, v4, v6}, Lf35;->P(Ljava/util/ArrayList;III)V

    .line 69
    .line 70
    .line 71
    invoke-static {v2, v7, v8}, Lbm2;->q1(Lcu4;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v7, v8}, Lbm2;->Z0(Ljava/util/ArrayList;Ljava/util/ArrayList;)Lau4;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v3}, Lcu4;->p()Z

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    if-nez v7, :cond_5

    .line 83
    .line 84
    iget-object v7, v0, Lbm2;->q:Llk3;

    .line 85
    .line 86
    invoke-static {v7}, Lbm2;->e1(Llk3;)I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-lt v7, v1, :cond_2

    .line 91
    .line 92
    if-ge v7, v4, :cond_2

    .line 93
    .line 94
    sub-int v1, v7, v1

    .line 95
    .line 96
    add-int/2addr v1, v6

    .line 97
    :goto_1
    move v13, v1

    .line 98
    goto :goto_2

    .line 99
    :cond_2
    if-gt v4, v7, :cond_3

    .line 100
    .line 101
    if-le v6, v7, :cond_3

    .line 102
    .line 103
    sub-int v1, v7, v5

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    if-le v4, v7, :cond_4

    .line 107
    .line 108
    if-gt v6, v7, :cond_4

    .line 109
    .line 110
    add-int v1, v7, v5

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_4
    move v13, v7

    .line 114
    :goto_2
    new-instance v1, Lbu4;

    .line 115
    .line 116
    invoke-direct {v1}, Lbu4;-><init>()V

    .line 117
    .line 118
    .line 119
    iget-object v4, v0, Lbm2;->q:Llk3;

    .line 120
    .line 121
    iget-object v4, v4, Llk3;->c:Lza4;

    .line 122
    .line 123
    iget-object v4, v4, Lza4;->a:Lpi3;

    .line 124
    .line 125
    iget v4, v4, Lpi3;->e:I

    .line 126
    .line 127
    invoke-virtual {v2, v7, v1, v11, v12}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    iget v2, v2, Lbu4;->m:I

    .line 132
    .line 133
    sub-int/2addr v4, v2

    .line 134
    invoke-virtual {v3, v13, v1, v11, v12}, Lau4;->m(ILbu4;J)Lbu4;

    .line 135
    .line 136
    .line 137
    iget v1, v1, Lbu4;->m:I

    .line 138
    .line 139
    add-int v14, v1, v4

    .line 140
    .line 141
    iget-object v11, v0, Lbm2;->q:Llk3;

    .line 142
    .line 143
    invoke-virtual {v0}, Lbm2;->M0()J

    .line 144
    .line 145
    .line 146
    move-result-wide v15

    .line 147
    invoke-virtual {v0}, Lbm2;->Z()J

    .line 148
    .line 149
    .line 150
    move-result-wide v17

    .line 151
    const/16 v19, 0x5

    .line 152
    .line 153
    move-object v12, v3

    .line 154
    invoke-static/range {v11 .. v19}, Lbm2;->k1(Llk3;Lau4;IIJJI)Llk3;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    const/4 v4, 0x0

    .line 163
    const/4 v5, 0x0

    .line 164
    const/4 v3, 0x0

    .line 165
    invoke-virtual/range {v0 .. v5}, Lbm2;->A1(Llk3;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 166
    .line 167
    .line 168
    :cond_5
    :goto_3
    return-void
.end method

.method public final n(IJ)V
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    if-ltz p1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-static {v0}, Lrr2;->l(Z)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Llj0;

    .line 19
    .line 20
    invoke-direct {v0, p2, p3, p0, p1}, Llj0;-><init>(JLjava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1, p2, p3}, Lbm2;->v1(IJ)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final n0()I
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object p0, p0, Llk3;->c:Lza4;

    .line 4
    .line 5
    iget-object p0, p0, Lza4;->a:Lpi3;

    .line 6
    .line 7
    iget p0, p0, Lpi3;->h:I

    .line 8
    .line 9
    return p0
.end method

.method public final n1(Llk3;Llk3;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p5

    .line 10
    .line 11
    move-object/from16 v5, p6

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    move-object/from16 v7, p0

    .line 15
    .line 16
    iget-object v7, v7, Lbm2;->i:Ltc2;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    new-instance v8, Lol2;

    .line 21
    .line 22
    invoke-direct {v8, v1, v2, v6}, Lol2;-><init>(Llk3;Ljava/lang/Integer;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v7, v6, v8}, Ltc2;->c(ILqc2;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    const/16 v2, 0xb

    .line 29
    .line 30
    const/4 v8, 0x1

    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    new-instance v9, Lol2;

    .line 34
    .line 35
    invoke-direct {v9, v1, v4, v8}, Lol2;-><init>(Llk3;Ljava/lang/Integer;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v7, v2, v9}, Ltc2;->c(ILqc2;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {v1}, Llk3;->s()Lgn2;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    const/16 v9, 0xf

    .line 46
    .line 47
    if-eqz v5, :cond_2

    .line 48
    .line 49
    new-instance v10, Lef0;

    .line 50
    .line 51
    invoke-direct {v10, v9, v4, v5}, Lef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v7, v8, v10}, Ltc2;->c(ILqc2;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    iget-object v4, v0, Llk3;->a:Landroidx/media3/common/PlaybackException;

    .line 58
    .line 59
    iget-object v5, v1, Llk3;->a:Landroidx/media3/common/PlaybackException;

    .line 60
    .line 61
    const/4 v10, 0x2

    .line 62
    const/16 v11, 0xa

    .line 63
    .line 64
    if-eq v4, v5, :cond_4

    .line 65
    .line 66
    if-eqz v4, :cond_3

    .line 67
    .line 68
    invoke-virtual {v4, v5}, Landroidx/media3/common/PlaybackException;->a(Landroidx/media3/common/PlaybackException;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_3

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    new-instance v4, Lhj0;

    .line 76
    .line 77
    invoke-direct {v4, v8, v5}, Lhj0;-><init>(ILandroidx/media3/common/PlaybackException;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v7, v11, v4}, Ltc2;->c(ILqc2;)V

    .line 81
    .line 82
    .line 83
    if-eqz v5, :cond_4

    .line 84
    .line 85
    new-instance v4, Lhj0;

    .line 86
    .line 87
    invoke-direct {v4, v10, v5}, Lhj0;-><init>(ILandroidx/media3/common/PlaybackException;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v7, v11, v4}, Ltc2;->c(ILqc2;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    :goto_0
    iget-object v4, v0, Llk3;->F:Ljw4;

    .line 94
    .line 95
    iget-object v5, v1, Llk3;->F:Ljw4;

    .line 96
    .line 97
    invoke-virtual {v4, v5}, Ljw4;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    const/16 v5, 0x12

    .line 102
    .line 103
    if-nez v4, :cond_5

    .line 104
    .line 105
    new-instance v4, Lpl2;

    .line 106
    .line 107
    invoke-direct {v4, v1, v5}, Lpl2;-><init>(Llk3;I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v7, v10, v4}, Ltc2;->c(ILqc2;)V

    .line 111
    .line 112
    .line 113
    :cond_5
    iget-object v4, v0, Llk3;->B:Ldo2;

    .line 114
    .line 115
    iget-object v12, v1, Llk3;->B:Ldo2;

    .line 116
    .line 117
    invoke-virtual {v4, v12}, Ldo2;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    const/16 v12, 0x13

    .line 122
    .line 123
    const/16 v13, 0xe

    .line 124
    .line 125
    if-nez v4, :cond_6

    .line 126
    .line 127
    new-instance v4, Lpl2;

    .line 128
    .line 129
    invoke-direct {v4, v1, v12}, Lpl2;-><init>(Llk3;I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v7, v13, v4}, Ltc2;->c(ILqc2;)V

    .line 133
    .line 134
    .line 135
    :cond_6
    iget-boolean v4, v0, Llk3;->y:Z

    .line 136
    .line 137
    iget-boolean v14, v1, Llk3;->y:Z

    .line 138
    .line 139
    const/16 v15, 0x14

    .line 140
    .line 141
    const/4 v12, 0x3

    .line 142
    if-eq v4, v14, :cond_7

    .line 143
    .line 144
    new-instance v4, Lpl2;

    .line 145
    .line 146
    invoke-direct {v4, v1, v15}, Lpl2;-><init>(Llk3;I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v7, v12, v4}, Ltc2;->c(ILqc2;)V

    .line 150
    .line 151
    .line 152
    :cond_7
    iget v4, v0, Llk3;->A:I

    .line 153
    .line 154
    iget v14, v1, Llk3;->A:I

    .line 155
    .line 156
    const/16 v5, 0x15

    .line 157
    .line 158
    const/4 v13, 0x4

    .line 159
    if-eq v4, v14, :cond_8

    .line 160
    .line 161
    new-instance v4, Lpl2;

    .line 162
    .line 163
    invoke-direct {v4, v1, v5}, Lpl2;-><init>(Llk3;I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v7, v13, v4}, Ltc2;->c(ILqc2;)V

    .line 167
    .line 168
    .line 169
    :cond_8
    const/4 v4, 0x5

    .line 170
    if-eqz v3, :cond_9

    .line 171
    .line 172
    new-instance v14, Lol2;

    .line 173
    .line 174
    invoke-direct {v14, v1, v3, v10}, Lol2;-><init>(Llk3;Ljava/lang/Integer;I)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v7, v4, v14}, Ltc2;->c(ILqc2;)V

    .line 178
    .line 179
    .line 180
    :cond_9
    iget v3, v0, Llk3;->z:I

    .line 181
    .line 182
    iget v14, v1, Llk3;->z:I

    .line 183
    .line 184
    const/4 v2, 0x6

    .line 185
    if-eq v3, v14, :cond_a

    .line 186
    .line 187
    new-instance v3, Lpl2;

    .line 188
    .line 189
    invoke-direct {v3, v1, v6}, Lpl2;-><init>(Llk3;I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v7, v2, v3}, Ltc2;->c(ILqc2;)V

    .line 193
    .line 194
    .line 195
    :cond_a
    iget-boolean v3, v0, Llk3;->x:Z

    .line 196
    .line 197
    iget-boolean v6, v1, Llk3;->x:Z

    .line 198
    .line 199
    const/4 v14, 0x7

    .line 200
    if-eq v3, v6, :cond_b

    .line 201
    .line 202
    new-instance v3, Lpl2;

    .line 203
    .line 204
    invoke-direct {v3, v1, v8}, Lpl2;-><init>(Llk3;I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v7, v14, v3}, Ltc2;->c(ILqc2;)V

    .line 208
    .line 209
    .line 210
    :cond_b
    iget-object v3, v0, Llk3;->g:Lqh3;

    .line 211
    .line 212
    iget-object v6, v1, Llk3;->g:Lqh3;

    .line 213
    .line 214
    invoke-virtual {v3, v6}, Lqh3;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    const/16 v6, 0xc

    .line 219
    .line 220
    if-nez v3, :cond_c

    .line 221
    .line 222
    new-instance v3, Lpl2;

    .line 223
    .line 224
    invoke-direct {v3, v1, v10}, Lpl2;-><init>(Llk3;I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v7, v6, v3}, Ltc2;->c(ILqc2;)V

    .line 228
    .line 229
    .line 230
    :cond_c
    iget v3, v0, Llk3;->h:I

    .line 231
    .line 232
    iget v8, v1, Llk3;->h:I

    .line 233
    .line 234
    const/16 v10, 0x8

    .line 235
    .line 236
    if-eq v3, v8, :cond_d

    .line 237
    .line 238
    new-instance v3, Lpl2;

    .line 239
    .line 240
    invoke-direct {v3, v1, v12}, Lpl2;-><init>(Llk3;I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v7, v10, v3}, Ltc2;->c(ILqc2;)V

    .line 244
    .line 245
    .line 246
    :cond_d
    iget-boolean v3, v0, Llk3;->i:Z

    .line 247
    .line 248
    iget-boolean v8, v1, Llk3;->i:Z

    .line 249
    .line 250
    const/16 v12, 0x9

    .line 251
    .line 252
    if-eq v3, v8, :cond_e

    .line 253
    .line 254
    new-instance v3, Lpl2;

    .line 255
    .line 256
    invoke-direct {v3, v1, v13}, Lpl2;-><init>(Llk3;I)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v7, v12, v3}, Ltc2;->c(ILqc2;)V

    .line 260
    .line 261
    .line 262
    :cond_e
    iget-object v3, v0, Llk3;->m:Ldo2;

    .line 263
    .line 264
    iget-object v8, v1, Llk3;->m:Ldo2;

    .line 265
    .line 266
    invoke-virtual {v3, v8}, Ldo2;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    if-nez v3, :cond_f

    .line 271
    .line 272
    new-instance v3, Lpl2;

    .line 273
    .line 274
    invoke-direct {v3, v1, v4}, Lpl2;-><init>(Llk3;I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v7, v9, v3}, Ltc2;->c(ILqc2;)V

    .line 278
    .line 279
    .line 280
    :cond_f
    iget v3, v0, Llk3;->n:F

    .line 281
    .line 282
    iget v4, v1, Llk3;->n:F

    .line 283
    .line 284
    cmpl-float v3, v3, v4

    .line 285
    .line 286
    if-eqz v3, :cond_10

    .line 287
    .line 288
    new-instance v3, Lpl2;

    .line 289
    .line 290
    invoke-direct {v3, v1, v2}, Lpl2;-><init>(Llk3;I)V

    .line 291
    .line 292
    .line 293
    const/16 v2, 0x16

    .line 294
    .line 295
    invoke-virtual {v7, v2, v3}, Ltc2;->c(ILqc2;)V

    .line 296
    .line 297
    .line 298
    :cond_10
    iget-object v2, v0, Llk3;->q:Lil;

    .line 299
    .line 300
    iget-object v3, v1, Llk3;->q:Lil;

    .line 301
    .line 302
    invoke-virtual {v2, v3}, Lil;->equals(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v2

    .line 306
    if-nez v2, :cond_11

    .line 307
    .line 308
    new-instance v2, Lpl2;

    .line 309
    .line 310
    invoke-direct {v2, v1, v14}, Lpl2;-><init>(Llk3;I)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v7, v15, v2}, Ltc2;->c(ILqc2;)V

    .line 314
    .line 315
    .line 316
    :cond_11
    iget v2, v0, Llk3;->p:I

    .line 317
    .line 318
    iget v3, v1, Llk3;->p:I

    .line 319
    .line 320
    if-eq v2, v3, :cond_12

    .line 321
    .line 322
    new-instance v2, Lpl2;

    .line 323
    .line 324
    invoke-direct {v2, v1, v10}, Lpl2;-><init>(Llk3;I)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v7, v5, v2}, Ltc2;->c(ILqc2;)V

    .line 328
    .line 329
    .line 330
    :cond_12
    iget-object v2, v0, Llk3;->r:Ljg0;

    .line 331
    .line 332
    iget-object v2, v2, Ljg0;->a:Lgy3;

    .line 333
    .line 334
    iget-object v3, v1, Llk3;->r:Ljg0;

    .line 335
    .line 336
    iget-object v3, v3, Ljg0;->a:Lgy3;

    .line 337
    .line 338
    invoke-virtual {v2, v3}, Lyw1;->equals(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v2

    .line 342
    if-nez v2, :cond_13

    .line 343
    .line 344
    new-instance v2, Lpl2;

    .line 345
    .line 346
    invoke-direct {v2, v1, v12}, Lpl2;-><init>(Llk3;I)V

    .line 347
    .line 348
    .line 349
    const/16 v3, 0x1b

    .line 350
    .line 351
    invoke-virtual {v7, v3, v2}, Ltc2;->c(ILqc2;)V

    .line 352
    .line 353
    .line 354
    new-instance v2, Lpl2;

    .line 355
    .line 356
    invoke-direct {v2, v1, v11}, Lpl2;-><init>(Llk3;I)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v7, v3, v2}, Ltc2;->c(ILqc2;)V

    .line 360
    .line 361
    .line 362
    :cond_13
    iget-object v2, v0, Llk3;->s:Lhp0;

    .line 363
    .line 364
    iget-object v3, v1, Llk3;->s:Lhp0;

    .line 365
    .line 366
    invoke-virtual {v2, v3}, Lhp0;->equals(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    if-nez v2, :cond_14

    .line 371
    .line 372
    new-instance v2, Lpl2;

    .line 373
    .line 374
    const/16 v3, 0xb

    .line 375
    .line 376
    invoke-direct {v2, v1, v3}, Lpl2;-><init>(Llk3;I)V

    .line 377
    .line 378
    .line 379
    const/16 v3, 0x1d

    .line 380
    .line 381
    invoke-virtual {v7, v3, v2}, Ltc2;->c(ILqc2;)V

    .line 382
    .line 383
    .line 384
    :cond_14
    iget v2, v0, Llk3;->t:I

    .line 385
    .line 386
    iget v3, v1, Llk3;->t:I

    .line 387
    .line 388
    if-ne v2, v3, :cond_15

    .line 389
    .line 390
    iget-boolean v2, v0, Llk3;->u:Z

    .line 391
    .line 392
    iget-boolean v3, v1, Llk3;->u:Z

    .line 393
    .line 394
    if-eq v2, v3, :cond_16

    .line 395
    .line 396
    :cond_15
    new-instance v2, Lpl2;

    .line 397
    .line 398
    invoke-direct {v2, v1, v6}, Lpl2;-><init>(Llk3;I)V

    .line 399
    .line 400
    .line 401
    const/16 v3, 0x1e

    .line 402
    .line 403
    invoke-virtual {v7, v3, v2}, Ltc2;->c(ILqc2;)V

    .line 404
    .line 405
    .line 406
    :cond_16
    iget-object v2, v0, Llk3;->l:Ls55;

    .line 407
    .line 408
    iget-object v3, v1, Llk3;->l:Ls55;

    .line 409
    .line 410
    invoke-virtual {v2, v3}, Ls55;->equals(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    if-nez v2, :cond_17

    .line 415
    .line 416
    new-instance v2, Lpl2;

    .line 417
    .line 418
    const/16 v3, 0xd

    .line 419
    .line 420
    invoke-direct {v2, v1, v3}, Lpl2;-><init>(Llk3;I)V

    .line 421
    .line 422
    .line 423
    const/16 v3, 0x19

    .line 424
    .line 425
    invoke-virtual {v7, v3, v2}, Ltc2;->c(ILqc2;)V

    .line 426
    .line 427
    .line 428
    :cond_17
    iget-wide v2, v0, Llk3;->C:J

    .line 429
    .line 430
    iget-wide v4, v1, Llk3;->C:J

    .line 431
    .line 432
    cmp-long v2, v2, v4

    .line 433
    .line 434
    const/16 v3, 0x10

    .line 435
    .line 436
    if-eqz v2, :cond_18

    .line 437
    .line 438
    new-instance v2, Lpl2;

    .line 439
    .line 440
    const/16 v4, 0xe

    .line 441
    .line 442
    invoke-direct {v2, v1, v4}, Lpl2;-><init>(Llk3;I)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v7, v3, v2}, Ltc2;->c(ILqc2;)V

    .line 446
    .line 447
    .line 448
    :cond_18
    iget-wide v4, v0, Llk3;->D:J

    .line 449
    .line 450
    iget-wide v10, v1, Llk3;->D:J

    .line 451
    .line 452
    cmp-long v2, v4, v10

    .line 453
    .line 454
    const/16 v4, 0x11

    .line 455
    .line 456
    if-eqz v2, :cond_19

    .line 457
    .line 458
    new-instance v2, Lpl2;

    .line 459
    .line 460
    invoke-direct {v2, v1, v9}, Lpl2;-><init>(Llk3;I)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v7, v4, v2}, Ltc2;->c(ILqc2;)V

    .line 464
    .line 465
    .line 466
    :cond_19
    iget-wide v5, v0, Llk3;->E:J

    .line 467
    .line 468
    iget-wide v8, v1, Llk3;->E:J

    .line 469
    .line 470
    cmp-long v2, v5, v8

    .line 471
    .line 472
    if-eqz v2, :cond_1a

    .line 473
    .line 474
    new-instance v2, Lpl2;

    .line 475
    .line 476
    invoke-direct {v2, v1, v3}, Lpl2;-><init>(Llk3;I)V

    .line 477
    .line 478
    .line 479
    const/16 v3, 0x12

    .line 480
    .line 481
    invoke-virtual {v7, v3, v2}, Ltc2;->c(ILqc2;)V

    .line 482
    .line 483
    .line 484
    :cond_1a
    iget-object v0, v0, Llk3;->G:Lcw4;

    .line 485
    .line 486
    iget-object v2, v1, Llk3;->G:Lcw4;

    .line 487
    .line 488
    invoke-virtual {v0, v2}, Lcw4;->equals(Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    move-result v0

    .line 492
    if-nez v0, :cond_1b

    .line 493
    .line 494
    new-instance v0, Lpl2;

    .line 495
    .line 496
    invoke-direct {v0, v1, v4}, Lpl2;-><init>(Llk3;I)V

    .line 497
    .line 498
    .line 499
    const/16 v1, 0x13

    .line 500
    .line 501
    invoke-virtual {v7, v1, v0}, Ltc2;->c(ILqc2;)V

    .line 502
    .line 503
    .line 504
    :cond_1b
    invoke-virtual {v7}, Ltc2;->b()V

    .line 505
    .line 506
    .line 507
    return-void
.end method

.method public final o()Lmi3;
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->z:Lmi3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final o0()I
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    invoke-static {p0}, Lbm2;->e1(Llk3;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final o1(Llk3;Ljk3;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Lbm2;->Y()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    iget-object v0, p0, Lbm2;->n:Lcb4;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lcb4;->a:Lbb4;

    .line 14
    .line 15
    invoke-interface {v0}, Lbb4;->f()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x6

    .line 20
    if-ge v0, v1, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    :goto_0
    move v5, v0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v1, p0, Lbm2;->H:Llk3;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    iget-object v4, p0, Lbm2;->z:Lmi3;

    .line 33
    .line 34
    iget-object v6, p0, Lbm2;->n:Lcb4;

    .line 35
    .line 36
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-object v2, p1

    .line 40
    move-object v3, p2

    .line 41
    invoke-static/range {v1 .. v6}, Lju2;->e(Llk3;Llk3;Ljk3;Lmi3;ZLcb4;)Llk3;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lbm2;->H:Llk3;

    .line 46
    .line 47
    iget-object p1, p0, Lbm2;->k:Lqi;

    .line 48
    .line 49
    invoke-virtual {p1}, Lqi;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    iget-object p1, p0, Lbm2;->H:Llk3;

    .line 56
    .line 57
    sget-object p2, Ljk3;->c:Ljk3;

    .line 58
    .line 59
    iput-object v0, p0, Lbm2;->H:Llk3;

    .line 60
    .line 61
    :cond_2
    move-object v2, p1

    .line 62
    move-object v3, p2

    .line 63
    goto :goto_3

    .line 64
    :cond_3
    :goto_2
    return-void

    .line 65
    :goto_3
    iget-object v1, p0, Lbm2;->q:Llk3;

    .line 66
    .line 67
    iget-object v4, p0, Lbm2;->z:Lmi3;

    .line 68
    .line 69
    iget-object v6, p0, Lbm2;->n:Lcb4;

    .line 70
    .line 71
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-static/range {v1 .. v6}, Lju2;->e(Llk3;Llk3;Ljk3;Lmi3;ZLcb4;)Llk3;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    iput-object v8, p0, Lbm2;->q:Llk3;

    .line 79
    .line 80
    iget-object p1, v1, Llk3;->d:Lpi3;

    .line 81
    .line 82
    iget-object p2, v2, Llk3;->d:Lpi3;

    .line 83
    .line 84
    invoke-virtual {p1, p2}, Lpi3;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_5

    .line 89
    .line 90
    iget-object p1, v1, Llk3;->e:Lpi3;

    .line 91
    .line 92
    iget-object p2, v2, Llk3;->e:Lpi3;

    .line 93
    .line 94
    invoke-virtual {p1, p2}, Lpi3;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-nez p1, :cond_4

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_4
    move-object v11, v0

    .line 102
    goto :goto_5

    .line 103
    :cond_5
    :goto_4
    iget p1, v8, Llk3;->f:I

    .line 104
    .line 105
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    move-object v11, p1

    .line 110
    :goto_5
    invoke-virtual {v1}, Llk3;->s()Lgn2;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {v8}, Llk3;->s()Lgn2;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-static {p1, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-nez p1, :cond_6

    .line 123
    .line 124
    iget p1, v8, Llk3;->b:I

    .line 125
    .line 126
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    move-object v12, p1

    .line 131
    goto :goto_6

    .line 132
    :cond_6
    move-object v12, v0

    .line 133
    :goto_6
    iget-object p1, v1, Llk3;->j:Lcu4;

    .line 134
    .line 135
    iget-object p2, v8, Llk3;->j:Lcu4;

    .line 136
    .line 137
    invoke-virtual {p1, p2}, Lcu4;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-nez p1, :cond_7

    .line 142
    .line 143
    iget p1, v8, Llk3;->k:I

    .line 144
    .line 145
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    move-object v9, p1

    .line 150
    goto :goto_7

    .line 151
    :cond_7
    move-object v9, v0

    .line 152
    :goto_7
    iget p1, v1, Llk3;->w:I

    .line 153
    .line 154
    iget p2, v8, Llk3;->w:I

    .line 155
    .line 156
    if-ne p1, p2, :cond_9

    .line 157
    .line 158
    iget-boolean p1, v1, Llk3;->v:Z

    .line 159
    .line 160
    iget-boolean v2, v8, Llk3;->v:Z

    .line 161
    .line 162
    if-eq p1, v2, :cond_8

    .line 163
    .line 164
    goto :goto_9

    .line 165
    :cond_8
    :goto_8
    move-object v6, p0

    .line 166
    move-object v10, v0

    .line 167
    move-object v7, v1

    .line 168
    goto :goto_a

    .line 169
    :cond_9
    :goto_9
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    goto :goto_8

    .line 174
    :goto_a
    invoke-virtual/range {v6 .. v12}, Lbm2;->n1(Llk3;Llk3;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 175
    .line 176
    .line 177
    return-void
.end method

.method public final p(Lgn2;J)V
    .locals 7

    .line 1
    const/16 v0, 0x1f

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lel2;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1, p2, p3}, Lel2;-><init>(Lbm2;Lgn2;J)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, -0x1

    .line 23
    const/4 v6, 0x0

    .line 24
    move-object v1, p0

    .line 25
    move-wide v4, p2

    .line 26
    invoke-virtual/range {v1 .. v6}, Lbm2;->x1(Ljava/util/List;IJZ)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final p0(I)V
    .locals 2

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lkl2;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {v0, p0, p1, v1}, Lkl2;-><init>(Lbm2;II)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 20
    .line 21
    iget v1, v0, Llk3;->h:I

    .line 22
    .line 23
    if-eq v1, p1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Llk3;->i(I)Llk3;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lbm2;->q:Llk3;

    .line 30
    .line 31
    new-instance v0, Lij0;

    .line 32
    .line 33
    const/4 v1, 0x4

    .line 34
    invoke-direct {v0, p1, v1}, Lij0;-><init>(II)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, Lbm2;->i:Ltc2;

    .line 38
    .line 39
    const/16 p1, 0x8

    .line 40
    .line 41
    invoke-virtual {p0, p1, v0}, Ltc2;->c(ILqc2;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Ltc2;->b()V

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_0
    return-void
.end method

.method public final p1(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbm2;->C:Lpf4;

    .line 2
    .line 3
    iget v1, v0, Lpf4;->a:I

    .line 4
    .line 5
    if-ne v1, p1, :cond_1

    .line 6
    .line 7
    iget v0, v0, Lpf4;->b:I

    .line 8
    .line 9
    if-eq v0, p2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    :goto_0
    new-instance v0, Lpf4;

    .line 14
    .line 15
    invoke-direct {v0, p1, p2}, Lpf4;-><init>(II)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lbm2;->C:Lpf4;

    .line 19
    .line 20
    new-instance v0, Lv31;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-direct {v0, p1, p2, v1}, Lv31;-><init>(III)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Lbm2;->i:Ltc2;

    .line 27
    .line 28
    const/16 p1, 0x18

    .line 29
    .line 30
    invoke-virtual {p0, p1, v0}, Ltc2;->f(ILqc2;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final q()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-boolean p0, p0, Llk3;->v:Z

    .line 4
    .line 5
    return p0
.end method

.method public final q0(Z)V
    .locals 2

    .line 1
    const/16 v0, 0x1a

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Ljl2;

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    invoke-direct {v0, p0, p1, v1}, Ljl2;-><init>(Lbm2;ZI)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 20
    .line 21
    iget-boolean v1, v0, Llk3;->u:Z

    .line 22
    .line 23
    if-eq v1, p1, :cond_1

    .line 24
    .line 25
    iget v1, v0, Llk3;->t:I

    .line 26
    .line 27
    invoke-virtual {v0, v1, p1}, Llk3;->c(IZ)Llk3;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lbm2;->q:Llk3;

    .line 32
    .line 33
    new-instance v0, Ljl2;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-direct {v0, p0, p1, v1}, Ljl2;-><init>(Lbm2;ZI)V

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, Lbm2;->i:Ltc2;

    .line 40
    .line 41
    const/16 p1, 0x1e

    .line 42
    .line 43
    invoke-virtual {p0, p1, v0}, Ltc2;->c(ILqc2;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Ltc2;->b()V

    .line 47
    .line 48
    .line 49
    :cond_1
    :goto_0
    return-void
.end method

.method public final r()V
    .locals 2

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lcl2;

    .line 11
    .line 12
    const/16 v1, 0xa

    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, Lcl2;-><init>(Lbm2;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    const v1, 0x7fffffff

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0, v1}, Lbm2;->r1(II)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final r0(Loi3;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->i:Ltc2;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ltc2;->e(Loi3;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final r1(II)V
    .locals 12

    .line 1
    iget-object v1, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object v1, v1, Llk3;->j:Lcu4;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcu4;->o()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-ge p1, v1, :cond_5

    .line 14
    .line 15
    if-eq p1, v3, :cond_5

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto :goto_3

    .line 20
    :cond_0
    iget-object v1, p0, Lbm2;->q:Llk3;

    .line 21
    .line 22
    invoke-static {v1}, Lbm2;->e1(Llk3;)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v9, 0x1

    .line 27
    const/4 v10, 0x0

    .line 28
    if-lt v1, p1, :cond_1

    .line 29
    .line 30
    iget-object v1, p0, Lbm2;->q:Llk3;

    .line 31
    .line 32
    invoke-static {v1}, Lbm2;->e1(Llk3;)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-ge v1, v3, :cond_1

    .line 37
    .line 38
    move v11, v9

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move v11, v10

    .line 41
    :goto_0
    iget-object v1, p0, Lbm2;->q:Llk3;

    .line 42
    .line 43
    invoke-virtual {p0}, Lbm2;->M0()J

    .line 44
    .line 45
    .line 46
    move-result-wide v5

    .line 47
    invoke-virtual {p0}, Lbm2;->Z()J

    .line 48
    .line 49
    .line 50
    move-result-wide v7

    .line 51
    const/4 v4, 0x0

    .line 52
    move v2, p1

    .line 53
    invoke-static/range {v1 .. v8}, Lbm2;->j1(Llk3;IIZJJ)Llk3;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object v4, p0, Lbm2;->q:Llk3;

    .line 58
    .line 59
    iget-object v4, v4, Llk3;->c:Lza4;

    .line 60
    .line 61
    iget-object v4, v4, Lza4;->a:Lpi3;

    .line 62
    .line 63
    iget v4, v4, Lpi3;->b:I

    .line 64
    .line 65
    if-lt v4, p1, :cond_2

    .line 66
    .line 67
    if-ge v4, v3, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    move v9, v10

    .line 71
    :goto_1
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    const/4 v3, 0x0

    .line 76
    if-eqz v11, :cond_3

    .line 77
    .line 78
    const/4 v4, 0x4

    .line 79
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    goto :goto_2

    .line 84
    :cond_3
    move-object v4, v3

    .line 85
    :goto_2
    if-eqz v9, :cond_4

    .line 86
    .line 87
    const/4 v3, 0x3

    .line 88
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    :cond_4
    move-object v5, v3

    .line 93
    const/4 v3, 0x0

    .line 94
    move-object v0, p0

    .line 95
    invoke-virtual/range {v0 .. v5}, Lbm2;->A1(Llk3;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 96
    .line 97
    .line 98
    :cond_5
    :goto_3
    return-void
.end method

.method public final s(Z)V
    .locals 3

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Ljl2;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-direct {v0, p0, p1, v1}, Ljl2;-><init>(Lbm2;ZI)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 20
    .line 21
    iget-boolean v2, v0, Llk3;->i:Z

    .line 22
    .line 23
    if-eq v2, p1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Llk3;->k(Z)Llk3;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lbm2;->q:Llk3;

    .line 30
    .line 31
    new-instance v0, Lt31;

    .line 32
    .line 33
    invoke-direct {v0, v1, p1}, Lt31;-><init>(IZ)V

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Lbm2;->i:Ltc2;

    .line 37
    .line 38
    const/16 p1, 0x9

    .line 39
    .line 40
    invoke-virtual {p0, p1, v0}, Ltc2;->c(ILqc2;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Ltc2;->b()V

    .line 44
    .line 45
    .line 46
    :cond_1
    :goto_0
    return-void
.end method

.method public final s0(Lgn2;)V
    .locals 8

    .line 1
    const/16 v0, 0x1f

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lgl2;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, p0, p1, v1}, Lgl2;-><init>(Lbm2;Lgn2;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    const/4 v7, 0x1

    .line 29
    const/4 v4, -0x1

    .line 30
    move-object v2, p0

    .line 31
    invoke-virtual/range {v2 .. v7}, Lbm2;->x1(Ljava/util/List;IJZ)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final s1(IILjava/util/List;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lbm2;->q:Llk3;

    .line 6
    .line 7
    iget-object v2, v2, Llk3;->j:Lcu4;

    .line 8
    .line 9
    invoke-virtual {v2}, Lcu4;->o()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-le v1, v2, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v3, v0, Lbm2;->q:Llk3;

    .line 17
    .line 18
    iget-object v3, v3, Llk3;->j:Lcu4;

    .line 19
    .line 20
    invoke-virtual {v3}, Lcu4;->p()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v2, -0x1

    .line 33
    move-object/from16 v1, p3

    .line 34
    .line 35
    invoke-virtual/range {v0 .. v5}, Lbm2;->x1(Ljava/util/List;IJZ)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    move-object v8, v0

    .line 40
    move/from16 v0, p2

    .line 41
    .line 42
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    iget-object v9, v8, Lbm2;->q:Llk3;

    .line 47
    .line 48
    invoke-virtual {v8}, Lbm2;->M0()J

    .line 49
    .line 50
    .line 51
    move-result-wide v12

    .line 52
    invoke-virtual {v8}, Lbm2;->Z()J

    .line 53
    .line 54
    .line 55
    move-result-wide v14

    .line 56
    move-object/from16 v11, p3

    .line 57
    .line 58
    move v10, v2

    .line 59
    invoke-static/range {v9 .. v15}, Lbm2;->i1(Llk3;ILjava/util/List;JJ)Llk3;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v8}, Lbm2;->M0()J

    .line 64
    .line 65
    .line 66
    move-result-wide v4

    .line 67
    invoke-virtual {v8}, Lbm2;->Z()J

    .line 68
    .line 69
    .line 70
    move-result-wide v6

    .line 71
    const/4 v3, 0x1

    .line 72
    invoke-static/range {v0 .. v7}, Lbm2;->j1(Llk3;IIZJJ)Llk3;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iget-object v3, v8, Lbm2;->q:Llk3;

    .line 77
    .line 78
    iget-object v3, v3, Llk3;->c:Lza4;

    .line 79
    .line 80
    iget-object v3, v3, Lza4;->a:Lpi3;

    .line 81
    .line 82
    iget v3, v3, Lpi3;->b:I

    .line 83
    .line 84
    const/4 v4, 0x0

    .line 85
    if-lt v3, v1, :cond_2

    .line 86
    .line 87
    if-ge v3, v2, :cond_2

    .line 88
    .line 89
    const/4 v1, 0x1

    .line 90
    goto :goto_0

    .line 91
    :cond_2
    move v1, v4

    .line 92
    :goto_0
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    const/4 v3, 0x0

    .line 97
    if-eqz v1, :cond_3

    .line 98
    .line 99
    const/4 v4, 0x4

    .line 100
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    goto :goto_1

    .line 105
    :cond_3
    move-object v4, v3

    .line 106
    :goto_1
    if-eqz v1, :cond_4

    .line 107
    .line 108
    const/4 v1, 0x3

    .line 109
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    :cond_4
    move-object v5, v3

    .line 114
    const/4 v3, 0x0

    .line 115
    move-object v1, v0

    .line 116
    move-object v0, v8

    .line 117
    invoke-virtual/range {v0 .. v5}, Lbm2;->A1(Llk3;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method public final stop()V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-virtual {v0, v1}, Lbm2;->h1(I)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    :cond_0
    new-instance v1, Lcl2;

    .line 13
    .line 14
    const/4 v2, 0x5

    .line 15
    invoke-direct {v1, v0, v2}, Lcl2;-><init>(Lbm2;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lbm2;->b1(Lxl2;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, v0, Lbm2;->q:Llk3;

    .line 22
    .line 23
    new-instance v2, Lza4;

    .line 24
    .line 25
    iget-object v3, v0, Lbm2;->q:Llk3;

    .line 26
    .line 27
    iget-object v3, v3, Llk3;->c:Lza4;

    .line 28
    .line 29
    iget-object v4, v3, Lza4;->a:Lpi3;

    .line 30
    .line 31
    iget-boolean v3, v3, Lza4;->b:Z

    .line 32
    .line 33
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 34
    .line 35
    .line 36
    move-result-wide v5

    .line 37
    iget-object v7, v0, Lbm2;->q:Llk3;

    .line 38
    .line 39
    iget-object v7, v7, Llk3;->c:Lza4;

    .line 40
    .line 41
    iget-wide v8, v7, Lza4;->d:J

    .line 42
    .line 43
    iget-object v7, v7, Lza4;->a:Lpi3;

    .line 44
    .line 45
    iget-wide v10, v7, Lpi3;->f:J

    .line 46
    .line 47
    move-wide v12, v10

    .line 48
    invoke-static {v12, v13, v8, v9}, Lju2;->b(JJ)I

    .line 49
    .line 50
    .line 51
    move-result v11

    .line 52
    iget-object v7, v0, Lbm2;->q:Llk3;

    .line 53
    .line 54
    iget-object v7, v7, Llk3;->c:Lza4;

    .line 55
    .line 56
    iget-wide v14, v7, Lza4;->h:J

    .line 57
    .line 58
    move-object v10, v2

    .line 59
    move/from16 v16, v3

    .line 60
    .line 61
    iget-wide v2, v7, Lza4;->i:J

    .line 62
    .line 63
    iget-object v7, v7, Lza4;->a:Lpi3;

    .line 64
    .line 65
    move-wide/from16 v17, v2

    .line 66
    .line 67
    iget-wide v2, v7, Lpi3;->f:J

    .line 68
    .line 69
    move-wide/from16 v20, v2

    .line 70
    .line 71
    move-object v3, v4

    .line 72
    move/from16 v4, v16

    .line 73
    .line 74
    move-wide/from16 v16, v17

    .line 75
    .line 76
    move-wide/from16 v18, v20

    .line 77
    .line 78
    move-wide v7, v8

    .line 79
    move-object v2, v10

    .line 80
    move-wide v9, v12

    .line 81
    const-wide/16 v12, 0x0

    .line 82
    .line 83
    invoke-direct/range {v2 .. v19}, Lza4;-><init>(Lpi3;ZJJJIJJJJ)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v2}, Llk3;->j(Lza4;)Llk3;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    iput-object v1, v0, Lbm2;->q:Llk3;

    .line 91
    .line 92
    iget v2, v1, Llk3;->A:I

    .line 93
    .line 94
    const/4 v3, 0x1

    .line 95
    if-eq v2, v3, :cond_1

    .line 96
    .line 97
    iget-object v2, v1, Llk3;->a:Landroidx/media3/common/PlaybackException;

    .line 98
    .line 99
    invoke-virtual {v1, v3, v2}, Llk3;->f(ILandroidx/media3/common/PlaybackException;)Llk3;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iput-object v1, v0, Lbm2;->q:Llk3;

    .line 104
    .line 105
    new-instance v1, Ler1;

    .line 106
    .line 107
    const/16 v2, 0x13

    .line 108
    .line 109
    invoke-direct {v1, v2}, Ler1;-><init>(I)V

    .line 110
    .line 111
    .line 112
    iget-object v0, v0, Lbm2;->i:Ltc2;

    .line 113
    .line 114
    const/4 v2, 0x4

    .line 115
    invoke-virtual {v0, v2, v1}, Ltc2;->c(ILqc2;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Ltc2;->b()V

    .line 119
    .line 120
    .line 121
    :cond_1
    :goto_0
    return-void
.end method

.method public final t()I
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object p0, p0, Llk3;->c:Lza4;

    .line 4
    .line 5
    iget p0, p0, Lza4;->f:I

    .line 6
    .line 7
    return p0
.end method

.method public final t0(II)V
    .locals 2

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    if-ltz p1, :cond_1

    .line 11
    .line 12
    if-ltz p2, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-static {v0}, Lrr2;->l(Z)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lnl2;

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    invoke-direct {v0, p0, p1, p2, v1}, Lnl2;-><init>(Lbm2;III)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v0, p1, 0x1

    .line 30
    .line 31
    invoke-virtual {p0, p1, v0, p2}, Lbm2;->m1(III)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final u()J
    .locals 2

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-wide v0, p0, Llk3;->E:J

    .line 4
    .line 5
    return-wide v0
.end method

.method public final u0(III)V
    .locals 1

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    if-ltz p1, :cond_1

    .line 11
    .line 12
    if-gt p1, p2, :cond_1

    .line 13
    .line 14
    if-ltz p3, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    :goto_0
    invoke-static {v0}, Lrr2;->l(Z)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Lul2;

    .line 23
    .line 24
    invoke-direct {v0, p0, p1, p2, p3}, Lul2;-><init>(Lbm2;III)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1, p2, p3}, Lbm2;->m1(III)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final v(Loi3;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->i:Ltc2;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ltc2;->a(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final v0()I
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget p0, p0, Llk3;->z:I

    .line 4
    .line 5
    return p0
.end method

.method public final v1(IJ)V
    .locals 53

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v3, p1

    .line 4
    .line 5
    move-wide/from16 v13, p2

    .line 6
    .line 7
    iget-object v1, v0, Lbm2;->q:Llk3;

    .line 8
    .line 9
    iget-object v1, v1, Llk3;->j:Lcu4;

    .line 10
    .line 11
    invoke-virtual {v1}, Lcu4;->p()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Lcu4;->o()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-ge v3, v2, :cond_e

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v0}, Lbm2;->k()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    goto/16 :goto_b

    .line 30
    .line 31
    :cond_1
    iget-object v2, v0, Lbm2;->q:Llk3;

    .line 32
    .line 33
    iget v4, v2, Llk3;->A:I

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    if-ne v4, v5, :cond_2

    .line 37
    .line 38
    move v4, v5

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    const/4 v4, 0x2

    .line 41
    :goto_0
    iget-object v6, v2, Llk3;->a:Landroidx/media3/common/PlaybackException;

    .line 42
    .line 43
    invoke-virtual {v2, v4, v6}, Llk3;->f(ILandroidx/media3/common/PlaybackException;)Llk3;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v0, v3, v13, v14, v1}, Lbm2;->g1(IJLcu4;)Ldd2;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    const/4 v6, 0x0

    .line 52
    const-wide/16 v7, 0x0

    .line 53
    .line 54
    if-nez v4, :cond_7

    .line 55
    .line 56
    new-instance v1, Lpi3;

    .line 57
    .line 58
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    cmp-long v16, v13, v9

    .line 64
    .line 65
    move-wide v9, v7

    .line 66
    if-nez v16, :cond_3

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    move-wide v7, v13

    .line 70
    :goto_1
    move-wide v11, v9

    .line 71
    if-nez v16, :cond_4

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    move-wide v9, v13

    .line 75
    :goto_2
    const/4 v2, -0x1

    .line 76
    move-wide/from16 v17, v11

    .line 77
    .line 78
    const/4 v12, -0x1

    .line 79
    move v11, v2

    .line 80
    const/4 v2, 0x0

    .line 81
    const/4 v4, 0x0

    .line 82
    move/from16 v19, v5

    .line 83
    .line 84
    const/4 v5, 0x0

    .line 85
    move/from16 v20, v6

    .line 86
    .line 87
    move/from16 v6, p1

    .line 88
    .line 89
    move/from16 v15, v19

    .line 90
    .line 91
    move/from16 v13, v20

    .line 92
    .line 93
    const/16 v34, 0x2

    .line 94
    .line 95
    invoke-direct/range {v1 .. v12}, Lpi3;-><init>(Ljava/lang/Object;ILgn2;Ljava/lang/Object;IJJII)V

    .line 96
    .line 97
    .line 98
    iget-object v2, v0, Lbm2;->q:Llk3;

    .line 99
    .line 100
    iget-object v3, v2, Llk3;->j:Lcu4;

    .line 101
    .line 102
    move/from16 v4, v16

    .line 103
    .line 104
    new-instance v16, Lza4;

    .line 105
    .line 106
    iget-object v5, v0, Lbm2;->q:Llk3;

    .line 107
    .line 108
    iget-object v5, v5, Llk3;->c:Lza4;

    .line 109
    .line 110
    iget-boolean v5, v5, Lza4;->b:Z

    .line 111
    .line 112
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 113
    .line 114
    .line 115
    move-result-wide v19

    .line 116
    iget-object v6, v0, Lbm2;->q:Llk3;

    .line 117
    .line 118
    iget-object v6, v6, Llk3;->c:Lza4;

    .line 119
    .line 120
    iget-wide v7, v6, Lza4;->d:J

    .line 121
    .line 122
    if-nez v4, :cond_5

    .line 123
    .line 124
    const-wide/16 v23, 0x0

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_5
    move-wide/from16 v23, p2

    .line 128
    .line 129
    :goto_3
    iget-wide v9, v6, Lza4;->h:J

    .line 130
    .line 131
    iget-wide v11, v6, Lza4;->i:J

    .line 132
    .line 133
    if-nez v4, :cond_6

    .line 134
    .line 135
    const-wide/16 v32, 0x0

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_6
    move-wide/from16 v32, p2

    .line 139
    .line 140
    :goto_4
    const/16 v25, 0x0

    .line 141
    .line 142
    const-wide/16 v26, 0x0

    .line 143
    .line 144
    move-object/from16 v17, v1

    .line 145
    .line 146
    move/from16 v18, v5

    .line 147
    .line 148
    move-wide/from16 v21, v7

    .line 149
    .line 150
    move-wide/from16 v28, v9

    .line 151
    .line 152
    move-wide/from16 v30, v11

    .line 153
    .line 154
    invoke-direct/range {v16 .. v33}, Lza4;-><init>(Lpi3;ZJJJIJJJJ)V

    .line 155
    .line 156
    .line 157
    move-object/from16 v4, v16

    .line 158
    .line 159
    invoke-static {v2, v3, v1, v4, v15}, Lbm2;->l1(Llk3;Lcu4;Lpi3;Lza4;I)Llk3;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    goto/16 :goto_9

    .line 164
    .line 165
    :cond_7
    move v15, v5

    .line 166
    move v13, v6

    .line 167
    const/16 v34, 0x2

    .line 168
    .line 169
    iget-object v3, v2, Llk3;->c:Lza4;

    .line 170
    .line 171
    iget-object v5, v3, Lza4;->a:Lpi3;

    .line 172
    .line 173
    iget-object v3, v3, Lza4;->a:Lpi3;

    .line 174
    .line 175
    iget v5, v5, Lpi3;->e:I

    .line 176
    .line 177
    iget v6, v4, Ldd2;->a:I

    .line 178
    .line 179
    new-instance v7, Lzt4;

    .line 180
    .line 181
    invoke-direct {v7}, Lzt4;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, v5, v7, v13}, Lcu4;->f(ILzt4;Z)Lzt4;

    .line 185
    .line 186
    .line 187
    new-instance v8, Lzt4;

    .line 188
    .line 189
    invoke-direct {v8}, Lzt4;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1, v6, v8, v13}, Lcu4;->f(ILzt4;Z)Lzt4;

    .line 193
    .line 194
    .line 195
    if-eq v5, v6, :cond_8

    .line 196
    .line 197
    move v9, v15

    .line 198
    goto :goto_5

    .line 199
    :cond_8
    move v9, v13

    .line 200
    :goto_5
    iget-wide v10, v4, Ldd2;->b:J

    .line 201
    .line 202
    invoke-virtual {v0}, Lbm2;->M0()J

    .line 203
    .line 204
    .line 205
    move-result-wide v19

    .line 206
    invoke-static/range {v19 .. v20}, Lf35;->Q(J)J

    .line 207
    .line 208
    .line 209
    move-result-wide v19

    .line 210
    iget-wide v13, v7, Lzt4;->e:J

    .line 211
    .line 212
    sub-long v12, v19, v13

    .line 213
    .line 214
    if-nez v9, :cond_9

    .line 215
    .line 216
    cmp-long v14, v10, v12

    .line 217
    .line 218
    if-nez v14, :cond_9

    .line 219
    .line 220
    goto/16 :goto_8

    .line 221
    .line 222
    :cond_9
    iget v14, v3, Lpi3;->h:I

    .line 223
    .line 224
    const/4 v4, -0x1

    .line 225
    if-ne v14, v4, :cond_a

    .line 226
    .line 227
    move v4, v15

    .line 228
    goto :goto_6

    .line 229
    :cond_a
    const/4 v4, 0x0

    .line 230
    :goto_6
    invoke-static {v4}, Lrr2;->w(Z)V

    .line 231
    .line 232
    .line 233
    new-instance v19, Lpi3;

    .line 234
    .line 235
    iget v4, v7, Lzt4;->c:I

    .line 236
    .line 237
    iget-object v3, v3, Lpi3;->c:Lgn2;

    .line 238
    .line 239
    move-object/from16 v22, v3

    .line 240
    .line 241
    move/from16 v21, v4

    .line 242
    .line 243
    iget-wide v3, v7, Lzt4;->e:J

    .line 244
    .line 245
    add-long/2addr v3, v12

    .line 246
    invoke-static {v3, v4}, Lf35;->i0(J)J

    .line 247
    .line 248
    .line 249
    move-result-wide v25

    .line 250
    iget-wide v3, v7, Lzt4;->e:J

    .line 251
    .line 252
    add-long/2addr v3, v12

    .line 253
    invoke-static {v3, v4}, Lf35;->i0(J)J

    .line 254
    .line 255
    .line 256
    move-result-wide v27

    .line 257
    const/16 v29, -0x1

    .line 258
    .line 259
    const/16 v30, -0x1

    .line 260
    .line 261
    const/16 v20, 0x0

    .line 262
    .line 263
    const/16 v23, 0x0

    .line 264
    .line 265
    move/from16 v24, v5

    .line 266
    .line 267
    invoke-direct/range {v19 .. v30}, Lpi3;-><init>(Ljava/lang/Object;ILgn2;Ljava/lang/Object;IJJII)V

    .line 268
    .line 269
    .line 270
    move-object/from16 v3, v19

    .line 271
    .line 272
    const/4 v4, 0x0

    .line 273
    invoke-virtual {v1, v6, v8, v4}, Lcu4;->f(ILzt4;Z)Lzt4;

    .line 274
    .line 275
    .line 276
    new-instance v5, Lbu4;

    .line 277
    .line 278
    invoke-direct {v5}, Lbu4;-><init>()V

    .line 279
    .line 280
    .line 281
    iget v7, v8, Lzt4;->c:I

    .line 282
    .line 283
    invoke-virtual {v1, v7, v5}, Lcu4;->n(ILbu4;)V

    .line 284
    .line 285
    .line 286
    move-object/from16 p2, v5

    .line 287
    .line 288
    iget-wide v4, v8, Lzt4;->e:J

    .line 289
    .line 290
    add-long/2addr v4, v10

    .line 291
    invoke-static {v4, v5}, Lf35;->i0(J)J

    .line 292
    .line 293
    .line 294
    move-result-wide v25

    .line 295
    new-instance v36, Lpi3;

    .line 296
    .line 297
    iget v1, v8, Lzt4;->c:I

    .line 298
    .line 299
    move-object/from16 v4, p2

    .line 300
    .line 301
    iget-object v5, v4, Lbu4;->b:Lgn2;

    .line 302
    .line 303
    move-wide/from16 v27, v25

    .line 304
    .line 305
    move/from16 v21, v1

    .line 306
    .line 307
    move-object/from16 v22, v5

    .line 308
    .line 309
    move/from16 v24, v6

    .line 310
    .line 311
    move-object/from16 v19, v36

    .line 312
    .line 313
    invoke-direct/range {v19 .. v30}, Lpi3;-><init>(Ljava/lang/Object;ILgn2;Ljava/lang/Object;IJJII)V

    .line 314
    .line 315
    .line 316
    move-object/from16 v1, v19

    .line 317
    .line 318
    move-wide/from16 v5, v25

    .line 319
    .line 320
    invoke-virtual {v2, v3, v1, v15}, Llk3;->h(Lpi3;Lpi3;I)Llk3;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    if-nez v9, :cond_b

    .line 325
    .line 326
    cmp-long v3, v10, v12

    .line 327
    .line 328
    if-gez v3, :cond_c

    .line 329
    .line 330
    :cond_b
    move-object/from16 v36, v1

    .line 331
    .line 332
    goto :goto_7

    .line 333
    :cond_c
    iget-object v3, v2, Llk3;->c:Lza4;

    .line 334
    .line 335
    iget-wide v5, v3, Lza4;->g:J

    .line 336
    .line 337
    invoke-static {v5, v6}, Lf35;->Q(J)J

    .line 338
    .line 339
    .line 340
    move-result-wide v5

    .line 341
    sub-long v12, v10, v12

    .line 342
    .line 343
    sub-long/2addr v5, v12

    .line 344
    const-wide/16 v12, 0x0

    .line 345
    .line 346
    invoke-static {v12, v13, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 347
    .line 348
    .line 349
    move-result-wide v5

    .line 350
    iget-wide v7, v8, Lzt4;->e:J

    .line 351
    .line 352
    add-long/2addr v7, v10

    .line 353
    add-long/2addr v7, v5

    .line 354
    invoke-static {v7, v8}, Lf35;->i0(J)J

    .line 355
    .line 356
    .line 357
    move-result-wide v7

    .line 358
    new-instance v35, Lza4;

    .line 359
    .line 360
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 361
    .line 362
    .line 363
    move-result-wide v38

    .line 364
    iget-wide v9, v4, Lbu4;->l:J

    .line 365
    .line 366
    invoke-static {v9, v10}, Lf35;->i0(J)J

    .line 367
    .line 368
    .line 369
    move-result-wide v40

    .line 370
    iget-wide v3, v4, Lbu4;->l:J

    .line 371
    .line 372
    invoke-static {v3, v4}, Lf35;->i0(J)J

    .line 373
    .line 374
    .line 375
    move-result-wide v3

    .line 376
    invoke-static {v7, v8, v3, v4}, Lju2;->b(JJ)I

    .line 377
    .line 378
    .line 379
    move-result v44

    .line 380
    invoke-static {v5, v6}, Lf35;->i0(J)J

    .line 381
    .line 382
    .line 383
    move-result-wide v45

    .line 384
    const-wide v47, -0x7fffffffffffffffL    # -4.9E-324

    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    const-wide v49, -0x7fffffffffffffffL    # -4.9E-324

    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    const/16 v37, 0x0

    .line 395
    .line 396
    move-wide/from16 v51, v7

    .line 397
    .line 398
    move-object/from16 v36, v1

    .line 399
    .line 400
    move-wide/from16 v42, v7

    .line 401
    .line 402
    invoke-direct/range {v35 .. v52}, Lza4;-><init>(Lpi3;ZJJJIJJJJ)V

    .line 403
    .line 404
    .line 405
    move-object/from16 v1, v35

    .line 406
    .line 407
    invoke-virtual {v2, v1}, Llk3;->j(Lza4;)Llk3;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    goto :goto_8

    .line 412
    :goto_7
    new-instance v35, Lza4;

    .line 413
    .line 414
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 415
    .line 416
    .line 417
    move-result-wide v38

    .line 418
    iget-wide v7, v4, Lbu4;->l:J

    .line 419
    .line 420
    invoke-static {v7, v8}, Lf35;->i0(J)J

    .line 421
    .line 422
    .line 423
    move-result-wide v40

    .line 424
    iget-wide v3, v4, Lbu4;->l:J

    .line 425
    .line 426
    invoke-static {v3, v4}, Lf35;->i0(J)J

    .line 427
    .line 428
    .line 429
    move-result-wide v3

    .line 430
    invoke-static {v5, v6, v3, v4}, Lju2;->b(JJ)I

    .line 431
    .line 432
    .line 433
    move-result v44

    .line 434
    const-wide v47, -0x7fffffffffffffffL    # -4.9E-324

    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    const-wide v49, -0x7fffffffffffffffL    # -4.9E-324

    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    const/16 v37, 0x0

    .line 445
    .line 446
    const-wide/16 v45, 0x0

    .line 447
    .line 448
    move-wide/from16 v51, v5

    .line 449
    .line 450
    move-wide/from16 v42, v5

    .line 451
    .line 452
    invoke-direct/range {v35 .. v52}, Lza4;-><init>(Lpi3;ZJJJIJJJJ)V

    .line 453
    .line 454
    .line 455
    move-object/from16 v1, v35

    .line 456
    .line 457
    invoke-virtual {v2, v1}, Llk3;->j(Lza4;)Llk3;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    :goto_8
    move-object v1, v2

    .line 462
    :goto_9
    iget-object v2, v1, Llk3;->c:Lza4;

    .line 463
    .line 464
    iget-object v3, v0, Lbm2;->q:Llk3;

    .line 465
    .line 466
    iget-object v3, v3, Llk3;->j:Lcu4;

    .line 467
    .line 468
    invoke-virtual {v3}, Lcu4;->p()Z

    .line 469
    .line 470
    .line 471
    move-result v3

    .line 472
    if-nez v3, :cond_d

    .line 473
    .line 474
    iget-object v3, v2, Lza4;->a:Lpi3;

    .line 475
    .line 476
    iget v3, v3, Lpi3;->b:I

    .line 477
    .line 478
    iget-object v4, v0, Lbm2;->q:Llk3;

    .line 479
    .line 480
    iget-object v4, v4, Llk3;->c:Lza4;

    .line 481
    .line 482
    iget-object v4, v4, Lza4;->a:Lpi3;

    .line 483
    .line 484
    iget v4, v4, Lpi3;->b:I

    .line 485
    .line 486
    if-eq v3, v4, :cond_d

    .line 487
    .line 488
    move v5, v15

    .line 489
    goto :goto_a

    .line 490
    :cond_d
    const/4 v5, 0x0

    .line 491
    :goto_a
    if-nez v5, :cond_f

    .line 492
    .line 493
    iget-object v2, v2, Lza4;->a:Lpi3;

    .line 494
    .line 495
    iget-wide v2, v2, Lpi3;->f:J

    .line 496
    .line 497
    iget-object v4, v0, Lbm2;->q:Llk3;

    .line 498
    .line 499
    iget-object v4, v4, Llk3;->c:Lza4;

    .line 500
    .line 501
    iget-object v4, v4, Lza4;->a:Lpi3;

    .line 502
    .line 503
    iget-wide v6, v4, Lpi3;->f:J

    .line 504
    .line 505
    cmp-long v2, v2, v6

    .line 506
    .line 507
    if-eqz v2, :cond_e

    .line 508
    .line 509
    goto :goto_c

    .line 510
    :cond_e
    :goto_b
    return-void

    .line 511
    :cond_f
    :goto_c
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 512
    .line 513
    .line 514
    move-result-object v4

    .line 515
    if-eqz v5, :cond_10

    .line 516
    .line 517
    invoke-static/range {v34 .. v34}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    :goto_d
    move-object v5, v2

    .line 522
    goto :goto_e

    .line 523
    :cond_10
    const/4 v2, 0x0

    .line 524
    goto :goto_d

    .line 525
    :goto_e
    const/4 v2, 0x0

    .line 526
    const/4 v3, 0x0

    .line 527
    invoke-virtual/range {v0 .. v5}, Lbm2;->A1(Llk3;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 528
    .line 529
    .line 530
    return-void
.end method

.method public final w()I
    .locals 4

    .line 1
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object v0, v0, Llk3;->j:Lcu4;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 p0, -0x1

    .line 12
    return p0

    .line 13
    :cond_0
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 14
    .line 15
    iget-object v1, v0, Llk3;->j:Lcu4;

    .line 16
    .line 17
    invoke-static {v0}, Lbm2;->e1(Llk3;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 22
    .line 23
    iget v2, p0, Llk3;->h:I

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    if-ne v2, v3, :cond_1

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    :cond_1
    iget-boolean p0, p0, Llk3;->i:Z

    .line 30
    .line 31
    invoke-virtual {v1, v0, v2, p0}, Lcu4;->k(IIZ)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0
.end method

.method public final w0(Ljava/util/List;)V
    .locals 2

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lfl2;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, p0, p1, v1}, Lfl2;-><init>(Lbm2;Ljava/util/List;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 20
    .line 21
    iget-object v0, v0, Llk3;->j:Lcu4;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcu4;->o()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0, p1, v0}, Lbm2;->W0(Ljava/util/List;I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final w1(J)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lbm2;->M0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    add-long/2addr v0, p1

    .line 6
    invoke-virtual {p0}, Lbm2;->getDuration()J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    cmp-long v2, p1, v2

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    :cond_0
    const-wide/16 p1, 0x0

    .line 24
    .line 25
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 30
    .line 31
    invoke-static {v0}, Lbm2;->e1(Llk3;)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p0, v0, p1, p2}, Lbm2;->v1(IJ)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final x()J
    .locals 2

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object p0, p0, Llk3;->c:Lza4;

    .line 4
    .line 5
    iget-wide v0, p0, Lza4;->i:J

    .line 6
    .line 7
    return-wide v0
.end method

.method public final x0()Lcu4;
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object p0, p0, Llk3;->j:Lcu4;

    .line 4
    .line 5
    return-object p0
.end method

.method public final x1(Ljava/util/List;IJZ)V
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    new-instance v3, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v4, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    move v11, v5

    .line 23
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    if-ge v11, v6, :cond_0

    .line 28
    .line 29
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    move-object v8, v6

    .line 34
    check-cast v8, Lgn2;

    .line 35
    .line 36
    sget-object v6, Lf92;->a:Ljx1;

    .line 37
    .line 38
    new-instance v6, Lbu4;

    .line 39
    .line 40
    invoke-direct {v6}, Lbu4;-><init>()V

    .line 41
    .line 42
    .line 43
    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    const-wide/16 v25, 0x0

    .line 49
    .line 50
    const/4 v9, 0x0

    .line 51
    move/from16 v23, v11

    .line 52
    .line 53
    const-wide/16 v10, 0x0

    .line 54
    .line 55
    const-wide/16 v12, 0x0

    .line 56
    .line 57
    const-wide/16 v14, 0x0

    .line 58
    .line 59
    const/16 v16, 0x1

    .line 60
    .line 61
    const/16 v17, 0x0

    .line 62
    .line 63
    const/16 v18, 0x0

    .line 64
    .line 65
    const-wide/16 v19, 0x0

    .line 66
    .line 67
    move/from16 v24, v23

    .line 68
    .line 69
    invoke-virtual/range {v6 .. v26}, Lbu4;->b(Ljava/lang/Object;Lgn2;Ljava/lang/Object;JJJZZLan2;JJIIJ)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    new-instance v8, Lzt4;

    .line 76
    .line 77
    invoke-direct {v8}, Lzt4;-><init>()V

    .line 78
    .line 79
    .line 80
    sget-object v16, Lz5;->f:Lz5;

    .line 81
    .line 82
    const/16 v17, 0x1

    .line 83
    .line 84
    const/4 v10, 0x0

    .line 85
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    move/from16 v11, v23

    .line 91
    .line 92
    invoke-virtual/range {v8 .. v17}, Lzt4;->i(Ljava/lang/Object;Ljava/lang/Object;IJJLz5;Z)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    add-int/lit8 v11, v23, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    invoke-static {v3, v4}, Lbm2;->Z0(Ljava/util/ArrayList;Ljava/util/ArrayList;)Lau4;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    iget-object v4, v3, Lau4;->e:Lyw1;

    .line 106
    .line 107
    invoke-virtual {v3}, Lcu4;->p()Z

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    if-nez v6, :cond_2

    .line 112
    .line 113
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    if-ge v2, v6, :cond_1

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_1
    new-instance v0, Landroidx/media3/common/IllegalSeekPositionException;

    .line 121
    .line 122
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 123
    .line 124
    .line 125
    throw v0

    .line 126
    :cond_2
    :goto_1
    const/4 v6, -0x1

    .line 127
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    const/4 v10, 0x1

    .line 133
    if-eqz p5, :cond_4

    .line 134
    .line 135
    invoke-virtual {v3}, Lcu4;->p()Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_3

    .line 140
    .line 141
    move v2, v5

    .line 142
    goto :goto_2

    .line 143
    :cond_3
    iget-object v2, v0, Lbm2;->q:Llk3;

    .line 144
    .line 145
    iget-boolean v2, v2, Llk3;->i:Z

    .line 146
    .line 147
    invoke-virtual {v3, v2}, Lau4;->a(Z)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    :goto_2
    move v13, v2

    .line 152
    move v2, v5

    .line 153
    move-wide v4, v8

    .line 154
    goto :goto_3

    .line 155
    :cond_4
    if-ne v2, v6, :cond_6

    .line 156
    .line 157
    iget-object v2, v0, Lbm2;->q:Llk3;

    .line 158
    .line 159
    iget-object v2, v2, Llk3;->c:Lza4;

    .line 160
    .line 161
    iget-object v2, v2, Lza4;->a:Lpi3;

    .line 162
    .line 163
    iget v11, v2, Lpi3;->b:I

    .line 164
    .line 165
    iget-wide v12, v2, Lpi3;->f:J

    .line 166
    .line 167
    invoke-virtual {v3}, Lcu4;->p()Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-nez v2, :cond_5

    .line 172
    .line 173
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-lt v11, v2, :cond_5

    .line 178
    .line 179
    iget-object v2, v0, Lbm2;->q:Llk3;

    .line 180
    .line 181
    iget-boolean v2, v2, Llk3;->i:Z

    .line 182
    .line 183
    invoke-virtual {v3, v2}, Lau4;->a(Z)I

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    move v13, v2

    .line 188
    move-wide v4, v8

    .line 189
    move v2, v10

    .line 190
    goto :goto_3

    .line 191
    :cond_5
    move v2, v5

    .line 192
    move-wide v4, v12

    .line 193
    move v13, v11

    .line 194
    goto :goto_3

    .line 195
    :cond_6
    move v13, v2

    .line 196
    move v2, v5

    .line 197
    move-wide/from16 v4, p3

    .line 198
    .line 199
    :goto_3
    invoke-virtual {v0, v13, v4, v5, v3}, Lbm2;->g1(IJLcu4;)Ldd2;

    .line 200
    .line 201
    .line 202
    move-result-object v11

    .line 203
    if-nez v11, :cond_b

    .line 204
    .line 205
    new-instance v11, Lpi3;

    .line 206
    .line 207
    cmp-long v1, v4, v8

    .line 208
    .line 209
    const-wide/16 v8, 0x0

    .line 210
    .line 211
    if-nez v1, :cond_7

    .line 212
    .line 213
    move-wide/from16 v17, v8

    .line 214
    .line 215
    goto :goto_4

    .line 216
    :cond_7
    move-wide/from16 v17, v4

    .line 217
    .line 218
    :goto_4
    if-nez v1, :cond_8

    .line 219
    .line 220
    move-wide/from16 v19, v8

    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_8
    move-wide/from16 v19, v4

    .line 224
    .line 225
    :goto_5
    const/16 v21, -0x1

    .line 226
    .line 227
    const/16 v22, -0x1

    .line 228
    .line 229
    const/4 v12, 0x0

    .line 230
    const/4 v14, 0x0

    .line 231
    const/4 v15, 0x0

    .line 232
    move/from16 v16, v13

    .line 233
    .line 234
    invoke-direct/range {v11 .. v22}, Lpi3;-><init>(Ljava/lang/Object;ILgn2;Ljava/lang/Object;IJJII)V

    .line 235
    .line 236
    .line 237
    new-instance v14, Lza4;

    .line 238
    .line 239
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 240
    .line 241
    .line 242
    move-result-wide v17

    .line 243
    if-nez v1, :cond_9

    .line 244
    .line 245
    move-wide/from16 v21, v8

    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_9
    move-wide/from16 v21, v4

    .line 249
    .line 250
    :goto_6
    if-nez v1, :cond_a

    .line 251
    .line 252
    move-wide/from16 v30, v8

    .line 253
    .line 254
    goto :goto_7

    .line 255
    :cond_a
    move-wide/from16 v30, v4

    .line 256
    .line 257
    :goto_7
    const/16 v16, 0x0

    .line 258
    .line 259
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    const/16 v23, 0x0

    .line 265
    .line 266
    const-wide/16 v24, 0x0

    .line 267
    .line 268
    const-wide v26, -0x7fffffffffffffffL    # -4.9E-324

    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    const-wide v28, -0x7fffffffffffffffL    # -4.9E-324

    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    move-object v15, v11

    .line 279
    invoke-direct/range {v14 .. v31}, Lza4;-><init>(Lpi3;ZJJJIJJJJ)V

    .line 280
    .line 281
    .line 282
    goto :goto_8

    .line 283
    :cond_b
    iget-wide v4, v11, Ldd2;->b:J

    .line 284
    .line 285
    new-instance v15, Lpi3;

    .line 286
    .line 287
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    move-object v14, v1

    .line 292
    check-cast v14, Lgn2;

    .line 293
    .line 294
    iget v1, v11, Ldd2;->a:I

    .line 295
    .line 296
    invoke-static {v4, v5}, Lf35;->i0(J)J

    .line 297
    .line 298
    .line 299
    move-result-wide v17

    .line 300
    invoke-static {v4, v5}, Lf35;->i0(J)J

    .line 301
    .line 302
    .line 303
    move-result-wide v19

    .line 304
    const/16 v21, -0x1

    .line 305
    .line 306
    const/16 v22, -0x1

    .line 307
    .line 308
    const/4 v12, 0x0

    .line 309
    move-object v11, v15

    .line 310
    const/4 v15, 0x0

    .line 311
    move/from16 v16, v1

    .line 312
    .line 313
    invoke-direct/range {v11 .. v22}, Lpi3;-><init>(Ljava/lang/Object;ILgn2;Ljava/lang/Object;IJJII)V

    .line 314
    .line 315
    .line 316
    new-instance v14, Lza4;

    .line 317
    .line 318
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 319
    .line 320
    .line 321
    move-result-wide v17

    .line 322
    invoke-static {v4, v5}, Lf35;->i0(J)J

    .line 323
    .line 324
    .line 325
    move-result-wide v21

    .line 326
    const-wide v28, -0x7fffffffffffffffL    # -4.9E-324

    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    invoke-static {v4, v5}, Lf35;->i0(J)J

    .line 332
    .line 333
    .line 334
    move-result-wide v30

    .line 335
    const/16 v16, 0x0

    .line 336
    .line 337
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    const/16 v23, 0x0

    .line 343
    .line 344
    const-wide/16 v24, 0x0

    .line 345
    .line 346
    const-wide v26, -0x7fffffffffffffffL    # -4.9E-324

    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    move-object v15, v11

    .line 352
    invoke-direct/range {v14 .. v31}, Lza4;-><init>(Lpi3;ZJJJIJJJJ)V

    .line 353
    .line 354
    .line 355
    :goto_8
    iget-object v1, v0, Lbm2;->q:Llk3;

    .line 356
    .line 357
    const/4 v4, 0x4

    .line 358
    invoke-static {v1, v3, v11, v14, v4}, Lbm2;->l1(Llk3;Lcu4;Lpi3;Lza4;I)Llk3;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    iget v5, v1, Llk3;->A:I

    .line 363
    .line 364
    if-eq v13, v6, :cond_e

    .line 365
    .line 366
    if-eq v5, v10, :cond_e

    .line 367
    .line 368
    invoke-virtual {v3}, Lcu4;->p()Z

    .line 369
    .line 370
    .line 371
    move-result v3

    .line 372
    if-nez v3, :cond_d

    .line 373
    .line 374
    if-eqz v2, :cond_c

    .line 375
    .line 376
    goto :goto_9

    .line 377
    :cond_c
    const/4 v5, 0x2

    .line 378
    goto :goto_a

    .line 379
    :cond_d
    :goto_9
    move v5, v4

    .line 380
    :cond_e
    :goto_a
    iget-object v2, v0, Lbm2;->q:Llk3;

    .line 381
    .line 382
    iget-object v2, v2, Llk3;->a:Landroidx/media3/common/PlaybackException;

    .line 383
    .line 384
    invoke-virtual {v1, v5, v2}, Llk3;->f(ILandroidx/media3/common/PlaybackException;)Llk3;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    iget-object v2, v0, Lbm2;->q:Llk3;

    .line 389
    .line 390
    iget-object v2, v2, Llk3;->j:Lcu4;

    .line 391
    .line 392
    invoke-virtual {v2}, Lcu4;->p()Z

    .line 393
    .line 394
    .line 395
    move-result v2

    .line 396
    const/4 v3, 0x0

    .line 397
    if-nez v2, :cond_f

    .line 398
    .line 399
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    move-object v4, v2

    .line 404
    goto :goto_b

    .line 405
    :cond_f
    move-object v4, v3

    .line 406
    :goto_b
    iget-object v2, v0, Lbm2;->q:Llk3;

    .line 407
    .line 408
    iget-object v2, v2, Llk3;->j:Lcu4;

    .line 409
    .line 410
    invoke-virtual {v2}, Lcu4;->p()Z

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    if-eqz v2, :cond_11

    .line 415
    .line 416
    iget-object v2, v1, Llk3;->j:Lcu4;

    .line 417
    .line 418
    invoke-virtual {v2}, Lcu4;->p()Z

    .line 419
    .line 420
    .line 421
    move-result v2

    .line 422
    if-nez v2, :cond_10

    .line 423
    .line 424
    goto :goto_d

    .line 425
    :cond_10
    :goto_c
    move-object v5, v3

    .line 426
    goto :goto_e

    .line 427
    :cond_11
    :goto_d
    const/4 v2, 0x3

    .line 428
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    goto :goto_c

    .line 433
    :goto_e
    const/4 v3, 0x0

    .line 434
    move-object v2, v7

    .line 435
    invoke-virtual/range {v0 .. v5}, Lbm2;->A1(Llk3;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 436
    .line 437
    .line 438
    return-void
.end method

.method public final y()I
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object p0, p0, Llk3;->c:Lza4;

    .line 4
    .line 5
    iget-object p0, p0, Lza4;->a:Lpi3;

    .line 6
    .line 7
    iget p0, p0, Lpi3;->e:I

    .line 8
    .line 9
    return p0
.end method

.method public final y0()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-boolean p0, p0, Llk3;->u:Z

    .line 4
    .line 5
    return p0
.end method

.method public final y1(Z)V
    .locals 9

    .line 1
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget v1, v0, Llk3;->z:I

    .line 4
    .line 5
    const/4 v7, 0x1

    .line 6
    if-ne v1, v7, :cond_0

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    move v8, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v8, v1

    .line 12
    :goto_0
    iget-boolean v2, v0, Llk3;->v:Z

    .line 13
    .line 14
    if-ne v2, p1, :cond_1

    .line 15
    .line 16
    if-ne v1, v8, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    iget-wide v1, p0, Lbm2;->F:J

    .line 20
    .line 21
    iget-wide v3, p0, Lbm2;->G:J

    .line 22
    .line 23
    invoke-virtual {p0}, Lbm2;->f1()Lsk2;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    iget-wide v5, v5, Lsk2;->g:J

    .line 28
    .line 29
    invoke-static/range {v0 .. v6}, Lju2;->c(Llk3;JJJ)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    iput-wide v0, p0, Lbm2;->F:J

    .line 34
    .line 35
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    iput-wide v0, p0, Lbm2;->G:J

    .line 40
    .line 41
    iget-object v0, p0, Lbm2;->q:Llk3;

    .line 42
    .line 43
    invoke-virtual {v0, v7, v8, p1}, Llk3;->d(IIZ)Llk3;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    const/4 v5, 0x0

    .line 52
    const/4 v6, 0x0

    .line 53
    const/4 v3, 0x0

    .line 54
    move-object v1, p0

    .line 55
    invoke-virtual/range {v1 .. v6}, Lbm2;->A1(Llk3;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final z()Ls55;
    .locals 0

    .line 1
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 2
    .line 3
    iget-object p0, p0, Llk3;->l:Ls55;

    .line 4
    .line 5
    return-object p0
.end method

.method public final z0(ILgn2;)V
    .locals 2

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbm2;->h1(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    if-ltz p1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-static {v0}, Lrr2;->l(Z)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lvl2;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-direct {v0, p0, p1, p2, v1}, Lvl2;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lbm2;->b1(Lxl2;)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v0, p1, 0x1

    .line 28
    .line 29
    invoke-static {p2}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p0, p1, v0, p2}, Lbm2;->s1(IILjava/util/List;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final z1(Landroid/view/Surface;II)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lbm2;->Y()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lbm2;->n:Lcb4;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lcb4;->a:Lbb4;

    .line 14
    .line 15
    invoke-interface {v0}, Lbb4;->f()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/16 v1, 0x8

    .line 20
    .line 21
    if-lt v0, v1, :cond_1

    .line 22
    .line 23
    new-instance v2, Lhl2;

    .line 24
    .line 25
    const/4 v7, 0x1

    .line 26
    move-object v3, p0

    .line 27
    move-object v4, p1

    .line 28
    move v5, p2

    .line 29
    move v6, p3

    .line 30
    invoke-direct/range {v2 .. v7}, Lhl2;-><init>(Ljava/lang/Object;Ljava/lang/Object;III)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v2}, Lbm2;->c1(Lxl2;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    move-object v3, p0

    .line 38
    move-object v4, p1

    .line 39
    new-instance p0, Lef0;

    .line 40
    .line 41
    const/16 p1, 0xc

    .line 42
    .line 43
    invoke-direct {p0, p1, v3, v4}, Lef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, p0}, Lbm2;->c1(Lxl2;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method
