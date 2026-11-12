.class public final synthetic Ldg0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Le93;
.implements Lfz;
.implements Lmn0;
.implements Lcp3;
.implements Lmk;
.implements Lks2;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Ldg0;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldg0;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Ldg0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Ldg0;->q:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Ldg0;->r:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldg0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;

    .line 4
    .line 5
    iget-object v1, p0, Ldg0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/os/CancellationSignal;

    .line 8
    .line 9
    iget-object v2, p0, Ldg0;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/concurrent/Executor;

    .line 12
    .line 13
    iget-object p0, p0, Ldg0;->r:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lvf0;

    .line 16
    .line 17
    invoke-static {v0, v1, v2, p0, p1}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->$r8$lambda$iQQ111WndOqJplgmKt5mtJ5jYgo(Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lvf0;Ljava/lang/Exception;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public apply(Ljava/lang/Object;)Lic2;
    .locals 12

    .line 1
    iget-object v0, p0, Ldg0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lfr2;

    .line 4
    .line 5
    iget-object v1, p0, Ldg0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lkn2;

    .line 8
    .line 9
    iget-object v2, p0, Ldg0;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/lang/String;

    .line 12
    .line 13
    iget-object p0, p0, Ldg0;->r:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ljn2;

    .line 16
    .line 17
    check-cast p1, Lm92;

    .line 18
    .line 19
    iget v3, p1, Lm92;->a:I

    .line 20
    .line 21
    if-nez v3, :cond_7

    .line 22
    .line 23
    iget-object v3, p1, Lm92;->c:Ljava/lang/Object;

    .line 24
    .line 25
    if-eqz v3, :cond_7

    .line 26
    .line 27
    check-cast v3, Lgn2;

    .line 28
    .line 29
    iget-object v3, v3, Lgn2;->d:Ldo2;

    .line 30
    .line 31
    iget-object v3, v3, Ldo2;->q:Ljava/lang/Boolean;

    .line 32
    .line 33
    if-eqz v3, :cond_7

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    goto/16 :goto_4

    .line 42
    .line 43
    :cond_0
    iget p1, v0, Lfr2;->b:I

    .line 44
    .line 45
    if-eqz p1, :cond_6

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    xor-int/lit8 p1, p1, 0x1

    .line 55
    .line 56
    invoke-static {p1}, Lrr2;->l(Z)V

    .line 57
    .line 58
    .line 59
    iget-object p1, v1, Lkn2;->a:Ltn2;

    .line 60
    .line 61
    iget-boolean v1, p1, Ltn2;->y:Z

    .line 62
    .line 63
    if-eqz v1, :cond_5

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ltn2;->k(Lfr2;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_5

    .line 70
    .line 71
    iget-object v0, p1, Ltn2;->h:Lls2;

    .line 72
    .line 73
    iget-object v0, v0, Lls2;->f:Lna4;

    .line 74
    .line 75
    invoke-virtual {v0}, Lna4;->u()Lyw1;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const/4 v1, 0x0

    .line 80
    move v3, v1

    .line 81
    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-ge v3, v4, :cond_2

    .line 86
    .line 87
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    check-cast v4, Lfr2;

    .line 92
    .line 93
    invoke-static {v4}, Ltn2;->m(Lfr2;)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-eqz v5, :cond_1

    .line 98
    .line 99
    move-object v0, v4

    .line 100
    goto :goto_2

    .line 101
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    iget-object v0, p1, Ltn2;->g:Lkt2;

    .line 105
    .line 106
    iget-object v0, v0, Lkt2;->f:Lna4;

    .line 107
    .line 108
    invoke-virtual {v0}, Lna4;->u()Lyw1;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    :goto_1
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-ge v1, v3, :cond_4

    .line 117
    .line 118
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    check-cast v3, Lfr2;

    .line 123
    .line 124
    invoke-static {v3}, Ltn2;->m(Lfr2;)Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-eqz v4, :cond_3

    .line 129
    .line 130
    move-object v0, v3

    .line 131
    goto :goto_2

    .line 132
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_4
    const/4 v0, 0x0

    .line 136
    :goto_2
    if-nez v0, :cond_5

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_5
    new-instance v1, Leg0;

    .line 140
    .line 141
    const/4 v3, 0x6

    .line 142
    invoke-direct {v1, p1, v2, p0, v3}, Leg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v0, v1}, Ltn2;->e(Lfr2;Lyr2;)V

    .line 146
    .line 147
    .line 148
    :cond_6
    :goto_3
    new-instance v4, Lm92;

    .line 149
    .line 150
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 151
    .line 152
    .line 153
    move-result-wide v6

    .line 154
    const/4 v10, 0x0

    .line 155
    const/4 v11, 0x1

    .line 156
    const/4 v5, 0x0

    .line 157
    const/4 v8, 0x0

    .line 158
    const/4 v9, 0x0

    .line 159
    invoke-direct/range {v4 .. v11}, Lm92;-><init>(IJLjn2;Lxa4;Ljava/lang/Object;I)V

    .line 160
    .line 161
    .line 162
    new-instance p0, Lmw1;

    .line 163
    .line 164
    invoke-direct {p0, v4}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    return-object p0

    .line 168
    :cond_7
    :goto_4
    iget p0, p1, Lm92;->a:I

    .line 169
    .line 170
    if-eqz p0, :cond_8

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_8
    const/4 p0, -0x3

    .line 174
    :goto_5
    invoke-static {p0}, Lm92;->b(I)Lm92;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    new-instance p1, Lmw1;

    .line 179
    .line 180
    invoke-direct {p1, p0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    return-object p1
.end method

.method public b(Lfr2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldg0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lls2;

    .line 4
    .line 5
    iget-object v1, p0, Ldg0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lva4;

    .line 8
    .line 9
    iget-object v2, p0, Ldg0;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Landroid/os/Bundle;

    .line 12
    .line 13
    iget-object p0, p0, Ldg0;->r:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Landroid/os/ResultReceiver;

    .line 16
    .line 17
    iget-object v0, v0, Lls2;->g:Ltn2;

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    sget-object v2, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v0, p1, v1, v2}, Ltn2;->q(Lfr2;Lva4;Landroid/os/Bundle;)Lic2;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    new-instance v0, Lur2;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-direct {v0, v1, p1, p0}, Lur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lgq0;->n:Lgq0;

    .line 36
    .line 37
    invoke-interface {p1, v0, p0}, Lic2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public g(ILsv4;[I)Lgy3;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    iget-object v1, v0, Ldg0;->o:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v4, v1

    .line 8
    check-cast v4, Ljn0;

    .line 9
    .line 10
    iget-object v1, v0, Ldg0;->p:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v6, v1

    .line 13
    check-cast v6, Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, v0, Ldg0;->q:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, [I

    .line 18
    .line 19
    iget-object v0, v0, Ldg0;->r:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Landroid/graphics/Point;

    .line 22
    .line 23
    aget v7, v1, p1

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget v1, v4, Lcw4;->i:I

    .line 31
    .line 32
    :goto_0
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    iget v0, v4, Lcw4;->j:I

    .line 38
    .line 39
    :goto_1
    iget-boolean v3, v4, Lcw4;->l:Z

    .line 40
    .line 41
    const v9, 0x7fffffff

    .line 42
    .line 43
    .line 44
    if-eq v1, v9, :cond_9

    .line 45
    .line 46
    if-ne v0, v9, :cond_2

    .line 47
    .line 48
    goto/16 :goto_7

    .line 49
    .line 50
    :cond_2
    move v8, v9

    .line 51
    const/4 v5, 0x0

    .line 52
    :goto_2
    iget v12, v2, Lsv4;->a:I

    .line 53
    .line 54
    if-ge v5, v12, :cond_8

    .line 55
    .line 56
    iget-object v12, v2, Lsv4;->d:[Ltb1;

    .line 57
    .line 58
    aget-object v12, v12, v5

    .line 59
    .line 60
    iget v13, v12, Ltb1;->u:I

    .line 61
    .line 62
    iget v14, v12, Ltb1;->v:I

    .line 63
    .line 64
    if-lez v13, :cond_7

    .line 65
    .line 66
    if-lez v14, :cond_7

    .line 67
    .line 68
    if-eqz v3, :cond_5

    .line 69
    .line 70
    if-le v13, v14, :cond_3

    .line 71
    .line 72
    const/4 v15, 0x1

    .line 73
    goto :goto_3

    .line 74
    :cond_3
    const/4 v15, 0x0

    .line 75
    :goto_3
    if-le v1, v0, :cond_4

    .line 76
    .line 77
    const/4 v10, 0x1

    .line 78
    goto :goto_4

    .line 79
    :cond_4
    const/4 v10, 0x0

    .line 80
    :goto_4
    if-eq v15, v10, :cond_5

    .line 81
    .line 82
    move v15, v0

    .line 83
    move v10, v1

    .line 84
    goto :goto_5

    .line 85
    :cond_5
    move v10, v0

    .line 86
    move v15, v1

    .line 87
    :goto_5
    mul-int v11, v13, v10

    .line 88
    .line 89
    mul-int v9, v14, v15

    .line 90
    .line 91
    if-lt v11, v9, :cond_6

    .line 92
    .line 93
    new-instance v10, Landroid/graphics/Point;

    .line 94
    .line 95
    invoke-static {v9, v13}, Lf35;->g(II)I

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    invoke-direct {v10, v15, v9}, Landroid/graphics/Point;-><init>(II)V

    .line 100
    .line 101
    .line 102
    goto :goto_6

    .line 103
    :cond_6
    new-instance v9, Landroid/graphics/Point;

    .line 104
    .line 105
    invoke-static {v11, v14}, Lf35;->g(II)I

    .line 106
    .line 107
    .line 108
    move-result v11

    .line 109
    invoke-direct {v9, v11, v10}, Landroid/graphics/Point;-><init>(II)V

    .line 110
    .line 111
    .line 112
    move-object v10, v9

    .line 113
    :goto_6
    iget v9, v12, Ltb1;->u:I

    .line 114
    .line 115
    mul-int v11, v9, v14

    .line 116
    .line 117
    iget v12, v10, Landroid/graphics/Point;->x:I

    .line 118
    .line 119
    int-to-float v12, v12

    .line 120
    const v13, 0x3f7ae148    # 0.98f

    .line 121
    .line 122
    .line 123
    mul-float/2addr v12, v13

    .line 124
    float-to-int v12, v12

    .line 125
    if-lt v9, v12, :cond_7

    .line 126
    .line 127
    iget v9, v10, Landroid/graphics/Point;->y:I

    .line 128
    .line 129
    int-to-float v9, v9

    .line 130
    mul-float/2addr v9, v13

    .line 131
    float-to-int v9, v9

    .line 132
    if-lt v14, v9, :cond_7

    .line 133
    .line 134
    if-ge v11, v8, :cond_7

    .line 135
    .line 136
    move v8, v11

    .line 137
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 138
    .line 139
    const v9, 0x7fffffff

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_8
    move v9, v8

    .line 144
    goto :goto_8

    .line 145
    :cond_9
    :goto_7
    const v9, 0x7fffffff

    .line 146
    .line 147
    .line 148
    :goto_8
    invoke-static {}, Lyw1;->j()Luw1;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    const/4 v3, 0x0

    .line 153
    :goto_9
    iget v0, v2, Lsv4;->a:I

    .line 154
    .line 155
    if-ge v3, v0, :cond_e

    .line 156
    .line 157
    iget-object v0, v2, Lsv4;->d:[Ltb1;

    .line 158
    .line 159
    aget-object v0, v0, v3

    .line 160
    .line 161
    iget v1, v0, Ltb1;->u:I

    .line 162
    .line 163
    const/4 v5, -0x1

    .line 164
    if-eq v1, v5, :cond_b

    .line 165
    .line 166
    iget v0, v0, Ltb1;->v:I

    .line 167
    .line 168
    if-ne v0, v5, :cond_a

    .line 169
    .line 170
    goto :goto_b

    .line 171
    :cond_a
    mul-int/2addr v1, v0

    .line 172
    :goto_a
    const v11, 0x7fffffff

    .line 173
    .line 174
    .line 175
    goto :goto_c

    .line 176
    :cond_b
    :goto_b
    move v1, v5

    .line 177
    goto :goto_a

    .line 178
    :goto_c
    if-eq v9, v11, :cond_d

    .line 179
    .line 180
    if-eq v1, v5, :cond_c

    .line 181
    .line 182
    if-gt v1, v9, :cond_c

    .line 183
    .line 184
    goto :goto_d

    .line 185
    :cond_c
    const/4 v8, 0x0

    .line 186
    goto :goto_e

    .line 187
    :cond_d
    :goto_d
    const/4 v8, 0x1

    .line 188
    :goto_e
    new-instance v0, Lon0;

    .line 189
    .line 190
    aget v5, p3, v3

    .line 191
    .line 192
    move/from16 v1, p1

    .line 193
    .line 194
    invoke-direct/range {v0 .. v8}, Lon0;-><init>(ILsv4;ILjn0;ILjava/lang/String;IZ)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v10, v0}, Lpw1;->c(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    add-int/lit8 v3, v3, 0x1

    .line 201
    .line 202
    move-object/from16 v2, p2

    .line 203
    .line 204
    goto :goto_9

    .line 205
    :cond_e
    invoke-virtual {v10}, Luw1;->f()Lgy3;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    return-object v0
.end method

.method public j(Landroidx/preference/Preference;)V
    .locals 9

    .line 1
    iget p1, p0, Ldg0;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/high16 v1, 0x1040000

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    iget-object v3, p0, Ldg0;->r:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, Ldg0;->q:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, p0, Ldg0;->p:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object p0, p0, Ldg0;->o:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch p1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p0, Lh62;

    .line 19
    .line 20
    check-cast v5, Ljava/lang/String;

    .line 21
    .line 22
    check-cast v4, Landroid/content/SharedPreferences;

    .line 23
    .line 24
    check-cast v3, Ljava/lang/String;

    .line 25
    .line 26
    new-instance p1, Lvg2;

    .line 27
    .line 28
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    invoke-direct {p1, v6, v2}, Lvg2;-><init>(Landroid/content/Context;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v5}, Lvg2;->o(Ljava/lang/CharSequence;)Lvg2;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const v2, 0x7f1302df

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v2}, Lvg2;->i(I)V

    .line 43
    .line 44
    .line 45
    new-instance v2, Lrn1;

    .line 46
    .line 47
    const/4 v5, 0x3

    .line 48
    invoke-direct {v2, v4, p0, v3, v5}, Lrn1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    const v3, 0x7f1302dd

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v3, v2}, Lvg2;->l(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1, v1, v0}, Lvg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Lvg2;->create()Lf9;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object v0, p0, Lh62;->U0:Lh52;

    .line 67
    .line 68
    iget-object v0, p0, Lh62;->K0:Lf9;

    .line 69
    .line 70
    if-eqz v0, :cond_0

    .line 71
    .line 72
    invoke-virtual {v0}, Ldg;->dismiss()V

    .line 73
    .line 74
    .line 75
    :cond_0
    iput-object p1, p0, Lh62;->K0:Lf9;

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_0
    check-cast p0, Ljx3;

    .line 82
    .line 83
    check-cast v5, Lvb4;

    .line 84
    .line 85
    check-cast v4, Ljx3;

    .line 86
    .line 87
    move-object v6, v3

    .line 88
    check-cast v6, Landroidx/preference/Preference;

    .line 89
    .line 90
    iget-object p1, p0, Ljx3;->n:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p1, Ljava/lang/String;

    .line 93
    .line 94
    if-eqz p1, :cond_1

    .line 95
    .line 96
    new-instance v8, Lvg2;

    .line 97
    .line 98
    invoke-virtual {v5}, Lkc1;->Z()Landroid/content/Context;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-direct {v8, v3, v2}, Lvg2;-><init>(Landroid/content/Context;I)V

    .line 103
    .line 104
    .line 105
    const v2, 0x7f130213

    .line 106
    .line 107
    .line 108
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {v5, v2, p1}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iget-object v2, v8, Le9;->a:La9;

    .line 117
    .line 118
    iput-object p1, v2, La9;->f:Ljava/lang/CharSequence;

    .line 119
    .line 120
    new-instance v2, Lvs1;

    .line 121
    .line 122
    const/4 v7, 0x0

    .line 123
    move-object v3, v5

    .line 124
    move-object v5, v4

    .line 125
    move-object v4, p0

    .line 126
    invoke-direct/range {v2 .. v7}, Lvs1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 127
    .line 128
    .line 129
    const p0, 0x7f130214

    .line 130
    .line 131
    .line 132
    invoke-virtual {v8, p0, v2}, Lvg2;->l(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {p0, v1, v0}, Lvg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-virtual {p0}, Le9;->h()Lf9;

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_1
    move-object v3, v5

    .line 145
    move-object v5, v4

    .line 146
    move-object v4, p0

    .line 147
    iget-object p0, v5, Ljx3;->n:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast p0, Ljava/lang/String;

    .line 150
    .line 151
    if-nez p0, :cond_2

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_2
    invoke-virtual {v3}, Lkc1;->X()Lnc1;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    new-instance v0, Lna4;

    .line 159
    .line 160
    invoke-direct {v0, v3, v4, v5, v6}, Lna4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    invoke-static {p1, p0, v0}, Lud3;->M(Lnc1;Ljava/lang/String;Ljj1;)V

    .line 164
    .line 165
    .line 166
    :goto_0
    return-void

    .line 167
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public onCancel()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldg0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    iget-object v1, p0, Ldg0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lxm0;

    .line 8
    .line 9
    iget-object v2, p0, Ldg0;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ltm0;

    .line 12
    .line 13
    iget-object p0, p0, Ldg0;->r:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lpj4;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 18
    .line 19
    .line 20
    iget-object v1, v1, Lxm0;->a:Landroid/view/ViewGroup;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Lb3;->d()V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    invoke-static {v0}, Lld1;->I(I)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, "Animation from operation "

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p0, " has been cancelled."

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    const-string v0, "FragmentManager"

    .line 55
    .line 56
    invoke-static {v0, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    :cond_0
    return-void
.end method
