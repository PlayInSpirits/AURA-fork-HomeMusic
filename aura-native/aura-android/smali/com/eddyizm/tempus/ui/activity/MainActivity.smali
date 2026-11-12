.class public Lcom/eddyizm/tempus/ui/activity/MainActivity;
.super Ldf;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final synthetic e0:I


# instance fields
.field public N:Ljava/lang/String;

.field public O:Z

.field public P:Lbl2;

.field public Q:Lk03;

.field public R:Lqp4;

.field public S:Lvf2;

.field public T:Lv23;

.field public U:Lom1;

.field public V:Lzg5;

.field public W:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

.field public X:Z

.field public Y:Lc12;

.field public Z:Lik;

.field public a0:Lv9;

.field public b0:Landroid/content/Intent;

.field public c0:Z

.field public final d0:Lwt;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ldf;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->N:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->O:Z

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-object v1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->Q:Lk03;

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->X:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->c0:Z

    .line 17
    .line 18
    new-instance v0, Lwt;

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    invoke-direct {v0, v1, p0}, Lwt;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->d0:Lwt;

    .line 25
    .line 26
    return-void
.end method

.method public static p(Lcom/eddyizm/tempus/ui/activity/MainActivity;F)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p1, v0

    .line 3
    .line 4
    if-gez v0, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->R:Lqp4;

    .line 8
    .line 9
    iget-object v0, v0, Lqp4;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    int-to-float v0, v0

    .line 18
    const/high16 v1, 0x3f800000    # 1.0f

    .line 19
    .line 20
    sub-float/2addr v1, p1

    .line 21
    mul-float/2addr v1, v0

    .line 22
    sub-float/2addr v0, v1

    .line 23
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->R:Lqp4;

    .line 24
    .line 25
    iget-object p0, p0, Lqp4;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static y()Z
    .locals 1

    .line 1
    invoke-static {}, Lud3;->y()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {}, Lud3;->J()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lud3;->B()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return v0

    .line 22
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 23
    return v0
.end method


