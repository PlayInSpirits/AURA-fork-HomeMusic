.class public final Lu02;
.super Lvr1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lu02;->c:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/os/Looper;Lml3;Ljava/lang/Object;Lgj1;Lhj1;)Lme;
    .locals 8

    .line 1
    iget v0, p0, Lu02;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super/range {p0 .. p6}, Lvr1;->a(Landroid/content/Context;Landroid/os/Looper;Lml3;Ljava/lang/Object;Lgj1;Lhj1;)Lme;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_1
    move-object v1, p1

    .line 12
    move-object v2, p2

    .line 13
    move-object v3, p3

    .line 14
    move-object v5, p5

    .line 15
    move-object v6, p6

    .line 16
    check-cast p4, Lke;

    .line 17
    .line 18
    new-instance v0, Lok5;

    .line 19
    .line 20
    const/16 v3, 0x94

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    move-object v4, p3

    .line 24
    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/common/internal/a;-><init>(Landroid/content/Context;Landroid/os/Looper;ILml3;Lgj1;Lhj1;I)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_2
    move-object v1, p1

    .line 29
    move-object v2, p2

    .line 30
    move-object v3, p3

    .line 31
    move-object v5, p5

    .line 32
    move-object v6, p6

    .line 33
    move-object v4, p4

    .line 34
    check-cast v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 35
    .line 36
    new-instance v0, Lsg5;

    .line 37
    .line 38
    check-cast v5, Lgf5;

    .line 39
    .line 40
    check-cast v6, Lgf5;

    .line 41
    .line 42
    invoke-direct/range {v0 .. v6}, Lsg5;-><init>(Landroid/content/Context;Landroid/os/Looper;Lml3;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;Lgf5;Lgf5;)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_3
    move-object v1, p1

    .line 47
    move-object v2, p2

    .line 48
    move-object v3, p3

    .line 49
    move-object v5, p5

    .line 50
    move-object v6, p6

    .line 51
    move-object v4, p4

    .line 52
    check-cast v4, Lqg5;

    .line 53
    .line 54
    new-instance v0, Lrg5;

    .line 55
    .line 56
    check-cast v5, Lgf5;

    .line 57
    .line 58
    check-cast v6, Lgf5;

    .line 59
    .line 60
    invoke-direct/range {v0 .. v6}, Lrg5;-><init>(Landroid/content/Context;Landroid/os/Looper;Lml3;Lqg5;Lgf5;Lgf5;)V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :pswitch_4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance p0, Ljava/lang/ClassCastException;

    .line 68
    .line 69
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 70
    .line 71
    .line 72
    throw p0

    .line 73
    :pswitch_5
    move-object v1, p1

    .line 74
    move-object v2, p2

    .line 75
    move-object v3, p3

    .line 76
    move-object v5, p5

    .line 77
    move-object v6, p6

    .line 78
    check-cast p4, Lud4;

    .line 79
    .line 80
    new-instance v0, Lsd4;

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    iget-object p0, v3, Lml3;->f:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p0, Ljava/lang/Integer;

    .line 88
    .line 89
    new-instance v4, Landroid/os/Bundle;

    .line 90
    .line 91
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 92
    .line 93
    .line 94
    const-string p1, "com.google.android.gms.signin.internal.clientRequestedAccount"

    .line 95
    .line 96
    const/4 p2, 0x0

    .line 97
    invoke-virtual {v4, p1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 98
    .line 99
    .line 100
    if-eqz p0, :cond_0

    .line 101
    .line 102
    const-string p1, "com.google.android.gms.common.internal.ClientSettings.sessionId"

    .line 103
    .line 104
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    invoke-virtual {v4, p1, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 109
    .line 110
    .line 111
    :cond_0
    const-string p0, "com.google.android.gms.signin.internal.offlineAccessRequested"

    .line 112
    .line 113
    const/4 p1, 0x0

    .line 114
    invoke-virtual {v4, p0, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 115
    .line 116
    .line 117
    const-string p0, "com.google.android.gms.signin.internal.idTokenRequested"

    .line 118
    .line 119
    invoke-virtual {v4, p0, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 120
    .line 121
    .line 122
    const-string p0, "com.google.android.gms.signin.internal.serverClientId"

    .line 123
    .line 124
    invoke-virtual {v4, p0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    const-string p0, "com.google.android.gms.signin.internal.usePromptModeForAuthCode"

    .line 128
    .line 129
    const/4 p3, 0x1

    .line 130
    invoke-virtual {v4, p0, p3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 131
    .line 132
    .line 133
    const-string p0, "com.google.android.gms.signin.internal.forceCodeForRefreshToken"

    .line 134
    .line 135
    invoke-virtual {v4, p0, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 136
    .line 137
    .line 138
    const-string p0, "com.google.android.gms.signin.internal.hostedDomain"

    .line 139
    .line 140
    invoke-virtual {v4, p0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    const-string p0, "com.google.android.gms.signin.internal.logSessionId"

    .line 144
    .line 145
    invoke-virtual {v4, p0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    const-string p0, "com.google.android.gms.signin.internal.waitForAccessTokenRefresh"

    .line 149
    .line 150
    invoke-virtual {v4, p0, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 151
    .line 152
    .line 153
    invoke-direct/range {v0 .. v6}, Lsd4;-><init>(Landroid/content/Context;Landroid/os/Looper;Lml3;Landroid/os/Bundle;Lgj1;Lhj1;)V

    .line 154
    .line 155
    .line 156
    return-object v0

    .line 157
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public b(Landroid/content/Context;Landroid/os/Looper;Lml3;Ljava/lang/Object;Lgf5;Lgf5;)Lme;
    .locals 8

    .line 1
    iget v0, p0, Lu02;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super/range {p0 .. p6}, Lvr1;->b(Landroid/content/Context;Landroid/os/Looper;Lml3;Ljava/lang/Object;Lgf5;Lgf5;)Lme;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_1
    move-object v1, p1

    .line 12
    move-object v2, p2

    .line 13
    move-object p0, p4

    .line 14
    move-object p4, p3

    .line 15
    check-cast p0, Ldh5;

    .line 16
    .line 17
    new-instance p1, Llg5;

    .line 18
    .line 19
    move-object p2, v1

    .line 20
    move-object p3, v2

    .line 21
    invoke-direct/range {p1 .. p6}, Llg5;-><init>(Landroid/content/Context;Landroid/os/Looper;Lml3;Lgf5;Lgf5;)V

    .line 22
    .line 23
    .line 24
    return-object p1

    .line 25
    :pswitch_2
    move-object v1, p1

    .line 26
    move-object v2, p2

    .line 27
    move-object p0, p4

    .line 28
    move-object p4, p3

    .line 29
    check-cast p0, Lxg5;

    .line 30
    .line 31
    new-instance p1, Lvg5;

    .line 32
    .line 33
    move-object p2, v1

    .line 34
    move-object p3, v2

    .line 35
    invoke-direct/range {p1 .. p6}, Lvg5;-><init>(Landroid/content/Context;Landroid/os/Looper;Lml3;Lgf5;Lgf5;)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_3
    move-object v1, p1

    .line 40
    move-object v2, p2

    .line 41
    move-object p0, p4

    .line 42
    move-object p4, p3

    .line 43
    move-object v4, p0

    .line 44
    check-cast v4, Llr4;

    .line 45
    .line 46
    new-instance v0, Lfg5;

    .line 47
    .line 48
    move-object v3, p4

    .line 49
    move-object v5, p5

    .line 50
    move-object v6, p6

    .line 51
    invoke-direct/range {v0 .. v6}, Lfg5;-><init>(Landroid/content/Context;Landroid/os/Looper;Lml3;Llr4;Lgf5;Lgf5;)V

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :pswitch_4
    move-object v1, p1

    .line 56
    move-object v2, p2

    .line 57
    move-object p0, p4

    .line 58
    move-object p4, p3

    .line 59
    check-cast p0, Lke;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    new-instance v0, Lp14;

    .line 71
    .line 72
    const/16 v3, 0x17d

    .line 73
    .line 74
    const/4 v7, 0x0

    .line 75
    move-object v4, p4

    .line 76
    move-object v5, p5

    .line 77
    move-object v6, p6

    .line 78
    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/common/internal/a;-><init>(Landroid/content/Context;Landroid/os/Looper;ILml3;Lgj1;Lhj1;I)V

    .line 79
    .line 80
    .line 81
    return-object v0

    .line 82
    :pswitch_5
    move-object v1, p1

    .line 83
    move-object v2, p2

    .line 84
    move-object p0, p4

    .line 85
    move-object p4, p3

    .line 86
    check-cast p0, Lke;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    new-instance v0, Lsv1;

    .line 98
    .line 99
    const/16 v3, 0x160

    .line 100
    .line 101
    const/4 v7, 0x0

    .line 102
    move-object v4, p4

    .line 103
    move-object v5, p5

    .line 104
    move-object v6, p6

    .line 105
    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/common/internal/a;-><init>(Landroid/content/Context;Landroid/os/Looper;ILml3;Lgj1;Lhj1;I)V

    .line 106
    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
