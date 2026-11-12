.class public final synthetic Lps2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Landroidx/media3/session/MediaLibraryService;

.field public final synthetic p:Lkn2;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/session/MediaLibraryService;Lkn2;I)V
    .locals 0

    .line 1
    iput p3, p0, Lps2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lps2;->o:Landroidx/media3/session/MediaLibraryService;

    .line 4
    .line 5
    iput-object p2, p0, Lps2;->p:Lkn2;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lps2;->n:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, Lps2;->o:Landroidx/media3/session/MediaLibraryService;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget v1, Landroidx/media3/session/MediaLibraryService;->t:I

    .line 12
    .line 13
    invoke-virtual {v3}, Landroidx/media3/session/MediaLibraryService;->d()Llo2;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v1, v1, Llo2;->t:Ljava/util/HashMap;

    .line 18
    .line 19
    iget-object v0, v0, Lps2;->p:Lkn2;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljo2;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    iget-object v1, v1, Ljo2;->a:Lbl2;

    .line 30
    .line 31
    invoke-static {v1}, Lsk2;->Z0(Ljava/util/concurrent/Future;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object v0, v0, Lkn2;->a:Ltn2;

    .line 35
    .line 36
    iput-object v2, v0, Ltn2;->v:Lrm2;

    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_0
    iget-object v8, v0, Lps2;->p:Lkn2;

    .line 40
    .line 41
    iget-object v0, v8, Lkn2;->a:Ltn2;

    .line 42
    .line 43
    sget v1, Landroidx/media3/session/MediaLibraryService;->t:I

    .line 44
    .line 45
    invoke-virtual {v3}, Landroidx/media3/session/MediaLibraryService;->d()Llo2;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    iget-object v10, v5, Llo2;->n:Landroidx/media3/session/MediaLibraryService;

    .line 50
    .line 51
    iget-object v1, v5, Llo2;->t:Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-virtual {v1, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    new-instance v7, Lko2;

    .line 61
    .line 62
    invoke-direct {v7, v5, v10, v8}, Lko2;-><init>(Llo2;Landroidx/media3/session/MediaLibraryService;Lkn2;)V

    .line 63
    .line 64
    .line 65
    new-instance v4, Landroid/os/Bundle;

    .line 66
    .line 67
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v6, "androidx.media3.session.MediaNotificationManager"

    .line 71
    .line 72
    const/4 v9, 0x1

    .line 73
    invoke-virtual {v4, v6, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 74
    .line 75
    .line 76
    iget-object v11, v0, Ltn2;->j:Lcb4;

    .line 77
    .line 78
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    sget-object v6, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 82
    .line 83
    invoke-static {}, Lf35;->x()Landroid/os/Looper;

    .line 84
    .line 85
    .line 86
    new-instance v12, Landroid/os/Bundle;

    .line 87
    .line 88
    invoke-direct {v12, v4}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 89
    .line 90
    .line 91
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 92
    .line 93
    .line 94
    move-result-object v14

    .line 95
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    new-instance v15, Lbl2;

    .line 99
    .line 100
    invoke-direct {v15, v14}, Lbl2;-><init>(Landroid/os/Looper;)V

    .line 101
    .line 102
    .line 103
    iget-object v4, v11, Lcb4;->a:Lbb4;

    .line 104
    .line 105
    invoke-interface {v4}, Lbb4;->e()Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_2

    .line 110
    .line 111
    new-instance v2, Lxc5;

    .line 112
    .line 113
    new-instance v4, Lx7;

    .line 114
    .line 115
    invoke-direct {v4, v10}, Lx7;-><init>(Landroid/content/Context;)V

    .line 116
    .line 117
    .line 118
    new-instance v6, Lfi0;

    .line 119
    .line 120
    invoke-direct {v6, v4}, Lfi0;-><init>(Lx7;)V

    .line 121
    .line 122
    .line 123
    const/4 v4, 0x4

    .line 124
    invoke-direct {v2, v4, v6}, Lxc5;-><init>(ILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :cond_2
    move-object/from16 v16, v2

    .line 128
    .line 129
    new-instance v9, Lsk2;

    .line 130
    .line 131
    move-object v13, v7

    .line 132
    invoke-direct/range {v9 .. v16}, Lsk2;-><init>(Landroid/content/Context;Lcb4;Landroid/os/Bundle;Lqk2;Landroid/os/Looper;Lbl2;Lxc5;)V

    .line 133
    .line 134
    .line 135
    new-instance v2, Landroid/os/Handler;

    .line 136
    .line 137
    invoke-direct {v2, v14}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 138
    .line 139
    .line 140
    new-instance v4, Lpk2;

    .line 141
    .line 142
    const/4 v6, 0x0

    .line 143
    invoke-direct {v4, v15, v9, v6}, Lpk2;-><init>(Lbl2;Lsk2;I)V

    .line 144
    .line 145
    .line 146
    invoke-static {v2, v4}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 147
    .line 148
    .line 149
    new-instance v2, Ljo2;

    .line 150
    .line 151
    invoke-direct {v2, v15}, Ljo2;-><init>(Lbl2;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    new-instance v4, Lt6;

    .line 158
    .line 159
    const/16 v9, 0x12

    .line 160
    .line 161
    move-object v6, v15

    .line 162
    invoke-direct/range {v4 .. v9}, Lt6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 163
    .line 164
    .line 165
    iget-object v1, v5, Llo2;->r:Lh41;

    .line 166
    .line 167
    invoke-virtual {v15, v4, v1}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 168
    .line 169
    .line 170
    :goto_0
    new-instance v1, Lrm2;

    .line 171
    .line 172
    const/4 v2, 0x2

    .line 173
    invoke-direct {v1, v2, v3}, Lrm2;-><init>(ILjava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    iput-object v1, v0, Ltn2;->v:Lrm2;

    .line 177
    .line 178
    return-void

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