# virtual methods
.method public final A(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    const-class v0, Lcom/eddyizm/tempus/service/DownloaderService;

    .line 2
    .line 3
    invoke-static {p0}, Ljz4;->r(Ldf;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lud3;->S()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const-string v1, "DYNAMIC"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {}, Lud3;->m()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    invoke-static {}, Lud3;->H()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {}, Lud3;->Q()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-static {v3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    new-instance v4, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v2, "|"

    .line 40
    .line 41
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iput-object v1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->N:Ljava/lang/String;

    .line 58
    .line 59
    invoke-super {p0, p1}, Lnc1;->onCreate(Landroid/os/Bundle;)V

    .line 60
    .line 61
    .line 62
    const-string p1, "androidx.media3.exoplayer.downloadService.action.INIT"

    .line 63
    .line 64
    const/4 v1, 0x1

    .line 65
    :try_start_0
    sget-object v2, Lvt0;->v:Ljava/util/HashMap;

    .line 66
    .line 67
    new-instance v2, Landroid/content/Intent;

    .line 68
    .line 69
    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {p0, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :catch_0
    sget-object v2, Lvt0;->v:Ljava/util/HashMap;

    .line 81
    .line 82
    new-instance v2, Landroid/content/Intent;

    .line 83
    .line 84
    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    const-string v0, "foreground"

    .line 92
    .line 93
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 98
    .line 99
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 100
    .line 101
    const/16 v2, 0x1a

    .line 102
    .line 103
    if-lt v0, v2, :cond_1

    .line 104
    .line 105
    invoke-static {p0, p1}, Lrg3;->a(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_1
    invoke-virtual {p0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 110
    .line 111
    .line 112
    :goto_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    const-string v0, "power"

    .line 117
    .line 118
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, Landroid/os/PowerManager;

    .line 123
    .line 124
    invoke-virtual {v0, p1}, Landroid/os/PowerManager;->isIgnoringBatteryOptimizations(Ljava/lang/String;)Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-nez p1, :cond_2

    .line 129
    .line 130
    const-string p1, "battery_optimization"

    .line 131
    .line 132
    invoke-static {p1, v1}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_2

    .line 137
    .line 138
    sget-object p1, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 139
    .line 140
    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 143
    .line 144
    .line 145
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 146
    .line 147
    const/16 v1, 0x21

    .line 148
    .line 149
    if-lt v0, v1, :cond_3

    .line 150
    .line 151
    const-string v1, "android.permission.POST_NOTIFICATIONS"

    .line 152
    .line 153
    invoke-static {p0, v1}, Lud3;->c(Landroid/content/Context;Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eqz v2, :cond_3

    .line 158
    .line 159
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    :cond_3
    const/16 v1, 0x25

    .line 163
    .line 164
    const-string v2, "android.permission.ACCESS_LOCAL_NETWORK"

    .line 165
    .line 166
    if-lt v0, v1, :cond_4

    .line 167
    .line 168
    invoke-static {p0, v2}, Lud3;->c(Landroid/content/Context;Ljava/lang/String;)I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-eqz v0, :cond_4

    .line 173
    .line 174
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    :cond_4
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    const/4 v1, 0x0

    .line 182
    if-nez v0, :cond_5

    .line 183
    .line 184
    new-array v0, v1, [Ljava/lang/String;

    .line 185
    .line 186
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    check-cast v0, [Ljava/lang/String;

    .line 191
    .line 192
    const/16 v3, 0x65

    .line 193
    .line 194
    invoke-static {p0, v0, v3}, Lud3;->f0(Lnc1;[Ljava/lang/String;I)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result p1

    .line 201
    iput-boolean p1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->O:Z

    .line 202
    .line 203
    :cond_5
    const-string p1, "always_on_display"

    .line 204
    .line 205
    invoke-static {p1, v1}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    if-eqz p1, :cond_6

    .line 210
    .line 211
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    const/16 p1, 0x80

    .line 216
    .line 217
    invoke-virtual {p0, p1}, Landroid/view/Window;->addFlags(I)V

    .line 218
    .line 219
    .line 220
    :cond_6
    return-void
.end method

.method public final B(I[Ljava/lang/String;[I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lnc1;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 2
    .line 3
    .line 4
    const/16 p2, 0x65

    .line 5
    .line 6
    if-ne p1, p2, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->O:Z

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final C()V
    .locals 4

    .line 1
    invoke-super {p0}, Lnc1;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lud3;->S()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "DYNAMIC"

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, Lud3;->m()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :goto_0
    invoke-static {}, Lud3;->H()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {}, Lud3;->Q()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    new-instance v3, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, "|"

    .line 34
    .line 35
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->N:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_2

    .line 58
    .line 59
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 60
    .line 61
    const/16 v1, 0x1c

    .line 62
    .line 63
    if-lt v0, v1, :cond_1

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/app/Activity;->recreate()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_1
    new-instance v0, Landroid/os/Handler;

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 76
    .line 77
    .line 78
    new-instance v1, La0;

    .line 79
    .line 80
    const/4 v2, 0x1

    .line 81
    invoke-direct {v1, v2, p0}, La0;-><init>(ILjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 85
    .line 86
    .line 87
    :cond_2
    return-void
.end method

.method public final D()V
    .locals 8

    .line 1
    new-instance v2, Lcb4;

    .line 2
    .line 3
    new-instance v0, Landroid/content/ComponentName;

    .line 4
    .line 5
    const-class v1, Lcom/eddyizm/tempus/service/MediaService;

    .line 6
    .line 7
    invoke-direct {v0, p0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v2, p0, v0}, Lcb4;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V

    .line 11
    .line 12
    .line 13
    sget-object v3, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 14
    .line 15
    new-instance v4, Laj2;

    .line 16
    .line 17
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lf35;->x()Landroid/os/Looper;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    new-instance v6, Lbl2;

    .line 25
    .line 26
    invoke-direct {v6, v5}, Lbl2;-><init>(Landroid/os/Looper;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, v2, Lcb4;->a:Lbb4;

    .line 30
    .line 31
    invoke-interface {v0}, Lbb4;->e()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    new-instance v0, Lxc5;

    .line 38
    .line 39
    new-instance v1, Lx7;

    .line 40
    .line 41
    invoke-direct {v1, p0}, Lx7;-><init>(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    new-instance v7, Lfi0;

    .line 45
    .line 46
    invoke-direct {v7, v1}, Lfi0;-><init>(Lx7;)V

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x4

    .line 50
    invoke-direct {v0, v1, v7}, Lxc5;-><init>(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    move-object v7, v0

    .line 54
    goto :goto_1

    .line 55
    :cond_0
    const/4 v0, 0x0

    .line 56
    goto :goto_0

    .line 57
    :goto_1
    new-instance v0, Lbj2;

    .line 58
    .line 59
    move-object v1, p0

    .line 60
    invoke-direct/range {v0 .. v7}, Lsk2;-><init>(Landroid/content/Context;Lcb4;Landroid/os/Bundle;Lqk2;Landroid/os/Looper;Lbl2;Lxc5;)V

    .line 61
    .line 62
    .line 63
    new-instance p0, Landroid/os/Handler;

    .line 64
    .line 65
    invoke-direct {p0, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v6, v0, p0}, Lb11;->w(Lbl2;Lbj2;Landroid/os/Handler;)V

    .line 69
    .line 70
    .line 71
    iput-object v6, v1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->P:Lbl2;

    .line 72
    .line 73
    invoke-super {v1}, Ldf;->onStart()V

    .line 74
    .line 75
    .line 76
    invoke-static {}, Lud3;->H()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    const-string v0, "dark"

    .line 81
    .line 82
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    const/4 v2, 0x0

    .line 87
    if-eqz v0, :cond_1

    .line 88
    .line 89
    invoke-static {}, Lud3;->Q()Z

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    goto :goto_2

    .line 94
    :cond_1
    const-string v0, "default"

    .line 95
    .line 96
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-eqz p0, :cond_2

    .line 101
    .line 102
    invoke-virtual {v1}, Ldf;->getResources()Landroid/content/res/Resources;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 111
    .line 112
    and-int/lit8 p0, p0, 0x30

    .line 113
    .line 114
    const/16 v0, 0x20

    .line 115
    .line 116
    if-ne p0, v0, :cond_2

    .line 117
    .line 118
    invoke-static {}, Lud3;->Q()Z

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-eqz p0, :cond_2

    .line 123
    .line 124
    const/4 p0, 0x1

    .line 125
    goto :goto_2

    .line 126
    :cond_2
    move p0, v2

    .line 127
    :goto_2
    if-eqz p0, :cond_3

    .line 128
    .line 129
    const p0, 0x106000c

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, p0}, Landroid/content/Context;->getColor(I)I

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v0, p0}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v0, p0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_3
    new-instance p0, Lnz0;

    .line 152
    .line 153
    invoke-direct {p0, v1}, Lnz0;-><init>(Landroid/content/Context;)V

    .line 154
    .line 155
    .line 156
    const v0, 0x7f04013b

    .line 157
    .line 158
    .line 159
    invoke-static {v1, v0, v2}, Lg12;->s(Landroid/content/Context;II)I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    const/high16 v4, 0x41000000    # 8.0f

    .line 164
    .line 165
    invoke-virtual {p0, v3, v4}, Lnz0;->a(IF)I

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    new-instance v3, Lnz0;

    .line 170
    .line 171
    invoke-direct {v3, v1}, Lnz0;-><init>(Landroid/content/Context;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v1, v0, v2}, Lg12;->s(Landroid/content/Context;II)I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    const/4 v2, 0x0

    .line 179
    invoke-virtual {v3, v0, v2}, Lnz0;->a(IF)I

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-virtual {v2, p0}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-virtual {p0, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 195
    .line 196
    .line 197
    return-void
.end method

.method public final E()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->P:Lbl2;

    .line 2
    .line 3
    invoke-static {v0}, Lsk2;->Z0(Ljava/util/concurrent/Future;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ldf;->onStop()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final F(Lik;Z)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->y()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->Z:Lik;

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    if-eqz p2, :cond_1

    .line 11
    .line 12
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 13
    .line 14
    iget-object p2, p2, Lzg5;->n:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p2, Lau;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-virtual {p2, v0}, Lau;->d(Z)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->Y:Lc12;

    .line 23
    .line 24
    if-eqz p0, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lc12;->i(Lik;)V

    .line 27
    .line 28
    .line 29
    :cond_2
    return-void
.end method

.method public final G()V
    .locals 8

    .line 1
    invoke-static {}, Lud3;->J()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lud3;->y()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-boolean v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->O:Z

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const-wide v0, 0x7fffffffffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    sput-wide v0, Lra0;->c:J

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    sget-object v0, Lra0;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 27
    .line 28
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    sput-wide v0, Lra0;->b:J

    .line 33
    .line 34
    sget-object v0, Lra0;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 37
    .line 38
    .line 39
    const-wide/16 v0, 0x0

    .line 40
    .line 41
    sput-wide v0, Lra0;->c:J

    .line 42
    .line 43
    invoke-static {}, Lud3;->u()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {}, Lud3;->v()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-static {v2, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    const/4 v3, 0x5

    .line 56
    const/16 v4, 0x15

    .line 57
    .line 58
    const/4 v5, 0x0

    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->S:Lvf2;

    .line 62
    .line 63
    iget-object v0, v0, Lvf2;->c:Lxi4;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {v5}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    new-instance v1, Lk03;

    .line 73
    .line 74
    invoke-direct {v1}, Lad2;-><init>()V

    .line 75
    .line 76
    .line 77
    iget-object v2, v0, Lpn4;->c:Lgp3;

    .line 78
    .line 79
    if-nez v2, :cond_2

    .line 80
    .line 81
    new-instance v2, Lgp3;

    .line 82
    .line 83
    invoke-direct {v2, v0, v4}, Lgp3;-><init>(Lpn4;I)V

    .line 84
    .line 85
    .line 86
    iput-object v2, v0, Lpn4;->c:Lgp3;

    .line 87
    .line 88
    :cond_2
    iget-object v0, v0, Lpn4;->c:Lgp3;

    .line 89
    .line 90
    invoke-virtual {v0}, Lgp3;->u()Lretrofit2/Call;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    new-instance v2, Lr8;

    .line 95
    .line 96
    invoke-direct {v2, v1, v3}, Lr8;-><init>(Lk03;I)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v0, v2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 100
    .line 101
    .line 102
    new-instance v0, Lsf2;

    .line 103
    .line 104
    invoke-direct {v0, p0, v5}, Lsf2;-><init>(Lcom/eddyizm/tempus/ui/activity/MainActivity;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, p0, v0}, Lad2;->e(Lba2;La83;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_3
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->Q:Lk03;

    .line 112
    .line 113
    if-eqz v2, :cond_4

    .line 114
    .line 115
    invoke-static {}, Lra0;->a()V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_4
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    const-string v6, "next_server_switch"

    .line 131
    .line 132
    invoke-interface {v2, v6, v0, v1}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 133
    .line 134
    .line 135
    move-result-wide v0

    .line 136
    const-wide/16 v6, 0x3a98

    .line 137
    .line 138
    add-long/2addr v0, v6

    .line 139
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 140
    .line 141
    .line 142
    move-result-wide v6

    .line 143
    cmp-long v0, v0, v6

    .line 144
    .line 145
    if-gez v0, :cond_8

    .line 146
    .line 147
    invoke-static {}, Lud3;->D()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    if-eqz v0, :cond_8

    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-nez v0, :cond_5

    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_5
    invoke-static {}, Lud3;->v()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    if-eqz v0, :cond_8

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-nez v0, :cond_6

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_6
    invoke-static {}, Lud3;->v()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->S:Lvf2;

    .line 178
    .line 179
    iget-object v1, v1, Lvf2;->c:Lxi4;

    .line 180
    .line 181
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-static {}, Lud3;->v()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-static {v1}, Lcom/eddyizm/tempus/App;->e(Ljava/lang/String;)Lpn4;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    new-instance v2, Lk03;

    .line 193
    .line 194
    invoke-direct {v2}, Lad2;-><init>()V

    .line 195
    .line 196
    .line 197
    iget-object v5, v1, Lpn4;->c:Lgp3;

    .line 198
    .line 199
    if-nez v5, :cond_7

    .line 200
    .line 201
    new-instance v5, Lgp3;

    .line 202
    .line 203
    invoke-direct {v5, v1, v4}, Lgp3;-><init>(Lpn4;I)V

    .line 204
    .line 205
    .line 206
    iput-object v5, v1, Lpn4;->c:Lgp3;

    .line 207
    .line 208
    :cond_7
    iget-object v1, v1, Lpn4;->c:Lgp3;

    .line 209
    .line 210
    invoke-virtual {v1}, Lgp3;->u()Lretrofit2/Call;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    new-instance v4, Lr8;

    .line 215
    .line 216
    invoke-direct {v4, v2, v3}, Lr8;-><init>(Lk03;I)V

    .line 217
    .line 218
    .line 219
    invoke-interface {v1, v4}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 220
    .line 221
    .line 222
    iput-object v2, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->Q:Lk03;

    .line 223
    .line 224
    new-instance v1, Lz6;

    .line 225
    .line 226
    invoke-direct {v1, p0, v2, v0}, Lz6;-><init>(Lcom/eddyizm/tempus/ui/activity/MainActivity;Lk03;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, p0, v1}, Lad2;->e(Lba2;La83;)V

    .line 230
    .line 231
    .line 232
    return-void

    .line 233
    :cond_8
    :goto_0
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->S:Lvf2;

    .line 234
    .line 235
    iget-object v0, v0, Lvf2;->c:Lxi4;

    .line 236
    .line 237
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-static {v5}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    new-instance v1, Lk03;

    .line 245
    .line 246
    invoke-direct {v1}, Lad2;-><init>()V

    .line 247
    .line 248
    .line 249
    iget-object v2, v0, Lpn4;->c:Lgp3;

    .line 250
    .line 251
    if-nez v2, :cond_9

    .line 252
    .line 253
    new-instance v2, Lgp3;

    .line 254
    .line 255
    invoke-direct {v2, v0, v4}, Lgp3;-><init>(Lpn4;I)V

    .line 256
    .line 257
    .line 258
    iput-object v2, v0, Lpn4;->c:Lgp3;

    .line 259
    .line 260
    :cond_9
    iget-object v0, v0, Lpn4;->c:Lgp3;

    .line 261
    .line 262
    invoke-virtual {v0}, Lgp3;->u()Lretrofit2/Call;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    new-instance v2, Lr8;

    .line 267
    .line 268
    invoke-direct {v2, v1, v3}, Lr8;-><init>(Lk03;I)V

    .line 269
    .line 270
    .line 271
    invoke-interface {v0, v2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 272
    .line 273
    .line 274
    new-instance v0, Lsf2;

    .line 275
    .line 276
    const/4 v2, 0x1

    .line 277
    invoke-direct {v0, p0, v2}, Lsf2;-><init>(Lcom/eddyizm/tempus/ui/activity/MainActivity;I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, p0, v0}, Lad2;->e(Lba2;La83;)V

    .line 281
    .line 282
    .line 283
    return-void
.end method

.method public final H()V
    .locals 5

    .line 1
    invoke-static {}, Lu52;->f()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/content/Intent;

    .line 5
    .line 6
    const-class v1, Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 12
    .line 13
    .line 14
    sget-object v0, Ln61;->a:Ljava/util/HashMap;

    .line 15
    .line 16
    const-class v0, Ln61;

    .line 17
    .line 18
    monitor-enter v0

    .line 19
    :try_start_0
    sget-object v1, Ln61;->a:Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 22
    .line 23
    .line 24
    sget-object v1, Ln61;->b:Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 27
    .line 28
    .line 29
    sget-object v1, Ln61;->c:Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 32
    .line 33
    .line 34
    sget-wide v1, Ln61;->d:J

    .line 35
    .line 36
    const-wide/16 v3, 0x1

    .line 37
    .line 38
    add-long/2addr v1, v3

    .line 39
    sput-wide v1, Ln61;->d:J

    .line 40
    .line 41
    invoke-static {}, Ln61;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 42
    .line 43
    .line 44
    monitor-exit v0

    .line 45
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sget-object v1, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lxr1;->a()V

    .line 55
    .line 56
    .line 57
    sget-object v1, Lhw;->g:Landroid/webkit/WebView;

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    instance-of v4, v3, Landroid/view/ViewGroup;

    .line 67
    .line 68
    if-eqz v4, :cond_0

    .line 69
    .line 70
    check-cast v3, Landroid/view/ViewGroup;

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    move-object v3, v2

    .line 74
    :goto_0
    if-eqz v3, :cond_1

    .line 75
    .line 76
    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    const-string v3, "HomeMusicAndroid"

    .line 80
    .line 81
    invoke-virtual {v1, v3}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Landroid/webkit/WebView;->destroy()V

    .line 85
    .line 86
    .line 87
    :cond_2
    sput-object v2, Lhw;->g:Landroid/webkit/WebView;

    .line 88
    .line 89
    sput-object v2, Lhw;->h:Landroid/content/MutableContextWrapper;

    .line 90
    .line 91
    sput-object v2, Lhw;->i:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {}, Lrr1;->m()V

    .line 94
    .line 95
    .line 96
    const-string v1, "homemusic_notifier"

    .line 97
    .line 98
    const/4 v3, 0x0

    .line 99
    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 112
    .line 113
    .line 114
    :try_start_1
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0, v2}, Landroid/webkit/CookieManager;->removeAllCookies(Landroid/webkit/ValueCallback;)V

    .line 119
    .line 120
    .line 121
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {v0}, Landroid/webkit/CookieManager;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :catchall_0
    move-exception v0

    .line 130
    const-string v1, "HomeMusic"

    .line 131
    .line 132
    const-string v4, "Cannot clear Hub cookies"

    .line 133
    .line 134
    invoke-static {v1, v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 135
    .line 136
    .line 137
    :goto_1
    sput-object v2, Lmm3;->g:Ljava/lang/String;

    .line 138
    .line 139
    invoke-static {v2}, Lud3;->w0(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-static {v2}, Lud3;->u0(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-static {v2}, Lud3;->C0(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-static {v2}, Lud3;->q0(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-static {v2}, Lud3;->v0(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-static {v2}, Lud3;->n0(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v2}, Lud3;->D0(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-static {v2}, Lud3;->h0(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-static {v3}, Lud3;->p0(Z)V

    .line 164
    .line 165
    .line 166
    const/high16 v0, 0x3f800000    # 1.0f

    .line 167
    .line 168
    invoke-static {v0}, Lud3;->r0(F)V

    .line 169
    .line 170
    .line 171
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    const-string v1, "skip_silence"

    .line 187
    .line 188
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 193
    .line 194
    .line 195
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    const-string v1, "data_saving_mode"

    .line 211
    .line 212
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 217
    .line 218
    .line 219
    invoke-static {v3}, Lud3;->A0(Z)V

    .line 220
    .line 221
    .line 222
    invoke-static {v3}, Lud3;->z0(Z)V

    .line 223
    .line 224
    .line 225
    invoke-static {}, Lu52;->f()V

    .line 226
    .line 227
    .line 228
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->P:Lbl2;

    .line 229
    .line 230
    sget-object v1, Lbo2;->a:Ljava/lang/ref/WeakReference;

    .line 231
    .line 232
    if-eqz v0, :cond_3

    .line 233
    .line 234
    new-instance v1, Ljr1;

    .line 235
    .line 236
    const/4 v2, 0x2

    .line 237
    invoke-direct {v1, v0, v2}, Ljr1;-><init>(Lbl2;I)V

    .line 238
    .line 239
    .line 240
    sget-object v2, Lgq0;->n:Lgq0;

    .line 241
    .line 242
    invoke-virtual {v0, v1, v2}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 243
    .line 244
    .line 245
    :cond_3
    invoke-virtual {p0}, Ll70;->d()Le75;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-virtual {v0}, Le75;->a()V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->x()V

    .line 253
    .line 254
    .line 255
    return-void

    .line 256
    :catchall_1
    move-exception p0

    .line 257
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 258
    throw p0
.end method

.method public final I(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 2
    .line 3
    iget-object p0, p0, Lzg5;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lau;

    .line 6
    .line 7
    iget-object p0, p0, Lau;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroid/view/View;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const/16 p1, 0x8

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final J()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ldf;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 10
    .line 11
    const-string v1, "hide_bottom_navbar_on_portrait"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v1, v2}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/high16 v3, 0x42600000    # 56.0f

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Lom1;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lom1;->p(Z)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 29
    .line 30
    iget-object v1, v1, Lzg5;->n:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lau;

    .line 33
    .line 34
    mul-float/2addr v3, v0

    .line 35
    float-to-int v0, v3

    .line 36
    iget-object v1, v1, Lau;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 39
    .line 40
    iput-boolean v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->A:Z

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I(I)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Lom1;

    .line 46
    .line 47
    iget-boolean v1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->X:Z

    .line 48
    .line 49
    xor-int/2addr v1, v4

    .line 50
    invoke-virtual {v0, p0, v1}, Lom1;->q(Ldf;Z)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_0
    iget-boolean v1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->X:Z

    .line 55
    .line 56
    iget-object v5, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 57
    .line 58
    if-nez v1, :cond_1

    .line 59
    .line 60
    iget-object v1, v5, Lzg5;->n:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Lau;

    .line 63
    .line 64
    const/high16 v3, 0x43080000    # 136.0f

    .line 65
    .line 66
    mul-float/2addr v3, v0

    .line 67
    float-to-int v0, v3

    .line 68
    iget-object v1, v1, Lau;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 71
    .line 72
    iput-boolean v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->A:Z

    .line 73
    .line 74
    invoke-virtual {v1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I(I)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Lom1;

    .line 78
    .line 79
    invoke-virtual {v0, v4}, Lom1;->p(Z)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Lom1;

    .line 83
    .line 84
    invoke-virtual {v0, p0, v4}, Lom1;->q(Ldf;Z)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_1
    iget-object v1, v5, Lzg5;->n:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Lau;

    .line 91
    .line 92
    mul-float/2addr v3, v0

    .line 93
    float-to-int v0, v3

    .line 94
    iget-object v1, v1, Lau;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 97
    .line 98
    iput-boolean v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->A:Z

    .line 99
    .line 100
    invoke-virtual {v1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I(I)V

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->W:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 104
    .line 105
    if-eqz v0, :cond_2

    .line 106
    .line 107
    iput-boolean v4, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->A:Z

    .line 108
    .line 109
    :cond_2
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Lom1;

    .line 110
    .line 111
    invoke-virtual {v0, v2}, Lom1;->p(Z)V

    .line 112
    .line 113
    .line 114
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Lom1;

    .line 115
    .line 116
    invoke-virtual {v0, p0, v2}, Lom1;->q(Ldf;Z)V

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public final K()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Lom1;

    .line 2
    .line 3
    iget-object v0, v0, Lom1;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lss0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ldf;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget p0, p0, Landroid/content/res/Configuration;->orientation:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x1

    .line 20
    if-ne p0, v1, :cond_0

    .line 21
    .line 22
    move p0, v3

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p0, v2

    .line 25
    :goto_0
    const-string v1, "enable_drawer_on_portrait"

    .line 26
    .line 27
    invoke-static {v1, v2}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iget-object v0, v0, Lss0;->p:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    xor-int/2addr p0, v3

    .line 42
    invoke-virtual {v0, p0}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-static {p1}, Lz52;->a(Landroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-super {p0, p1}, Ldf;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v2, 0x1f

    .line 6
    .line 7
    const/16 v3, 0x18

    .line 8
    .line 9
    if-lt v1, v2, :cond_0

    .line 10
    .line 11
    new-instance v1, Ltj4;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Ltj4;-><init>(Ldf;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v1, Lpz1;

    .line 18
    .line 19
    invoke-direct {v1, v3, v0}, Lpz1;-><init>(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {v1}, Lpz1;->v()V

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lkb4;->T(Ldf;)V

    .line 26
    .line 27
    .line 28
    const v1, 0x1020002

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ldf;->findViewById(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v2, Lcn;

    .line 36
    .line 37
    invoke-direct {v2, v3, v1}, Lcn;-><init>(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    sget-object v3, Lj65;->a:Ljava/util/WeakHashMap;

    .line 41
    .line 42
    invoke-static {v1, v2}, La65;->c(Landroid/view/View;Lr83;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual/range {p0 .. p1}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->A(Landroid/os/Bundle;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const v2, 0x7f0d001f

    .line 53
    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    const/4 v4, 0x0

    .line 57
    invoke-virtual {v1, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const v2, 0x7f0a011d

    .line 62
    .line 63
    .line 64
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    check-cast v5, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 69
    .line 70
    if-eqz v5, :cond_16

    .line 71
    .line 72
    const v6, 0x7f0a011e

    .line 73
    .line 74
    .line 75
    invoke-static {v1, v6}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    check-cast v7, Landroid/widget/FrameLayout;

    .line 80
    .line 81
    if-eqz v7, :cond_15

    .line 82
    .line 83
    move-object v7, v1

    .line 84
    check-cast v7, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 85
    .line 86
    const v8, 0x7f0a040e

    .line 87
    .line 88
    .line 89
    invoke-static {v1, v8}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    check-cast v9, Landroidx/fragment/app/FragmentContainerView;

    .line 94
    .line 95
    if-eqz v9, :cond_14

    .line 96
    .line 97
    const v9, 0x7f0a0410

    .line 98
    .line 99
    .line 100
    invoke-static {v1, v9}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    check-cast v10, Lcom/google/android/material/navigation/NavigationView;

    .line 105
    .line 106
    if-eqz v10, :cond_13

    .line 107
    .line 108
    const v10, 0x7f0a0430

    .line 109
    .line 110
    .line 111
    invoke-static {v1, v10}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object v11

    .line 115
    check-cast v11, Landroid/widget/TextView;

    .line 116
    .line 117
    if-eqz v11, :cond_12

    .line 118
    .line 119
    const v10, 0x7f0a047a

    .line 120
    .line 121
    .line 122
    invoke-static {v1, v10}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object v12

    .line 126
    check-cast v12, Landroid/widget/FrameLayout;

    .line 127
    .line 128
    if-eqz v12, :cond_12

    .line 129
    .line 130
    new-instance v1, Lqp4;

    .line 131
    .line 132
    invoke-direct {v1, v7, v5, v11, v12}, Lqp4;-><init>(Landroidx/drawerlayout/widget/DrawerLayout;Lcom/google/android/material/bottomnavigation/BottomNavigationView;Landroid/widget/TextView;Landroid/widget/FrameLayout;)V

    .line 133
    .line 134
    .line 135
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->R:Lqp4;

    .line 136
    .line 137
    invoke-virtual {v0, v7}, Ldf;->setContentView(Landroid/view/View;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Ll70;->d()Le75;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-static {v0}, Lgh0;->r(Lf75;)Lb75;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-static {v0}, Lgh0;->q(Lf75;)Ltf0;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    new-instance v11, Lbq4;

    .line 159
    .line 160
    invoke-direct {v11, v1, v5, v7}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 161
    .line 162
    .line 163
    const-class v1, Lvf2;

    .line 164
    .line 165
    invoke-static {v1}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {v1}, Li30;->b()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    if-eqz v5, :cond_11

    .line 174
    .line 175
    const-string v7, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 176
    .line 177
    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    invoke-virtual {v11, v1, v5}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    check-cast v1, Lvf2;

    .line 186
    .line 187
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->S:Lvf2;

    .line 188
    .line 189
    new-instance v1, Lc12;

    .line 190
    .line 191
    invoke-direct {v1, v0}, Lc12;-><init>(Lcom/eddyizm/tempus/ui/activity/MainActivity;)V

    .line 192
    .line 193
    .line 194
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->Y:Lc12;

    .line 195
    .line 196
    new-instance v1, Lv9;

    .line 197
    .line 198
    invoke-direct {v1, v0}, Lv9;-><init>(Lcom/eddyizm/tempus/ui/activity/MainActivity;)V

    .line 199
    .line 200
    .line 201
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->a0:Lv9;

    .line 202
    .line 203
    new-instance v1, Landroid/content/IntentFilter;

    .line 204
    .line 205
    const-string v5, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 206
    .line 207
    invoke-direct {v1, v5}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    iget-object v5, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->a0:Lv9;

    .line 211
    .line 212
    invoke-virtual {v0, v5, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Ldf;->getResources()Landroid/content/res/Resources;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    .line 224
    .line 225
    const/4 v5, 0x2

    .line 226
    const/4 v7, 0x1

    .line 227
    if-ne v1, v5, :cond_1

    .line 228
    .line 229
    move v1, v7

    .line 230
    goto :goto_1

    .line 231
    :cond_1
    move v1, v4

    .line 232
    :goto_1
    iput-boolean v1, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->X:Z

    .line 233
    .line 234
    invoke-virtual {v0}, Lnc1;->k()Lmd1;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-virtual {v0, v10}, Ldf;->findViewById(I)Landroid/view/View;

    .line 239
    .line 240
    .line 241
    move-result-object v11

    .line 242
    invoke-static {v11}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->C(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 243
    .line 244
    .line 245
    move-result-object v12

    .line 246
    iput-object v12, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->W:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 247
    .line 248
    new-instance v13, Lau;

    .line 249
    .line 250
    invoke-direct {v13, v12, v11, v1}, Lau;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;Lmd1;)V

    .line 251
    .line 252
    .line 253
    new-instance v1, Lzg5;

    .line 254
    .line 255
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 256
    .line 257
    .line 258
    iput-object v13, v1, Lzg5;->n:Ljava/lang/Object;

    .line 259
    .line 260
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 261
    .line 262
    iget-object v1, v13, Lau;->b:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 265
    .line 266
    iget-object v11, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->d0:Lwt;

    .line 267
    .line 268
    invoke-virtual {v1, v11}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w(Lut;)V

    .line 269
    .line 270
    .line 271
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 272
    .line 273
    iget-object v1, v1, Lzg5;->n:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v1, Lau;

    .line 276
    .line 277
    iget-object v11, v1, Lau;->d:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v11, Lld1;

    .line 280
    .line 281
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    new-instance v12, Lpo;

    .line 285
    .line 286
    invoke-direct {v12, v11}, Lpo;-><init>(Lld1;)V

    .line 287
    .line 288
    .line 289
    iget-object v1, v1, Lau;->e:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v1, Lxi3;

    .line 292
    .line 293
    const-string v11, "PlayerBottomSheet"

    .line 294
    .line 295
    invoke-virtual {v12, v10, v1, v11}, Lpo;->j(ILkc1;Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12, v4}, Lpo;->e(Z)I

    .line 299
    .line 300
    .line 301
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 302
    .line 303
    iget-object v10, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->S:Lvf2;

    .line 304
    .line 305
    iget-object v1, v1, Lzg5;->n:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v1, Lau;

    .line 308
    .line 309
    iget-object v11, v1, Lau;->f:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v11, Landroid/os/Handler;

    .line 312
    .line 313
    iget-boolean v12, v1, Lau;->a:Z

    .line 314
    .line 315
    const/4 v13, 0x3

    .line 316
    if-nez v12, :cond_4

    .line 317
    .line 318
    iget-object v12, v1, Lau;->b:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v12, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 321
    .line 322
    iget v12, v12, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:I

    .line 323
    .line 324
    if-eq v12, v13, :cond_4

    .line 325
    .line 326
    if-ne v12, v5, :cond_2

    .line 327
    .line 328
    goto :goto_2

    .line 329
    :cond_2
    iget-object v5, v1, Lau;->g:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v5, Ljava/lang/Runnable;

    .line 332
    .line 333
    if-eqz v5, :cond_3

    .line 334
    .line 335
    invoke-virtual {v11, v5}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 336
    .line 337
    .line 338
    :cond_3
    new-instance v5, Lk6;

    .line 339
    .line 340
    const/16 v12, 0xc

    .line 341
    .line 342
    invoke-direct {v5, v12, v1, v10}, Lk6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    iput-object v5, v1, Lau;->g:Ljava/lang/Object;

    .line 346
    .line 347
    const-wide/16 v14, 0x64

    .line 348
    .line 349
    invoke-virtual {v11, v5, v14, v15}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 350
    .line 351
    .line 352
    :cond_4
    :goto_2
    invoke-virtual {v0}, Lnc1;->k()Lmd1;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    invoke-virtual {v1, v8}, Lld1;->C(I)Lkc1;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    check-cast v1, Landroidx/navigation/fragment/NavHostFragment;

    .line 361
    .line 362
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v1}, Landroidx/navigation/fragment/NavHostFragment;->h0()Lv23;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 370
    .line 371
    new-instance v1, Lss0;

    .line 372
    .line 373
    invoke-virtual {v0, v2}, Ldf;->findViewById(I)Landroid/view/View;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    check-cast v2, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 378
    .line 379
    invoke-virtual {v0, v6}, Ldf;->findViewById(I)Landroid/view/View;

    .line 380
    .line 381
    .line 382
    move-result-object v5

    .line 383
    check-cast v5, Landroid/widget/FrameLayout;

    .line 384
    .line 385
    const v6, 0x7f0a01da

    .line 386
    .line 387
    .line 388
    invoke-virtual {v0, v6}, Ldf;->findViewById(I)Landroid/view/View;

    .line 389
    .line 390
    .line 391
    move-result-object v6

    .line 392
    check-cast v6, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 393
    .line 394
    invoke-virtual {v0, v9}, Ldf;->findViewById(I)Landroid/view/View;

    .line 395
    .line 396
    .line 397
    move-result-object v8

    .line 398
    check-cast v8, Lcom/google/android/material/navigation/NavigationView;

    .line 399
    .line 400
    iget-object v9, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 401
    .line 402
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 403
    .line 404
    .line 405
    iput-object v2, v1, Lss0;->n:Ljava/lang/Object;

    .line 406
    .line 407
    iput-object v5, v1, Lss0;->o:Ljava/lang/Object;

    .line 408
    .line 409
    iput-object v6, v1, Lss0;->p:Ljava/lang/Object;

    .line 410
    .line 411
    iput-object v9, v1, Lss0;->q:Ljava/lang/Object;

    .line 412
    .line 413
    new-instance v5, Lom1;

    .line 414
    .line 415
    const/16 v6, 0xd

    .line 416
    .line 417
    invoke-direct {v5, v4, v6}, Lom1;-><init>(CI)V

    .line 418
    .line 419
    .line 420
    iput-object v1, v5, Lom1;->o:Ljava/lang/Object;

    .line 421
    .line 422
    iput-object v5, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Lom1;

    .line 423
    .line 424
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->W:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 425
    .line 426
    new-instance v5, Lz33;

    .line 427
    .line 428
    invoke-direct {v5, v1}, Lz33;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v9, v5}, Lv23;->b(Le23;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    new-instance v1, Lss2;

    .line 438
    .line 439
    const/4 v5, 0x6

    .line 440
    invoke-direct {v1, v5, v9}, Lss2;-><init>(ILjava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2, v1}, Ls33;->setOnItemSelectedListener(Lq33;)V

    .line 444
    .line 445
    .line 446
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 447
    .line 448
    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    new-instance v2, Ln43;

    .line 452
    .line 453
    invoke-direct {v2, v1, v9, v7}, Ln43;-><init>(Ljava/lang/ref/WeakReference;Lv23;I)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v9, v2}, Lv23;->b(Le23;)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    new-instance v1, Lbt2;

    .line 463
    .line 464
    invoke-direct {v1, v9, v8}, Lbt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v8, v1}, Lcom/google/android/material/navigation/NavigationView;->setNavigationItemSelectedListener(Lq43;)V

    .line 468
    .line 469
    .line 470
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 471
    .line 472
    invoke-direct {v1, v8}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    new-instance v2, Ln43;

    .line 476
    .line 477
    invoke-direct {v2, v1, v9, v4}, Ln43;-><init>(Ljava/lang/ref/WeakReference;Lv23;I)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v9, v2}, Lv23;->b(Le23;)V

    .line 481
    .line 482
    .line 483
    new-instance v1, Lbd1;

    .line 484
    .line 485
    iget-object v2, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->W:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 486
    .line 487
    iget v2, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:I

    .line 488
    .line 489
    if-ne v2, v13, :cond_5

    .line 490
    .line 491
    move v2, v7

    .line 492
    goto :goto_3

    .line 493
    :cond_5
    move v2, v4

    .line 494
    :goto_3
    invoke-direct {v1, v0, v2}, Lbd1;-><init>(Lcom/eddyizm/tempus/ui/activity/MainActivity;Z)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v0}, Ll70;->i()La93;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    invoke-virtual {v2, v0, v1}, La93;->a(Lba2;Lv83;)V

    .line 502
    .line 503
    .line 504
    iget-object v2, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->W:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 505
    .line 506
    new-instance v5, Lwt;

    .line 507
    .line 508
    invoke-direct {v5, v13, v1}, Lwt;-><init>(ILjava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v2, v5}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w(Lut;)V

    .line 512
    .line 513
    .line 514
    invoke-static {}, Lud3;->y()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v1

    .line 518
    if-nez v1, :cond_7

    .line 519
    .line 520
    invoke-static {}, Lud3;->J()Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    if-eqz v1, :cond_6

    .line 525
    .line 526
    invoke-static {}, Lud3;->B()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    if-eqz v1, :cond_6

    .line 531
    .line 532
    goto :goto_4

    .line 533
    :cond_6
    invoke-virtual {v0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->x()V

    .line 534
    .line 535
    .line 536
    goto :goto_5

    .line 537
    :cond_7
    :goto_4
    invoke-virtual {v0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->v()V

    .line 538
    .line 539
    .line 540
    :goto_5
    invoke-virtual {v0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->K()V

    .line 541
    .line 542
    .line 543
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    const-string v2, "wifi_only"

    .line 555
    .line 556
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 557
    .line 558
    .line 559
    move-result v1

    .line 560
    if-eqz v1, :cond_8

    .line 561
    .line 562
    const-string v1, "connectivity"

    .line 563
    .line 564
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    check-cast v1, Landroid/net/ConnectivityManager;

    .line 569
    .line 570
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 571
    .line 572
    .line 573
    move-result-object v1

    .line 574
    if-eqz v1, :cond_8

    .line 575
    .line 576
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->getType()I

    .line 577
    .line 578
    .line 579
    move-result v1

    .line 580
    if-eq v1, v7, :cond_8

    .line 581
    .line 582
    new-instance v1, Lca0;

    .line 583
    .line 584
    invoke-direct {v1}, Lca0;-><init>()V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v0}, Lnc1;->k()Lmd1;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    invoke-virtual {v1, v2, v3}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    :cond_8
    invoke-static {}, Lud3;->J()Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    if-nez v1, :cond_9

    .line 599
    .line 600
    invoke-static {}, Lud3;->y()Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v1

    .line 604
    if-eqz v1, :cond_b

    .line 605
    .line 606
    :cond_9
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->S:Lvf2;

    .line 607
    .line 608
    iget-object v1, v1, Lvf2;->c:Lxi4;

    .line 609
    .line 610
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 611
    .line 612
    .line 613
    new-instance v1, Lk03;

    .line 614
    .line 615
    invoke-direct {v1}, Lad2;-><init>()V

    .line 616
    .line 617
    .line 618
    invoke-static {v4}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 619
    .line 620
    .line 621
    move-result-object v2

    .line 622
    iget-object v5, v2, Lpn4;->c:Lgp3;

    .line 623
    .line 624
    if-nez v5, :cond_a

    .line 625
    .line 626
    new-instance v5, Lgp3;

    .line 627
    .line 628
    const/16 v6, 0x15

    .line 629
    .line 630
    invoke-direct {v5, v2, v6}, Lgp3;-><init>(Lpn4;I)V

    .line 631
    .line 632
    .line 633
    iput-object v5, v2, Lpn4;->c:Lgp3;

    .line 634
    .line 635
    :cond_a
    iget-object v2, v2, Lpn4;->c:Lgp3;

    .line 636
    .line 637
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 638
    .line 639
    .line 640
    const-string v5, "SystemClient"

    .line 641
    .line 642
    const-string v6, "getOpenSubsonicExtensions()"

    .line 643
    .line 644
    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 645
    .line 646
    .line 647
    iget-object v5, v2, Lgp3;->p:Ljava/lang/Object;

    .line 648
    .line 649
    check-cast v5, Lgq4;

    .line 650
    .line 651
    iget-object v2, v2, Lgp3;->o:Ljava/lang/Object;

    .line 652
    .line 653
    check-cast v2, Lpn4;

    .line 654
    .line 655
    invoke-virtual {v2}, Lpn4;->f()Ljava/util/HashMap;

    .line 656
    .line 657
    .line 658
    move-result-object v2

    .line 659
    invoke-interface {v5, v2}, Lgq4;->a(Ljava/util/Map;)Lretrofit2/Call;

    .line 660
    .line 661
    .line 662
    move-result-object v2

    .line 663
    new-instance v5, Lck;

    .line 664
    .line 665
    const/4 v6, 0x5

    .line 666
    invoke-direct {v5, v1, v6}, Lck;-><init>(Lk03;I)V

    .line 667
    .line 668
    .line 669
    invoke-interface {v2, v5}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 670
    .line 671
    .line 672
    new-instance v2, Llj;

    .line 673
    .line 674
    invoke-direct {v2, v7}, Llj;-><init>(I)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v1, v0, v2}, Lad2;->e(Lba2;La83;)V

    .line 678
    .line 679
    .line 680
    :cond_b
    sget-object v1, Lpt0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 681
    .line 682
    invoke-virtual {v1, v4, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 683
    .line 684
    .line 685
    move-result v1

    .line 686
    if-nez v1, :cond_c

    .line 687
    .line 688
    goto :goto_6

    .line 689
    :cond_c
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 690
    .line 691
    .line 692
    move-result-object v1

    .line 693
    new-instance v2, Ljava/lang/Thread;

    .line 694
    .line 695
    new-instance v5, Llf;

    .line 696
    .line 697
    invoke-direct {v5, v1, v13}, Llf;-><init>(Landroid/content/Context;I)V

    .line 698
    .line 699
    .line 700
    const-string v1, "DownloadRepair"

    .line 701
    .line 702
    invoke-direct {v2, v5, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 703
    .line 704
    .line 705
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 706
    .line 707
    .line 708
    :goto_6
    sget-object v1, Lx6;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 709
    .line 710
    invoke-virtual {v1, v4, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 711
    .line 712
    .line 713
    move-result v1

    .line 714
    if-nez v1, :cond_d

    .line 715
    .line 716
    goto :goto_7

    .line 717
    :cond_d
    new-instance v1, Ljava/lang/Thread;

    .line 718
    .line 719
    new-instance v2, Lu6;

    .line 720
    .line 721
    invoke-direct {v2, v4}, Lu6;-><init>(I)V

    .line 722
    .line 723
    .line 724
    const-string v4, "AlbumArtistBackfill"

    .line 725
    .line 726
    invoke-direct {v1, v2, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 730
    .line 731
    .line 732
    :goto_7
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 733
    .line 734
    .line 735
    move-result-object v1

    .line 736
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->z(Landroid/content/Intent;)V

    .line 737
    .line 738
    .line 739
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 740
    .line 741
    .line 742
    move-result-object v1

    .line 743
    const-string v2, "LOGIN_ACTIVITY_INTENT"

    .line 744
    .line 745
    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 746
    .line 747
    .line 748
    move-result-object v1

    .line 749
    const-string v2, "open_legacy_login_fragment"

    .line 750
    .line 751
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 752
    .line 753
    .line 754
    move-result v2

    .line 755
    if-eqz v2, :cond_e

    .line 756
    .line 757
    invoke-virtual {v0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->x()V

    .line 758
    .line 759
    .line 760
    goto :goto_8

    .line 761
    :cond_e
    const-string v2, "open_legacy_settings_fragment"

    .line 762
    .line 763
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 764
    .line 765
    .line 766
    move-result v1

    .line 767
    if-eqz v1, :cond_f

    .line 768
    .line 769
    invoke-virtual {v0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->w()V

    .line 770
    .line 771
    .line 772
    :cond_f
    :goto_8
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 773
    .line 774
    const/16 v2, 0x19

    .line 775
    .line 776
    if-lt v1, v2, :cond_10

    .line 777
    .line 778
    invoke-static {}, Lkz0;->g()Ljava/lang/Class;

    .line 779
    .line 780
    .line 781
    move-result-object v1

    .line 782
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v1

    .line 786
    invoke-static {v1}, Lkz0;->f(Ljava/lang/Object;)Landroid/content/pm/ShortcutManager;

    .line 787
    .line 788
    .line 789
    move-result-object v1

    .line 790
    new-instance v2, Landroid/content/Intent;

    .line 791
    .line 792
    const-class v4, Lcom/eddyizm/tempus/ui/login/LoginActivity;

    .line 793
    .line 794
    invoke-direct {v2, v0, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 795
    .line 796
    .line 797
    const-string v4, "android.intent.action.VIEW"

    .line 798
    .line 799
    invoke-virtual {v2, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 800
    .line 801
    .line 802
    invoke-static {v0}, Lkz0;->d(Lcom/eddyizm/tempus/ui/activity/MainActivity;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 803
    .line 804
    .line 805
    move-result-object v4

    .line 806
    const v5, 0x7f130295

    .line 807
    .line 808
    .line 809
    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v6

    .line 813
    invoke-static {v4, v6}, Lkz0;->b(Landroid/content/pm/ShortcutInfo$Builder;Ljava/lang/String;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 814
    .line 815
    .line 816
    move-result-object v4

    .line 817
    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v5

    .line 821
    invoke-static {v4, v5}, Lkz0;->k(Landroid/content/pm/ShortcutInfo$Builder;Ljava/lang/String;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 822
    .line 823
    .line 824
    move-result-object v4

    .line 825
    const/high16 v5, 0x7f100000

    .line 826
    .line 827
    invoke-static {v0, v5}, Landroid/graphics/drawable/Icon;->createWithResource(Landroid/content/Context;I)Landroid/graphics/drawable/Icon;

    .line 828
    .line 829
    .line 830
    move-result-object v5

    .line 831
    invoke-static {v4, v5}, Lkz0;->a(Landroid/content/pm/ShortcutInfo$Builder;Landroid/graphics/drawable/Icon;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 832
    .line 833
    .line 834
    move-result-object v4

    .line 835
    filled-new-array {v2}, [Landroid/content/Intent;

    .line 836
    .line 837
    .line 838
    move-result-object v2

    .line 839
    invoke-static {v4, v2}, Lkz0;->c(Landroid/content/pm/ShortcutInfo$Builder;[Landroid/content/Intent;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 840
    .line 841
    .line 842
    move-result-object v2

    .line 843
    invoke-static {v2}, Lkz0;->e(Landroid/content/pm/ShortcutInfo$Builder;)Landroid/content/pm/ShortcutInfo;

    .line 844
    .line 845
    .line 846
    move-result-object v2

    .line 847
    if-eqz v1, :cond_10

    .line 848
    .line 849
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 850
    .line 851
    .line 852
    move-result-object v2

    .line 853
    invoke-static {v1, v2}, Lkz0;->h(Landroid/content/pm/ShortcutManager;Ljava/util/List;)V

    .line 854
    .line 855
    .line 856
    :cond_10
    sget-object v1, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 857
    .line 858
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->R:Lqp4;

    .line 859
    .line 860
    iget-object v1, v1, Lqp4;->a:Ljava/lang/Object;

    .line 861
    .line 862
    check-cast v1, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 863
    .line 864
    invoke-virtual {v1, v7}, Ls33;->setLabelVisibilityMode(I)V

    .line 865
    .line 866
    .line 867
    invoke-static {v0}, Lgi1;->m(Landroid/content/Context;)V

    .line 868
    .line 869
    .line 870
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 871
    .line 872
    .line 873
    move-result-object v1

    .line 874
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 875
    .line 876
    .line 877
    new-instance v2, Li93;

    .line 878
    .line 879
    const-class v4, Lcom/eddyizm/tempus/homemusic/HubSyncWorker;

    .line 880
    .line 881
    const-wide/16 v5, 0xf

    .line 882
    .line 883
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 884
    .line 885
    invoke-direct {v2, v4, v5, v6, v7}, Li93;-><init>(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V

    .line 886
    .line 887
    .line 888
    new-instance v4, Lo53;

    .line 889
    .line 890
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 891
    .line 892
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 893
    .line 894
    .line 895
    new-instance v6, Lo53;

    .line 896
    .line 897
    invoke-direct {v6, v3}, Lo53;-><init>(Landroid/net/NetworkRequest;)V

    .line 898
    .line 899
    .line 900
    invoke-static {v4}, Lq40;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 901
    .line 902
    .line 903
    move-result-object v16

    .line 904
    new-instance v5, Lmc0;

    .line 905
    .line 906
    const/4 v7, 0x2

    .line 907
    const/4 v8, 0x0

    .line 908
    const/4 v9, 0x0

    .line 909
    const/4 v10, 0x0

    .line 910
    const/4 v11, 0x0

    .line 911
    const-wide/16 v12, -0x1

    .line 912
    .line 913
    move-wide v14, v12

    .line 914
    invoke-direct/range {v5 .. v16}, Lmc0;-><init>(Lo53;IZZZZJJLjava/util/Set;)V

    .line 915
    .line 916
    .line 917
    iget-object v3, v2, Lrx1;->b:Ljava/lang/Object;

    .line 918
    .line 919
    check-cast v3, Ldd5;

    .line 920
    .line 921
    iput-object v5, v3, Ldd5;->j:Lmc0;

    .line 922
    .line 923
    invoke-virtual {v2}, Lrx1;->b()Lbd5;

    .line 924
    .line 925
    .line 926
    move-result-object v2

    .line 927
    check-cast v2, Lkf3;

    .line 928
    .line 929
    invoke-static {v1}, Lsc5;->b(Landroid/content/Context;)Lsc5;

    .line 930
    .line 931
    .line 932
    move-result-object v1

    .line 933
    const-string v3, "homemusic_hub_sync"

    .line 934
    .line 935
    invoke-virtual {v1, v3, v2}, Lsc5;->a(Ljava/lang/String;Lkf3;)Lrv2;

    .line 936
    .line 937
    .line 938
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 939
    .line 940
    .line 941
    move-result-object v0

    .line 942
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 943
    .line 944
    .line 945
    invoke-static {v0}, Lgi1;->W(Landroid/content/Context;)V

    .line 946
    .line 947
    .line 948
    invoke-static {}, Lrs1;->g()V

    .line 949
    .line 950
    .line 951
    return-void

    .line 952
    :cond_11
    const-string v0, "Local and anonymous classes can not be ViewModels"

    .line 953
    .line 954
    invoke-static {v0}, Lkf2;->n(Ljava/lang/String;)V

    .line 955
    .line 956
    .line 957
    return-void

    .line 958
    :cond_12
    move v2, v10

    .line 959
    goto :goto_9

    .line 960
    :cond_13
    move v2, v9

    .line 961
    goto :goto_9

    .line 962
    :cond_14
    move v2, v8

    .line 963
    goto :goto_9

    .line 964
    :cond_15
    move v2, v6

    .line 965
    :cond_16
    :goto_9
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 966
    .line 967
    .line 968
    move-result-object v0

    .line 969
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 970
    .line 971
    .line 972
    move-result-object v0

    .line 973
    const-string v1, "Missing required view with ID: "

    .line 974
    .line 975
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 976
    .line 977
    .line 978
    move-result-object v0

    .line 979
    invoke-static {v0}, Lnz2;->n(Ljava/lang/String;)V

    .line 980
    .line 981
    .line 982
    return-void
.end method

.method public final onDestroy()V
    .locals 8

    .line 1
    invoke-super {p0}, Ldf;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->a0:Lv9;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    sput-object v1, Lmm3;->g:Ljava/lang/String;

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    sget-wide v2, Lra0;->c:J

    .line 25
    .line 26
    const-wide v4, 0x7fffffffffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    cmp-long v0, v2, v4

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    sget-object v0, Lra0;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 40
    .line 41
    invoke-static {}, Lud3;->x()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    int-to-long v4, v0

    .line 46
    const-wide/16 v6, 0x3e8

    .line 47
    .line 48
    mul-long/2addr v4, v6

    .line 49
    add-long/2addr v4, v6

    .line 50
    add-long/2addr v4, v2

    .line 51
    sput-wide v4, Lra0;->c:J

    .line 52
    .line 53
    :cond_1
    iput-object v1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->R:Lqp4;

    .line 54
    .line 55
    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ll70;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->z(Landroid/content/Intent;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->s()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->r()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->O:Z

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->B(I[Ljava/lang/String;[I)V

    .line 4
    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-boolean p1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->O:Z

    .line 9
    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Lk70;->n:Lea2;

    .line 13
    .line 14
    iget-object p1, p1, Lea2;->h:Lr92;

    .line 15
    .line 16
    sget-object p2, Lr92;->r:Lr92;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-ltz p1, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    :goto_0
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->G()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public final onResume()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->C()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->G()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->K()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    const-string v0, " bytes (limit 409600); clearing it to avoid TransactionTooLargeException on background (#688)"

    .line 2
    .line 3
    const-string v1, "Saved instance state is "

    .line 4
    .line 5
    invoke-super {p0, p1}, Ll70;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/os/Parcel;->dataSize()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const v3, 0x64000

    .line 20
    .line 21
    .line 22
    if-le v2, v3, :cond_0

    .line 23
    .line 24
    const-string v3, "MainActivityLogs"

    .line 25
    .line 26
    new-instance v4, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/os/Bundle;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    :goto_0
    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :goto_1
    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    .line 55
    .line 56
    .line 57
    throw p1
.end method

.method public final onStart()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->D()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->G()V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lgq0;->n:Lgq0;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->P:Lbl2;

    .line 10
    .line 11
    sget-object v2, Lbo2;->a:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    new-instance v2, Ljr1;

    .line 16
    .line 17
    const/4 v3, 0x3

    .line 18
    invoke-direct {v2, v1, v3}, Ljr1;-><init>(Lbl2;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2, v0}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->P:Lbl2;

    .line 25
    .line 26
    new-instance v2, Lxs1;

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    invoke-direct {v2, p0, v3}, Lxs1;-><init>(Lcom/eddyizm/tempus/ui/activity/MainActivity;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2, v0}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->s()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->r()V

    .line 39
    .line 40
    .line 41
    sget-object v0, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 42
    .line 43
    invoke-static {}, Lpt0;->c()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    sget-object v0, Lrs1;->a:Lrs1;

    .line 51
    .line 52
    invoke-static {}, Ln61;->d()J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    sget-object v2, Lrs1;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 57
    .line 58
    new-instance v3, Lns1;

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    invoke-direct {v3, v4, v0, v1}, Lns1;-><init>(IJ)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 65
    .line 66
    .line 67
    sget-object v0, Lb00;->a:Lb00;

    .line 68
    .line 69
    invoke-virtual {v0}, Lb00;->e()V

    .line 70
    .line 71
    .line 72
    sget-boolean v0, Lxr1;->a:Z

    .line 73
    .line 74
    const-class v0, Lxr1;

    .line 75
    .line 76
    monitor-enter v0

    .line 77
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    sput-object v1, Lxr1;->d:Landroid/content/Context;

    .line 82
    .line 83
    sget-boolean v1, Lxr1;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    .line 85
    if-eqz v1, :cond_2

    .line 86
    .line 87
    monitor-exit v0

    .line 88
    goto :goto_0

    .line 89
    :cond_2
    const/4 v1, 0x1

    .line 90
    :try_start_1
    sput-boolean v1, Lxr1;->a:Z

    .line 91
    .line 92
    new-instance v2, Ljava/lang/Thread;

    .line 93
    .line 94
    new-instance v3, Lu6;

    .line 95
    .line 96
    const/4 v5, 0x5

    .line 97
    invoke-direct {v3, v5}, Lu6;-><init>(I)V

    .line 98
    .line 99
    .line 100
    const-string v5, "HubEvents"

    .line 101
    .line 102
    invoke-direct {v2, v3, v5}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 109
    .line 110
    .line 111
    sput-object v2, Lxr1;->c:Ljava/lang/Thread;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    .line 113
    monitor-exit v0

    .line 114
    :goto_0
    const-string v0, "homemusic_notifier"

    .line 115
    .line 116
    invoke-virtual {p0, v0, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    const-string v1, "pending_kept_sync"

    .line 121
    .line 122
    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_3

    .line 127
    .line 128
    invoke-static {p0}, Lgi1;->U(Landroid/content/Context;)V

    .line 129
    .line 130
    .line 131
    :cond_3
    invoke-static {p0}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->checkOnStart(Landroid/app/Activity;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :catchall_0
    move-exception p0

    .line 136
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 137
    throw p0
.end method

.method public final onStop()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->Q:Lk03;

    .line 3
    .line 4
    sget-object v0, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 5
    .line 6
    invoke-static {}, Lxr1;->a()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->E()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final q()V
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 2
    .line 3
    iget-object p0, p0, Lzg5;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lau;

    .line 6
    .line 7
    iget-object v0, p0, Lau;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/os/Handler;

    .line 10
    .line 11
    iget-object v1, p0, Lau;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Ljava/lang/Runnable;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    new-instance v1, La0;

    .line 21
    .line 22
    const/16 v2, 0xa

    .line 23
    .line 24
    invoke-direct {v1, v2, p0}, La0;-><init>(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lau;->g:Ljava/lang/Object;

    .line 28
    .line 29
    const-wide/16 v2, 0x64

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final r()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->c0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    :goto_0
    return-void

    .line 13
    :cond_1
    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->c0:Z

    .line 15
    .line 16
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0}, Lv23;->g()Lr23;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 28
    .line 29
    invoke-virtual {v0}, Lv23;->g()Lr23;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v0, v0, Lr23;->u:I

    .line 34
    .line 35
    const v2, 0x7f0a056d

    .line 36
    .line 37
    .line 38
    if-ne v0, v2, :cond_2

    .line 39
    .line 40
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 41
    .line 42
    invoke-virtual {v0, v2, v1}, Lv23;->p(IZ)Z

    .line 43
    .line 44
    .line 45
    :cond_2
    const v0, 0x7f0a047a

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Ldf;->findViewById(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_3

    .line 59
    .line 60
    new-instance v2, Lxs1;

    .line 61
    .line 62
    invoke-direct {v2, p0, v1}, Lxs1;-><init>(Lcom/eddyizm/tempus/ui/activity/MainActivity;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->t()V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final s()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->b0:Landroid/content/Intent;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    const/4 v2, 0x0

    .line 10
    iput-object v2, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->b0:Landroid/content/Intent;

    .line 11
    .line 12
    const-string v3, "EXTRA_DOWNLOAD_URI"

    .line 13
    .line 14
    invoke-virtual {v1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    goto/16 :goto_2

    .line 25
    .line 26
    :cond_1
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    const-string v3, "EXTRA_DOWNLOAD_MEDIA_ID"

    .line 31
    .line 32
    invoke-virtual {v1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    invoke-virtual {v6}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    :cond_2
    const-string v4, "EXTRA_DOWNLOAD_TITLE"

    .line 47
    .line 48
    invoke-virtual {v1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    const-string v5, "EXTRA_DOWNLOAD_ARTIST"

    .line 53
    .line 54
    invoke-virtual {v1, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    const-string v7, "EXTRA_DOWNLOAD_ALBUM"

    .line 59
    .line 60
    invoke-virtual {v1, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    const-string v8, "EXTRA_DOWNLOAD_DURATION"

    .line 65
    .line 66
    const/4 v15, 0x0

    .line 67
    invoke-virtual {v1, v8, v15}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    new-instance v8, Landroid/os/Bundle;

    .line 72
    .line 73
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v9, "id"

    .line 77
    .line 78
    invoke-virtual {v8, v9, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string v9, "title"

    .line 82
    .line 83
    invoke-virtual {v8, v9, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const-string v9, "artist"

    .line 87
    .line 88
    invoke-virtual {v8, v9, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    const-string v9, "album"

    .line 92
    .line 93
    invoke-virtual {v8, v9, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const-string v9, "uri"

    .line 97
    .line 98
    invoke-virtual {v6}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    invoke-virtual {v8, v9, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const-string v9, "type"

    .line 106
    .line 107
    const-string v10, "music"

    .line 108
    .line 109
    invoke-virtual {v8, v9, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const-string v9, "duration"

    .line 113
    .line 114
    invoke-virtual {v8, v9, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 115
    .line 116
    .line 117
    new-instance v1, Lco2;

    .line 118
    .line 119
    invoke-direct {v1}, Lco2;-><init>()V

    .line 120
    .line 121
    .line 122
    iput-object v8, v1, Lco2;->H:Landroid/os/Bundle;

    .line 123
    .line 124
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 125
    .line 126
    iput-object v9, v1, Lco2;->q:Ljava/lang/Boolean;

    .line 127
    .line 128
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 129
    .line 130
    iput-object v9, v1, Lco2;->r:Ljava/lang/Boolean;

    .line 131
    .line 132
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-nez v9, :cond_3

    .line 137
    .line 138
    iput-object v4, v1, Lco2;->a:Ljava/lang/CharSequence;

    .line 139
    .line 140
    :cond_3
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-nez v4, :cond_4

    .line 145
    .line 146
    iput-object v5, v1, Lco2;->b:Ljava/lang/CharSequence;

    .line 147
    .line 148
    :cond_4
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    if-nez v4, :cond_5

    .line 153
    .line 154
    iput-object v7, v1, Lco2;->c:Ljava/lang/CharSequence;

    .line 155
    .line 156
    :cond_5
    new-instance v4, Lum2;

    .line 157
    .line 158
    invoke-direct {v4}, Lum2;-><init>()V

    .line 159
    .line 160
    .line 161
    new-instance v5, Lxm2;

    .line 162
    .line 163
    invoke-direct {v5}, Lxm2;-><init>()V

    .line 164
    .line 165
    .line 166
    sget-object v10, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 167
    .line 168
    sget-object v12, Lgy3;->r:Lgy3;

    .line 169
    .line 170
    new-instance v7, Lzm2;

    .line 171
    .line 172
    invoke-direct {v7}, Lzm2;-><init>()V

    .line 173
    .line 174
    .line 175
    sget-object v9, Lcn2;->d:Lcn2;

    .line 176
    .line 177
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    new-instance v9, Ldo2;

    .line 181
    .line 182
    invoke-direct {v9, v1}, Ldo2;-><init>(Lco2;)V

    .line 183
    .line 184
    .line 185
    new-instance v1, Lyc5;

    .line 186
    .line 187
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 188
    .line 189
    .line 190
    iput-object v6, v1, Lyc5;->n:Ljava/lang/Object;

    .line 191
    .line 192
    iput-object v8, v1, Lyc5;->p:Ljava/lang/Object;

    .line 193
    .line 194
    new-instance v8, Lcn2;

    .line 195
    .line 196
    invoke-direct {v8, v1}, Lcn2;-><init>(Lyc5;)V

    .line 197
    .line 198
    .line 199
    iget-object v1, v5, Lxm2;->e:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v1, Landroid/net/Uri;

    .line 202
    .line 203
    if-eqz v1, :cond_7

    .line 204
    .line 205
    iget-object v1, v5, Lxm2;->d:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v1, Ljava/util/UUID;

    .line 208
    .line 209
    if-eqz v1, :cond_6

    .line 210
    .line 211
    goto :goto_0

    .line 212
    :cond_6
    move v1, v15

    .line 213
    goto :goto_1

    .line 214
    :cond_7
    :goto_0
    const/4 v1, 0x1

    .line 215
    :goto_1
    invoke-static {v1}, Lrr2;->w(Z)V

    .line 216
    .line 217
    .line 218
    new-instance v1, Lbn2;

    .line 219
    .line 220
    iget-object v11, v5, Lxm2;->d:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v11, Ljava/util/UUID;

    .line 223
    .line 224
    if-eqz v11, :cond_8

    .line 225
    .line 226
    new-instance v2, Lym2;

    .line 227
    .line 228
    invoke-direct {v2, v5}, Lym2;-><init>(Lxm2;)V

    .line 229
    .line 230
    .line 231
    :cond_8
    move-object v5, v7

    .line 232
    const-string v7, "audio"

    .line 233
    .line 234
    move-object v11, v9

    .line 235
    const/4 v9, 0x0

    .line 236
    move-object v13, v11

    .line 237
    const/4 v11, 0x0

    .line 238
    move-object/from16 v16, v13

    .line 239
    .line 240
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    move-object/from16 v17, v5

    .line 246
    .line 247
    move-object v5, v1

    .line 248
    move-object/from16 v1, v17

    .line 249
    .line 250
    move-object/from16 v17, v8

    .line 251
    .line 252
    move-object v8, v2

    .line 253
    move-object/from16 v2, v17

    .line 254
    .line 255
    invoke-direct/range {v5 .. v14}, Lbn2;-><init>(Landroid/net/Uri;Ljava/lang/String;Lym2;Lsm2;Ljava/util/List;Ljava/lang/String;Lyw1;J)V

    .line 256
    .line 257
    .line 258
    new-instance v7, Lgn2;

    .line 259
    .line 260
    new-instance v9, Lwm2;

    .line 261
    .line 262
    invoke-direct {v9, v4}, Lvm2;-><init>(Lum2;)V

    .line 263
    .line 264
    .line 265
    new-instance v11, Lan2;

    .line 266
    .line 267
    invoke-direct {v11, v1}, Lan2;-><init>(Lzm2;)V

    .line 268
    .line 269
    .line 270
    move-object v13, v2

    .line 271
    move-object v8, v3

    .line 272
    move-object v10, v5

    .line 273
    move-object/from16 v12, v16

    .line 274
    .line 275
    invoke-direct/range {v7 .. v13}, Lgn2;-><init>(Ljava/lang/String;Lwm2;Lbn2;Lan2;Ldo2;Lcn2;)V

    .line 276
    .line 277
    .line 278
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->P:Lbl2;

    .line 279
    .line 280
    sget-object v1, Lbo2;->a:Ljava/lang/ref/WeakReference;

    .line 281
    .line 282
    invoke-static {v7}, Lgi1;->N(Lgn2;)Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    sget-object v2, Lu52;->a:Landroid/os/Handler;

    .line 291
    .line 292
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    const-wide/16 v2, 0x0

    .line 296
    .line 297
    const-string v4, "replace"

    .line 298
    .line 299
    invoke-static {v1, v4, v15, v2, v3}, Lu52;->r(Ljava/util/List;Ljava/lang/String;IJ)Z

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    if-eqz v1, :cond_9

    .line 304
    .line 305
    goto :goto_2

    .line 306
    :cond_9
    if-eqz v0, :cond_a

    .line 307
    .line 308
    new-instance v1, Lws1;

    .line 309
    .line 310
    const/16 v2, 0x15

    .line 311
    .line 312
    invoke-direct {v1, v2, v0, v7}, Lws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    sget-object v2, Lgq0;->n:Lgq0;

    .line 316
    .line 317
    invoke-virtual {v0, v1, v2}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 318
    .line 319
    .line 320
    :cond_a
    :goto_2
    return-void
.end method

.method public final t()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 15
    .line 16
    if-eqz p0, :cond_2

    .line 17
    .line 18
    iget-object p0, p0, Lzg5;->n:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lau;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    iput-boolean v0, p0, Lau;->a:Z

    .line 24
    .line 25
    iget-object v0, p0, Lau;->g:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Runnable;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v1, p0, Lau;->f:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Landroid/os/Handler;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    iput-object v0, p0, Lau;->g:Ljava/lang/Object;

    .line 40
    .line 41
    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lau;->a(F)V

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Lau;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 49
    .line 50
    const/4 v0, 0x3

    .line 51
    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J(I)V

    .line 52
    .line 53
    .line 54
    :cond_2
    :goto_0
    return-void
.end method

.method public final u()Landroid/widget/FrameLayout;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->W:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 2
    .line 3
    iget v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:I

    .line 4
    .line 5
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->R:Lqp4;

    .line 6
    .line 7
    iget-object v1, v1, Lqp4;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Landroid/widget/FrameLayout;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x4

    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->R:Lqp4;

    .line 21
    .line 22
    iget-object p0, p0, Lqp4;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Landroid/widget/FrameLayout;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    const/4 v1, 0x3

    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    iget-boolean v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->X:Z

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->R:Lqp4;

    .line 35
    .line 36
    iget-object v0, v0, Lqp4;->a:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->R:Lqp4;

    .line 47
    .line 48
    iget-object p0, p0, Lqp4;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_1
    const/4 p0, 0x0

    .line 54
    return-object p0
.end method

.method public final v()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->S:Lvf2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lvf2;->c()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 11
    .line 12
    iget-object v1, v1, Lzg5;->n:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lau;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Lau;->d(Z)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lmm3;

    .line 20
    .line 21
    invoke-direct {v0}, Lmm3;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Lmm3;->i(Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->w()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->Z:Lik;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->Y:Lc12;

    .line 40
    .line 41
    if-nez v2, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {v2, v0}, Lc12;->i(Lik;)V

    .line 45
    .line 46
    .line 47
    iput-object v1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->Z:Lik;

    .line 48
    .line 49
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->r()V

    .line 50
    .line 51
    .line 52
    sget-object v0, Lio1;->c:Ljava/lang/String;

    .line 53
    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    return-void

    .line 57
    :cond_2
    sput-object v1, Lio1;->c:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {p0, v0}, Ljs1;->a(Lcom/eddyizm/tempus/ui/activity/MainActivity;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final w()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Lom1;

    .line 3
    .line 4
    invoke-virtual {v1, v0}, Lom1;->p(Z)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Lom1;

    .line 8
    .line 9
    iget-object p0, p0, Lom1;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lss0;

    .line 12
    .line 13
    iget-object p0, p0, Lss0;->q:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lv23;

    .line 16
    .line 17
    invoke-virtual {p0}, Lv23;->g()Lr23;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget v0, v0, Lr23;->u:I

    .line 22
    .line 23
    const v1, 0x7f0a0331

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    if-ne v0, v1, :cond_0

    .line 28
    .line 29
    const v0, 0x7f0a0069

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0, v2, v2}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    const v1, 0x7f0a034a

    .line 37
    .line 38
    .line 39
    if-ne v0, v1, :cond_1

    .line 40
    .line 41
    const v0, 0x7f0a0077

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v0, v2, v2}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method

.method public final x()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->W:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Lom1;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Lom1;->p(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->I(Z)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Lom1;

    .line 17
    .line 18
    iget-object p0, p0, Lom1;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lss0;

    .line 21
    .line 22
    iget-object p0, p0, Lss0;->q:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Lv23;

    .line 25
    .line 26
    invoke-virtual {p0}, Lv23;->g()Lr23;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget v0, v0, Lr23;->u:I

    .line 31
    .line 32
    const v1, 0x7f0a0331

    .line 33
    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    if-ne v0, v1, :cond_0

    .line 37
    .line 38
    const v0, 0x7f0a006a

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0, v2, v2}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    const v1, 0x7f0a056d

    .line 46
    .line 47
    .line 48
    if-ne v0, v1, :cond_1

    .line 49
    .line 50
    const v0, 0x7f0a008a

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v0, v2, v2}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    const v1, 0x7f0a02af

    .line 58
    .line 59
    .line 60
    if-ne v0, v1, :cond_2

    .line 61
    .line 62
    const v0, 0x7f0a005f

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0, v2, v2}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    return-void
.end method

.method public final z(Landroid/content/Intent;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const-string v0, "com.eddyizm.tempus.action.OPEN_NOW_PLAYING"

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->c0:Z

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    :cond_1
    const-string v0, "com.eddyizm.tempus.action.PLAY_EXTERNAL_DOWNLOAD"

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    const-string v0, "EXTRA_DOWNLOAD_URI"

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    :cond_2
    new-instance v0, Landroid/content/Intent;

    .line 44
    .line 45
    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->b0:Landroid/content/Intent;

    .line 49
    .line 50
    :cond_3
    sget-object v0, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 51
    .line 52
    const-string v0, "homemusic_hub_route"

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-nez v2, :cond_7

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0}, Ll93;->S(Landroid/net/Uri;)Lik;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-nez v0, :cond_4

    .line 69
    .line 70
    :goto_0
    return-void

    .line 71
    :cond_4
    invoke-static {}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->y()Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-nez v2, :cond_5

    .line 76
    .line 77
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->Z:Lik;

    .line 78
    .line 79
    invoke-virtual {p1, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_5
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->Y:Lc12;

    .line 84
    .line 85
    if-eqz p0, :cond_6

    .line 86
    .line 87
    invoke-virtual {p0, v0}, Lc12;->i(Lik;)V

    .line 88
    .line 89
    .line 90
    :cond_6
    invoke-virtual {p1, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_7
    invoke-virtual {p1, v0}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-static {}, Lpt0;->c()Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-nez p1, :cond_8

    .line 102
    .line 103
    sput-object v2, Lio1;->c:Ljava/lang/String;

    .line 104
    .line 105
    return-void

    .line 106
    :cond_8
    invoke-static {p0, v2}, Ljs1;->a(Lcom/eddyizm/tempus/ui/activity/MainActivity;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-void
.end method
