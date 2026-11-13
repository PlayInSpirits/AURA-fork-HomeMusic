.class public final Ldefpackage/h62;
.super Ldefpackage/kp3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public A0:Landroidx/preference/Preference;

.field public B0:Landroidx/preference/Preference;

.field public C0:Landroidx/preference/Preference;

.field public final D0:Landroid/os/Handler;

.field public final E0:Ljava/util/concurrent/ExecutorService;

.field public final F0:Ldefpackage/z42;

.field public final G0:Ljava/util/LinkedHashMap;

.field public H0:Ldefpackage/g62;

.field public I0:Z

.field public J0:Ljava/util/concurrent/Future;

.field public K0:Ldefpackage/f9;

.field public L0:Z

.field public M0:J

.field public N0:Z

.field public O0:Z

.field public P0:J

.field public Q0:Z

.field public R0:Ljava/lang/String;

.field public S0:Ljava/lang/String;

.field public T0:Ljava/lang/String;

.field public U0:Ldefpackage/h52;

.field public V0:Z

.field public final W0:Ldefpackage/dc1;

.field public final X0:Ldefpackage/g5;

.field public t0:Landroid/content/Context;

.field public u0:Landroid/net/nsd/NsdManager;

.field public v0:Landroidx/preference/SwitchPreference;

.field public w0:Landroidx/preference/SwitchPreference;

.field public x0:Landroidx/preference/PreferenceCategory;

.field public y0:Landroidx/preference/PreferenceCategory;

