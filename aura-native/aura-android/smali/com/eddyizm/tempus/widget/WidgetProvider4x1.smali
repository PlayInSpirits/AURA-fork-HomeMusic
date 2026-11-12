.class public Lcom/eddyizm/tempus/widget/WidgetProvider4x1;
.super Landroid/appwidget/AppWidgetProvider;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/appwidget/AppWidgetProvider;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/widget/RemoteViews;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-class v1, Lcom/eddyizm/tempus/widget/WidgetProvider4x1;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    const-string v2, "tempo.widget.PLAY_PAUSE"

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/high16 v2, 0xc000000

    .line 15
    .line 16
    invoke-static {p0, p2, v0, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    add-int/lit8 v3, p2, 0x1

    .line 21
    .line 22
    new-instance v4, Landroid/content/Intent;

    .line 23
    .line 24
    invoke-direct {v4, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 25
    .line 26
    .line 27
    const-string v5, "tempo.widget.NEXT"

    .line 28
    .line 29
    invoke-virtual {v4, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-static {p0, v3, v4, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    add-int/lit8 v4, p2, 0x2

    .line 38
    .line 39
    new-instance v5, Landroid/content/Intent;

    .line 40
    .line 41
    invoke-direct {v5, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 42
    .line 43
    .line 44
    const-string v6, "tempo.widget.PREV"

    .line 45
    .line 46
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-static {p0, v4, v5, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    add-int/lit8 v5, p2, 0x3

    .line 55
    .line 56
    new-instance v6, Landroid/content/Intent;

    .line 57
    .line 58
    invoke-direct {v6, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 59
    .line 60
    .line 61
    const-string v7, "tempo.widget.SHUFFLE"

    .line 62
    .line 63
    invoke-virtual {v6, v7}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-static {p0, v5, v6, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    add-int/lit8 v6, p2, 0x4

    .line 72
    .line 73
    new-instance v7, Landroid/content/Intent;

    .line 74
    .line 75
    invoke-direct {v7, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 76
    .line 77
    .line 78
    const-string v1, "tempo.widget.REPEAT"

    .line 79
    .line 80
    invoke-virtual {v7, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-static {p0, v6, v1, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    const v2, 0x7f0a012d

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v2, v0}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 92
    .line 93
    .line 94
    const v0, 0x7f0a012c

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v0, v3}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 98
    .line 99
    .line 100
    const v0, 0x7f0a012e

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v0, v4}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 104
    .line 105
    .line 106
    const v0, 0x7f0a0130

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, v0, v5}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 110
    .line 111
    .line 112
    const v0, 0x7f0a012f

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v0, v1}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 116
    .line 117
    .line 118
    add-int/lit8 v0, p2, 0xa

    .line 119
    .line 120
    const/4 v1, 0x0

    .line 121
    invoke-static {v0, p0, v1}, Lcom/eddyizm/tempus/widget/WidgetProvider4x1;->b(ILandroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    const v1, 0x7f0a0524

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v1, v0}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 129
    .line 130
    .line 131
    add-int/lit8 v1, p2, 0x14

    .line 132
    .line 133
    invoke-static {v1, p0, p3}, Lcom/eddyizm/tempus/widget/WidgetProvider4x1;->b(ILandroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;

    .line 134
    .line 135
    .line 136
    move-result-object p3

    .line 137
    add-int/lit8 v1, p2, 0x15

    .line 138
    .line 139
    invoke-static {v1, p0, p5}, Lcom/eddyizm/tempus/widget/WidgetProvider4x1;->b(ILandroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;

    .line 140
    .line 141
    .line 142
    move-result-object p5

    .line 143
    add-int/lit8 p2, p2, 0x16

    .line 144
    .line 145
    invoke-static {p2, p0, p4}, Lcom/eddyizm/tempus/widget/WidgetProvider4x1;->b(ILandroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    if-eqz p3, :cond_0

    .line 150
    .line 151
    move-object p2, p3

    .line 152
    goto :goto_0

    .line 153
    :cond_0
    move-object p2, v0

    .line 154
    :goto_0
    const p4, 0x7f0a00a0

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, p4, p2}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 158
    .line 159
    .line 160
    if-eqz p3, :cond_1

    .line 161
    .line 162
    move-object p2, p3

    .line 163
    goto :goto_1

    .line 164
    :cond_1
    move-object p2, v0

    .line 165
    :goto_1
    const p4, 0x7f0a0611

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, p4, p2}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 169
    .line 170
    .line 171
    if-eqz p5, :cond_2

    .line 172
    .line 173
    move-object p3, p5

    .line 174
    goto :goto_2

    .line 175
    :cond_2
    if-eqz p3, :cond_3

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_3
    move-object p3, v0

    .line 179
    :goto_2
    const p2, 0x7f0a05d4

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, p2, p3}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 183
    .line 184
    .line 185
    if-eqz p0, :cond_4

    .line 186
    .line 187
    move-object v0, p0

    .line 188
    :cond_4
    const p0, 0x7f0a009a

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1, p0, v0}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 192
    .line 193
    .line 194
    return-void
.end method

.method public static b(ILandroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;
    .locals 3

    .line 1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-class v1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Landroid/content/Intent;

    .line 10
    .line 11
    const-string v2, "android.intent.action.VIEW"

    .line 12
    .line 13
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-direct {v0, v2, p2, p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;Landroid/content/Context;Ljava/lang/Class;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v0, Landroid/content/Intent;

    .line 22
    .line 23
    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    const/high16 p2, 0x24000000

    .line 27
    .line 28
    invoke-virtual {v0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Landroid/app/TaskStackBuilder;->create(Landroid/content/Context;)Landroid/app/TaskStackBuilder;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1, v0}, Landroid/app/TaskStackBuilder;->addNextIntentWithParentStack(Landroid/content/Intent;)Landroid/app/TaskStackBuilder;

    .line 36
    .line 37
    .line 38
    const/high16 p2, 0xc000000

    .line 39
    .line 40
    invoke-virtual {p1, p0, p2}, Landroid/app/TaskStackBuilder;->getPendingIntent(II)Landroid/app/PendingIntent;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method


# virtual methods
.method public final onAppWidgetOptionsChanged(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILandroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/appwidget/AppWidgetProvider;->onAppWidgetOptionsChanged(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILandroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p3}, Lji2;->q(Landroid/content/Context;I)Landroid/widget/RemoteViews;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    move-object v0, p1

    .line 12
    move v2, p3

    .line 13
    invoke-static/range {v0 .. v5}, Lcom/eddyizm/tempus/widget/WidgetProvider4x1;->a(Landroid/content/Context;Landroid/widget/RemoteViews;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2, v2, v1}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lji2;->I(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 9

    .line 1
    invoke-super {p0, p1, p2}, Landroid/appwidget/AppWidgetProvider;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    new-instance p2, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v0, "onReceive action="

    .line 11
    .line 12
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const-string v0, "TempoWidget"

    .line 23
    .line 24
    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    const-string p2, "tempo.widget.PLAY_PAUSE"

    .line 28
    .line 29
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-nez p2, :cond_2

    .line 34
    .line 35
    const-string p2, "tempo.widget.NEXT"

    .line 36
    .line 37
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-nez p2, :cond_2

    .line 42
    .line 43
    const-string p2, "tempo.widget.PREV"

    .line 44
    .line 45
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-nez p2, :cond_2

    .line 50
    .line 51
    const-string p2, "tempo.widget.SHUFFLE"

    .line 52
    .line 53
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-nez p2, :cond_2

    .line 58
    .line 59
    const-string p2, "tempo.widget.REPEAT"

    .line 60
    .line 61
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-eqz p2, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    const-string p2, "android.appwidget.action.APPWIDGET_UPDATE"

    .line 69
    .line 70
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-eqz p0, :cond_1

    .line 75
    .line 76
    invoke-static {p1}, Lji2;->I(Landroid/content/Context;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    return-void

    .line 80
    :cond_2
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v1, "dispatch action="

    .line 83
    .line 84
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    new-instance v3, Lcb4;

    .line 102
    .line 103
    new-instance p2, Landroid/content/ComponentName;

    .line 104
    .line 105
    const-class v0, Lcom/eddyizm/tempus/service/MediaService;

    .line 106
    .line 107
    invoke-direct {p2, v2, v0}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 108
    .line 109
    .line 110
    invoke-direct {v3, v2, p2}, Lcb4;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V

    .line 111
    .line 112
    .line 113
    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 114
    .line 115
    new-instance v5, Ltv1;

    .line 116
    .line 117
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-static {}, Lf35;->x()Landroid/os/Looper;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    new-instance v7, Lbl2;

    .line 125
    .line 126
    invoke-direct {v7, v6}, Lbl2;-><init>(Landroid/os/Looper;)V

    .line 127
    .line 128
    .line 129
    iget-object p2, v3, Lcb4;->a:Lbb4;

    .line 130
    .line 131
    invoke-interface {p2}, Lbb4;->e()Z

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    if-eqz p2, :cond_3

    .line 136
    .line 137
    new-instance p2, Lxc5;

    .line 138
    .line 139
    new-instance v0, Lx7;

    .line 140
    .line 141
    invoke-direct {v0, v2}, Lx7;-><init>(Landroid/content/Context;)V

    .line 142
    .line 143
    .line 144
    new-instance v1, Lfi0;

    .line 145
    .line 146
    invoke-direct {v1, v0}, Lfi0;-><init>(Lx7;)V

    .line 147
    .line 148
    .line 149
    const/4 v0, 0x4

    .line 150
    invoke-direct {p2, v0, v1}, Lxc5;-><init>(ILjava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :goto_1
    move-object v8, p2

    .line 154
    goto :goto_2

    .line 155
    :cond_3
    const/4 p2, 0x0

    .line 156
    goto :goto_1

    .line 157
    :goto_2
    new-instance v1, Lsk2;

    .line 158
    .line 159
    invoke-direct/range {v1 .. v8}, Lsk2;-><init>(Landroid/content/Context;Lcb4;Landroid/os/Bundle;Lqk2;Landroid/os/Looper;Lbl2;Lxc5;)V

    .line 160
    .line 161
    .line 162
    new-instance p2, Landroid/os/Handler;

    .line 163
    .line 164
    invoke-direct {p2, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 165
    .line 166
    .line 167
    new-instance v0, Lpk2;

    .line 168
    .line 169
    const/4 v2, 0x0

    .line 170
    invoke-direct {v0, v7, v1, v2}, Lpk2;-><init>(Lbl2;Lsk2;I)V

    .line 171
    .line 172
    .line 173
    invoke-static {p2, v0}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 174
    .line 175
    .line 176
    new-instance p2, Lqo2;

    .line 177
    .line 178
    const/16 v0, 0x14

    .line 179
    .line 180
    invoke-direct {p2, v7, p0, p1, v0}, Lqo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 181
    .line 182
    .line 183
    sget-object p0, Lgq0;->n:Lgq0;

    .line 184
    .line 185
    invoke-virtual {v7, p2, p0}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 186
    .line 187
    .line 188
    return-void
.end method

.method public final onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
    .locals 7

    .line 1
    array-length p0, p3

    .line 2
    const/4 v0, 0x0

    .line 3
    :goto_0
    if-ge v0, p0, :cond_0

    .line 4
    .line 5
    aget v3, p3, v0

    .line 6
    .line 7
    invoke-static {p1, v3}, Lji2;->q(Landroid/content/Context;I)Landroid/widget/RemoteViews;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    move-object v1, p1

    .line 15
    invoke-static/range {v1 .. v6}, Lcom/eddyizm/tempus/widget/WidgetProvider4x1;->a(Landroid/content/Context;Landroid/widget/RemoteViews;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, v3, v2}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void
.end method
