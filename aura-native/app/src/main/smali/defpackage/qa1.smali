.class public final synthetic Ldefpackage/qa1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/qa1;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final a()V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/media3/session/MediaLibraryService;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/media3/session/MediaLibraryService;->n:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter p0

    .line 8
    :try_start_0
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    throw v0
.end method

.method private final b()V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/hw2;

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/hw2;->p:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object p0, p0, Ldefpackage/hw2;->s:Ldefpackage/fw2;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ldefpackage/fw2;->a()V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p0
.end method

.method private final c()V
    .locals 9

    .line 1
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/u53;

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/u53;->a:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ldefpackage/uj0;

    .line 12
    .line 13
    if-eqz v0, :cond_7

    .line 14
    .line 15
    iget-object p0, p0, Ldefpackage/u53;->c:Ldefpackage/v53;

    .line 16
    .line 17
    invoke-virtual {p0}, Ldefpackage/v53;->b()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    iget-object v1, v0, Ldefpackage/uj0;->a:Ldefpackage/vj0;

    .line 22
    .line 23
    monitor-enter v1

    .line 24
    :try_start_0
    iget v0, v1, Ldefpackage/vj0;->A:I

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-boolean v2, v1, Ldefpackage/vj0;->r:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    monitor-exit v1

    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    move-object p0, v0

    .line 36
    goto/16 :goto_3

    .line 37
    .line 38
    :cond_0
    if-ne v0, p0, :cond_1

    .line 39
    .line 40
    :try_start_1
    iget-object v0, v1, Ldefpackage/vj0;->B:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    monitor-exit v1

    .line 45
    return-void

    .line 46
    :cond_1
    :try_start_2
    iput p0, v1, Ldefpackage/vj0;->A:I

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    if-eq p0, v0, :cond_6

    .line 50
    .line 51
    if-eqz p0, :cond_6

    .line 52
    .line 53
    const/16 v0, 0x8

    .line 54
    .line 55
    if-ne p0, v0, :cond_2

    .line 56
    .line 57
    goto/16 :goto_2

    .line 58
    .line 59
    :cond_2
    iget-object v0, v1, Ldefpackage/vj0;->B:Ljava/lang/String;

    .line 60
    .line 61
    if-nez v0, :cond_4

    .line 62
    .line 63
    iget-object v0, v1, Ldefpackage/vj0;->n:Landroid/content/Context;

    .line 64
    .line 65
    sget-object v2, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    const-string v2, "phone"

    .line 70
    .line 71
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 76
    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkCountryIso()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-nez v2, :cond_3

    .line 88
    .line 89
    invoke-static {v0}, Ldefpackage/rr2;->V(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    goto :goto_0

    .line 94
    :cond_3
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v0}, Ldefpackage/rr2;->V(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    :goto_0
    iput-object v0, v1, Ldefpackage/vj0;->B:Ljava/lang/String;

    .line 107
    .line 108
    :cond_4
    invoke-virtual {v1, p0}, Ldefpackage/vj0;->e(I)J

    .line 109
    .line 110
    .line 111
    move-result-wide v2

    .line 112
    iput-wide v2, v1, Ldefpackage/vj0;->y:J

    .line 113
    .line 114
    iget-object p0, v1, Ldefpackage/vj0;->q:Ldefpackage/vp4;

    .line 115
    .line 116
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 120
    .line 121
    .line 122
    move-result-wide v7

    .line 123
    iget p0, v1, Ldefpackage/vj0;->t:I

    .line 124
    .line 125
    const/4 v0, 0x0

    .line 126
    if-lez p0, :cond_5

    .line 127
    .line 128
    iget-wide v2, v1, Ldefpackage/vj0;->u:J

    .line 129
    .line 130
    sub-long v2, v7, v2

    .line 131
    .line 132
    long-to-int p0, v2

    .line 133
    move v2, p0

    .line 134
    goto :goto_1

    .line 135
    :cond_5
    move v2, v0

    .line 136
    :goto_1
    iget-wide v3, v1, Ldefpackage/vj0;->v:J

    .line 137
    .line 138
    iget-wide v5, v1, Ldefpackage/vj0;->y:J

    .line 139
    .line 140
    invoke-virtual/range {v1 .. v6}, Ldefpackage/vj0;->f(IJJ)V

    .line 141
    .line 142
    .line 143
    iput-wide v7, v1, Ldefpackage/vj0;->u:J

    .line 144
    .line 145
    const-wide/16 v2, 0x0

    .line 146
    .line 147
    iput-wide v2, v1, Ldefpackage/vj0;->v:J

    .line 148
    .line 149
    iput-wide v2, v1, Ldefpackage/vj0;->x:J

    .line 150
    .line 151
    iput-wide v2, v1, Ldefpackage/vj0;->w:J

    .line 152
    .line 153
    iget-object p0, v1, Ldefpackage/vj0;->s:Ldefpackage/fg4;

    .line 154
    .line 155
    iget-object v2, p0, Ldefpackage/fg4;->f:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v2, Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 160
    .line 161
    .line 162
    const/4 v2, -0x1

    .line 163
    iput v2, p0, Ldefpackage/fg4;->b:I

    .line 164
    .line 165
    iput v0, p0, Ldefpackage/fg4;->c:I

    .line 166
    .line 167
    iput v0, p0, Ldefpackage/fg4;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 168
    .line 169
    monitor-exit v1

    .line 170
    return-void

    .line 171
    :cond_6
    :goto_2
    monitor-exit v1

    .line 172
    return-void

    .line 173
    :goto_3
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 174
    throw p0

    .line 175
    :cond_7
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Ldefpackage/qa1;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Ldefpackage/yd1;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    invoke-virtual {p0}, Ldefpackage/kc1;->r()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const v1, 0x7f0702eb

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    float-to-int v0, v0

    .line 30
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    sget-object v2, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 43
    .line 44
    invoke-static {v1}, Ldefpackage/b65;->a(Landroid/view/View;)Ldefpackage/pb5;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const/16 v2, 0x207

    .line 52
    .line 53
    iget-object v1, v1, Ldefpackage/pb5;->a:Ldefpackage/mb5;

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ldefpackage/mb5;->h(I)Ldefpackage/vz1;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget v3, v1, Ldefpackage/vz1;->d:I

    .line 60
    .line 61
    :goto_0
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Ldefpackage/yd1;

    .line 62
    .line 63
    iget-object v1, v1, Ldefpackage/yd1;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 64
    .line 65
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Ldefpackage/yd1;

    .line 70
    .line 71
    iget-object v4, v4, Ldefpackage/yd1;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 72
    .line 73
    invoke-virtual {v4}, Landroid/view/View;->getPaddingTop()I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Ldefpackage/yd1;

    .line 78
    .line 79
    iget-object p0, p0, Ldefpackage/yd1;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 80
    .line 81
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    add-int/2addr v3, v0

    .line 86
    invoke-virtual {v1, v2, v4, p0, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 87
    .line 88
    .line 89
    :goto_1
    return-void

    .line 90
    :pswitch_0
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p0, Ldefpackage/hk3;

    .line 93
    .line 94
    iget-object p0, p0, Ldefpackage/hk3;->l0:Ldefpackage/ey;

    .line 95
    .line 96
    if-eqz p0, :cond_2

    .line 97
    .line 98
    iget-object p0, p0, Ldefpackage/ey;->h:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p0, Landroid/widget/Button;

    .line 101
    .line 102
    const/16 v0, 0x8

    .line 103
    .line 104
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 105
    .line 106
    .line 107
    :cond_2
    return-void

    .line 108
    :pswitch_1
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 111
    .line 112
    :try_start_0
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->M0:Ldefpackage/bl2;

    .line 113
    .line 114
    invoke-virtual {v0}, Ldefpackage/u0;->get()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, Ldefpackage/bj2;

    .line 119
    .line 120
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Ldefpackage/i61;

    .line 121
    .line 122
    iget-object v1, v1, Ldefpackage/i61;->p:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v1, Landroidx/media3/ui/PlayerControlView;

    .line 125
    .line 126
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    iget-boolean v2, v2, Ldefpackage/v52;->a:Z

    .line 131
    .line 132
    if-eqz v2, :cond_3

    .line 133
    .line 134
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->m0:Ldefpackage/a52;

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_3
    move-object v2, v0

    .line 138
    :goto_2
    invoke-virtual {v1, v2}, Landroidx/media3/ui/PlayerControlView;->setPlayer(Ldefpackage/qi3;)V

    .line 139
    .line 140
    .line 141
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    const-string v2, "shuffle_mode"

    .line 153
    .line 154
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    invoke-virtual {v0, v1}, Ldefpackage/sk2;->s(Z)V

    .line 159
    .line 160
    .line 161
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    const-string v2, "repeat_mode"

    .line 173
    .line 174
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    invoke-virtual {v0, v1}, Ldefpackage/sk2;->p0(I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0, v0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->n0(Ldefpackage/bj2;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0}, Ldefpackage/sk2;->K0()Ldefpackage/do2;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-virtual {p0, v1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->q0(Ldefpackage/do2;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0}, Ldefpackage/sk2;->K0()Ldefpackage/do2;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {p0, v1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->p0(Ldefpackage/do2;)V

    .line 196
    .line 197
    .line 198
    new-instance v1, Ldefpackage/zj3;

    .line 199
    .line 200
    invoke-direct {v1, p0, v0}, Ldefpackage/zj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;Ldefpackage/bj2;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v1}, Ldefpackage/sk2;->v(Ldefpackage/oi3;)V

    .line 204
    .line 205
    .line 206
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->E0:Landroid/widget/ImageButton;

    .line 207
    .line 208
    new-instance v2, Ldefpackage/j8;

    .line 209
    .line 210
    const/16 v3, 0xf

    .line 211
    .line 212
    invoke-direct {v2, v3, p0, v0}, Ldefpackage/j8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 216
    .line 217
    .line 218
    invoke-static {}, Ldefpackage/yf4;->c()Ldefpackage/yf4;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    new-instance v2, Ldefpackage/vj3;

    .line 223
    .line 224
    invoke-direct {v2, p0}, Ldefpackage/vj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;)V

    .line 225
    .line 226
    .line 227
    iput-object v2, v1, Ldefpackage/yf4;->h:Ldefpackage/vj3;

    .line 228
    .line 229
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->x0()V

    .line 230
    .line 231
    .line 232
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->v0:Landroid/widget/Button;

    .line 233
    .line 234
    new-instance v2, Ldefpackage/rj3;

    .line 235
    .line 236
    const/4 v3, 0x6

    .line 237
    invoke-direct {v2, p0, v3}, Ldefpackage/rj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;I)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 241
    .line 242
    .line 243
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->w0:Landroid/widget/ToggleButton;

    .line 244
    .line 245
    new-instance v2, Ldefpackage/rj3;

    .line 246
    .line 247
    const/4 v3, 0x7

    .line 248
    invoke-direct {v2, p0, v3}, Ldefpackage/rj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->m0()V

    .line 255
    .line 256
    .line 257
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Ldefpackage/i61;

    .line 258
    .line 259
    if-eqz p0, :cond_4

    .line 260
    .line 261
    iget-object p0, p0, Ldefpackage/i61;->o:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast p0, Landroid/widget/LinearLayout;

    .line 264
    .line 265
    invoke-static {p0, v0}, Ldefpackage/fu;->K(Landroid/view/View;Ldefpackage/qi3;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 266
    .line 267
    .line 268
    goto :goto_3

    .line 269
    :catch_0
    move-exception p0

    .line 270
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 271
    .line 272
    .line 273
    :cond_4
    :goto_3
    return-void

    .line 274
    :pswitch_2
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast p0, Landroidx/media3/ui/PlayerControlView;

    .line 277
    .line 278
    sget-object v0, Landroidx/media3/ui/PlayerControlView;->U0:[F

    .line 279
    .line 280
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->n()V

    .line 281
    .line 282
    .line 283
    return-void

    .line 284
    :pswitch_3
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast p0, Ldefpackage/ki3;

    .line 287
    .line 288
    iget v0, p0, Ldefpackage/ki3;->m:I

    .line 289
    .line 290
    sub-int/2addr v0, v1

    .line 291
    iput v0, p0, Ldefpackage/ki3;->m:I

    .line 292
    .line 293
    return-void

    .line 294
    :pswitch_4
    invoke-direct {p0}, Ldefpackage/qa1;->c()V

    .line 295
    .line 296
    .line 297
    return-void

    .line 298
    :pswitch_5
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast p0, Ldefpackage/qp4;

    .line 301
    .line 302
    iget-object v0, p0, Ldefpackage/qp4;->a:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v0, Ldefpackage/ah2;

    .line 305
    .line 306
    if-eqz v0, :cond_5

    .line 307
    .line 308
    iget-object v2, p0, Ldefpackage/qp4;->b:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v2, Ldefpackage/zg2;

    .line 311
    .line 312
    iget-object p0, p0, Ldefpackage/qp4;->c:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast p0, Landroid/view/View;

    .line 315
    .line 316
    invoke-virtual {v0, v2, p0, v1}, Ldefpackage/ah2;->b(Ldefpackage/zg2;Landroid/view/View;Z)V

    .line 317
    .line 318
    .line 319
    :cond_5
    return-void

    .line 320
    :pswitch_6
    invoke-direct {p0}, Ldefpackage/qa1;->b()V

    .line 321
    .line 322
    .line 323
    return-void

    .line 324
    :pswitch_7
    invoke-direct {p0}, Ldefpackage/qa1;->a()V

    .line 325
    .line 326
    .line 327
    return-void

    .line 328
    :pswitch_8
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast p0, Ldefpackage/uq2;

    .line 331
    .line 332
    invoke-virtual {p0}, Ldefpackage/uq2;->b()V

    .line 333
    .line 334
    .line 335
    return-void

    .line 336
    :pswitch_9
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast p0, Ldefpackage/vo2;

    .line 339
    .line 340
    const/4 v0, -0x1

    .line 341
    iput v0, p0, Ldefpackage/vo2;->n:I

    .line 342
    .line 343
    return-void

    .line 344
    :pswitch_a
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast p0, Ldefpackage/sk2;

    .line 347
    .line 348
    invoke-virtual {p0}, Ldefpackage/sk2;->Y0()V

    .line 349
    .line 350
    .line 351
    return-void

    .line 352
    :pswitch_b
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast p0, Ldefpackage/s22;

    .line 355
    .line 356
    if-eqz p0, :cond_6

    .line 357
    .line 358
    invoke-interface {p0, v2}, Ldefpackage/s22;->f(Ljava/util/concurrent/CancellationException;)V

    .line 359
    .line 360
    .line 361
    :cond_6
    return-void

    .line 362
    :pswitch_c
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;

    .line 365
    .line 366
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    const v1, 0x7f13015b

    .line 371
    .line 372
    .line 373
    invoke-virtual {p0, v1}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object p0

    .line 377
    invoke-static {v0, p0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 378
    .line 379
    .line 380
    move-result-object p0

    .line 381
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 382
    .line 383
    .line 384
    return-void

    .line 385
    :pswitch_d
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast p0, Lcom/eddyizm/tempus/homemusic/WaveOut;

    .line 388
    .line 389
    sget-object v0, Ldefpackage/xt1;->e:Ldefpackage/zr1;

    .line 390
    .line 391
    if-eqz v0, :cond_7

    .line 392
    .line 393
    invoke-virtual {v0, p0}, Ldefpackage/zr1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    :cond_7
    return-void

    .line 397
    :pswitch_e
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast p0, Ldefpackage/vb4;

    .line 400
    .line 401
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 402
    .line 403
    .line 404
    move-result-object p0

    .line 405
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 406
    .line 407
    .line 408
    move-result-object p0

    .line 409
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    invoke-static {p0}, Ldefpackage/gi1;->W(Landroid/content/Context;)V

    .line 413
    .line 414
    .line 415
    return-void

    .line 416
    :pswitch_f
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast p0, Ldefpackage/ps1;

    .line 419
    .line 420
    iget-object v0, p0, Ldefpackage/ps1;->n:Ldefpackage/qi3;

    .line 421
    .line 422
    invoke-interface {v0}, Ldefpackage/qi3;->a()Ldefpackage/gn2;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    invoke-virtual {p0, v0}, Ldefpackage/ps1;->l(Ldefpackage/gn2;)Ldefpackage/oh3;

    .line 427
    .line 428
    .line 429
    move-result-object p0

    .line 430
    sget-object v0, Ldefpackage/rs1;->a:Ldefpackage/rs1;

    .line 431
    .line 432
    sget-object v0, Ldefpackage/b00;->a:Ldefpackage/b00;

    .line 433
    .line 434
    invoke-static {}, Ldefpackage/b00;->a()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    if-eqz p0, :cond_8

    .line 439
    .line 440
    iget-object v2, p0, Ldefpackage/oh3;->a:Ljava/lang/String;

    .line 441
    .line 442
    :cond_8
    invoke-static {v0, v2}, Ldefpackage/rs1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    return-void

    .line 446
    :pswitch_10
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast p0, Ldefpackage/hp1;

    .line 449
    .line 450
    iget-object v0, p0, Ldefpackage/hp1;->n0:Ldefpackage/iu3;

    .line 451
    .line 452
    if-eqz v0, :cond_9

    .line 453
    .line 454
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 455
    .line 456
    .line 457
    move-result-object p0

    .line 458
    iget-object v1, v0, Ldefpackage/iu3;->c:Ldefpackage/hh3;

    .line 459
    .line 460
    invoke-virtual {v1}, Ldefpackage/hh3;->j()Ldefpackage/k03;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    iget-object v0, v0, Ldefpackage/iu3;->d:Ldefpackage/k03;

    .line 465
    .line 466
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    new-instance v2, Ldefpackage/g7;

    .line 470
    .line 471
    invoke-direct {v2, v0, v3}, Ldefpackage/g7;-><init>(Ldefpackage/k03;I)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v1, p0, v2}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 475
    .line 476
    .line 477
    :cond_9
    return-void

    .line 478
    :pswitch_11
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast p0, Ldefpackage/gp1;

    .line 481
    .line 482
    iget-object v0, p0, Ldefpackage/gp1;->n0:Ldefpackage/jn3;

    .line 483
    .line 484
    if-eqz v0, :cond_a

    .line 485
    .line 486
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    iget-object v4, v0, Ldefpackage/jn3;->c:Ldefpackage/hh3;

    .line 491
    .line 492
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    invoke-static {v2, v3}, Ldefpackage/hh3;->l(Ljava/lang/String;Z)Ldefpackage/k03;

    .line 496
    .line 497
    .line 498
    move-result-object v2

    .line 499
    iget-object v0, v0, Ldefpackage/jn3;->e:Ldefpackage/k03;

    .line 500
    .line 501
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    new-instance v4, Ldefpackage/g7;

    .line 505
    .line 506
    invoke-direct {v4, v0, v3}, Ldefpackage/g7;-><init>(Ldefpackage/k03;I)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v2, v1, v4}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 510
    .line 511
    .line 512
    :cond_a
    iget-object v0, p0, Ldefpackage/gp1;->n0:Ldefpackage/jn3;

    .line 513
    .line 514
    if-eqz v0, :cond_b

    .line 515
    .line 516
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 517
    .line 518
    .line 519
    move-result-object p0

    .line 520
    iget-object v1, v0, Ldefpackage/jn3;->c:Ldefpackage/hh3;

    .line 521
    .line 522
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    invoke-static {}, Ldefpackage/hh3;->k()Ldefpackage/k03;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    iget-object v0, v0, Ldefpackage/jn3;->d:Ldefpackage/k03;

    .line 530
    .line 531
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    new-instance v2, Ldefpackage/g7;

    .line 535
    .line 536
    invoke-direct {v2, v0, v3}, Ldefpackage/g7;-><init>(Ldefpackage/k03;I)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v1, p0, v2}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 540
    .line 541
    .line 542
    :cond_b
    return-void

    .line 543
    :pswitch_12
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 544
    .line 545
    check-cast p0, Ldefpackage/bp1;

    .line 546
    .line 547
    iget-object p0, p0, Ldefpackage/bp1;->c:Ldefpackage/cp1;

    .line 548
    .line 549
    invoke-virtual {p0}, Ldefpackage/cp1;->j0()V

    .line 550
    .line 551
    .line 552
    return-void

    .line 553
    :pswitch_13
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 554
    .line 555
    check-cast p0, Ldefpackage/ap1;

    .line 556
    .line 557
    iget-object p0, p0, Ldefpackage/ap1;->b:Ldefpackage/cp1;

    .line 558
    .line 559
    invoke-virtual {p0}, Ldefpackage/cp1;->j0()V

    .line 560
    .line 561
    .line 562
    return-void

    .line 563
    :pswitch_14
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 564
    .line 565
    check-cast p0, Ldefpackage/bp1;

    .line 566
    .line 567
    iget-object p0, p0, Ldefpackage/bp1;->c:Ldefpackage/cp1;

    .line 568
    .line 569
    invoke-virtual {p0}, Ldefpackage/cp1;->j0()V

    .line 570
    .line 571
    .line 572
    return-void

    .line 573
    :pswitch_15
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 574
    .line 575
    check-cast p0, Ldefpackage/ap1;

    .line 576
    .line 577
    iget-object p0, p0, Ldefpackage/ap1;->b:Ldefpackage/cp1;

    .line 578
    .line 579
    invoke-virtual {p0}, Ldefpackage/cp1;->j0()V

    .line 580
    .line 581
    .line 582
    return-void

    .line 583
    :pswitch_16
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 584
    .line 585
    check-cast p0, Ldefpackage/np0;

    .line 586
    .line 587
    iget-object p0, p0, Ldefpackage/np0;->b:Ljava/lang/Object;

    .line 588
    .line 589
    check-cast p0, Ldefpackage/i4;

    .line 590
    .line 591
    iget-object p0, p0, Ldefpackage/i4;->o:Ljava/lang/Object;

    .line 592
    .line 593
    check-cast p0, Ldefpackage/cp1;

    .line 594
    .line 595
    invoke-virtual {p0}, Ldefpackage/cp1;->j0()V

    .line 596
    .line 597
    .line 598
    return-void

    .line 599
    :pswitch_17
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 600
    .line 601
    check-cast p0, Ldefpackage/ap1;

    .line 602
    .line 603
    iget-object p0, p0, Ldefpackage/ap1;->b:Ldefpackage/cp1;

    .line 604
    .line 605
    invoke-virtual {p0}, Ldefpackage/cp1;->j0()V

    .line 606
    .line 607
    .line 608
    return-void

    .line 609
    :pswitch_18
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 610
    .line 611
    check-cast p0, Ldefpackage/fo1;

    .line 612
    .line 613
    invoke-virtual {p0}, Ldefpackage/fo1;->w()V

    .line 614
    .line 615
    .line 616
    return-void

    .line 617
    :pswitch_19
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 618
    .line 619
    check-cast p0, Ldefpackage/om1;

    .line 620
    .line 621
    invoke-virtual {p0}, Ldefpackage/om1;->k()V

    .line 622
    .line 623
    .line 624
    return-void

    .line 625
    :pswitch_1a
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 626
    .line 627
    check-cast p0, Ldefpackage/ui1;

    .line 628
    .line 629
    invoke-virtual {p0}, Ldefpackage/ui1;->k()V

    .line 630
    .line 631
    .line 632
    return-void

    .line 633
    :pswitch_1b
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 634
    .line 635
    check-cast p0, Ldefpackage/kc1;

    .line 636
    .line 637
    iget-object v0, p0, Ldefpackage/kc1;->d0:Ldefpackage/le1;

    .line 638
    .line 639
    iget-object v1, p0, Ldefpackage/kc1;->q:Landroid/os/Bundle;

    .line 640
    .line 641
    iget-object v0, v0, Ldefpackage/le1;->s:Ldefpackage/gp3;

    .line 642
    .line 643
    invoke-virtual {v0, v1}, Ldefpackage/gp3;->s(Landroid/os/Bundle;)V

    .line 644
    .line 645
    .line 646
    iput-object v2, p0, Ldefpackage/kc1;->q:Landroid/os/Bundle;

    .line 647
    .line 648
    return-void

    .line 649
    :pswitch_1c
    iget-object p0, p0, Ldefpackage/qa1;->o:Ljava/lang/Object;

    .line 650
    .line 651
    check-cast p0, Ldefpackage/ra1;

    .line 652
    .line 653
    const-string v0, "fetchFonts result is not OK. ("

    .line 654
    .line 655
    iget-object v1, p0, Ldefpackage/ra1;->q:Ljava/lang/Object;

    .line 656
    .line 657
    monitor-enter v1

    .line 658
    :try_start_1
    iget-object v2, p0, Ldefpackage/ra1;->u:Ldefpackage/bu;

    .line 659
    .line 660
    if-nez v2, :cond_c

    .line 661
    .line 662
    monitor-exit v1

    .line 663
    goto/16 :goto_a

    .line 664
    .line 665
    :catchall_0
    move-exception p0

    .line 666
    goto/16 :goto_c

    .line 667
    .line 668
    :cond_c
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 669
    :try_start_2
    invoke-virtual {p0}, Ldefpackage/ra1;->c()Ldefpackage/ib1;

    .line 670
    .line 671
    .line 672
    move-result-object v1

    .line 673
    iget v2, v1, Ldefpackage/ib1;->f:I

    .line 674
    .line 675
    const/4 v4, 0x2

    .line 676
    if-ne v2, v4, :cond_d

    .line 677
    .line 678
    iget-object v4, p0, Ldefpackage/ra1;->q:Ljava/lang/Object;

    .line 679
    .line 680
    monitor-enter v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 681
    :try_start_3
    monitor-exit v4

    .line 682
    goto :goto_4

    .line 683
    :catchall_1
    move-exception v0

    .line 684
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 685
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 686
    :catchall_2
    move-exception v0

    .line 687
    goto/16 :goto_8

    .line 688
    .line 689
    :cond_d
    :goto_4
    if-nez v2, :cond_10

    .line 690
    .line 691
    :try_start_5
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 692
    .line 693
    sget-object v2, Ldefpackage/ov4;->b:Ljava/lang/reflect/Method;

    .line 694
    .line 695
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 696
    .line 697
    .line 698
    iget-object v0, p0, Ldefpackage/ra1;->p:Ldefpackage/y41;

    .line 699
    .line 700
    iget-object v2, p0, Ldefpackage/ra1;->n:Landroid/content/Context;

    .line 701
    .line 702
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 703
    .line 704
    .line 705
    filled-new-array {v1}, [Ldefpackage/ib1;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    sget-object v4, Ldefpackage/d05;->a:Ldefpackage/vr1;

    .line 710
    .line 711
    const-string v4, "TypefaceCompat.createFromFontInfo"

    .line 712
    .line 713
    invoke-static {v4}, Ldefpackage/xl;->N(Ljava/lang/String;)Ljava/lang/String;

    .line 714
    .line 715
    .line 716
    move-result-object v4

    .line 717
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 718
    .line 719
    .line 720
    :try_start_6
    sget-object v4, Ldefpackage/d05;->a:Ldefpackage/vr1;

    .line 721
    .line 722
    invoke-virtual {v4, v2, v0, v3}, Ldefpackage/vr1;->f(Landroid/content/Context;[Ldefpackage/ib1;I)Landroid/graphics/Typeface;

    .line 723
    .line 724
    .line 725
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 726
    :try_start_7
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 727
    .line 728
    .line 729
    iget-object v2, p0, Ldefpackage/ra1;->n:Landroid/content/Context;

    .line 730
    .line 731
    iget-object v1, v1, Ldefpackage/ib1;->a:Landroid/net/Uri;

    .line 732
    .line 733
    invoke-static {v2, v1}, Ldefpackage/wr1;->N(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 734
    .line 735
    .line 736
    move-result-object v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 737
    if-eqz v1, :cond_f

    .line 738
    .line 739
    if-eqz v0, :cond_f

    .line 740
    .line 741
    :try_start_8
    const-string v2, "EmojiCompat.MetadataRepo.create"

    .line 742
    .line 743
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 744
    .line 745
    .line 746
    new-instance v2, Ldefpackage/na4;

    .line 747
    .line 748
    invoke-static {v1}, Ldefpackage/fh0;->s(Ljava/nio/MappedByteBuffer;)Ldefpackage/wv2;

    .line 749
    .line 750
    .line 751
    move-result-object v1

    .line 752
    invoke-direct {v2, v0, v1}, Ldefpackage/na4;-><init>(Landroid/graphics/Typeface;Ldefpackage/wv2;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 753
    .line 754
    .line 755
    :try_start_9
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 756
    .line 757
    .line 758
    :try_start_a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 759
    .line 760
    .line 761
    iget-object v0, p0, Ldefpackage/ra1;->q:Ljava/lang/Object;

    .line 762
    .line 763
    monitor-enter v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 764
    :try_start_b
    iget-object v1, p0, Ldefpackage/ra1;->u:Ldefpackage/bu;

    .line 765
    .line 766
    if-eqz v1, :cond_e

    .line 767
    .line 768
    invoke-virtual {v1, v2}, Ldefpackage/bu;->v(Ldefpackage/na4;)V

    .line 769
    .line 770
    .line 771
    goto :goto_5

    .line 772
    :catchall_3
    move-exception v1

    .line 773
    goto :goto_6

    .line 774
    :cond_e
    :goto_5
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 775
    :try_start_c
    invoke-virtual {p0}, Ldefpackage/ra1;->b()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 776
    .line 777
    .line 778
    goto :goto_a

    .line 779
    :goto_6
    :try_start_d
    monitor-exit v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 780
    :try_start_e
    throw v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 781
    :catchall_4
    move-exception v0

    .line 782
    :try_start_f
    sget-object v1, Ldefpackage/ov4;->b:Ljava/lang/reflect/Method;

    .line 783
    .line 784
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 785
    .line 786
    .line 787
    throw v0

    .line 788
    :cond_f
    new-instance v0, Ljava/lang/RuntimeException;

    .line 789
    .line 790
    const-string v1, "Unable to open file."

    .line 791
    .line 792
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 793
    .line 794
    .line 795
    throw v0

    .line 796
    :catchall_5
    move-exception v0

    .line 797
    goto :goto_7

    .line 798
    :catchall_6
    move-exception v0

    .line 799
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 800
    .line 801
    .line 802
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 803
    :goto_7
    :try_start_10
    sget-object v1, Ldefpackage/ov4;->b:Ljava/lang/reflect/Method;

    .line 804
    .line 805
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 806
    .line 807
    .line 808
    throw v0

    .line 809
    :cond_10
    new-instance v1, Ljava/lang/RuntimeException;

    .line 810
    .line 811
    new-instance v3, Ljava/lang/StringBuilder;

    .line 812
    .line 813
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 814
    .line 815
    .line 816
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 817
    .line 818
    .line 819
    const-string v0, ")"

    .line 820
    .line 821
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 822
    .line 823
    .line 824
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 825
    .line 826
    .line 827
    move-result-object v0

    .line 828
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 829
    .line 830
    .line 831
    throw v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    .line 832
    :goto_8
    iget-object v2, p0, Ldefpackage/ra1;->q:Ljava/lang/Object;

    .line 833
    .line 834
    monitor-enter v2

    .line 835
    :try_start_11
    iget-object v1, p0, Ldefpackage/ra1;->u:Ldefpackage/bu;

    .line 836
    .line 837
    if-eqz v1, :cond_11

    .line 838
    .line 839
    invoke-virtual {v1, v0}, Ldefpackage/bu;->u(Ljava/lang/Throwable;)V

    .line 840
    .line 841
    .line 842
    goto :goto_9

    .line 843
    :catchall_7
    move-exception p0

    .line 844
    goto :goto_b

    .line 845
    :cond_11
    :goto_9
    monitor-exit v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 846
    invoke-virtual {p0}, Ldefpackage/ra1;->b()V

    .line 847
    .line 848
    .line 849
    :goto_a
    return-void

    .line 850
    :goto_b
    :try_start_12
    monitor-exit v2
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    .line 851
    throw p0

    .line 852
    :goto_c
    :try_start_13
    monitor-exit v1
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    .line 853
    throw p0

    .line 854
    nop

    .line 855
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