.field public z0:Landroidx/preference/PreferenceCategory;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ldefpackage/kp3;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Ldefpackage/h62;->D0:Landroid/os/Handler;

    .line 14
    .line 15
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Ldefpackage/h62;->E0:Ljava/util/concurrent/ExecutorService;

    .line 20
    .line 21
    new-instance v0, Ldefpackage/z42;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Ldefpackage/h62;->F0:Ldefpackage/z42;

    .line 27
    .line 28
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Ldefpackage/h62;->G0:Ljava/util/LinkedHashMap;

    .line 34
    .line 35
    const-string v0, ""

    .line 36
    .line 37
    iput-object v0, p0, Ldefpackage/h62;->R0:Ljava/lang/String;

    .line 38
    .line 39
    iput-object v0, p0, Ldefpackage/h62;->T0:Ljava/lang/String;

    .line 40
    .line 41
    new-instance v0, Ldefpackage/q5;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-direct {v0, v1}, Ldefpackage/q5;-><init>(I)V

    .line 45
    .line 46
    .line 47
    new-instance v1, Ldefpackage/a62;

    .line 48
    .line 49
    const/4 v2, 0x4

    .line 50
    invoke-direct {v1, p0, v2}, Ldefpackage/a62;-><init>(Ldefpackage/h62;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v1, v0}, Ldefpackage/kc1;->W(Ldefpackage/p5;Ldefpackage/su3;)Ldefpackage/dc1;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, Ldefpackage/h62;->W0:Ldefpackage/dc1;

    .line 58
    .line 59
    new-instance v0, Ldefpackage/g5;

    .line 60
    .line 61
    const/16 v1, 0x11

    .line 62
    .line 63
    invoke-direct {v0, v1, p0}, Ldefpackage/g5;-><init>(ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iput-object v0, p0, Ldefpackage/h62;->X0:Ldefpackage/g5;

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final I()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/h62;->E0:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 8
    .line 9
    return-void
.end method

.method public final R()V
    .locals 1

    .line 1
    invoke-super {p0}, Ldefpackage/kp3;->R()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Ldefpackage/h62;->L0:Z

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/h62;->D0:Landroid/os/Handler;

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/h62;->X0:Ldefpackage/g5;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final S()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Ldefpackage/h62;->L0:Z

    .line 3
    .line 4
    iget-wide v1, p0, Ldefpackage/h62;->M0:J

    .line 5
    .line 6
    const-wide/16 v3, 0x1

    .line 7
    .line 8
    add-long/2addr v1, v3

    .line 9
    iput-wide v1, p0, Ldefpackage/h62;->M0:J

    .line 10
    .line 11
    iput-boolean v0, p0, Ldefpackage/h62;->N0:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Ldefpackage/h62;->O0:Z

    .line 14
    .line 15
    iget-object v1, p0, Ldefpackage/h62;->D0:Landroid/os/Handler;

    .line 16
    .line 17
    iget-object v2, p0, Ldefpackage/h62;->X0:Ldefpackage/g5;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Ldefpackage/h62;->H0:Ldefpackage/g62;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    :try_start_0
    iget-object v3, p0, Ldefpackage/h62;->u0:Landroid/net/nsd/NsdManager;

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-virtual {v3, v1}, Landroid/net/nsd/NsdManager;->stopServiceDiscovery(Landroid/net/nsd/NsdManager$DiscoveryListener;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const-string v1, "nsd"

    .line 36
    .line 37
    invoke-static {v1}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    :catchall_0
    :cond_1
    :goto_0
    iput-object v2, p0, Ldefpackage/h62;->H0:Ldefpackage/g62;

    .line 42
    .line 43
    iput-boolean v0, p0, Ldefpackage/h62;->I0:Z

    .line 44
    .line 45
    iget-object v0, p0, Ldefpackage/h62;->J0:Ljava/util/concurrent/Future;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 51
    .line 52
    .line 53
    :cond_2
    iget-object v0, p0, Ldefpackage/h62;->F0:Ldefpackage/z42;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    :try_start_1
    iget-object v0, v0, Ldefpackage/z42;->a:Ljavax/net/ssl/SSLSocket;

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    .line 64
    .line 65
    :catchall_1
    :cond_3
    iget-object v0, p0, Ldefpackage/h62;->K0:Ldefpackage/f9;

    .line 66
    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    invoke-virtual {v0}, Ldefpackage/dg;->dismiss()V

    .line 70
    .line 71
    .line 72
    :cond_4
    iput-object v2, p0, Ldefpackage/h62;->K0:Ldefpackage/f9;

    .line 73
    .line 74
    iput-object v2, p0, Ldefpackage/h62;->U0:Ldefpackage/h52;

    .line 75
    .line 76
    invoke-super {p0}, Ldefpackage/kp3;->S()V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final T(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, Ldefpackage/kp3;->T(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    sget-object p1, Ldefpackage/u52;->b:Ldefpackage/k03;

    .line 8
    .line 9
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    new-instance v0, Ldefpackage/x;

    .line 14
    .line 15
    const/16 v1, 0x14

    .line 16
    .line 17
    invoke-direct {v0, v1, p0}, Ldefpackage/x;-><init>(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    new-instance p0, Ldefpackage/wd1;

    .line 21
    .line 22
    const/4 v1, 0x5

    .line 23
    invoke-direct {p0, v0, v1}, Ldefpackage/wd1;-><init>(Ldefpackage/if1;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2, p0}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final i0(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Ldefpackage/h62;->t0:Landroid/content/Context;

    .line 13
    .line 14
    const-class v1, Landroid/net/nsd/NsdManager;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast v0, Landroid/net/nsd/NsdManager;

    .line 24
    .line 25
    iput-object v0, p0, Ldefpackage/h62;->u0:Landroid/net/nsd/NsdManager;

    .line 26
    .line 27
    const v0, 0x7f160003

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0, p1}, Ldefpackage/kp3;->j0(ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string p1, "lan_receiver_enabled"

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Ldefpackage/h62;->m0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Landroidx/preference/SwitchPreference;

    .line 40
    .line 41
    iput-object p1, p0, Ldefpackage/h62;->v0:Landroidx/preference/SwitchPreference;

    .line 42
    .line 43
    const-string p1, "lan_pairing_enabled"

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Ldefpackage/h62;->m0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Landroidx/preference/SwitchPreference;

    .line 50
    .line 51
    iput-object p1, p0, Ldefpackage/h62;->w0:Landroidx/preference/SwitchPreference;

    .line 52
    .line 53
    const-string p1, "lan_paired_controllers"

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ldefpackage/h62;->m0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Landroidx/preference/PreferenceCategory;

    .line 60
    .line 61
    iput-object p1, p0, Ldefpackage/h62;->x0:Landroidx/preference/PreferenceCategory;

    .line 62
    .line 63
    const-string p1, "lan_pair_requests"

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Ldefpackage/h62;->m0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Landroidx/preference/PreferenceCategory;

    .line 70
    .line 71
    iput-object p1, p0, Ldefpackage/h62;->y0:Landroidx/preference/PreferenceCategory;

    .line 72
    .line 73
    const-string p1, "lan_available_devices"

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Ldefpackage/h62;->m0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Landroidx/preference/PreferenceCategory;

    .line 80
    .line 81
    iput-object p1, p0, Ldefpackage/h62;->z0:Landroidx/preference/PreferenceCategory;

    .line 82
    .line 83
    const-string p1, "lan_setup_status"

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Ldefpackage/h62;->m0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iput-object p1, p0, Ldefpackage/h62;->A0:Landroidx/preference/Preference;

    .line 90
    .line 91
    const-string p1, "lan_controlled_device"

    .line 92
    .line 93
    invoke-virtual {p0, p1}, Ldefpackage/h62;->m0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iput-object p1, p0, Ldefpackage/h62;->B0:Landroidx/preference/Preference;

    .line 98
    .line 99
    const-string p1, "lan_release_device"

    .line 100
    .line 101
    invoke-virtual {p0, p1}, Ldefpackage/h62;->m0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iput-object p1, p0, Ldefpackage/h62;->C0:Landroidx/preference/Preference;

    .line 106
    .line 107
    const-string p1, "lan_name"

    .line 108
    .line 109
    invoke-virtual {p0, p1}, Ldefpackage/h62;->m0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    check-cast p1, Landroidx/preference/EditTextPreference;

    .line 114
    .line 115
    sget-boolean v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 116
    .line 117
    iget-object v0, p0, Ldefpackage/h62;->t0:Landroid/content/Context;

    .line 118
    .line 119
    const/4 v1, 0x0

    .line 120
    if-eqz v0, :cond_3

    .line 121
    .line 122
    invoke-static {v0}, Ldefpackage/kb4;->M(Landroid/content/Context;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {p1, v0}, Landroidx/preference/EditTextPreference;->E(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    iget-object v0, p1, Landroidx/preference/EditTextPreference;->h0:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {p1, v0}, Landroidx/preference/Preference;->x(Ljava/lang/CharSequence;)V

    .line 132
    .line 133
    .line 134
    new-instance v0, Ldefpackage/er1;

    .line 135
    .line 136
    const/16 v2, 0xb

    .line 137
    .line 138
    invoke-direct {v0, v2}, Ldefpackage/er1;-><init>(I)V

    .line 139
    .line 140
    .line 141
    iput-object v0, p1, Landroidx/preference/EditTextPreference;->i0:Ldefpackage/gz0;

    .line 142
    .line 143
    new-instance v0, Ldefpackage/ef0;

    .line 144
    .line 145
    const/16 v2, 0x8

    .line 146
    .line 147
    invoke-direct {v0, v2, p0, p1}, Ldefpackage/ef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    iput-object v0, p1, Landroidx/preference/Preference;->r:Ldefpackage/bp3;

    .line 151
    .line 152
    iget-object p1, p0, Ldefpackage/h62;->v0:Landroidx/preference/SwitchPreference;

    .line 153
    .line 154
    if-eqz p1, :cond_2

    .line 155
    .line 156
    new-instance v0, Ldefpackage/a62;

    .line 157
    .line 158
    const/4 v2, 0x0

    .line 159
    invoke-direct {v0, p0, v2}, Ldefpackage/a62;-><init>(Ldefpackage/h62;I)V

    .line 160
    .line 161
    .line 162
    iput-object v0, p1, Landroidx/preference/Preference;->r:Ldefpackage/bp3;

    .line 163
    .line 164
    iget-object p1, p0, Ldefpackage/h62;->w0:Landroidx/preference/SwitchPreference;

    .line 165
    .line 166
    if-eqz p1, :cond_1

    .line 167
    .line 168
    new-instance v0, Ldefpackage/a62;

    .line 169
    .line 170
    const/4 v2, 0x1

    .line 171
    invoke-direct {v0, p0, v2}, Ldefpackage/a62;-><init>(Ldefpackage/h62;I)V

    .line 172
    .line 173
    .line 174
    iput-object v0, p1, Landroidx/preference/Preference;->r:Ldefpackage/bp3;

    .line 175
    .line 176
    const-string p1, "lan_find_devices"

    .line 177
    .line 178
    invoke-virtual {p0, p1}, Ldefpackage/h62;->m0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    new-instance v0, Ldefpackage/a62;

    .line 183
    .line 184
    const/4 v2, 0x2

    .line 185
    invoke-direct {v0, p0, v2}, Ldefpackage/a62;-><init>(Ldefpackage/h62;I)V

    .line 186
    .line 187
    .line 188
    iput-object v0, p1, Landroidx/preference/Preference;->s:Ldefpackage/cp3;

    .line 189
    .line 190
    iget-object p1, p0, Ldefpackage/h62;->C0:Landroidx/preference/Preference;

    .line 191
    .line 192
    if-eqz p1, :cond_0

    .line 193
    .line 194
    new-instance v0, Ldefpackage/a62;

    .line 195
    .line 196
    const/4 v1, 0x3

    .line 197
    invoke-direct {v0, p0, v1}, Ldefpackage/a62;-><init>(Ldefpackage/h62;I)V

    .line 198
    .line 199
    .line 200
    iput-object v0, p1, Landroidx/preference/Preference;->s:Ldefpackage/cp3;

    .line 201
    .line 202
    return-void

    .line 203
    :cond_0
    const-string p0, "releaseControl"

    .line 204
    .line 205
    invoke-static {p0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v1

    .line 209
    :cond_1
    const-string p0, "pairing"

    .line 210
    .line 211
    invoke-static {p0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw v1

    .line 215
    :cond_2
    const-string p0, "receiver"

    .line 216
    .line 217
    invoke-static {p0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw v1

    .line 221
    :cond_3
    const-string p0, "app"

    .line 222
    .line 223
    invoke-static {p0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw v1
.end method

.method public final k0(Landroid/net/nsd/NsdServiceInfo;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Ldefpackage/h62;->O0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Ldefpackage/h62;->O0:Z

    .line 8
    .line 9
    iget-wide v5, p0, Ldefpackage/h62;->M0:J

    .line 10
    .line 11
    sget-boolean v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 12
    .line 13
    iget-object v0, p0, Ldefpackage/h62;->t0:Landroid/content/Context;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-static {v0}, Ldefpackage/kb4;->M(Landroid/content/Context;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-object v0, p0, Ldefpackage/h62;->E0:Ljava/util/concurrent/ExecutorService;

    .line 22
    .line 23
    new-instance v1, Ldefpackage/un1;

    .line 24
    .line 25
    move-object v2, p0

    .line 26
    move-object v3, p1

    .line 27
    invoke-direct/range {v1 .. v6}, Ldefpackage/un1;-><init>(Ldefpackage/h62;Landroid/net/nsd/NsdServiceInfo;Ljava/lang/String;J)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    iput-object p0, v2, Ldefpackage/h62;->J0:Ljava/util/concurrent/Future;

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    const-string p0, "app"

    .line 38
    .line 39
    invoke-static {p0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    throw p0
.end method

.method public final l0(J)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Ldefpackage/h62;->L0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, Ldefpackage/h62;->M0:J

    .line 6
    .line 7
    cmp-long p0, p1, v0

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final m0(Ljava/lang/String;)Landroidx/preference/Preference;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ldefpackage/kp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string p0, "Required value was null."

    .line 9
    .line 10
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method

.method public final n0()V
    .locals 8

    .line 1
    iget-object v0, p0, Ldefpackage/h62;->z0:Landroidx/preference/PreferenceCategory;

    .line 2
    .line 3
    const-string v1, "devices"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/preference/PreferenceGroup;->H()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ldefpackage/h62;->z0:Landroidx/preference/PreferenceCategory;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    iget-object v3, p0, Ldefpackage/h62;->G0:Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    xor-int/lit8 v4, v4, 0x1

    .line 22
    .line 23
    invoke-virtual {v0, v4}, Landroidx/preference/Preference;->A(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    check-cast v0, Ljava/lang/Iterable;

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Ldefpackage/c62;

    .line 50
    .line 51
    iget-object v4, p0, Ldefpackage/h62;->z0:Landroidx/preference/PreferenceCategory;

    .line 52
    .line 53
    if-eqz v4, :cond_0

    .line 54
    .line 55
    new-instance v5, Landroidx/preference/Preference;

    .line 56
    .line 57
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-direct {v5, v6, v2}, Landroidx/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 62
    .line 63
    .line 64
    iget-object v6, v3, Ldefpackage/c62;->a:Landroid/net/nsd/NsdServiceInfo;

    .line 65
    .line 66
    invoke-virtual {v6}, Landroid/net/nsd/NsdServiceInfo;->getServiceName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    const-string v7, "Tempus "

    .line 74
    .line 75
    invoke-static {v6, v7}, Ldefpackage/qm4;->z0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-virtual {v5, v6}, Landroidx/preference/Preference;->z(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const v6, 0x7f1302e4

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v6}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-virtual {v5, v6}, Landroidx/preference/Preference;->x(Ljava/lang/CharSequence;)V

    .line 90
    .line 91
    .line 92
    const v6, 0x7f0801fd

    .line 93
    .line 94
    .line 95
    invoke-virtual {v5, v6}, Landroidx/preference/Preference;->v(I)V

    .line 96
    .line 97
    .line 98
    const/4 v6, 0x0

    .line 99
    iput-boolean v6, v5, Landroidx/preference/Preference;->F:Z

    .line 100
    .line 101
    new-instance v6, Ldefpackage/ef0;

    .line 102
    .line 103
    const/4 v7, 0x7

    .line 104
    invoke-direct {v6, v7, p0, v3}, Ldefpackage/ef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iput-object v6, v5, Landroidx/preference/Preference;->s:Ldefpackage/cp3;

    .line 108
    .line 109
    invoke-virtual {v4, v5}, Landroidx/preference/PreferenceGroup;->E(Landroidx/preference/Preference;)V

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_0
    invoke-static {v1}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v2

    .line 117
    :cond_1
    return-void

    .line 118
    :cond_2
    invoke-static {v1}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw v2

    .line 122
    :cond_3
    invoke-static {v1}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v2
.end method

.method public final o0()V
    .locals 15

    .line 1
    sget-boolean v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/h62;->t0:Landroid/content/Context;

    .line 4
    .line 5
    const-string v1, "app"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v0, :cond_b

    .line 9
    .line 10
    const-string v3, "lan-playback"

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    invoke-virtual {v0, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object v8

    .line 17
    iget-object v0, p0, Ldefpackage/h62;->t0:Landroid/content/Context;

    .line 18
    .line 19
    if-eqz v0, :cond_a

    .line 20
    .line 21
    invoke-static {v0}, Ldefpackage/kb4;->a0(Landroid/content/Context;)Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Iterable;

    .line 26
    .line 27
    new-instance v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    const/16 v3, 0xa

    .line 30
    .line 31
    invoke-static {v0, v3}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Ljava/lang/String;

    .line 53
    .line 54
    new-instance v5, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v6, "peer-"

    .line 57
    .line 58
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-interface {v8, v5, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    if-eqz v5, :cond_1

    .line 73
    .line 74
    invoke-static {v5}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-nez v6, :cond_0

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_0
    move-object v5, v2

    .line 82
    :goto_1
    if-eqz v5, :cond_1

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_1
    const v5, 0x7f1302ea

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v5}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    :goto_2
    new-instance v6, Ldefpackage/kd3;

    .line 96
    .line 97
    invoke-direct {v6, v3, v5}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    new-instance v0, Ldefpackage/ca1;

    .line 105
    .line 106
    const/16 v3, 0x1c

    .line 107
    .line 108
    invoke-direct {v0, v3}, Ldefpackage/ca1;-><init>(I)V

    .line 109
    .line 110
    .line 111
    invoke-static {v1, v0}, Ldefpackage/q40;->K0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    new-instance v13, Ldefpackage/k52;

    .line 116
    .line 117
    const/16 v0, 0x8

    .line 118
    .line 119
    invoke-direct {v13, v0}, Ldefpackage/k52;-><init>(I)V

    .line 120
    .line 121
    .line 122
    const/16 v14, 0x1f

    .line 123
    .line 124
    const/4 v10, 0x0

    .line 125
    const/4 v11, 0x0

    .line 126
    const/4 v12, 0x0

    .line 127
    invoke-static/range {v9 .. v14}, Ldefpackage/q40;->B0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldefpackage/if1;I)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    iget-object v1, p0, Ldefpackage/h62;->S0:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eqz v1, :cond_3

    .line 138
    .line 139
    goto/16 :goto_4

    .line 140
    .line 141
    :cond_3
    iput-object v0, p0, Ldefpackage/h62;->S0:Ljava/lang/String;

    .line 142
    .line 143
    iget-object v0, p0, Ldefpackage/h62;->x0:Landroidx/preference/PreferenceCategory;

    .line 144
    .line 145
    const-string v1, "paired"

    .line 146
    .line 147
    if-eqz v0, :cond_9

    .line 148
    .line 149
    invoke-virtual {v0}, Landroidx/preference/PreferenceGroup;->H()V

    .line 150
    .line 151
    .line 152
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_6

    .line 157
    .line 158
    iget-object v0, p0, Ldefpackage/h62;->x0:Landroidx/preference/PreferenceCategory;

    .line 159
    .line 160
    if-eqz v0, :cond_5

    .line 161
    .line 162
    new-instance v1, Landroidx/preference/Preference;

    .line 163
    .line 164
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-direct {v1, v3, v2}, Landroidx/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 169
    .line 170
    .line 171
    const v2, 0x7f1302c3

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0, v2}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-virtual {v1, p0}, Landroidx/preference/Preference;->x(Ljava/lang/CharSequence;)V

    .line 179
    .line 180
    .line 181
    iget-boolean p0, v1, Landroidx/preference/Preference;->D:Z

    .line 182
    .line 183
    if-eqz p0, :cond_4

    .line 184
    .line 185
    iput-boolean v4, v1, Landroidx/preference/Preference;->D:Z

    .line 186
    .line 187
    invoke-virtual {v1}, Landroidx/preference/Preference;->h()V

    .line 188
    .line 189
    .line 190
    :cond_4
    invoke-virtual {v0, v1}, Landroidx/preference/PreferenceGroup;->E(Landroidx/preference/Preference;)V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :cond_5
    invoke-static {v1}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw v2

    .line 198
    :cond_6
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-eqz v3, :cond_8

    .line 207
    .line 208
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    check-cast v3, Ldefpackage/kd3;

    .line 213
    .line 214
    iget-object v5, v3, Ldefpackage/kd3;->n:Ljava/lang/Object;

    .line 215
    .line 216
    move-object v9, v5

    .line 217
    check-cast v9, Ljava/lang/String;

    .line 218
    .line 219
    iget-object v3, v3, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 220
    .line 221
    move-object v7, v3

    .line 222
    check-cast v7, Ljava/lang/String;

    .line 223
    .line 224
    iget-object v3, p0, Ldefpackage/h62;->x0:Landroidx/preference/PreferenceCategory;

    .line 225
    .line 226
    if-eqz v3, :cond_7

    .line 227
    .line 228
    new-instance v11, Landroidx/preference/Preference;

    .line 229
    .line 230
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-direct {v11, v5, v2}, Landroidx/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v11, v7}, Landroidx/preference/Preference;->z(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    const v5, 0x7f1302de

    .line 241
    .line 242
    .line 243
    invoke-virtual {p0, v5}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    invoke-virtual {v11, v5}, Landroidx/preference/Preference;->x(Ljava/lang/CharSequence;)V

    .line 248
    .line 249
    .line 250
    iput-boolean v4, v11, Landroidx/preference/Preference;->F:Z

    .line 251
    .line 252
    new-instance v5, Ldefpackage/dg0;

    .line 253
    .line 254
    const/4 v10, 0x4

    .line 255
    move-object v6, p0

    .line 256
    invoke-direct/range {v5 .. v10}, Ldefpackage/dg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 257
    .line 258
    .line 259
    iput-object v5, v11, Landroidx/preference/Preference;->s:Ldefpackage/cp3;

    .line 260
    .line 261
    invoke-virtual {v3, v11}, Landroidx/preference/PreferenceGroup;->E(Landroidx/preference/Preference;)V

    .line 262
    .line 263
    .line 264
    goto :goto_3

    .line 265
    :cond_7
    invoke-static {v1}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    throw v2

    .line 269
    :cond_8
    :goto_4
    return-void

    .line 270
    :cond_9
    invoke-static {v1}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    throw v2

    .line 274
    :cond_a
    invoke-static {v1}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    throw v2

    .line 278
    :cond_b
    invoke-static {v1}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    throw v2
.end method

.method public final p0()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    sget-boolean v3, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 8
    .line 9
    sget-boolean v3, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 10
    .line 11
    const-wide/16 v4, 0x0

    .line 12
    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    iput-wide v4, v0, Ldefpackage/h62;->P0:J

    .line 16
    .line 17
    :cond_0
    sget-boolean v3, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    iput-boolean v6, v0, Ldefpackage/h62;->Q0:Z

    .line 23
    .line 24
    :cond_1
    iget-wide v7, v0, Ldefpackage/h62;->P0:J

    .line 25
    .line 26
    cmp-long v3, v7, v4

    .line 27
    .line 28
    if-eqz v3, :cond_3

    .line 29
    .line 30
    sget-object v3, Lcom/eddyizm/tempus/lan/LanReceiverService;->z:Ljava/lang/String;

    .line 31
    .line 32
    if-nez v3, :cond_2

    .line 33
    .line 34
    iget-wide v7, v0, Ldefpackage/h62;->P0:J

    .line 35
    .line 36
    sub-long v7, v1, v7

    .line 37
    .line 38
    const-wide/16 v9, 0x2710

    .line 39
    .line 40
    cmp-long v3, v7, v9

    .line 41
    .line 42
    if-lez v3, :cond_3

    .line 43
    .line 44
    :cond_2
    iput-wide v4, v0, Ldefpackage/h62;->P0:J

    .line 45
    .line 46
    const v3, 0x7f1302b1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v3}, Ldefpackage/h62;->s0(I)V

    .line 50
    .line 51
    .line 52
    :cond_3
    sget-boolean v3, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 53
    .line 54
    const/4 v7, 0x1

    .line 55
    if-eqz v3, :cond_4

    .line 56
    .line 57
    iget-boolean v3, v0, Ldefpackage/h62;->Q0:Z

    .line 58
    .line 59
    if-nez v3, :cond_4

    .line 60
    .line 61
    move v3, v7

    .line 62
    goto :goto_0

    .line 63
    :cond_4
    move v3, v6

    .line 64
    :goto_0
    iget-object v8, v0, Ldefpackage/h62;->v0:Landroidx/preference/SwitchPreference;

    .line 65
    .line 66
    const-string v9, "receiver"

    .line 67
    .line 68
    const/4 v10, 0x0

    .line 69
    if-eqz v8, :cond_1e

    .line 70
    .line 71
    if-nez v3, :cond_6

    .line 72
    .line 73
    iget-wide v11, v0, Ldefpackage/h62;->P0:J

    .line 74
    .line 75
    cmp-long v11, v11, v4

    .line 76
    .line 77
    if-eqz v11, :cond_5

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_5
    move v11, v6

    .line 81
    goto :goto_2

    .line 82
    :cond_6
    :goto_1
    move v11, v7

    .line 83
    :goto_2
    invoke-virtual {v8, v11}, Landroidx/preference/TwoStatePreference;->E(Z)V

    .line 84
    .line 85
    .line 86
    iget-object v8, v0, Ldefpackage/h62;->v0:Landroidx/preference/SwitchPreference;

    .line 87
    .line 88
    if-eqz v8, :cond_1d

    .line 89
    .line 90
    iget-wide v11, v0, Ldefpackage/h62;->P0:J

    .line 91
    .line 92
    cmp-long v4, v11, v4

    .line 93
    .line 94
    if-eqz v4, :cond_7

    .line 95
    .line 96
    const v4, 0x7f1302b0

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_7
    const v4, 0x7f1302d7

    .line 101
    .line 102
    .line 103
    :goto_3
    invoke-virtual {v0, v4}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v8, v4}, Landroidx/preference/Preference;->x(Ljava/lang/CharSequence;)V

    .line 108
    .line 109
    .line 110
    iget-object v4, v0, Ldefpackage/h62;->w0:Landroidx/preference/SwitchPreference;

    .line 111
    .line 112
    const-string v5, "pairing"

    .line 113
    .line 114
    if-eqz v4, :cond_1c

    .line 115
    .line 116
    invoke-virtual {v4, v3}, Landroidx/preference/Preference;->A(Z)V

    .line 117
    .line 118
    .line 119
    iget-object v4, v0, Ldefpackage/h62;->x0:Landroidx/preference/PreferenceCategory;

    .line 120
    .line 121
    if-eqz v4, :cond_1b

    .line 122
    .line 123
    invoke-virtual {v4, v3}, Landroidx/preference/Preference;->A(Z)V

    .line 124
    .line 125
    .line 126
    if-eqz v3, :cond_8

    .line 127
    .line 128
    invoke-virtual {v0}, Ldefpackage/h62;->o0()V

    .line 129
    .line 130
    .line 131
    :cond_8
    if-eqz v3, :cond_9

    .line 132
    .line 133
    sget-wide v3, Lcom/eddyizm/tempus/lan/LanReceiverService;->A:J

    .line 134
    .line 135
    cmp-long v3, v1, v3

    .line 136
    .line 137
    if-gez v3, :cond_9

    .line 138
    .line 139
    move v3, v7

    .line 140
    goto :goto_4

    .line 141
    :cond_9
    move v3, v6

    .line 142
    :goto_4
    iget-object v4, v0, Ldefpackage/h62;->w0:Landroidx/preference/SwitchPreference;

    .line 143
    .line 144
    if-eqz v4, :cond_1a

    .line 145
    .line 146
    invoke-virtual {v4, v3}, Landroidx/preference/TwoStatePreference;->E(Z)V

    .line 147
    .line 148
    .line 149
    iget-object v4, v0, Ldefpackage/h62;->w0:Landroidx/preference/SwitchPreference;

    .line 150
    .line 151
    if-eqz v4, :cond_19

    .line 152
    .line 153
    if-eqz v3, :cond_a

    .line 154
    .line 155
    sget-wide v8, Lcom/eddyizm/tempus/lan/LanReceiverService;->A:J

    .line 156
    .line 157
    sub-long/2addr v8, v1

    .line 158
    const-wide/16 v11, 0x3e7

    .line 159
    .line 160
    add-long/2addr v8, v11

    .line 161
    const-wide/16 v11, 0x3e8

    .line 162
    .line 163
    div-long/2addr v8, v11

    .line 164
    const-wide/16 v11, 0x3c

    .line 165
    .line 166
    div-long v13, v8, v11

    .line 167
    .line 168
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    rem-long/2addr v8, v11

    .line 173
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    filled-new-array {v5, v8}, [Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    const/4 v8, 0x2

    .line 182
    invoke-static {v5, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    const-string v8, "%d:%02d"

    .line 187
    .line 188
    invoke-static {v8, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    const v8, 0x7f1302d0

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v8, v5}, Ldefpackage/kc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    goto :goto_5

    .line 204
    :cond_a
    const v5, 0x7f1302ce

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v5}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    :goto_5
    invoke-virtual {v4, v5}, Landroidx/preference/Preference;->x(Ljava/lang/CharSequence;)V

    .line 212
    .line 213
    .line 214
    if-eqz v3, :cond_d

    .line 215
    .line 216
    sget-object v3, Lcom/eddyizm/tempus/lan/LanReceiverService;->B:Ljava/util/concurrent/ConcurrentHashMap;

    .line 217
    .line 218
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    check-cast v3, Ljava/lang/Iterable;

    .line 226
    .line 227
    new-instance v4, Ljava/util/ArrayList;

    .line 228
    .line 229
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 230
    .line 231
    .line 232
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    :cond_b
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    if-eqz v5, :cond_c

    .line 241
    .line 242
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    move-object v8, v5

    .line 247
    check-cast v8, Ldefpackage/h52;

    .line 248
    .line 249
    sget-boolean v9, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 250
    .line 251
    sget-wide v11, Lcom/eddyizm/tempus/lan/LanReceiverService;->A:J

    .line 252
    .line 253
    iget-wide v8, v8, Ldefpackage/h52;->d:J

    .line 254
    .line 255
    cmp-long v11, v1, v11

    .line 256
    .line 257
    if-gez v11, :cond_b

    .line 258
    .line 259
    cmp-long v11, v1, v8

    .line 260
    .line 261
    if-ltz v11, :cond_b

    .line 262
    .line 263
    sub-long v8, v1, v8

    .line 264
    .line 265
    const-wide/32 v11, 0x1d4c0

    .line 266
    .line 267
    .line 268
    cmp-long v8, v8, v11

    .line 269
    .line 270
    if-gez v8, :cond_b

    .line 271
    .line 272
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_c
    new-instance v1, Ldefpackage/ca1;

    .line 277
    .line 278
    const/16 v2, 0x1d

    .line 279
    .line 280
    invoke-direct {v1, v2}, Ldefpackage/ca1;-><init>(I)V

    .line 281
    .line 282
    .line 283
    invoke-static {v4, v1}, Ldefpackage/q40;->K0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    :goto_7
    move-object v11, v1

    .line 288
    goto :goto_8

    .line 289
    :cond_d
    sget-object v1, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 290
    .line 291
    goto :goto_7

    .line 292
    :goto_8
    iget-object v1, v0, Ldefpackage/h62;->y0:Landroidx/preference/PreferenceCategory;

    .line 293
    .line 294
    const-string v2, "pendingRequests"

    .line 295
    .line 296
    if-eqz v1, :cond_18

    .line 297
    .line 298
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 299
    .line 300
    .line 301
    move-result v3

    .line 302
    xor-int/2addr v3, v7

    .line 303
    invoke-virtual {v1, v3}, Landroidx/preference/Preference;->A(Z)V

    .line 304
    .line 305
    .line 306
    iget-object v1, v0, Ldefpackage/h62;->U0:Ldefpackage/h52;

    .line 307
    .line 308
    if-eqz v1, :cond_f

    .line 309
    .line 310
    invoke-static {v11, v1}, Ldefpackage/q40;->s0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    if-nez v1, :cond_f

    .line 315
    .line 316
    iget-object v1, v0, Ldefpackage/h62;->K0:Ldefpackage/f9;

    .line 317
    .line 318
    if-eqz v1, :cond_e

    .line 319
    .line 320
    invoke-virtual {v1}, Ldefpackage/dg;->dismiss()V

    .line 321
    .line 322
    .line 323
    :cond_e
    iput-object v10, v0, Ldefpackage/h62;->U0:Ldefpackage/h52;

    .line 324
    .line 325
    :cond_f
    iget-boolean v1, v0, Ldefpackage/h62;->L0:Z

    .line 326
    .line 327
    if-eqz v1, :cond_13

    .line 328
    .line 329
    iget-object v1, v0, Ldefpackage/h62;->K0:Ldefpackage/f9;

    .line 330
    .line 331
    if-eqz v1, :cond_10

    .line 332
    .line 333
    invoke-virtual {v1}, Landroid/app/Dialog;->isShowing()Z

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    if-ne v1, v7, :cond_10

    .line 338
    .line 339
    goto :goto_a

    .line 340
    :cond_10
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    :cond_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    const-string v4, ":"

    .line 349
    .line 350
    if-eqz v3, :cond_12

    .line 351
    .line 352
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    move-object v5, v3

    .line 357
    check-cast v5, Ldefpackage/h52;

    .line 358
    .line 359
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    iget-object v7, v5, Ldefpackage/h52;->a:Ljava/lang/String;

    .line 363
    .line 364
    iget-wide v8, v5, Ldefpackage/h52;->d:J

    .line 365
    .line 366
    new-instance v5, Ljava/lang/StringBuilder;

    .line 367
    .line 368
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v5, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v5

    .line 384
    iget-object v7, v0, Ldefpackage/h62;->T0:Ljava/lang/String;

    .line 385
    .line 386
    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v5

    .line 390
    if-nez v5, :cond_11

    .line 391
    .line 392
    goto :goto_9

    .line 393
    :cond_12
    move-object v3, v10

    .line 394
    :goto_9
    check-cast v3, Ldefpackage/h52;

    .line 395
    .line 396
    if-eqz v3, :cond_13

    .line 397
    .line 398
    iget-object v1, v3, Ldefpackage/h52;->a:Ljava/lang/String;

    .line 399
    .line 400
    iget-wide v7, v3, Ldefpackage/h52;->d:J

    .line 401
    .line 402
    new-instance v5, Ljava/lang/StringBuilder;

    .line 403
    .line 404
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v5, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    iput-object v1, v0, Ldefpackage/h62;->T0:Ljava/lang/String;

    .line 421
    .line 422
    invoke-virtual {v0, v3}, Ldefpackage/h62;->r0(Ldefpackage/h52;)V

    .line 423
    .line 424
    .line 425
    :cond_13
    :goto_a
    new-instance v15, Ldefpackage/k52;

    .line 426
    .line 427
    const/4 v1, 0x7

    .line 428
    invoke-direct {v15, v1}, Ldefpackage/k52;-><init>(I)V

    .line 429
    .line 430
    .line 431
    const/16 v16, 0x1f

    .line 432
    .line 433
    const/4 v12, 0x0

    .line 434
    const/4 v13, 0x0

    .line 435
    const/4 v14, 0x0

    .line 436
    invoke-static/range {v11 .. v16}, Ldefpackage/q40;->B0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldefpackage/if1;I)Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    iget-object v3, v0, Ldefpackage/h62;->R0:Ljava/lang/String;

    .line 441
    .line 442
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result v3

    .line 446
    if-eqz v3, :cond_14

    .line 447
    .line 448
    goto :goto_c

    .line 449
    :cond_14
    iput-object v1, v0, Ldefpackage/h62;->R0:Ljava/lang/String;

    .line 450
    .line 451
    iget-object v1, v0, Ldefpackage/h62;->y0:Landroidx/preference/PreferenceCategory;

    .line 452
    .line 453
    if-eqz v1, :cond_17

    .line 454
    .line 455
    invoke-virtual {v1}, Landroidx/preference/PreferenceGroup;->H()V

    .line 456
    .line 457
    .line 458
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 463
    .line 464
    .line 465
    move-result v3

    .line 466
    if-eqz v3, :cond_16

    .line 467
    .line 468
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v3

    .line 472
    check-cast v3, Ldefpackage/h52;

    .line 473
    .line 474
    iget-object v4, v0, Ldefpackage/h62;->y0:Landroidx/preference/PreferenceCategory;

    .line 475
    .line 476
    if-eqz v4, :cond_15

    .line 477
    .line 478
    new-instance v5, Landroidx/preference/Preference;

    .line 479
    .line 480
    invoke-virtual {v0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 481
    .line 482
    .line 483
    move-result-object v7

    .line 484
    invoke-direct {v5, v7, v10}, Landroidx/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 485
    .line 486
    .line 487
    iget-object v7, v3, Ldefpackage/h52;->b:Ljava/lang/String;

    .line 488
    .line 489
    invoke-virtual {v5, v7}, Landroidx/preference/Preference;->z(Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    iget-object v7, v3, Ldefpackage/h52;->b:Ljava/lang/String;

    .line 493
    .line 494
    iget-object v8, v3, Ldefpackage/h52;->c:Ljava/lang/String;

    .line 495
    .line 496
    filled-new-array {v7, v8}, [Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v7

    .line 500
    const v8, 0x7f1302ca

    .line 501
    .line 502
    .line 503
    invoke-virtual {v0, v8, v7}, Ldefpackage/kc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v7

    .line 507
    invoke-virtual {v5, v7}, Landroidx/preference/Preference;->x(Ljava/lang/CharSequence;)V

    .line 508
    .line 509
    .line 510
    iput-boolean v6, v5, Landroidx/preference/Preference;->F:Z

    .line 511
    .line 512
    new-instance v7, Ldefpackage/ef0;

    .line 513
    .line 514
    const/4 v8, 0x6

    .line 515
    invoke-direct {v7, v8, v0, v3}, Ldefpackage/ef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    iput-object v7, v5, Landroidx/preference/Preference;->s:Ldefpackage/cp3;

    .line 519
    .line 520
    invoke-virtual {v4, v5}, Landroidx/preference/PreferenceGroup;->E(Landroidx/preference/Preference;)V

    .line 521
    .line 522
    .line 523
    goto :goto_b

    .line 524
    :cond_15
    invoke-static {v2}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    throw v10

    .line 528
    :cond_16
    :goto_c
    return-void

    .line 529
    :cond_17
    invoke-static {v2}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    throw v10

    .line 533
    :cond_18
    invoke-static {v2}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    throw v10

    .line 537
    :cond_19
    invoke-static {v5}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    throw v10

    .line 541
    :cond_1a
    invoke-static {v5}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    throw v10

    .line 545
    :cond_1b
    const-string v0, "paired"

    .line 546
    .line 547
    invoke-static {v0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    throw v10

    .line 551
    :cond_1c
    invoke-static {v5}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 552
    .line 553
    .line 554
    throw v10

    .line 555
    :cond_1d
    invoke-static {v9}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    throw v10

    .line 559
    :cond_1e
    invoke-static {v9}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    throw v10
.end method

.method public final q0()V
    .locals 7

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x25

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    if-lt v0, v1, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/h62;->t0:Landroid/content/Context;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v1, "android.permission.ACCESS_LOCAL_NETWORK"

    .line 14
    .line 15
    invoke-static {v0, v1}, Ldefpackage/ud3;->c(Landroid/content/Context;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iput-boolean v2, p0, Ldefpackage/h62;->V0:Z

    .line 22
    .line 23
    iget-object p0, p0, Ldefpackage/h62;->W0:Ldefpackage/dc1;

    .line 24
    .line 25
    filled-new-array {v1}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p0, v0}, Ldefpackage/dc1;->a(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    const-string p0, "app"

    .line 34
    .line 35
    invoke-static {p0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v3

    .line 39
    :cond_1
    iget-object v0, p0, Ldefpackage/h62;->H0:Ldefpackage/g62;

    .line 40
    .line 41
    const-string v1, "nsd"

    .line 42
    .line 43
    const/4 v4, 0x1

    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    iput-boolean v4, p0, Ldefpackage/h62;->I0:Z

    .line 47
    .line 48
    :try_start_0
    iget-object v4, p0, Ldefpackage/h62;->u0:Landroid/net/nsd/NsdManager;

    .line 49
    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    invoke-virtual {v4, v0}, Landroid/net/nsd/NsdManager;->stopServiceDiscovery(Landroid/net/nsd/NsdManager$DiscoveryListener;)V

    .line 53
    .line 54
    .line 55
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-static {v1}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    :goto_0
    new-instance v1, Ldefpackage/s14;

    .line 65
    .line 66
    invoke-direct {v1, v0}, Ldefpackage/s14;-><init>(Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    move-object v0, v1

    .line 70
    :goto_1
    invoke-static {v0}, Ldefpackage/bb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    iput-object v3, p0, Ldefpackage/h62;->H0:Ldefpackage/g62;

    .line 77
    .line 78
    iput-boolean v2, p0, Ldefpackage/h62;->I0:Z

    .line 79
    .line 80
    invoke-virtual {p0}, Ldefpackage/h62;->q0()V

    .line 81
    .line 82
    .line 83
    :cond_3
    return-void

    .line 84
    :cond_4
    iget-object v0, p0, Ldefpackage/h62;->G0:Ljava/util/LinkedHashMap;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Ldefpackage/h62;->n0()V

    .line 90
    .line 91
    .line 92
    iget-wide v5, p0, Ldefpackage/h62;->M0:J

    .line 93
    .line 94
    new-instance v0, Ldefpackage/g62;

    .line 95
    .line 96
    invoke-direct {v0, p0, v5, v6}, Ldefpackage/g62;-><init>(Ldefpackage/h62;J)V

    .line 97
    .line 98
    .line 99
    iput-object v0, p0, Ldefpackage/h62;->H0:Ldefpackage/g62;

    .line 100
    .line 101
    :try_start_1
    iget-object v2, p0, Ldefpackage/h62;->u0:Landroid/net/nsd/NsdManager;

    .line 102
    .line 103
    if-eqz v2, :cond_5

    .line 104
    .line 105
    const-string v1, "_tempus-lan._tcp."

    .line 106
    .line 107
    invoke-virtual {v2, v1, v4, v0}, Landroid/net/nsd/NsdManager;->discoverServices(Ljava/lang/String;ILandroid/net/nsd/NsdManager$DiscoveryListener;)V

    .line 108
    .line 109
    .line 110
    const v0, 0x7f1302e3

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v0}, Ldefpackage/h62;->s0(I)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_5
    invoke-static {v1}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 121
    :catch_0
    iput-object v3, p0, Ldefpackage/h62;->H0:Ldefpackage/g62;

    .line 122
    .line 123
    const v0, 0x7f1302bb

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v0}, Ldefpackage/h62;->s0(I)V

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method public final r0(Ldefpackage/h52;)V
    .locals 4

    .line 1
    new-instance v0, Ldefpackage/vg2;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, v1, v2}, Ldefpackage/vg2;-><init>(Landroid/content/Context;I)V

    .line 9
    .line 10
    .line 11
    const v1, 0x7f1302cc

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ldefpackage/vg2;->p(I)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p1, Ldefpackage/h52;->b:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v3, p1, Ldefpackage/h52;->c:Ljava/lang/String;

    .line 20
    .line 21
    filled-new-array {v1, v3}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const v3, 0x7f1302ca

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v3, v1}, Ldefpackage/kc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v3, v0, Ldefpackage/e9;->a:Ldefpackage/a9;

    .line 33
    .line 34
    iput-object v1, v3, Ldefpackage/a9;->f:Ljava/lang/CharSequence;

    .line 35
    .line 36
    new-instance v1, Ldefpackage/b62;

    .line 37
    .line 38
    invoke-direct {v1, p0, p1, v2}, Ldefpackage/b62;-><init>(Ldefpackage/kc1;Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    const v2, 0x7f1302c7

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2, v1}, Ldefpackage/vg2;->l(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/vg2;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const/high16 v1, 0x1040000

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-virtual {v0, v1, v2}, Ldefpackage/vg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/vg2;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ldefpackage/vg2;->create()Ldefpackage/f9;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v2, p0, Ldefpackage/h62;->U0:Ldefpackage/h52;

    .line 60
    .line 61
    iget-object v1, p0, Ldefpackage/h62;->K0:Ldefpackage/f9;

    .line 62
    .line 63
    if-eqz v1, :cond_0

    .line 64
    .line 65
    invoke-virtual {v1}, Ldefpackage/dg;->dismiss()V

    .line 66
    .line 67
    .line 68
    :cond_0
    iput-object v0, p0, Ldefpackage/h62;->K0:Ldefpackage/f9;

    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Ldefpackage/h62;->U0:Ldefpackage/h52;

    .line 74
    .line 75
    return-void
.end method

.method public final s0(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/h62;->A0:Landroidx/preference/Preference;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/preference/Preference;->w(I)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "status"

    .line 10
    .line 11
    invoke-static {p0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    throw p0
.end method

.method public final t0()V
    .locals 5

    .line 1
    :try_start_0
    sget-boolean v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    sput-object v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->z:Ljava/lang/String;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-boolean v1, p0, Ldefpackage/h62;->Q0:Z

    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iput-wide v1, p0, Ldefpackage/h62;->P0:J

    .line 14
    .line 15
    iget-object v1, p0, Ldefpackage/h62;->t0:Landroid/content/Context;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    const-string v2, "app"

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    :try_start_1
    new-instance v3, Landroid/content/Intent;

    .line 22
    .line 23
    iget-object v4, p0, Ldefpackage/h62;->t0:Landroid/content/Context;

    .line 24
    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    const-class v0, Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 28
    .line 29
    invoke-direct {v3, v4, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v3}, Ldefpackage/ud3;->G0(Landroid/content/Context;Landroid/content/Intent;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Ldefpackage/h62;->p0()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    invoke-static {v2}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    invoke-static {v2}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 47
    :catch_0
    const-wide/16 v0, 0x0

    .line 48
    .line 49
    iput-wide v0, p0, Ldefpackage/h62;->P0:J

    .line 50
    .line 51
    const v0, 0x7f1302b1

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Ldefpackage/h62;->s0(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ldefpackage/h62;->p0()V

    .line 58
    .line 59
    .line 60
    return-void
.end method
