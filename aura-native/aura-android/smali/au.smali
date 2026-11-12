.class public final Lau;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lau;->b:Ljava/lang/Object;

    .line 43
    sget-object p1, Lnl;->c:Lnl;

    iput-object p1, p0, Lau;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;Lmd1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lau;->a:Z

    .line 6
    .line 7
    new-instance v0, Landroid/os/Handler;

    .line 8
    .line 9
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lau;->f:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p1, p0, Lau;->b:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object p2, p0, Lau;->c:Ljava/lang/Object;

    .line 21
    .line 22
    iput-object p3, p0, Lau;->d:Ljava/lang/Object;

    .line 23
    .line 24
    new-instance p2, Lxi3;

    .line 25
    .line 26
    invoke-direct {p2}, Lxi3;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p2, p0, Lau;->e:Ljava/lang/Object;

    .line 30
    .line 31
    new-instance p2, Lwt;

    .line 32
    .line 33
    const/4 p3, 0x1

    .line 34
    invoke-direct {p2, p3, p0}, Lwt;-><init>(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w(Lut;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(Ln51;Lom0;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lau;->b:Ljava/lang/Object;

    .line 46
    iput-object p2, p0, Lau;->f:Ljava/lang/Object;

    .line 47
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lau;->c:Ljava/lang/Object;

    .line 48
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lau;->d:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 49
    iput-boolean p1, p0, Lau;->a:Z

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 4

    .line 1
    iget-object p0, p0, Lau;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxi3;

    .line 4
    .line 5
    if-eqz p0, :cond_2

    .line 6
    .line 7
    iget-object p0, p0, Lxi3;->o0:Lns3;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lns3;->q:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lae1;

    .line 14
    .line 15
    iget-object p0, p0, Lae1;->b:Landroid/view/ViewGroup;

    .line 16
    .line 17
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    :goto_0
    if-eqz p0, :cond_2

    .line 22
    .line 23
    const v0, 0x3e4ccccd    # 0.2f

    .line 24
    .line 25
    .line 26
    sub-float/2addr p1, v0

    .line 27
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    div-float/2addr p1, v0

    .line 37
    const/high16 v0, 0x3f800000    # 1.0f

    .line 38
    .line 39
    sub-float/2addr v0, p1

    .line 40
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 41
    .line 42
    .line 43
    float-to-double v0, p1

    .line 44
    const-wide v2, 0x3fefae147ae147aeL    # 0.99

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    cmpl-double p1, v0, v2

    .line 50
    .line 51
    if-lez p1, :cond_1

    .line 52
    .line 53
    const/16 p1, 0x8

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const/4 p1, 0x0

    .line 57
    :goto_1
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 58
    .line 59
    .line 60
    :cond_2
    return-void
.end method

.method public b()Ltj0;
    .locals 5

    .line 1
    iget-object v0, p0, Lau;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    iget-boolean v1, p0, Lau;->a:Z

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    xor-int/2addr v1, v2

    .line 9
    invoke-static {v1}, Lrr2;->w(Z)V

    .line 10
    .line 11
    .line 12
    iput-boolean v2, p0, Lau;->a:Z

    .line 13
    .line 14
    iget-object v1, p0, Lau;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lqp4;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    new-instance v1, Lqp4;

    .line 22
    .line 23
    new-array v4, v3, [Lim;

    .line 24
    .line 25
    invoke-direct {v1, v4}, Lqp4;-><init>([Lim;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lau;->d:Ljava/lang/Object;

    .line 29
    .line 30
    :cond_0
    iget-object v1, p0, Lau;->f:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Ldn;

    .line 33
    .line 34
    iget-object v4, p0, Lau;->g:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v4, Lwo0;

    .line 37
    .line 38
    if-nez v1, :cond_8

    .line 39
    .line 40
    if-nez v4, :cond_1

    .line 41
    .line 42
    new-instance v1, Lwo0;

    .line 43
    .line 44
    invoke-direct {v1, v0}, Lwo0;-><init>(Landroid/content/Context;)V

    .line 45
    .line 46
    .line 47
    iput-object v1, p0, Lau;->g:Ljava/lang/Object;

    .line 48
    .line 49
    :cond_1
    iget-object v1, p0, Lau;->e:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Lfz0;

    .line 52
    .line 53
    if-nez v1, :cond_2

    .line 54
    .line 55
    sget-object v1, Lfz0;->T:Lfz0;

    .line 56
    .line 57
    iput-object v1, p0, Lau;->e:Ljava/lang/Object;

    .line 58
    .line 59
    :cond_2
    new-instance v1, Lss0;

    .line 60
    .line 61
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    goto :goto_0

    .line 72
    :cond_3
    move-object v3, v2

    .line 73
    :goto_0
    iput-object v3, v1, Lss0;->n:Ljava/lang/Object;

    .line 74
    .line 75
    sget-object v3, Lfz0;->T:Lfz0;

    .line 76
    .line 77
    iput-object v3, v1, Lss0;->p:Ljava/lang/Object;

    .line 78
    .line 79
    if-nez v0, :cond_4

    .line 80
    .line 81
    sget-object v3, Lnl;->c:Lnl;

    .line 82
    .line 83
    iput-object v3, v1, Lss0;->q:Ljava/lang/Object;

    .line 84
    .line 85
    :cond_4
    if-eqz v0, :cond_5

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_5
    iget-object v0, p0, Lau;->c:Ljava/lang/Object;

    .line 89
    .line 90
    move-object v2, v0

    .line 91
    check-cast v2, Lnl;

    .line 92
    .line 93
    :goto_1
    iget-object v0, v1, Lss0;->n:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Landroid/content/Context;

    .line 96
    .line 97
    if-nez v0, :cond_6

    .line 98
    .line 99
    iput-object v2, v1, Lss0;->q:Ljava/lang/Object;

    .line 100
    .line 101
    :cond_6
    iget-object v2, p0, Lau;->g:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v2, Lwo0;

    .line 104
    .line 105
    iput-object v2, v1, Lss0;->o:Ljava/lang/Object;

    .line 106
    .line 107
    iget-object v3, p0, Lau;->e:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v3, Lfz0;

    .line 110
    .line 111
    iput-object v3, v1, Lss0;->p:Ljava/lang/Object;

    .line 112
    .line 113
    if-nez v2, :cond_7

    .line 114
    .line 115
    new-instance v2, Lwo0;

    .line 116
    .line 117
    invoke-direct {v2, v0}, Lwo0;-><init>(Landroid/content/Context;)V

    .line 118
    .line 119
    .line 120
    iput-object v2, v1, Lss0;->o:Ljava/lang/Object;

    .line 121
    .line 122
    :cond_7
    new-instance v0, Ldn;

    .line 123
    .line 124
    invoke-direct {v0, v1}, Ldn;-><init>(Lss0;)V

    .line 125
    .line 126
    .line 127
    iput-object v0, p0, Lau;->f:Ljava/lang/Object;

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_8
    if-nez v4, :cond_9

    .line 131
    .line 132
    move v0, v2

    .line 133
    goto :goto_2

    .line 134
    :cond_9
    move v0, v3

    .line 135
    :goto_2
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 136
    .line 137
    .line 138
    iget-object v0, p0, Lau;->e:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v0, Lfz0;

    .line 141
    .line 142
    if-nez v0, :cond_a

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_a
    move v2, v3

    .line 146
    :goto_3
    invoke-static {v2}, Lrr2;->w(Z)V

    .line 147
    .line 148
    .line 149
    :goto_4
    new-instance v0, Ltj0;

    .line 150
    .line 151
    invoke-direct {v0, p0}, Ltj0;-><init>(Lau;)V

    .line 152
    .line 153
    .line 154
    return-object v0
.end method

.method public c(I)Llt2;
    .locals 7

    .line 1
    iget-object v0, p0, Lau;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Llt2;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_0
    iget-object v1, p0, Lau;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lgo4;

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    goto/16 :goto_2

    .line 35
    .line 36
    :cond_1
    iget-object v2, p0, Lau;->e:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Lbi0;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    const-class v4, Llt2;

    .line 45
    .line 46
    if-eqz p1, :cond_6

    .line 47
    .line 48
    const/4 v5, 0x1

    .line 49
    if-eq p1, v5, :cond_5

    .line 50
    .line 51
    const/4 v6, 0x2

    .line 52
    if-eq p1, v6, :cond_4

    .line 53
    .line 54
    const/4 v6, 0x3

    .line 55
    if-eq p1, v6, :cond_3

    .line 56
    .line 57
    const/4 v4, 0x4

    .line 58
    if-ne p1, v4, :cond_2

    .line 59
    .line 60
    new-instance v4, Lbm0;

    .line 61
    .line 62
    invoke-direct {v4, v3, p0, v2}, Lbm0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :goto_0
    move-object v2, v4

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    const-string v1, "Unrecognized contentType: "

    .line 68
    .line 69
    invoke-static {p1, v1}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-static {v1}, Lkf2;->n(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const/4 v2, 0x0

    .line 77
    goto :goto_2

    .line 78
    :cond_3
    const-string v2, "androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory"

    .line 79
    .line 80
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v2, v4}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    new-instance v3, Lsl;

    .line 89
    .line 90
    invoke-direct {v3, v5, v2}, Lsl;-><init>(ILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    move-object v2, v3

    .line 94
    goto :goto_1

    .line 95
    :cond_4
    const-class v3, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

    .line 96
    .line 97
    invoke-virtual {v3, v4}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    new-instance v4, Lam0;

    .line 102
    .line 103
    invoke-direct {v4, v3, v2, v6}, Lam0;-><init>(Ljava/lang/Class;Lbi0;I)V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_5
    const-string v3, "androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory"

    .line 108
    .line 109
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-virtual {v3, v4}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    new-instance v4, Lam0;

    .line 118
    .line 119
    invoke-direct {v4, v3, v2, v5}, Lam0;-><init>(Ljava/lang/Class;Lbi0;I)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_6
    const-string v5, "androidx.media3.exoplayer.dash.DashMediaSource$Factory"

    .line 124
    .line 125
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-virtual {v5, v4}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    new-instance v5, Lam0;

    .line 134
    .line 135
    invoke-direct {v5, v4, v2, v3}, Lam0;-><init>(Ljava/lang/Class;Lbi0;I)V

    .line 136
    .line 137
    .line 138
    move-object v2, v5

    .line 139
    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    :goto_2
    invoke-interface {v2}, Lgo4;->get()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    check-cast v1, Llt2;

    .line 151
    .line 152
    iget-object v2, p0, Lau;->g:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v2, Lyc5;

    .line 155
    .line 156
    if-eqz v2, :cond_7

    .line 157
    .line 158
    invoke-interface {v1, v2}, Llt2;->e(Lyc5;)Llt2;

    .line 159
    .line 160
    .line 161
    :cond_7
    iget-object v2, p0, Lau;->f:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v2, Lom0;

    .line 164
    .line 165
    invoke-interface {v1, v2}, Llt2;->a(Lom0;)V

    .line 166
    .line 167
    .line 168
    iget-boolean p0, p0, Lau;->a:Z

    .line 169
    .line 170
    invoke-interface {v1, p0}, Llt2;->c(Z)V

    .line 171
    .line 172
    .line 173
    invoke-interface {v1}, Llt2;->b()V

    .line 174
    .line 175
    .line 176
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    return-object v1
.end method

.method public d(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lau;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 4
    .line 5
    if-nez p1, :cond_1

    .line 6
    .line 7
    invoke-static {}, Lu52;->c()Lv52;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-boolean p1, p1, Lv52;->a:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x5

    .line 17
    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    :goto_0
    const/4 p1, 0x4

    .line 22
    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
