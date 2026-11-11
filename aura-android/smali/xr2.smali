.class public final Lxr2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Loi3;


# instance fields
.field public final n:Ljava/lang/ref/WeakReference;

.field public final o:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ltn2;Lal3;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxr2;->n:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final A(Ljw4;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lal3;

    .line 18
    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    iget-object p0, v0, Ltn2;->r:Llk3;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Llk3;->b(Ljw4;)Llk3;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    iput-object p0, v0, Ltn2;->r:Llk3;

    .line 29
    .line 30
    iget-object p0, v0, Ltn2;->c:Lwr2;

    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-virtual {p0, p1, v1}, Lwr2;->a(ZZ)V

    .line 35
    .line 36
    .line 37
    new-instance p0, Ler1;

    .line 38
    .line 39
    const/16 p1, 0x1b

    .line 40
    .line 41
    invoke-direct {p0, p1}, Ler1;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ltn2;->f(Lyr2;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final C(IZ)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lal3;

    .line 18
    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-object p0, v0, Ltn2;->r:Llk3;

    .line 23
    .line 24
    invoke-virtual {p0, p1, p2}, Llk3;->c(IZ)Llk3;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    iput-object p0, v0, Ltn2;->r:Llk3;

    .line 29
    .line 30
    iget-object p0, v0, Ltn2;->c:Lwr2;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-virtual {p0, v1, v1}, Lwr2;->a(ZZ)V

    .line 34
    .line 35
    .line 36
    :try_start_0
    iget-object p0, v0, Ltn2;->h:Lls2;

    .line 37
    .line 38
    iget-object p0, p0, Lls2;->i:Llr0;

    .line 39
    .line 40
    iget-object p0, p0, Llr0;->r:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Lls2;

    .line 43
    .line 44
    iget-object p0, p0, Lls2;->p:Lis2;

    .line 45
    .line 46
    if-eqz p0, :cond_3

    .line 47
    .line 48
    if-eqz p2, :cond_2

    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    :cond_2
    iput p1, p0, Lis2;->d:I

    .line 52
    .line 53
    invoke-virtual {p0}, Lis2;->a()Landroid/media/VolumeProvider;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0, p1}, Landroid/media/VolumeProvider;->setCurrentVolume(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    :cond_3
    :goto_0
    return-void

    .line 61
    :catch_0
    move-exception p0

    .line 62
    const-string p1, "MediaSessionImpl"

    .line 63
    .line 64
    const-string p2, "Exception in using media1 API"

    .line 65
    .line 66
    invoke-static {p1, p2, p0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final E(J)V
    .locals 39

    .line 1
    invoke-virtual/range {p0 .. p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p0

    .line 12
    .line 13
    iget-object v1, v1, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lal3;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    :goto_0
    return-void

    .line 24
    :cond_1
    iget-object v1, v0, Ltn2;->r:Llk3;

    .line 25
    .line 26
    iget-object v3, v1, Llk3;->a:Landroidx/media3/common/PlaybackException;

    .line 27
    .line 28
    iget v4, v1, Llk3;->b:I

    .line 29
    .line 30
    iget-object v5, v1, Llk3;->c:Lza4;

    .line 31
    .line 32
    iget-object v6, v1, Llk3;->d:Lpi3;

    .line 33
    .line 34
    iget-object v7, v1, Llk3;->e:Lpi3;

    .line 35
    .line 36
    iget v8, v1, Llk3;->f:I

    .line 37
    .line 38
    iget-object v9, v1, Llk3;->g:Lqh3;

    .line 39
    .line 40
    iget v10, v1, Llk3;->h:I

    .line 41
    .line 42
    iget-boolean v11, v1, Llk3;->i:Z

    .line 43
    .line 44
    iget-object v13, v1, Llk3;->j:Lcu4;

    .line 45
    .line 46
    iget v14, v1, Llk3;->k:I

    .line 47
    .line 48
    iget-object v12, v1, Llk3;->l:Ls55;

    .line 49
    .line 50
    iget-object v15, v1, Llk3;->m:Ldo2;

    .line 51
    .line 52
    iget v2, v1, Llk3;->n:F

    .line 53
    .line 54
    move/from16 v16, v2

    .line 55
    .line 56
    iget v2, v1, Llk3;->o:F

    .line 57
    .line 58
    move/from16 v17, v2

    .line 59
    .line 60
    iget v2, v1, Llk3;->p:I

    .line 61
    .line 62
    move/from16 v19, v2

    .line 63
    .line 64
    iget-object v2, v1, Llk3;->q:Lil;

    .line 65
    .line 66
    move-object/from16 v18, v2

    .line 67
    .line 68
    iget-object v2, v1, Llk3;->r:Ljg0;

    .line 69
    .line 70
    move-object/from16 v20, v2

    .line 71
    .line 72
    iget-object v2, v1, Llk3;->s:Lhp0;

    .line 73
    .line 74
    move-object/from16 v21, v2

    .line 75
    .line 76
    iget v2, v1, Llk3;->t:I

    .line 77
    .line 78
    move/from16 v22, v2

    .line 79
    .line 80
    iget-boolean v2, v1, Llk3;->u:Z

    .line 81
    .line 82
    move/from16 v23, v2

    .line 83
    .line 84
    iget-boolean v2, v1, Llk3;->v:Z

    .line 85
    .line 86
    move/from16 v24, v2

    .line 87
    .line 88
    iget v2, v1, Llk3;->w:I

    .line 89
    .line 90
    move/from16 v25, v2

    .line 91
    .line 92
    iget-boolean v2, v1, Llk3;->x:Z

    .line 93
    .line 94
    move/from16 v28, v2

    .line 95
    .line 96
    iget-boolean v2, v1, Llk3;->y:Z

    .line 97
    .line 98
    move/from16 v29, v2

    .line 99
    .line 100
    iget v2, v1, Llk3;->z:I

    .line 101
    .line 102
    move/from16 v26, v2

    .line 103
    .line 104
    iget v2, v1, Llk3;->A:I

    .line 105
    .line 106
    move/from16 v27, v2

    .line 107
    .line 108
    iget-object v2, v1, Llk3;->B:Ldo2;

    .line 109
    .line 110
    move-object/from16 v31, v2

    .line 111
    .line 112
    move-object/from16 v30, v3

    .line 113
    .line 114
    iget-wide v2, v1, Llk3;->D:J

    .line 115
    .line 116
    move-wide/from16 v33, v2

    .line 117
    .line 118
    iget-wide v2, v1, Llk3;->E:J

    .line 119
    .line 120
    move-wide/from16 v35, v2

    .line 121
    .line 122
    iget-object v2, v1, Llk3;->F:Ljw4;

    .line 123
    .line 124
    iget-object v1, v1, Llk3;->G:Lcw4;

    .line 125
    .line 126
    invoke-virtual {v13}, Lcu4;->p()Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    move-object/from16 v38, v1

    .line 131
    .line 132
    if-nez v3, :cond_3

    .line 133
    .line 134
    iget-object v3, v5, Lza4;->a:Lpi3;

    .line 135
    .line 136
    iget v3, v3, Lpi3;->b:I

    .line 137
    .line 138
    invoke-virtual {v13}, Lcu4;->o()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-ge v3, v1, :cond_2

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_2
    const/4 v1, 0x0

    .line 146
    goto :goto_2

    .line 147
    :cond_3
    :goto_1
    const/4 v1, 0x1

    .line 148
    :goto_2
    invoke-static {v1}, Lrr2;->w(Z)V

    .line 149
    .line 150
    .line 151
    move-object/from16 v37, v2

    .line 152
    .line 153
    new-instance v2, Llk3;

    .line 154
    .line 155
    move-object/from16 v3, v30

    .line 156
    .line 157
    move-object/from16 v30, v31

    .line 158
    .line 159
    move-wide/from16 v31, p1

    .line 160
    .line 161
    invoke-direct/range {v2 .. v38}, Llk3;-><init>(Landroidx/media3/common/PlaybackException;ILza4;Lpi3;Lpi3;ILqh3;IZLs55;Lcu4;ILdo2;FFLil;ILjg0;Lhp0;IZZIIIZZLdo2;JJJLjw4;Lcw4;)V

    .line 162
    .line 163
    .line 164
    iput-object v2, v0, Ltn2;->r:Llk3;

    .line 165
    .line 166
    iget-object v1, v0, Ltn2;->c:Lwr2;

    .line 167
    .line 168
    const/4 v2, 0x1

    .line 169
    invoke-virtual {v1, v2, v2}, Lwr2;->a(ZZ)V

    .line 170
    .line 171
    .line 172
    :try_start_0
    iget-object v0, v0, Ltn2;->h:Lls2;

    .line 173
    .line 174
    iget-object v0, v0, Lls2;->i:Llr0;

    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    .line 178
    .line 179
    goto :goto_3

    .line 180
    :catch_0
    move-exception v0

    .line 181
    const-string v1, "MediaSessionImpl"

    .line 182
    .line 183
    const-string v2, "Exception in using media1 API"

    .line 184
    .line 185
    invoke-static {v1, v2, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    :goto_3
    return-void
.end method

.method public final F(Ldo2;)V
    .locals 39

    .line 1
    invoke-virtual/range {p0 .. p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p0

    .line 12
    .line 13
    iget-object v1, v1, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lal3;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    :goto_0
    return-void

    .line 24
    :cond_1
    iget-object v1, v0, Ltn2;->r:Llk3;

    .line 25
    .line 26
    iget-object v3, v1, Llk3;->a:Landroidx/media3/common/PlaybackException;

    .line 27
    .line 28
    iget v4, v1, Llk3;->b:I

    .line 29
    .line 30
    iget-object v5, v1, Llk3;->c:Lza4;

    .line 31
    .line 32
    iget-object v6, v1, Llk3;->d:Lpi3;

    .line 33
    .line 34
    iget-object v7, v1, Llk3;->e:Lpi3;

    .line 35
    .line 36
    iget v8, v1, Llk3;->f:I

    .line 37
    .line 38
    iget-object v9, v1, Llk3;->g:Lqh3;

    .line 39
    .line 40
    iget v10, v1, Llk3;->h:I

    .line 41
    .line 42
    iget-boolean v11, v1, Llk3;->i:Z

    .line 43
    .line 44
    iget-object v13, v1, Llk3;->j:Lcu4;

    .line 45
    .line 46
    iget v14, v1, Llk3;->k:I

    .line 47
    .line 48
    iget-object v12, v1, Llk3;->l:Ls55;

    .line 49
    .line 50
    iget-object v15, v1, Llk3;->m:Ldo2;

    .line 51
    .line 52
    iget v2, v1, Llk3;->n:F

    .line 53
    .line 54
    move/from16 v16, v2

    .line 55
    .line 56
    iget v2, v1, Llk3;->o:F

    .line 57
    .line 58
    move/from16 v17, v2

    .line 59
    .line 60
    iget v2, v1, Llk3;->p:I

    .line 61
    .line 62
    move/from16 v19, v2

    .line 63
    .line 64
    iget-object v2, v1, Llk3;->q:Lil;

    .line 65
    .line 66
    move-object/from16 v18, v2

    .line 67
    .line 68
    iget-object v2, v1, Llk3;->r:Ljg0;

    .line 69
    .line 70
    move-object/from16 v20, v2

    .line 71
    .line 72
    iget-object v2, v1, Llk3;->s:Lhp0;

    .line 73
    .line 74
    move-object/from16 v21, v2

    .line 75
    .line 76
    iget v2, v1, Llk3;->t:I

    .line 77
    .line 78
    move/from16 v22, v2

    .line 79
    .line 80
    iget-boolean v2, v1, Llk3;->u:Z

    .line 81
    .line 82
    move/from16 v23, v2

    .line 83
    .line 84
    iget-boolean v2, v1, Llk3;->v:Z

    .line 85
    .line 86
    move/from16 v24, v2

    .line 87
    .line 88
    iget v2, v1, Llk3;->w:I

    .line 89
    .line 90
    move/from16 v25, v2

    .line 91
    .line 92
    iget-boolean v2, v1, Llk3;->x:Z

    .line 93
    .line 94
    move/from16 v28, v2

    .line 95
    .line 96
    iget-boolean v2, v1, Llk3;->y:Z

    .line 97
    .line 98
    move/from16 v29, v2

    .line 99
    .line 100
    iget v2, v1, Llk3;->z:I

    .line 101
    .line 102
    move/from16 v26, v2

    .line 103
    .line 104
    iget v2, v1, Llk3;->A:I

    .line 105
    .line 106
    move/from16 v30, v2

    .line 107
    .line 108
    move-object/from16 v27, v3

    .line 109
    .line 110
    iget-wide v2, v1, Llk3;->C:J

    .line 111
    .line 112
    move-wide/from16 v31, v2

    .line 113
    .line 114
    iget-wide v2, v1, Llk3;->D:J

    .line 115
    .line 116
    move-wide/from16 v33, v2

    .line 117
    .line 118
    iget-wide v2, v1, Llk3;->E:J

    .line 119
    .line 120
    move-wide/from16 v35, v2

    .line 121
    .line 122
    iget-object v2, v1, Llk3;->F:Ljw4;

    .line 123
    .line 124
    iget-object v1, v1, Llk3;->G:Lcw4;

    .line 125
    .line 126
    invoke-virtual {v13}, Lcu4;->p()Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    move-object/from16 v38, v1

    .line 131
    .line 132
    if-nez v3, :cond_3

    .line 133
    .line 134
    iget-object v3, v5, Lza4;->a:Lpi3;

    .line 135
    .line 136
    iget v3, v3, Lpi3;->b:I

    .line 137
    .line 138
    invoke-virtual {v13}, Lcu4;->o()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-ge v3, v1, :cond_2

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_2
    const/4 v1, 0x0

    .line 146
    goto :goto_2

    .line 147
    :cond_3
    :goto_1
    const/4 v1, 0x1

    .line 148
    :goto_2
    invoke-static {v1}, Lrr2;->w(Z)V

    .line 149
    .line 150
    .line 151
    move-object/from16 v37, v2

    .line 152
    .line 153
    new-instance v2, Llk3;

    .line 154
    .line 155
    move-object/from16 v3, v27

    .line 156
    .line 157
    move/from16 v27, v30

    .line 158
    .line 159
    move-object/from16 v30, p1

    .line 160
    .line 161
    invoke-direct/range {v2 .. v38}, Llk3;-><init>(Landroidx/media3/common/PlaybackException;ILza4;Lpi3;Lpi3;ILqh3;IZLs55;Lcu4;ILdo2;FFLil;ILjg0;Lhp0;IZZIIIZZLdo2;JJJLjw4;Lcw4;)V

    .line 162
    .line 163
    .line 164
    iput-object v2, v0, Ltn2;->r:Llk3;

    .line 165
    .line 166
    iget-object v1, v0, Ltn2;->c:Lwr2;

    .line 167
    .line 168
    const/4 v2, 0x1

    .line 169
    invoke-virtual {v1, v2, v2}, Lwr2;->a(ZZ)V

    .line 170
    .line 171
    .line 172
    :try_start_0
    iget-object v0, v0, Ltn2;->h:Lls2;

    .line 173
    .line 174
    iget-object v0, v0, Lls2;->i:Llr0;

    .line 175
    .line 176
    invoke-virtual {v0}, Llr0;->x()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :catch_0
    move-exception v0

    .line 181
    const-string v1, "MediaSessionImpl"

    .line 182
    .line 183
    const-string v2, "Exception in using media1 API"

    .line 184
    .line 185
    invoke-static {v1, v2, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    return-void
.end method

.method public final G(Ldo2;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ltn2;->r:Llk3;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Llk3;->g(Ldo2;)Llk3;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Ltn2;->r:Llk3;

    .line 18
    .line 19
    iget-object v0, p0, Ltn2;->c:Lwr2;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, v1, v1}, Lwr2;->a(ZZ)V

    .line 23
    .line 24
    .line 25
    :try_start_0
    iget-object p0, p0, Ltn2;->h:Lls2;

    .line 26
    .line 27
    iget-object p0, p0, Lls2;->i:Llr0;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Llr0;->q(Ldo2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catch_0
    move-exception p0

    .line 34
    const-string p1, "MediaSessionImpl"

    .line 35
    .line 36
    const-string v0, "Exception in using media1 API"

    .line 37
    .line 38
    invoke-static {p1, v0, p0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final H(J)V
    .locals 39

    .line 1
    invoke-virtual/range {p0 .. p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p0

    .line 12
    .line 13
    iget-object v1, v1, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lal3;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    :goto_0
    return-void

    .line 24
    :cond_1
    iget-object v1, v0, Ltn2;->r:Llk3;

    .line 25
    .line 26
    iget-object v3, v1, Llk3;->a:Landroidx/media3/common/PlaybackException;

    .line 27
    .line 28
    iget v4, v1, Llk3;->b:I

    .line 29
    .line 30
    iget-object v5, v1, Llk3;->c:Lza4;

    .line 31
    .line 32
    iget-object v6, v1, Llk3;->d:Lpi3;

    .line 33
    .line 34
    iget-object v7, v1, Llk3;->e:Lpi3;

    .line 35
    .line 36
    iget v8, v1, Llk3;->f:I

    .line 37
    .line 38
    iget-object v9, v1, Llk3;->g:Lqh3;

    .line 39
    .line 40
    iget v10, v1, Llk3;->h:I

    .line 41
    .line 42
    iget-boolean v11, v1, Llk3;->i:Z

    .line 43
    .line 44
    iget-object v13, v1, Llk3;->j:Lcu4;

    .line 45
    .line 46
    iget v14, v1, Llk3;->k:I

    .line 47
    .line 48
    iget-object v12, v1, Llk3;->l:Ls55;

    .line 49
    .line 50
    iget-object v15, v1, Llk3;->m:Ldo2;

    .line 51
    .line 52
    iget v2, v1, Llk3;->n:F

    .line 53
    .line 54
    move/from16 v16, v2

    .line 55
    .line 56
    iget v2, v1, Llk3;->o:F

    .line 57
    .line 58
    move/from16 v17, v2

    .line 59
    .line 60
    iget v2, v1, Llk3;->p:I

    .line 61
    .line 62
    move/from16 v19, v2

    .line 63
    .line 64
    iget-object v2, v1, Llk3;->q:Lil;

    .line 65
    .line 66
    move-object/from16 v18, v2

    .line 67
    .line 68
    iget-object v2, v1, Llk3;->r:Ljg0;

    .line 69
    .line 70
    move-object/from16 v20, v2

    .line 71
    .line 72
    iget-object v2, v1, Llk3;->s:Lhp0;

    .line 73
    .line 74
    move-object/from16 v21, v2

    .line 75
    .line 76
    iget v2, v1, Llk3;->t:I

    .line 77
    .line 78
    move/from16 v22, v2

    .line 79
    .line 80
    iget-boolean v2, v1, Llk3;->u:Z

    .line 81
    .line 82
    move/from16 v23, v2

    .line 83
    .line 84
    iget-boolean v2, v1, Llk3;->v:Z

    .line 85
    .line 86
    move/from16 v24, v2

    .line 87
    .line 88
    iget v2, v1, Llk3;->w:I

    .line 89
    .line 90
    move/from16 v25, v2

    .line 91
    .line 92
    iget-boolean v2, v1, Llk3;->x:Z

    .line 93
    .line 94
    move/from16 v28, v2

    .line 95
    .line 96
    iget-boolean v2, v1, Llk3;->y:Z

    .line 97
    .line 98
    move/from16 v29, v2

    .line 99
    .line 100
    iget v2, v1, Llk3;->z:I

    .line 101
    .line 102
    move/from16 v26, v2

    .line 103
    .line 104
    iget v2, v1, Llk3;->A:I

    .line 105
    .line 106
    move/from16 v27, v2

    .line 107
    .line 108
    iget-object v2, v1, Llk3;->B:Ldo2;

    .line 109
    .line 110
    move-object/from16 v31, v2

    .line 111
    .line 112
    move-object/from16 v30, v3

    .line 113
    .line 114
    iget-wide v2, v1, Llk3;->C:J

    .line 115
    .line 116
    move-wide/from16 v32, v2

    .line 117
    .line 118
    iget-wide v2, v1, Llk3;->E:J

    .line 119
    .line 120
    move-wide/from16 v35, v2

    .line 121
    .line 122
    iget-object v2, v1, Llk3;->F:Ljw4;

    .line 123
    .line 124
    iget-object v1, v1, Llk3;->G:Lcw4;

    .line 125
    .line 126
    invoke-virtual {v13}, Lcu4;->p()Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    move-object/from16 v38, v1

    .line 131
    .line 132
    if-nez v3, :cond_3

    .line 133
    .line 134
    iget-object v3, v5, Lza4;->a:Lpi3;

    .line 135
    .line 136
    iget v3, v3, Lpi3;->b:I

    .line 137
    .line 138
    invoke-virtual {v13}, Lcu4;->o()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-ge v3, v1, :cond_2

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_2
    const/4 v1, 0x0

    .line 146
    goto :goto_2

    .line 147
    :cond_3
    :goto_1
    const/4 v1, 0x1

    .line 148
    :goto_2
    invoke-static {v1}, Lrr2;->w(Z)V

    .line 149
    .line 150
    .line 151
    move-object/from16 v37, v2

    .line 152
    .line 153
    new-instance v2, Llk3;

    .line 154
    .line 155
    move-object/from16 v3, v30

    .line 156
    .line 157
    move-object/from16 v30, v31

    .line 158
    .line 159
    move-wide/from16 v31, v32

    .line 160
    .line 161
    move-wide/from16 v33, p1

    .line 162
    .line 163
    invoke-direct/range {v2 .. v38}, Llk3;-><init>(Landroidx/media3/common/PlaybackException;ILza4;Lpi3;Lpi3;ILqh3;IZLs55;Lcu4;ILdo2;FFLil;ILjg0;Lhp0;IZZIIIZZLdo2;JJJLjw4;Lcw4;)V

    .line 164
    .line 165
    .line 166
    iput-object v2, v0, Ltn2;->r:Llk3;

    .line 167
    .line 168
    iget-object v1, v0, Ltn2;->c:Lwr2;

    .line 169
    .line 170
    const/4 v2, 0x1

    .line 171
    invoke-virtual {v1, v2, v2}, Lwr2;->a(ZZ)V

    .line 172
    .line 173
    .line 174
    :try_start_0
    iget-object v0, v0, Ltn2;->h:Lls2;

    .line 175
    .line 176
    iget-object v0, v0, Lls2;->i:Llr0;

    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 179
    .line 180
    .line 181
    goto :goto_3

    .line 182
    :catch_0
    move-exception v0

    .line 183
    const-string v1, "MediaSessionImpl"

    .line 184
    .line 185
    const-string v2, "Exception in using media1 API"

    .line 186
    .line 187
    invoke-static {v1, v2, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 188
    .line 189
    .line 190
    :goto_3
    return-void
.end method

.method public final I(Lcu4;I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lal3;

    .line 18
    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    iget-object v1, v0, Ltn2;->r:Llk3;

    .line 23
    .line 24
    invoke-virtual {p0}, Lal3;->X0()Lza4;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {v1, p1, p0, p2}, Llk3;->n(Lcu4;Lza4;I)Llk3;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    iput-object p0, v0, Ltn2;->r:Llk3;

    .line 33
    .line 34
    iget-object p0, v0, Ltn2;->c:Lwr2;

    .line 35
    .line 36
    const/4 p2, 0x1

    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-virtual {p0, v1, p2}, Lwr2;->a(ZZ)V

    .line 39
    .line 40
    .line 41
    :try_start_0
    iget-object p0, v0, Ltn2;->h:Lls2;

    .line 42
    .line 43
    iget-object p0, p0, Lls2;->i:Llr0;

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Llr0;->w(Lcu4;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catch_0
    move-exception p0

    .line 50
    const-string p1, "MediaSessionImpl"

    .line 51
    .line 52
    const-string p2, "Exception in using media1 API"

    .line 53
    .line 54
    invoke-static {p1, p2, p0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final J()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ltn2;->g:Lkt2;

    .line 12
    .line 13
    iget-object v0, v0, Lkt2;->f:Lna4;

    .line 14
    .line 15
    invoke-virtual {v0}, Lna4;->u()Lyw1;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_0
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-ge v2, v3, :cond_1

    .line 25
    .line 26
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Lfr2;

    .line 31
    .line 32
    invoke-virtual {v0, v3}, Lna4;->A(Lfr2;)Landroidx/media3/common/PlaybackException;

    .line 33
    .line 34
    .line 35
    new-instance v4, Ler1;

    .line 36
    .line 37
    const/16 v5, 0x1d

    .line 38
    .line 39
    invoke-direct {v4, v5}, Ler1;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v3, v4}, Ltn2;->e(Lfr2;Lyr2;)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    :goto_1
    return-void
.end method

.method public final N(Lqh3;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lal3;

    .line 18
    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    iget-object p0, v0, Ltn2;->r:Llk3;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Llk3;->e(Lqh3;)Llk3;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    iput-object p0, v0, Ltn2;->r:Llk3;

    .line 29
    .line 30
    iget-object p0, v0, Ltn2;->c:Lwr2;

    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    invoke-virtual {p0, p1, p1}, Lwr2;->a(ZZ)V

    .line 34
    .line 35
    .line 36
    :try_start_0
    iget-object p0, v0, Ltn2;->h:Lls2;

    .line 37
    .line 38
    iget-object p0, p0, Lls2;->i:Llr0;

    .line 39
    .line 40
    iget-object p0, p0, Llr0;->r:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Lls2;

    .line 43
    .line 44
    iget-object p1, p0, Lls2;->g:Ltn2;

    .line 45
    .line 46
    iget-object p1, p1, Ltn2;->s:Lal3;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lls2;->P(Lal3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :catch_0
    move-exception p0

    .line 53
    const-string p1, "MediaSessionImpl"

    .line 54
    .line 55
    const-string v0, "Exception in using media1 API"

    .line 56
    .line 57
    invoke-static {p1, v0, p0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final O(Lmi3;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lal3;

    .line 18
    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    invoke-virtual {v0, p1}, Ltn2;->h(Lmi3;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final Q(Lhp0;)V
    .locals 39

    .line 1
    invoke-virtual/range {p0 .. p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p0

    .line 12
    .line 13
    iget-object v1, v1, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lal3;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    :goto_0
    return-void

    .line 24
    :cond_1
    iget-object v1, v0, Ltn2;->r:Llk3;

    .line 25
    .line 26
    iget-object v3, v1, Llk3;->a:Landroidx/media3/common/PlaybackException;

    .line 27
    .line 28
    iget v4, v1, Llk3;->b:I

    .line 29
    .line 30
    iget-object v5, v1, Llk3;->c:Lza4;

    .line 31
    .line 32
    iget-object v6, v1, Llk3;->d:Lpi3;

    .line 33
    .line 34
    iget-object v7, v1, Llk3;->e:Lpi3;

    .line 35
    .line 36
    iget v8, v1, Llk3;->f:I

    .line 37
    .line 38
    iget-object v9, v1, Llk3;->g:Lqh3;

    .line 39
    .line 40
    iget v10, v1, Llk3;->h:I

    .line 41
    .line 42
    iget-boolean v11, v1, Llk3;->i:Z

    .line 43
    .line 44
    iget-object v13, v1, Llk3;->j:Lcu4;

    .line 45
    .line 46
    iget v14, v1, Llk3;->k:I

    .line 47
    .line 48
    iget-object v12, v1, Llk3;->l:Ls55;

    .line 49
    .line 50
    iget-object v15, v1, Llk3;->m:Ldo2;

    .line 51
    .line 52
    iget v2, v1, Llk3;->n:F

    .line 53
    .line 54
    move/from16 v16, v2

    .line 55
    .line 56
    iget v2, v1, Llk3;->o:F

    .line 57
    .line 58
    move/from16 v17, v2

    .line 59
    .line 60
    iget v2, v1, Llk3;->p:I

    .line 61
    .line 62
    move/from16 v19, v2

    .line 63
    .line 64
    iget-object v2, v1, Llk3;->q:Lil;

    .line 65
    .line 66
    move-object/from16 v18, v2

    .line 67
    .line 68
    iget-object v2, v1, Llk3;->r:Ljg0;

    .line 69
    .line 70
    move-object/from16 v20, v2

    .line 71
    .line 72
    iget v2, v1, Llk3;->t:I

    .line 73
    .line 74
    move/from16 v22, v2

    .line 75
    .line 76
    iget-boolean v2, v1, Llk3;->u:Z

    .line 77
    .line 78
    move/from16 v23, v2

    .line 79
    .line 80
    iget-boolean v2, v1, Llk3;->v:Z

    .line 81
    .line 82
    move/from16 v24, v2

    .line 83
    .line 84
    iget v2, v1, Llk3;->w:I

    .line 85
    .line 86
    move/from16 v25, v2

    .line 87
    .line 88
    iget-boolean v2, v1, Llk3;->x:Z

    .line 89
    .line 90
    move/from16 v28, v2

    .line 91
    .line 92
    iget-boolean v2, v1, Llk3;->y:Z

    .line 93
    .line 94
    move/from16 v29, v2

    .line 95
    .line 96
    iget v2, v1, Llk3;->z:I

    .line 97
    .line 98
    move/from16 v26, v2

    .line 99
    .line 100
    iget v2, v1, Llk3;->A:I

    .line 101
    .line 102
    move/from16 v27, v2

    .line 103
    .line 104
    iget-object v2, v1, Llk3;->B:Ldo2;

    .line 105
    .line 106
    move-object/from16 v30, v2

    .line 107
    .line 108
    move-object/from16 v21, v3

    .line 109
    .line 110
    iget-wide v2, v1, Llk3;->C:J

    .line 111
    .line 112
    move-wide/from16 v31, v2

    .line 113
    .line 114
    iget-wide v2, v1, Llk3;->D:J

    .line 115
    .line 116
    move-wide/from16 v33, v2

    .line 117
    .line 118
    iget-wide v2, v1, Llk3;->E:J

    .line 119
    .line 120
    move-wide/from16 v35, v2

    .line 121
    .line 122
    iget-object v2, v1, Llk3;->F:Ljw4;

    .line 123
    .line 124
    iget-object v1, v1, Llk3;->G:Lcw4;

    .line 125
    .line 126
    invoke-virtual {v13}, Lcu4;->p()Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    move-object/from16 v38, v1

    .line 131
    .line 132
    if-nez v3, :cond_3

    .line 133
    .line 134
    iget-object v3, v5, Lza4;->a:Lpi3;

    .line 135
    .line 136
    iget v3, v3, Lpi3;->b:I

    .line 137
    .line 138
    invoke-virtual {v13}, Lcu4;->o()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-ge v3, v1, :cond_2

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_2
    const/4 v1, 0x0

    .line 146
    goto :goto_2

    .line 147
    :cond_3
    :goto_1
    const/4 v1, 0x1

    .line 148
    :goto_2
    invoke-static {v1}, Lrr2;->w(Z)V

    .line 149
    .line 150
    .line 151
    move-object/from16 v37, v2

    .line 152
    .line 153
    new-instance v2, Llk3;

    .line 154
    .line 155
    move-object/from16 v3, v21

    .line 156
    .line 157
    move-object/from16 v21, p1

    .line 158
    .line 159
    invoke-direct/range {v2 .. v38}, Llk3;-><init>(Landroidx/media3/common/PlaybackException;ILza4;Lpi3;Lpi3;ILqh3;IZLs55;Lcu4;ILdo2;FFLil;ILjg0;Lhp0;IZZIIIZZLdo2;JJJLjw4;Lcw4;)V

    .line 160
    .line 161
    .line 162
    iput-object v2, v0, Ltn2;->r:Llk3;

    .line 163
    .line 164
    iget-object v1, v0, Ltn2;->c:Lwr2;

    .line 165
    .line 166
    const/4 v2, 0x1

    .line 167
    invoke-virtual {v1, v2, v2}, Lwr2;->a(ZZ)V

    .line 168
    .line 169
    .line 170
    :try_start_0
    iget-object v0, v0, Ltn2;->h:Lls2;

    .line 171
    .line 172
    iget-object v0, v0, Lls2;->i:Llr0;

    .line 173
    .line 174
    invoke-virtual {v0}, Llr0;->j()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :catch_0
    move-exception v0

    .line 179
    const-string v1, "MediaSessionImpl"

    .line 180
    .line 181
    const-string v2, "Exception in using media1 API"

    .line 182
    .line 183
    invoke-static {v1, v2, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 184
    .line 185
    .line 186
    return-void
.end method

.method public final R(J)V
    .locals 39

    .line 1
    invoke-virtual/range {p0 .. p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p0

    .line 12
    .line 13
    iget-object v1, v1, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lal3;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    :goto_0
    return-void

    .line 24
    :cond_1
    iget-object v1, v0, Ltn2;->r:Llk3;

    .line 25
    .line 26
    iget-object v3, v1, Llk3;->a:Landroidx/media3/common/PlaybackException;

    .line 27
    .line 28
    iget v4, v1, Llk3;->b:I

    .line 29
    .line 30
    iget-object v5, v1, Llk3;->c:Lza4;

    .line 31
    .line 32
    iget-object v6, v1, Llk3;->d:Lpi3;

    .line 33
    .line 34
    iget-object v7, v1, Llk3;->e:Lpi3;

    .line 35
    .line 36
    iget v8, v1, Llk3;->f:I

    .line 37
    .line 38
    iget-object v9, v1, Llk3;->g:Lqh3;

    .line 39
    .line 40
    iget v10, v1, Llk3;->h:I

    .line 41
    .line 42
    iget-boolean v11, v1, Llk3;->i:Z

    .line 43
    .line 44
    iget-object v13, v1, Llk3;->j:Lcu4;

    .line 45
    .line 46
    iget v14, v1, Llk3;->k:I

    .line 47
    .line 48
    iget-object v12, v1, Llk3;->l:Ls55;

    .line 49
    .line 50
    iget-object v15, v1, Llk3;->m:Ldo2;

    .line 51
    .line 52
    iget v2, v1, Llk3;->n:F

    .line 53
    .line 54
    move/from16 v16, v2

    .line 55
    .line 56
    iget v2, v1, Llk3;->o:F

    .line 57
    .line 58
    move/from16 v17, v2

    .line 59
    .line 60
    iget v2, v1, Llk3;->p:I

    .line 61
    .line 62
    move/from16 v19, v2

    .line 63
    .line 64
    iget-object v2, v1, Llk3;->q:Lil;

    .line 65
    .line 66
    move-object/from16 v18, v2

    .line 67
    .line 68
    iget-object v2, v1, Llk3;->r:Ljg0;

    .line 69
    .line 70
    move-object/from16 v20, v2

    .line 71
    .line 72
    iget-object v2, v1, Llk3;->s:Lhp0;

    .line 73
    .line 74
    move-object/from16 v21, v2

    .line 75
    .line 76
    iget v2, v1, Llk3;->t:I

    .line 77
    .line 78
    move/from16 v22, v2

    .line 79
    .line 80
    iget-boolean v2, v1, Llk3;->u:Z

    .line 81
    .line 82
    move/from16 v23, v2

    .line 83
    .line 84
    iget-boolean v2, v1, Llk3;->v:Z

    .line 85
    .line 86
    move/from16 v24, v2

    .line 87
    .line 88
    iget v2, v1, Llk3;->w:I

    .line 89
    .line 90
    move/from16 v25, v2

    .line 91
    .line 92
    iget-boolean v2, v1, Llk3;->x:Z

    .line 93
    .line 94
    move/from16 v28, v2

    .line 95
    .line 96
    iget-boolean v2, v1, Llk3;->y:Z

    .line 97
    .line 98
    move/from16 v29, v2

    .line 99
    .line 100
    iget v2, v1, Llk3;->z:I

    .line 101
    .line 102
    move/from16 v26, v2

    .line 103
    .line 104
    iget v2, v1, Llk3;->A:I

    .line 105
    .line 106
    move/from16 v27, v2

    .line 107
    .line 108
    iget-object v2, v1, Llk3;->B:Ldo2;

    .line 109
    .line 110
    move-object/from16 v31, v2

    .line 111
    .line 112
    move-object/from16 v30, v3

    .line 113
    .line 114
    iget-wide v2, v1, Llk3;->C:J

    .line 115
    .line 116
    move-wide/from16 v32, v2

    .line 117
    .line 118
    iget-wide v2, v1, Llk3;->D:J

    .line 119
    .line 120
    move-wide/from16 v34, v2

    .line 121
    .line 122
    iget-object v2, v1, Llk3;->F:Ljw4;

    .line 123
    .line 124
    iget-object v1, v1, Llk3;->G:Lcw4;

    .line 125
    .line 126
    invoke-virtual {v13}, Lcu4;->p()Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    move-object/from16 v38, v1

    .line 131
    .line 132
    if-nez v3, :cond_3

    .line 133
    .line 134
    iget-object v3, v5, Lza4;->a:Lpi3;

    .line 135
    .line 136
    iget v3, v3, Lpi3;->b:I

    .line 137
    .line 138
    invoke-virtual {v13}, Lcu4;->o()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-ge v3, v1, :cond_2

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_2
    const/4 v1, 0x0

    .line 146
    goto :goto_2

    .line 147
    :cond_3
    :goto_1
    const/4 v1, 0x1

    .line 148
    :goto_2
    invoke-static {v1}, Lrr2;->w(Z)V

    .line 149
    .line 150
    .line 151
    move-object/from16 v37, v2

    .line 152
    .line 153
    new-instance v2, Llk3;

    .line 154
    .line 155
    move-object/from16 v3, v30

    .line 156
    .line 157
    move-object/from16 v30, v31

    .line 158
    .line 159
    move-wide/from16 v31, v32

    .line 160
    .line 161
    move-wide/from16 v33, v34

    .line 162
    .line 163
    move-wide/from16 v35, p1

    .line 164
    .line 165
    invoke-direct/range {v2 .. v38}, Llk3;-><init>(Landroidx/media3/common/PlaybackException;ILza4;Lpi3;Lpi3;ILqh3;IZLs55;Lcu4;ILdo2;FFLil;ILjg0;Lhp0;IZZIIIZZLdo2;JJJLjw4;Lcw4;)V

    .line 166
    .line 167
    .line 168
    iput-object v2, v0, Ltn2;->r:Llk3;

    .line 169
    .line 170
    iget-object v0, v0, Ltn2;->c:Lwr2;

    .line 171
    .line 172
    const/4 v1, 0x1

    .line 173
    invoke-virtual {v0, v1, v1}, Lwr2;->a(ZZ)V

    .line 174
    .line 175
    .line 176
    return-void
.end method

.method public final S(Landroidx/media3/common/PlaybackException;)V
    .locals 39

    .line 1
    invoke-virtual/range {p0 .. p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p0

    .line 12
    .line 13
    iget-object v1, v1, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lal3;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    :goto_0
    return-void

    .line 24
    :cond_1
    iget-object v1, v0, Ltn2;->r:Llk3;

    .line 25
    .line 26
    iget v4, v1, Llk3;->b:I

    .line 27
    .line 28
    iget-object v5, v1, Llk3;->c:Lza4;

    .line 29
    .line 30
    iget-object v6, v1, Llk3;->d:Lpi3;

    .line 31
    .line 32
    iget-object v7, v1, Llk3;->e:Lpi3;

    .line 33
    .line 34
    iget v8, v1, Llk3;->f:I

    .line 35
    .line 36
    iget-object v9, v1, Llk3;->g:Lqh3;

    .line 37
    .line 38
    iget v10, v1, Llk3;->h:I

    .line 39
    .line 40
    iget-boolean v11, v1, Llk3;->i:Z

    .line 41
    .line 42
    iget-object v13, v1, Llk3;->j:Lcu4;

    .line 43
    .line 44
    iget v14, v1, Llk3;->k:I

    .line 45
    .line 46
    iget-object v12, v1, Llk3;->l:Ls55;

    .line 47
    .line 48
    iget-object v15, v1, Llk3;->m:Ldo2;

    .line 49
    .line 50
    iget v2, v1, Llk3;->n:F

    .line 51
    .line 52
    iget v3, v1, Llk3;->o:F

    .line 53
    .line 54
    move/from16 v16, v2

    .line 55
    .line 56
    iget v2, v1, Llk3;->p:I

    .line 57
    .line 58
    move/from16 v19, v2

    .line 59
    .line 60
    iget-object v2, v1, Llk3;->q:Lil;

    .line 61
    .line 62
    move-object/from16 v18, v2

    .line 63
    .line 64
    iget-object v2, v1, Llk3;->r:Ljg0;

    .line 65
    .line 66
    move-object/from16 v20, v2

    .line 67
    .line 68
    iget-object v2, v1, Llk3;->s:Lhp0;

    .line 69
    .line 70
    move-object/from16 v21, v2

    .line 71
    .line 72
    iget v2, v1, Llk3;->t:I

    .line 73
    .line 74
    move/from16 v22, v2

    .line 75
    .line 76
    iget-boolean v2, v1, Llk3;->u:Z

    .line 77
    .line 78
    move/from16 v23, v2

    .line 79
    .line 80
    iget-boolean v2, v1, Llk3;->v:Z

    .line 81
    .line 82
    move/from16 v24, v2

    .line 83
    .line 84
    iget v2, v1, Llk3;->w:I

    .line 85
    .line 86
    move/from16 v25, v2

    .line 87
    .line 88
    iget-boolean v2, v1, Llk3;->x:Z

    .line 89
    .line 90
    move/from16 v28, v2

    .line 91
    .line 92
    iget-boolean v2, v1, Llk3;->y:Z

    .line 93
    .line 94
    move/from16 v29, v2

    .line 95
    .line 96
    iget v2, v1, Llk3;->z:I

    .line 97
    .line 98
    move/from16 v26, v2

    .line 99
    .line 100
    iget v2, v1, Llk3;->A:I

    .line 101
    .line 102
    move/from16 v27, v2

    .line 103
    .line 104
    iget-object v2, v1, Llk3;->B:Ldo2;

    .line 105
    .line 106
    move-object/from16 v30, v2

    .line 107
    .line 108
    move/from16 v17, v3

    .line 109
    .line 110
    iget-wide v2, v1, Llk3;->C:J

    .line 111
    .line 112
    move-wide/from16 v31, v2

    .line 113
    .line 114
    iget-wide v2, v1, Llk3;->D:J

    .line 115
    .line 116
    move-wide/from16 v33, v2

    .line 117
    .line 118
    iget-wide v2, v1, Llk3;->E:J

    .line 119
    .line 120
    move-wide/from16 v35, v2

    .line 121
    .line 122
    iget-object v2, v1, Llk3;->F:Ljw4;

    .line 123
    .line 124
    iget-object v1, v1, Llk3;->G:Lcw4;

    .line 125
    .line 126
    invoke-virtual {v13}, Lcu4;->p()Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    move-object/from16 v38, v1

    .line 131
    .line 132
    if-nez v3, :cond_3

    .line 133
    .line 134
    iget-object v3, v5, Lza4;->a:Lpi3;

    .line 135
    .line 136
    iget v3, v3, Lpi3;->b:I

    .line 137
    .line 138
    invoke-virtual {v13}, Lcu4;->o()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-ge v3, v1, :cond_2

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_2
    const/4 v1, 0x0

    .line 146
    goto :goto_2

    .line 147
    :cond_3
    :goto_1
    const/4 v1, 0x1

    .line 148
    :goto_2
    invoke-static {v1}, Lrr2;->w(Z)V

    .line 149
    .line 150
    .line 151
    move-object/from16 v37, v2

    .line 152
    .line 153
    new-instance v2, Llk3;

    .line 154
    .line 155
    move-object/from16 v3, p1

    .line 156
    .line 157
    invoke-direct/range {v2 .. v38}, Llk3;-><init>(Landroidx/media3/common/PlaybackException;ILza4;Lpi3;Lpi3;ILqh3;IZLs55;Lcu4;ILdo2;FFLil;ILjg0;Lhp0;IZZIIIZZLdo2;JJJLjw4;Lcw4;)V

    .line 158
    .line 159
    .line 160
    iput-object v2, v0, Ltn2;->r:Llk3;

    .line 161
    .line 162
    iget-object v1, v0, Ltn2;->c:Lwr2;

    .line 163
    .line 164
    const/4 v2, 0x1

    .line 165
    invoke-virtual {v1, v2, v2}, Lwr2;->a(ZZ)V

    .line 166
    .line 167
    .line 168
    :try_start_0
    iget-object v0, v0, Ltn2;->h:Lls2;

    .line 169
    .line 170
    iget-object v0, v0, Lls2;->i:Llr0;

    .line 171
    .line 172
    iget-object v0, v0, Llr0;->r:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, Lls2;

    .line 175
    .line 176
    iget-object v1, v0, Lls2;->g:Ltn2;

    .line 177
    .line 178
    iget-object v1, v1, Ltn2;->s:Lal3;

    .line 179
    .line 180
    invoke-virtual {v0, v1}, Lls2;->P(Lal3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :catch_0
    move-exception v0

    .line 185
    const-string v1, "MediaSessionImpl"

    .line 186
    .line 187
    const-string v2, "Exception in using media1 API"

    .line 188
    .line 189
    invoke-static {v1, v2, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    return-void
.end method

.method public final T(II)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lal3;

    .line 18
    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    new-instance p0, Lv31;

    .line 23
    .line 24
    const/4 v1, 0x3

    .line 25
    invoke-direct {p0, p1, p2, v1}, Lv31;-><init>(III)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ltn2;->f(Lyr2;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final V(Z)V
    .locals 39

    .line 1
    invoke-virtual/range {p0 .. p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    move-object/from16 v0, p0

    .line 12
    .line 13
    iget-object v0, v0, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lal3;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    :goto_0
    return-void

    .line 24
    :cond_1
    iget-object v0, v1, Ltn2;->r:Llk3;

    .line 25
    .line 26
    iget-object v3, v0, Llk3;->a:Landroidx/media3/common/PlaybackException;

    .line 27
    .line 28
    iget v4, v0, Llk3;->b:I

    .line 29
    .line 30
    iget-object v5, v0, Llk3;->c:Lza4;

    .line 31
    .line 32
    iget-object v6, v0, Llk3;->d:Lpi3;

    .line 33
    .line 34
    iget-object v7, v0, Llk3;->e:Lpi3;

    .line 35
    .line 36
    iget v8, v0, Llk3;->f:I

    .line 37
    .line 38
    iget-object v9, v0, Llk3;->g:Lqh3;

    .line 39
    .line 40
    iget v10, v0, Llk3;->h:I

    .line 41
    .line 42
    iget-boolean v11, v0, Llk3;->i:Z

    .line 43
    .line 44
    iget-object v13, v0, Llk3;->j:Lcu4;

    .line 45
    .line 46
    iget v14, v0, Llk3;->k:I

    .line 47
    .line 48
    iget-object v12, v0, Llk3;->l:Ls55;

    .line 49
    .line 50
    iget-object v15, v0, Llk3;->m:Ldo2;

    .line 51
    .line 52
    iget v2, v0, Llk3;->n:F

    .line 53
    .line 54
    move/from16 v16, v2

    .line 55
    .line 56
    iget v2, v0, Llk3;->o:F

    .line 57
    .line 58
    move/from16 v17, v2

    .line 59
    .line 60
    iget v2, v0, Llk3;->p:I

    .line 61
    .line 62
    move/from16 v19, v2

    .line 63
    .line 64
    iget-object v2, v0, Llk3;->q:Lil;

    .line 65
    .line 66
    move-object/from16 v18, v2

    .line 67
    .line 68
    iget-object v2, v0, Llk3;->r:Ljg0;

    .line 69
    .line 70
    move-object/from16 v20, v2

    .line 71
    .line 72
    iget-object v2, v0, Llk3;->s:Lhp0;

    .line 73
    .line 74
    move-object/from16 v21, v2

    .line 75
    .line 76
    iget v2, v0, Llk3;->t:I

    .line 77
    .line 78
    move/from16 v22, v2

    .line 79
    .line 80
    iget-boolean v2, v0, Llk3;->u:Z

    .line 81
    .line 82
    move/from16 v23, v2

    .line 83
    .line 84
    iget-boolean v2, v0, Llk3;->v:Z

    .line 85
    .line 86
    move/from16 v24, v2

    .line 87
    .line 88
    iget v2, v0, Llk3;->w:I

    .line 89
    .line 90
    move/from16 v25, v2

    .line 91
    .line 92
    iget-boolean v2, v0, Llk3;->y:Z

    .line 93
    .line 94
    move/from16 v29, v2

    .line 95
    .line 96
    iget v2, v0, Llk3;->z:I

    .line 97
    .line 98
    move/from16 v26, v2

    .line 99
    .line 100
    iget v2, v0, Llk3;->A:I

    .line 101
    .line 102
    move/from16 v27, v2

    .line 103
    .line 104
    iget-object v2, v0, Llk3;->B:Ldo2;

    .line 105
    .line 106
    move-object/from16 v30, v2

    .line 107
    .line 108
    move-object/from16 v28, v3

    .line 109
    .line 110
    iget-wide v2, v0, Llk3;->C:J

    .line 111
    .line 112
    move-wide/from16 v31, v2

    .line 113
    .line 114
    iget-wide v2, v0, Llk3;->D:J

    .line 115
    .line 116
    move-wide/from16 v33, v2

    .line 117
    .line 118
    iget-wide v2, v0, Llk3;->E:J

    .line 119
    .line 120
    move-wide/from16 v35, v2

    .line 121
    .line 122
    iget-object v2, v0, Llk3;->F:Ljw4;

    .line 123
    .line 124
    iget-object v0, v0, Llk3;->G:Lcw4;

    .line 125
    .line 126
    invoke-virtual {v13}, Lcu4;->p()Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    move-object/from16 v38, v0

    .line 131
    .line 132
    if-nez v3, :cond_3

    .line 133
    .line 134
    iget-object v3, v5, Lza4;->a:Lpi3;

    .line 135
    .line 136
    iget v3, v3, Lpi3;->b:I

    .line 137
    .line 138
    invoke-virtual {v13}, Lcu4;->o()I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-ge v3, v0, :cond_2

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_2
    const/4 v0, 0x0

    .line 146
    goto :goto_2

    .line 147
    :cond_3
    :goto_1
    const/4 v0, 0x1

    .line 148
    :goto_2
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 149
    .line 150
    .line 151
    move-object/from16 v37, v2

    .line 152
    .line 153
    new-instance v2, Llk3;

    .line 154
    .line 155
    move-object/from16 v3, v28

    .line 156
    .line 157
    move/from16 v28, p1

    .line 158
    .line 159
    invoke-direct/range {v2 .. v38}, Llk3;-><init>(Landroidx/media3/common/PlaybackException;ILza4;Lpi3;Lpi3;ILqh3;IZLs55;Lcu4;ILdo2;FFLil;ILjg0;Lhp0;IZZIIIZZLdo2;JJJLjw4;Lcw4;)V

    .line 160
    .line 161
    .line 162
    iput-object v2, v1, Ltn2;->r:Llk3;

    .line 163
    .line 164
    iget-object v0, v1, Ltn2;->c:Lwr2;

    .line 165
    .line 166
    const/4 v2, 0x1

    .line 167
    invoke-virtual {v0, v2, v2}, Lwr2;->a(ZZ)V

    .line 168
    .line 169
    .line 170
    :try_start_0
    iget-object v0, v1, Ltn2;->h:Lls2;

    .line 171
    .line 172
    iget-object v0, v0, Lls2;->i:Llr0;

    .line 173
    .line 174
    iget-object v0, v0, Llr0;->r:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v0, Lls2;

    .line 177
    .line 178
    iget-object v2, v0, Lls2;->g:Ltn2;

    .line 179
    .line 180
    iget-object v2, v2, Ltn2;->s:Lal3;

    .line 181
    .line 182
    invoke-virtual {v0, v2}, Lls2;->P(Lal3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 183
    .line 184
    .line 185
    goto :goto_3

    .line 186
    :catch_0
    move-exception v0

    .line 187
    const-string v2, "MediaSessionImpl"

    .line 188
    .line 189
    const-string v3, "Exception in using media1 API"

    .line 190
    .line 191
    invoke-static {v2, v3, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 192
    .line 193
    .line 194
    :goto_3
    invoke-virtual {v1}, Ltn2;->C()V

    .line 195
    .line 196
    .line 197
    return-void
.end method

.method public final a(Ls55;)V
    .locals 39

    .line 1
    invoke-virtual/range {p0 .. p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Ltn2;->r:Llk3;

    .line 12
    .line 13
    iget-object v3, v1, Llk3;->a:Landroidx/media3/common/PlaybackException;

    .line 14
    .line 15
    iget v4, v1, Llk3;->b:I

    .line 16
    .line 17
    iget-object v5, v1, Llk3;->c:Lza4;

    .line 18
    .line 19
    iget-object v6, v1, Llk3;->d:Lpi3;

    .line 20
    .line 21
    iget-object v7, v1, Llk3;->e:Lpi3;

    .line 22
    .line 23
    iget v8, v1, Llk3;->f:I

    .line 24
    .line 25
    iget-object v9, v1, Llk3;->g:Lqh3;

    .line 26
    .line 27
    iget v10, v1, Llk3;->h:I

    .line 28
    .line 29
    iget-boolean v11, v1, Llk3;->i:Z

    .line 30
    .line 31
    iget-object v13, v1, Llk3;->j:Lcu4;

    .line 32
    .line 33
    iget v14, v1, Llk3;->k:I

    .line 34
    .line 35
    iget-object v15, v1, Llk3;->m:Ldo2;

    .line 36
    .line 37
    iget v2, v1, Llk3;->n:F

    .line 38
    .line 39
    iget v12, v1, Llk3;->o:F

    .line 40
    .line 41
    move/from16 v16, v2

    .line 42
    .line 43
    iget v2, v1, Llk3;->p:I

    .line 44
    .line 45
    move/from16 v19, v2

    .line 46
    .line 47
    iget-object v2, v1, Llk3;->q:Lil;

    .line 48
    .line 49
    move-object/from16 v18, v2

    .line 50
    .line 51
    iget-object v2, v1, Llk3;->r:Ljg0;

    .line 52
    .line 53
    move-object/from16 v20, v2

    .line 54
    .line 55
    iget-object v2, v1, Llk3;->s:Lhp0;

    .line 56
    .line 57
    move-object/from16 v21, v2

    .line 58
    .line 59
    iget v2, v1, Llk3;->t:I

    .line 60
    .line 61
    move/from16 v22, v2

    .line 62
    .line 63
    iget-boolean v2, v1, Llk3;->u:Z

    .line 64
    .line 65
    move/from16 v23, v2

    .line 66
    .line 67
    iget-boolean v2, v1, Llk3;->v:Z

    .line 68
    .line 69
    move/from16 v24, v2

    .line 70
    .line 71
    iget v2, v1, Llk3;->w:I

    .line 72
    .line 73
    move/from16 v25, v2

    .line 74
    .line 75
    iget-boolean v2, v1, Llk3;->x:Z

    .line 76
    .line 77
    move/from16 v28, v2

    .line 78
    .line 79
    iget-boolean v2, v1, Llk3;->y:Z

    .line 80
    .line 81
    move/from16 v29, v2

    .line 82
    .line 83
    iget v2, v1, Llk3;->z:I

    .line 84
    .line 85
    move/from16 v26, v2

    .line 86
    .line 87
    iget v2, v1, Llk3;->A:I

    .line 88
    .line 89
    move/from16 v27, v2

    .line 90
    .line 91
    iget-object v2, v1, Llk3;->B:Ldo2;

    .line 92
    .line 93
    move-object/from16 v30, v2

    .line 94
    .line 95
    move-object/from16 v17, v3

    .line 96
    .line 97
    iget-wide v2, v1, Llk3;->C:J

    .line 98
    .line 99
    move-wide/from16 v31, v2

    .line 100
    .line 101
    iget-wide v2, v1, Llk3;->D:J

    .line 102
    .line 103
    move-wide/from16 v33, v2

    .line 104
    .line 105
    iget-wide v2, v1, Llk3;->E:J

    .line 106
    .line 107
    move-wide/from16 v35, v2

    .line 108
    .line 109
    iget-object v2, v1, Llk3;->F:Ljw4;

    .line 110
    .line 111
    iget-object v1, v1, Llk3;->G:Lcw4;

    .line 112
    .line 113
    invoke-virtual {v13}, Lcu4;->p()Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    move-object/from16 v38, v1

    .line 118
    .line 119
    if-nez v3, :cond_2

    .line 120
    .line 121
    iget-object v3, v5, Lza4;->a:Lpi3;

    .line 122
    .line 123
    iget v3, v3, Lpi3;->b:I

    .line 124
    .line 125
    invoke-virtual {v13}, Lcu4;->o()I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-ge v3, v1, :cond_1

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_1
    const/4 v1, 0x0

    .line 133
    goto :goto_1

    .line 134
    :cond_2
    :goto_0
    const/4 v1, 0x1

    .line 135
    :goto_1
    invoke-static {v1}, Lrr2;->w(Z)V

    .line 136
    .line 137
    .line 138
    move-object/from16 v37, v2

    .line 139
    .line 140
    new-instance v2, Llk3;

    .line 141
    .line 142
    move-object/from16 v3, v17

    .line 143
    .line 144
    move/from16 v17, v12

    .line 145
    .line 146
    move-object/from16 v12, p1

    .line 147
    .line 148
    invoke-direct/range {v2 .. v38}, Llk3;-><init>(Landroidx/media3/common/PlaybackException;ILza4;Lpi3;Lpi3;ILqh3;IZLs55;Lcu4;ILdo2;FFLil;ILjg0;Lhp0;IZZIIIZZLdo2;JJJLjw4;Lcw4;)V

    .line 149
    .line 150
    .line 151
    iput-object v2, v0, Ltn2;->r:Llk3;

    .line 152
    .line 153
    iget-object v1, v0, Ltn2;->c:Lwr2;

    .line 154
    .line 155
    const/4 v2, 0x1

    .line 156
    invoke-virtual {v1, v2, v2}, Lwr2;->a(ZZ)V

    .line 157
    .line 158
    .line 159
    :try_start_0
    iget-object v0, v0, Ltn2;->h:Lls2;

    .line 160
    .line 161
    iget-object v0, v0, Lls2;->i:Llr0;

    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :catch_0
    move-exception v0

    .line 168
    const-string v1, "MediaSessionImpl"

    .line 169
    .line 170
    const-string v2, "Exception in using media1 API"

    .line 171
    .line 172
    invoke-static {v1, v2, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 173
    .line 174
    .line 175
    :goto_2
    return-void
.end method

.method public final b(I)V
    .locals 39

    .line 1
    invoke-virtual/range {p0 .. p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p0

    .line 12
    .line 13
    iget-object v1, v1, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lal3;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    :goto_0
    return-void

    .line 24
    :cond_1
    iget-object v1, v0, Ltn2;->r:Llk3;

    .line 25
    .line 26
    iget-object v3, v1, Llk3;->a:Landroidx/media3/common/PlaybackException;

    .line 27
    .line 28
    iget v4, v1, Llk3;->b:I

    .line 29
    .line 30
    iget-object v5, v1, Llk3;->c:Lza4;

    .line 31
    .line 32
    iget-object v6, v1, Llk3;->d:Lpi3;

    .line 33
    .line 34
    iget-object v7, v1, Llk3;->e:Lpi3;

    .line 35
    .line 36
    iget v8, v1, Llk3;->f:I

    .line 37
    .line 38
    iget-object v9, v1, Llk3;->g:Lqh3;

    .line 39
    .line 40
    iget v10, v1, Llk3;->h:I

    .line 41
    .line 42
    iget-boolean v11, v1, Llk3;->i:Z

    .line 43
    .line 44
    iget-object v13, v1, Llk3;->j:Lcu4;

    .line 45
    .line 46
    iget v14, v1, Llk3;->k:I

    .line 47
    .line 48
    iget-object v12, v1, Llk3;->l:Ls55;

    .line 49
    .line 50
    iget-object v15, v1, Llk3;->m:Ldo2;

    .line 51
    .line 52
    iget v2, v1, Llk3;->n:F

    .line 53
    .line 54
    move/from16 v16, v2

    .line 55
    .line 56
    iget v2, v1, Llk3;->o:F

    .line 57
    .line 58
    move/from16 v17, v2

    .line 59
    .line 60
    iget-object v2, v1, Llk3;->q:Lil;

    .line 61
    .line 62
    move-object/from16 v18, v2

    .line 63
    .line 64
    iget-object v2, v1, Llk3;->r:Ljg0;

    .line 65
    .line 66
    move-object/from16 v20, v2

    .line 67
    .line 68
    iget-object v2, v1, Llk3;->s:Lhp0;

    .line 69
    .line 70
    move-object/from16 v21, v2

    .line 71
    .line 72
    iget v2, v1, Llk3;->t:I

    .line 73
    .line 74
    move/from16 v22, v2

    .line 75
    .line 76
    iget-boolean v2, v1, Llk3;->u:Z

    .line 77
    .line 78
    move/from16 v23, v2

    .line 79
    .line 80
    iget-boolean v2, v1, Llk3;->v:Z

    .line 81
    .line 82
    move/from16 v24, v2

    .line 83
    .line 84
    iget v2, v1, Llk3;->w:I

    .line 85
    .line 86
    move/from16 v25, v2

    .line 87
    .line 88
    iget-boolean v2, v1, Llk3;->x:Z

    .line 89
    .line 90
    move/from16 v28, v2

    .line 91
    .line 92
    iget-boolean v2, v1, Llk3;->y:Z

    .line 93
    .line 94
    move/from16 v29, v2

    .line 95
    .line 96
    iget v2, v1, Llk3;->z:I

    .line 97
    .line 98
    move/from16 v26, v2

    .line 99
    .line 100
    iget v2, v1, Llk3;->A:I

    .line 101
    .line 102
    move/from16 v27, v2

    .line 103
    .line 104
    iget-object v2, v1, Llk3;->B:Ldo2;

    .line 105
    .line 106
    move-object/from16 v30, v2

    .line 107
    .line 108
    move-object/from16 v19, v3

    .line 109
    .line 110
    iget-wide v2, v1, Llk3;->C:J

    .line 111
    .line 112
    move-wide/from16 v31, v2

    .line 113
    .line 114
    iget-wide v2, v1, Llk3;->D:J

    .line 115
    .line 116
    move-wide/from16 v33, v2

    .line 117
    .line 118
    iget-wide v2, v1, Llk3;->E:J

    .line 119
    .line 120
    move-wide/from16 v35, v2

    .line 121
    .line 122
    iget-object v2, v1, Llk3;->F:Ljw4;

    .line 123
    .line 124
    iget-object v1, v1, Llk3;->G:Lcw4;

    .line 125
    .line 126
    invoke-virtual {v13}, Lcu4;->p()Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    move-object/from16 v38, v1

    .line 131
    .line 132
    if-nez v3, :cond_3

    .line 133
    .line 134
    iget-object v3, v5, Lza4;->a:Lpi3;

    .line 135
    .line 136
    iget v3, v3, Lpi3;->b:I

    .line 137
    .line 138
    invoke-virtual {v13}, Lcu4;->o()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-ge v3, v1, :cond_2

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_2
    const/4 v1, 0x0

    .line 146
    goto :goto_2

    .line 147
    :cond_3
    :goto_1
    const/4 v1, 0x1

    .line 148
    :goto_2
    invoke-static {v1}, Lrr2;->w(Z)V

    .line 149
    .line 150
    .line 151
    move-object/from16 v37, v2

    .line 152
    .line 153
    new-instance v2, Llk3;

    .line 154
    .line 155
    move-object/from16 v3, v19

    .line 156
    .line 157
    move/from16 v19, p1

    .line 158
    .line 159
    invoke-direct/range {v2 .. v38}, Llk3;-><init>(Landroidx/media3/common/PlaybackException;ILza4;Lpi3;Lpi3;ILqh3;IZLs55;Lcu4;ILdo2;FFLil;ILjg0;Lhp0;IZZIIIZZLdo2;JJJLjw4;Lcw4;)V

    .line 160
    .line 161
    .line 162
    iput-object v2, v0, Ltn2;->r:Llk3;

    .line 163
    .line 164
    iget-object v1, v0, Ltn2;->c:Lwr2;

    .line 165
    .line 166
    const/4 v2, 0x1

    .line 167
    invoke-virtual {v1, v2, v2}, Lwr2;->a(ZZ)V

    .line 168
    .line 169
    .line 170
    :try_start_0
    iget-object v0, v0, Ltn2;->h:Lls2;

    .line 171
    .line 172
    iget-object v0, v0, Lls2;->i:Llr0;

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 175
    .line 176
    .line 177
    goto :goto_3

    .line 178
    :catch_0
    move-exception v0

    .line 179
    const-string v1, "MediaSessionImpl"

    .line 180
    .line 181
    const-string v2, "Exception in using media1 API"

    .line 182
    .line 183
    invoke-static {v1, v2, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 184
    .line 185
    .line 186
    :goto_3
    return-void
.end method

.method public final c()Ltn2;
    .locals 0

    .line 1
    iget-object p0, p0, Lxr2;->n:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ltn2;

    .line 8
    .line 9
    return-object p0
.end method

.method public final e(Ljg0;)V
    .locals 39

    .line 1
    invoke-virtual/range {p0 .. p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p0

    .line 12
    .line 13
    iget-object v1, v1, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lal3;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    :goto_0
    return-void

    .line 24
    :cond_1
    iget-object v1, v0, Ltn2;->r:Llk3;

    .line 25
    .line 26
    iget-object v3, v1, Llk3;->a:Landroidx/media3/common/PlaybackException;

    .line 27
    .line 28
    iget v4, v1, Llk3;->b:I

    .line 29
    .line 30
    iget-object v5, v1, Llk3;->c:Lza4;

    .line 31
    .line 32
    iget-object v6, v1, Llk3;->d:Lpi3;

    .line 33
    .line 34
    iget-object v7, v1, Llk3;->e:Lpi3;

    .line 35
    .line 36
    iget v8, v1, Llk3;->f:I

    .line 37
    .line 38
    iget-object v9, v1, Llk3;->g:Lqh3;

    .line 39
    .line 40
    iget v10, v1, Llk3;->h:I

    .line 41
    .line 42
    iget-boolean v11, v1, Llk3;->i:Z

    .line 43
    .line 44
    iget-object v13, v1, Llk3;->j:Lcu4;

    .line 45
    .line 46
    iget v14, v1, Llk3;->k:I

    .line 47
    .line 48
    iget-object v12, v1, Llk3;->l:Ls55;

    .line 49
    .line 50
    iget-object v15, v1, Llk3;->m:Ldo2;

    .line 51
    .line 52
    iget v2, v1, Llk3;->n:F

    .line 53
    .line 54
    move/from16 v16, v2

    .line 55
    .line 56
    iget v2, v1, Llk3;->o:F

    .line 57
    .line 58
    move/from16 v17, v2

    .line 59
    .line 60
    iget v2, v1, Llk3;->p:I

    .line 61
    .line 62
    move/from16 v19, v2

    .line 63
    .line 64
    iget-object v2, v1, Llk3;->q:Lil;

    .line 65
    .line 66
    move-object/from16 v18, v2

    .line 67
    .line 68
    iget-object v2, v1, Llk3;->s:Lhp0;

    .line 69
    .line 70
    move-object/from16 v21, v2

    .line 71
    .line 72
    iget v2, v1, Llk3;->t:I

    .line 73
    .line 74
    move/from16 v22, v2

    .line 75
    .line 76
    iget-boolean v2, v1, Llk3;->u:Z

    .line 77
    .line 78
    move/from16 v23, v2

    .line 79
    .line 80
    iget-boolean v2, v1, Llk3;->v:Z

    .line 81
    .line 82
    move/from16 v24, v2

    .line 83
    .line 84
    iget v2, v1, Llk3;->w:I

    .line 85
    .line 86
    move/from16 v25, v2

    .line 87
    .line 88
    iget-boolean v2, v1, Llk3;->x:Z

    .line 89
    .line 90
    move/from16 v28, v2

    .line 91
    .line 92
    iget-boolean v2, v1, Llk3;->y:Z

    .line 93
    .line 94
    move/from16 v29, v2

    .line 95
    .line 96
    iget v2, v1, Llk3;->z:I

    .line 97
    .line 98
    move/from16 v26, v2

    .line 99
    .line 100
    iget v2, v1, Llk3;->A:I

    .line 101
    .line 102
    move/from16 v27, v2

    .line 103
    .line 104
    iget-object v2, v1, Llk3;->B:Ldo2;

    .line 105
    .line 106
    move-object/from16 v30, v2

    .line 107
    .line 108
    move-object/from16 v20, v3

    .line 109
    .line 110
    iget-wide v2, v1, Llk3;->C:J

    .line 111
    .line 112
    move-wide/from16 v31, v2

    .line 113
    .line 114
    iget-wide v2, v1, Llk3;->D:J

    .line 115
    .line 116
    move-wide/from16 v33, v2

    .line 117
    .line 118
    iget-wide v2, v1, Llk3;->E:J

    .line 119
    .line 120
    move-wide/from16 v35, v2

    .line 121
    .line 122
    iget-object v2, v1, Llk3;->F:Ljw4;

    .line 123
    .line 124
    iget-object v1, v1, Llk3;->G:Lcw4;

    .line 125
    .line 126
    invoke-virtual {v13}, Lcu4;->p()Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    move-object/from16 v38, v1

    .line 131
    .line 132
    if-nez v3, :cond_3

    .line 133
    .line 134
    iget-object v3, v5, Lza4;->a:Lpi3;

    .line 135
    .line 136
    iget v3, v3, Lpi3;->b:I

    .line 137
    .line 138
    invoke-virtual {v13}, Lcu4;->o()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-ge v3, v1, :cond_2

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_2
    const/4 v1, 0x0

    .line 146
    goto :goto_2

    .line 147
    :cond_3
    :goto_1
    const/4 v1, 0x1

    .line 148
    :goto_2
    invoke-static {v1}, Lrr2;->w(Z)V

    .line 149
    .line 150
    .line 151
    move-object/from16 v37, v2

    .line 152
    .line 153
    new-instance v2, Llk3;

    .line 154
    .line 155
    move-object/from16 v3, v20

    .line 156
    .line 157
    move-object/from16 v20, p1

    .line 158
    .line 159
    invoke-direct/range {v2 .. v38}, Llk3;-><init>(Landroidx/media3/common/PlaybackException;ILza4;Lpi3;Lpi3;ILqh3;IZLs55;Lcu4;ILdo2;FFLil;ILjg0;Lhp0;IZZIIIZZLdo2;JJJLjw4;Lcw4;)V

    .line 160
    .line 161
    .line 162
    iput-object v2, v0, Ltn2;->r:Llk3;

    .line 163
    .line 164
    iget-object v0, v0, Ltn2;->c:Lwr2;

    .line 165
    .line 166
    const/4 v1, 0x1

    .line 167
    invoke-virtual {v0, v1, v1}, Lwr2;->a(ZZ)V

    .line 168
    .line 169
    .line 170
    return-void
.end method

.method public final f(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lal3;

    .line 18
    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    iget-object p0, v0, Ltn2;->r:Llk3;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Llk3;->i(I)Llk3;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    iput-object p0, v0, Ltn2;->r:Llk3;

    .line 29
    .line 30
    iget-object p0, v0, Ltn2;->c:Lwr2;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-virtual {p0, v1, v1}, Lwr2;->a(ZZ)V

    .line 34
    .line 35
    .line 36
    :try_start_0
    iget-object p0, v0, Ltn2;->h:Lls2;

    .line 37
    .line 38
    iget-object p0, p0, Lls2;->i:Llr0;

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Llr0;->s(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catch_0
    move-exception p0

    .line 45
    const-string p1, "MediaSessionImpl"

    .line 46
    .line 47
    const-string v0, "Exception in using media1 API"

    .line 48
    .line 49
    invoke-static {p1, v0, p0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final g(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lal3;

    .line 18
    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    iget-object p0, v0, Ltn2;->r:Llk3;

    .line 23
    .line 24
    iget-boolean v1, p0, Llk3;->v:Z

    .line 25
    .line 26
    iget v2, p0, Llk3;->w:I

    .line 27
    .line 28
    invoke-virtual {p0, v2, p1, v1}, Llk3;->d(IIZ)Llk3;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    iput-object p0, v0, Ltn2;->r:Llk3;

    .line 33
    .line 34
    iget-object p0, v0, Ltn2;->c:Lwr2;

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    invoke-virtual {p0, p1, p1}, Lwr2;->a(ZZ)V

    .line 38
    .line 39
    .line 40
    :try_start_0
    iget-object p0, v0, Ltn2;->h:Lls2;

    .line 41
    .line 42
    iget-object p0, p0, Lls2;->i:Llr0;

    .line 43
    .line 44
    iget-object p0, p0, Llr0;->r:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Lls2;

    .line 47
    .line 48
    iget-object p1, p0, Lls2;->g:Ltn2;

    .line 49
    .line 50
    iget-object p1, p1, Ltn2;->s:Lal3;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lls2;->P(Lal3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catch_0
    move-exception p0

    .line 57
    const-string p1, "MediaSessionImpl"

    .line 58
    .line 59
    const-string v0, "Exception in using media1 API"

    .line 60
    .line 61
    invoke-static {p1, v0, p0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final k(Lpi3;Lpi3;I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lal3;

    .line 18
    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    iget-object p0, v0, Ltn2;->r:Llk3;

    .line 23
    .line 24
    invoke-virtual {p0, p1, p2, p3}, Llk3;->h(Lpi3;Lpi3;I)Llk3;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    iput-object p0, v0, Ltn2;->r:Llk3;

    .line 29
    .line 30
    iget-object p0, v0, Ltn2;->c:Lwr2;

    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    invoke-virtual {p0, p1, p1}, Lwr2;->a(ZZ)V

    .line 34
    .line 35
    .line 36
    :try_start_0
    iget-object p0, v0, Ltn2;->h:Lls2;

    .line 37
    .line 38
    iget-object p0, p0, Lls2;->i:Llr0;

    .line 39
    .line 40
    iget-object p0, p0, Llr0;->r:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Lls2;

    .line 43
    .line 44
    iget-object p1, p0, Lls2;->g:Ltn2;

    .line 45
    .line 46
    iget-object p1, p1, Ltn2;->s:Lal3;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lls2;->P(Lal3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :catch_0
    move-exception p0

    .line 53
    const-string p1, "MediaSessionImpl"

    .line 54
    .line 55
    const-string p2, "Exception in using media1 API"

    .line 56
    .line 57
    invoke-static {p1, p2, p0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final n(Lil;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lal3;

    .line 18
    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-object p0, v0, Ltn2;->r:Llk3;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Llk3;->a(Lil;)Llk3;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    iput-object p0, v0, Ltn2;->r:Llk3;

    .line 29
    .line 30
    iget-object p0, v0, Ltn2;->c:Lwr2;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-virtual {p0, v1, v1}, Lwr2;->a(ZZ)V

    .line 34
    .line 35
    .line 36
    :try_start_0
    iget-object p0, v0, Ltn2;->h:Lls2;

    .line 37
    .line 38
    iget-object p0, p0, Lls2;->i:Llr0;

    .line 39
    .line 40
    iget-object p0, p0, Llr0;->r:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Lls2;

    .line 43
    .line 44
    iget-object v0, p0, Lls2;->g:Ltn2;

    .line 45
    .line 46
    iget-object v0, v0, Ltn2;->s:Lal3;

    .line 47
    .line 48
    invoke-virtual {v0}, Lal3;->F()Lhp0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget v0, v0, Lhp0;->a:I

    .line 53
    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    iget-object p0, p0, Lls2;->m:Lqr2;

    .line 57
    .line 58
    iget-object p0, p0, Lqr2;->o:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, Lkr2;

    .line 61
    .line 62
    iget-object p0, p0, Lkr2;->a:Landroid/media/session/MediaSession;

    .line 63
    .line 64
    invoke-virtual {p1}, Lil;->c()Landroid/media/AudioAttributes;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p0, p1}, Landroid/media/session/MediaSession;->setPlaybackToLocal(Landroid/media/AudioAttributes;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    .line 70
    .line 71
    :cond_2
    :goto_0
    return-void

    .line 72
    :catch_0
    move-exception p0

    .line 73
    const-string p1, "MediaSessionImpl"

    .line 74
    .line 75
    const-string v0, "Exception in using media1 API"

    .line 76
    .line 77
    invoke-static {p1, v0, p0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public final o(Lcw4;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lal3;

    .line 18
    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    iget-object p0, v0, Ltn2;->r:Llk3;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Llk3;->o(Lcw4;)Llk3;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    iput-object p0, v0, Ltn2;->r:Llk3;

    .line 29
    .line 30
    iget-object p0, v0, Ltn2;->c:Lwr2;

    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    invoke-virtual {p0, p1, p1}, Lwr2;->a(ZZ)V

    .line 34
    .line 35
    .line 36
    new-instance p0, Ler1;

    .line 37
    .line 38
    const/16 p1, 0x1c

    .line 39
    .line 40
    invoke-direct {p0, p1}, Ler1;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ltn2;->f(Lyr2;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final q(Z)V
    .locals 39

    .line 1
    invoke-virtual/range {p0 .. p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    move-object/from16 v0, p0

    .line 12
    .line 13
    iget-object v0, v0, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lal3;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    :goto_0
    return-void

    .line 24
    :cond_1
    iget-object v0, v1, Ltn2;->r:Llk3;

    .line 25
    .line 26
    iget-object v3, v0, Llk3;->a:Landroidx/media3/common/PlaybackException;

    .line 27
    .line 28
    iget v4, v0, Llk3;->b:I

    .line 29
    .line 30
    iget-object v5, v0, Llk3;->c:Lza4;

    .line 31
    .line 32
    iget-object v6, v0, Llk3;->d:Lpi3;

    .line 33
    .line 34
    iget-object v7, v0, Llk3;->e:Lpi3;

    .line 35
    .line 36
    iget v8, v0, Llk3;->f:I

    .line 37
    .line 38
    iget-object v9, v0, Llk3;->g:Lqh3;

    .line 39
    .line 40
    iget v10, v0, Llk3;->h:I

    .line 41
    .line 42
    iget-boolean v11, v0, Llk3;->i:Z

    .line 43
    .line 44
    iget-object v13, v0, Llk3;->j:Lcu4;

    .line 45
    .line 46
    iget v14, v0, Llk3;->k:I

    .line 47
    .line 48
    iget-object v12, v0, Llk3;->l:Ls55;

    .line 49
    .line 50
    iget-object v15, v0, Llk3;->m:Ldo2;

    .line 51
    .line 52
    iget v2, v0, Llk3;->n:F

    .line 53
    .line 54
    move/from16 v16, v2

    .line 55
    .line 56
    iget v2, v0, Llk3;->o:F

    .line 57
    .line 58
    move/from16 v17, v2

    .line 59
    .line 60
    iget v2, v0, Llk3;->p:I

    .line 61
    .line 62
    move/from16 v19, v2

    .line 63
    .line 64
    iget-object v2, v0, Llk3;->q:Lil;

    .line 65
    .line 66
    move-object/from16 v18, v2

    .line 67
    .line 68
    iget-object v2, v0, Llk3;->r:Ljg0;

    .line 69
    .line 70
    move-object/from16 v20, v2

    .line 71
    .line 72
    iget-object v2, v0, Llk3;->s:Lhp0;

    .line 73
    .line 74
    move-object/from16 v21, v2

    .line 75
    .line 76
    iget v2, v0, Llk3;->t:I

    .line 77
    .line 78
    move/from16 v22, v2

    .line 79
    .line 80
    iget-boolean v2, v0, Llk3;->u:Z

    .line 81
    .line 82
    move/from16 v23, v2

    .line 83
    .line 84
    iget-boolean v2, v0, Llk3;->v:Z

    .line 85
    .line 86
    move/from16 v24, v2

    .line 87
    .line 88
    iget v2, v0, Llk3;->w:I

    .line 89
    .line 90
    move/from16 v25, v2

    .line 91
    .line 92
    iget-boolean v2, v0, Llk3;->x:Z

    .line 93
    .line 94
    move/from16 v28, v2

    .line 95
    .line 96
    iget v2, v0, Llk3;->z:I

    .line 97
    .line 98
    move/from16 v26, v2

    .line 99
    .line 100
    iget v2, v0, Llk3;->A:I

    .line 101
    .line 102
    move/from16 v27, v2

    .line 103
    .line 104
    iget-object v2, v0, Llk3;->B:Ldo2;

    .line 105
    .line 106
    move-object/from16 v30, v2

    .line 107
    .line 108
    move-object/from16 v29, v3

    .line 109
    .line 110
    iget-wide v2, v0, Llk3;->C:J

    .line 111
    .line 112
    move-wide/from16 v31, v2

    .line 113
    .line 114
    iget-wide v2, v0, Llk3;->D:J

    .line 115
    .line 116
    move-wide/from16 v33, v2

    .line 117
    .line 118
    iget-wide v2, v0, Llk3;->E:J

    .line 119
    .line 120
    move-wide/from16 v35, v2

    .line 121
    .line 122
    iget-object v2, v0, Llk3;->F:Ljw4;

    .line 123
    .line 124
    iget-object v0, v0, Llk3;->G:Lcw4;

    .line 125
    .line 126
    invoke-virtual {v13}, Lcu4;->p()Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    move-object/from16 v38, v0

    .line 131
    .line 132
    if-nez v3, :cond_3

    .line 133
    .line 134
    iget-object v3, v5, Lza4;->a:Lpi3;

    .line 135
    .line 136
    iget v3, v3, Lpi3;->b:I

    .line 137
    .line 138
    invoke-virtual {v13}, Lcu4;->o()I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-ge v3, v0, :cond_2

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_2
    const/4 v0, 0x0

    .line 146
    goto :goto_2

    .line 147
    :cond_3
    :goto_1
    const/4 v0, 0x1

    .line 148
    :goto_2
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 149
    .line 150
    .line 151
    move-object/from16 v37, v2

    .line 152
    .line 153
    new-instance v2, Llk3;

    .line 154
    .line 155
    move-object/from16 v3, v29

    .line 156
    .line 157
    move/from16 v29, p1

    .line 158
    .line 159
    invoke-direct/range {v2 .. v38}, Llk3;-><init>(Landroidx/media3/common/PlaybackException;ILza4;Lpi3;Lpi3;ILqh3;IZLs55;Lcu4;ILdo2;FFLil;ILjg0;Lhp0;IZZIIIZZLdo2;JJJLjw4;Lcw4;)V

    .line 160
    .line 161
    .line 162
    iput-object v2, v1, Ltn2;->r:Llk3;

    .line 163
    .line 164
    iget-object v0, v1, Ltn2;->c:Lwr2;

    .line 165
    .line 166
    const/4 v2, 0x1

    .line 167
    invoke-virtual {v0, v2, v2}, Lwr2;->a(ZZ)V

    .line 168
    .line 169
    .line 170
    :try_start_0
    iget-object v0, v1, Ltn2;->h:Lls2;

    .line 171
    .line 172
    iget-object v0, v0, Lls2;->i:Llr0;

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 175
    .line 176
    .line 177
    goto :goto_3

    .line 178
    :catch_0
    move-exception v0

    .line 179
    const-string v2, "MediaSessionImpl"

    .line 180
    .line 181
    const-string v3, "Exception in using media1 API"

    .line 182
    .line 183
    invoke-static {v2, v3, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 184
    .line 185
    .line 186
    :goto_3
    invoke-virtual {v1}, Ltn2;->C()V

    .line 187
    .line 188
    .line 189
    return-void
.end method

.method public final r(IZ)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lal3;

    .line 18
    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    iget-object p0, v0, Ltn2;->r:Llk3;

    .line 23
    .line 24
    iget v1, p0, Llk3;->z:I

    .line 25
    .line 26
    invoke-virtual {p0, p1, v1, p2}, Llk3;->d(IIZ)Llk3;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iput-object p0, v0, Ltn2;->r:Llk3;

    .line 31
    .line 32
    iget-object p0, v0, Ltn2;->c:Lwr2;

    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    invoke-virtual {p0, p1, p1}, Lwr2;->a(ZZ)V

    .line 36
    .line 37
    .line 38
    :try_start_0
    iget-object p0, v0, Ltn2;->h:Lls2;

    .line 39
    .line 40
    iget-object p0, p0, Lls2;->i:Llr0;

    .line 41
    .line 42
    iget-object p0, p0, Llr0;->r:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Lls2;

    .line 45
    .line 46
    iget-object p1, p0, Lls2;->g:Ltn2;

    .line 47
    .line 48
    iget-object p1, p1, Ltn2;->s:Lal3;

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lls2;->P(Lal3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catch_0
    move-exception p0

    .line 55
    const-string p1, "MediaSessionImpl"

    .line 56
    .line 57
    const-string p2, "Exception in using media1 API"

    .line 58
    .line 59
    invoke-static {p1, p2, p0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final s(F)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ltn2;->r:Llk3;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Llk3;->p(F)Llk3;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Ltn2;->r:Llk3;

    .line 18
    .line 19
    iget-object p1, p0, Ltn2;->c:Lwr2;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-virtual {p1, v0, v0}, Lwr2;->a(ZZ)V

    .line 23
    .line 24
    .line 25
    :try_start_0
    iget-object p0, p0, Ltn2;->h:Lls2;

    .line 26
    .line 27
    iget-object p0, p0, Lls2;->i:Llr0;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception p0

    .line 34
    const-string p1, "MediaSessionImpl"

    .line 35
    .line 36
    const-string v0, "Exception in using media1 API"

    .line 37
    .line 38
    invoke-static {p1, v0, p0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    return-void
.end method

.method public final t(ILgn2;)V
    .locals 39

    .line 1
    invoke-virtual/range {p0 .. p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p0

    .line 12
    .line 13
    iget-object v1, v1, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lal3;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    :goto_0
    return-void

    .line 24
    :cond_1
    iget-object v1, v0, Ltn2;->r:Llk3;

    .line 25
    .line 26
    iget-object v3, v1, Llk3;->a:Landroidx/media3/common/PlaybackException;

    .line 27
    .line 28
    iget-object v5, v1, Llk3;->c:Lza4;

    .line 29
    .line 30
    iget-object v6, v1, Llk3;->d:Lpi3;

    .line 31
    .line 32
    iget-object v7, v1, Llk3;->e:Lpi3;

    .line 33
    .line 34
    iget v8, v1, Llk3;->f:I

    .line 35
    .line 36
    iget-object v9, v1, Llk3;->g:Lqh3;

    .line 37
    .line 38
    iget v10, v1, Llk3;->h:I

    .line 39
    .line 40
    iget-boolean v11, v1, Llk3;->i:Z

    .line 41
    .line 42
    iget-object v13, v1, Llk3;->j:Lcu4;

    .line 43
    .line 44
    iget v14, v1, Llk3;->k:I

    .line 45
    .line 46
    iget-object v12, v1, Llk3;->l:Ls55;

    .line 47
    .line 48
    iget-object v15, v1, Llk3;->m:Ldo2;

    .line 49
    .line 50
    iget v2, v1, Llk3;->n:F

    .line 51
    .line 52
    iget v4, v1, Llk3;->o:F

    .line 53
    .line 54
    move/from16 v16, v2

    .line 55
    .line 56
    iget v2, v1, Llk3;->p:I

    .line 57
    .line 58
    move/from16 v19, v2

    .line 59
    .line 60
    iget-object v2, v1, Llk3;->q:Lil;

    .line 61
    .line 62
    move-object/from16 v18, v2

    .line 63
    .line 64
    iget-object v2, v1, Llk3;->r:Ljg0;

    .line 65
    .line 66
    move-object/from16 v20, v2

    .line 67
    .line 68
    iget-object v2, v1, Llk3;->s:Lhp0;

    .line 69
    .line 70
    move-object/from16 v21, v2

    .line 71
    .line 72
    iget v2, v1, Llk3;->t:I

    .line 73
    .line 74
    move/from16 v22, v2

    .line 75
    .line 76
    iget-boolean v2, v1, Llk3;->u:Z

    .line 77
    .line 78
    move/from16 v23, v2

    .line 79
    .line 80
    iget-boolean v2, v1, Llk3;->v:Z

    .line 81
    .line 82
    move/from16 v24, v2

    .line 83
    .line 84
    iget v2, v1, Llk3;->w:I

    .line 85
    .line 86
    move/from16 v25, v2

    .line 87
    .line 88
    iget-boolean v2, v1, Llk3;->x:Z

    .line 89
    .line 90
    move/from16 v28, v2

    .line 91
    .line 92
    iget-boolean v2, v1, Llk3;->y:Z

    .line 93
    .line 94
    move/from16 v29, v2

    .line 95
    .line 96
    iget v2, v1, Llk3;->z:I

    .line 97
    .line 98
    move/from16 v26, v2

    .line 99
    .line 100
    iget v2, v1, Llk3;->A:I

    .line 101
    .line 102
    move/from16 v27, v2

    .line 103
    .line 104
    iget-object v2, v1, Llk3;->B:Ldo2;

    .line 105
    .line 106
    move-object/from16 v30, v2

    .line 107
    .line 108
    move-object/from16 v17, v3

    .line 109
    .line 110
    iget-wide v2, v1, Llk3;->C:J

    .line 111
    .line 112
    move-wide/from16 v31, v2

    .line 113
    .line 114
    iget-wide v2, v1, Llk3;->D:J

    .line 115
    .line 116
    move-wide/from16 v33, v2

    .line 117
    .line 118
    iget-wide v2, v1, Llk3;->E:J

    .line 119
    .line 120
    move-wide/from16 v35, v2

    .line 121
    .line 122
    iget-object v2, v1, Llk3;->F:Ljw4;

    .line 123
    .line 124
    iget-object v1, v1, Llk3;->G:Lcw4;

    .line 125
    .line 126
    invoke-virtual {v13}, Lcu4;->p()Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    move-object/from16 v38, v1

    .line 131
    .line 132
    if-nez v3, :cond_3

    .line 133
    .line 134
    iget-object v3, v5, Lza4;->a:Lpi3;

    .line 135
    .line 136
    iget v3, v3, Lpi3;->b:I

    .line 137
    .line 138
    invoke-virtual {v13}, Lcu4;->o()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-ge v3, v1, :cond_2

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_2
    const/4 v1, 0x0

    .line 146
    goto :goto_2

    .line 147
    :cond_3
    :goto_1
    const/4 v1, 0x1

    .line 148
    :goto_2
    invoke-static {v1}, Lrr2;->w(Z)V

    .line 149
    .line 150
    .line 151
    move-object/from16 v37, v2

    .line 152
    .line 153
    new-instance v2, Llk3;

    .line 154
    .line 155
    move-object/from16 v3, v17

    .line 156
    .line 157
    move/from16 v17, v4

    .line 158
    .line 159
    move/from16 v4, p1

    .line 160
    .line 161
    invoke-direct/range {v2 .. v38}, Llk3;-><init>(Landroidx/media3/common/PlaybackException;ILza4;Lpi3;Lpi3;ILqh3;IZLs55;Lcu4;ILdo2;FFLil;ILjg0;Lhp0;IZZIIIZZLdo2;JJJLjw4;Lcw4;)V

    .line 162
    .line 163
    .line 164
    iput-object v2, v0, Ltn2;->r:Llk3;

    .line 165
    .line 166
    iget-object v1, v0, Ltn2;->c:Lwr2;

    .line 167
    .line 168
    const/4 v2, 0x1

    .line 169
    invoke-virtual {v1, v2, v2}, Lwr2;->a(ZZ)V

    .line 170
    .line 171
    .line 172
    :try_start_0
    iget-object v0, v0, Ltn2;->h:Lls2;

    .line 173
    .line 174
    iget-object v0, v0, Lls2;->i:Llr0;

    .line 175
    .line 176
    move-object/from16 v1, p2

    .line 177
    .line 178
    invoke-virtual {v0, v1}, Llr0;->n(Lgn2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :catch_0
    move-exception v0

    .line 183
    const-string v1, "MediaSessionImpl"

    .line 184
    .line 185
    const-string v2, "Exception in using media1 API"

    .line 186
    .line 187
    invoke-static {v1, v2, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 188
    .line 189
    .line 190
    return-void
.end method

.method public final v(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lal3;

    .line 18
    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    iget-object v1, v0, Ltn2;->r:Llk3;

    .line 23
    .line 24
    invoke-virtual {p0}, Lal3;->U()Landroidx/media3/common/PlaybackException;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, p1, v2}, Llk3;->f(ILandroidx/media3/common/PlaybackException;)Llk3;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, v0, Ltn2;->r:Llk3;

    .line 33
    .line 34
    iget-object p1, v0, Ltn2;->c:Lwr2;

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    invoke-virtual {p1, v1, v1}, Lwr2;->a(ZZ)V

    .line 38
    .line 39
    .line 40
    :try_start_0
    iget-object p1, v0, Ltn2;->h:Lls2;

    .line 41
    .line 42
    iget-object p1, p1, Lls2;->i:Llr0;

    .line 43
    .line 44
    invoke-virtual {p0}, Lal3;->U()Landroidx/media3/common/PlaybackException;

    .line 45
    .line 46
    .line 47
    iget-object p0, p1, Llr0;->r:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Lls2;

    .line 50
    .line 51
    iget-object p1, p0, Lls2;->g:Ltn2;

    .line 52
    .line 53
    iget-object p1, p1, Ltn2;->s:Lal3;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Lls2;->P(Lal3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :catch_0
    move-exception p0

    .line 60
    const-string p1, "MediaSessionImpl"

    .line 61
    .line 62
    const-string v0, "Exception in using media1 API"

    .line 63
    .line 64
    invoke-static {p1, v0, p0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final x(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxr2;->c()Ltn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltn2;->F()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lxr2;->o:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lal3;

    .line 18
    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    iget-object p0, v0, Ltn2;->r:Llk3;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Llk3;->k(Z)Llk3;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    iput-object p0, v0, Ltn2;->r:Llk3;

    .line 29
    .line 30
    iget-object p0, v0, Ltn2;->c:Lwr2;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-virtual {p0, v1, v1}, Lwr2;->a(ZZ)V

    .line 34
    .line 35
    .line 36
    :try_start_0
    iget-object p0, v0, Ltn2;->h:Lls2;

    .line 37
    .line 38
    iget-object p0, p0, Lls2;->i:Llr0;

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Llr0;->u(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catch_0
    move-exception p0

    .line 45
    const-string p1, "MediaSessionImpl"

    .line 46
    .line 47
    const-string v0, "Exception in using media1 API"

    .line 48
    .line 49
    invoke-static {p1, v0, p0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method
