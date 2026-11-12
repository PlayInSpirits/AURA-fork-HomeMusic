.class public final Ldk4;
.super Lbz4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final c:Lri;

.field public static final d:Lri;

.field public static final e:Lri;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lri;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lri;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldk4;->c:Lri;

    .line 8
    .line 9
    new-instance v0, Lri;

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    invoke-direct {v0, v1}, Lri;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Ldk4;->d:Lri;

    .line 16
    .line 17
    new-instance v0, Lri;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, v1}, Lri;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Ldk4;->e:Lri;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 1
    iput p1, p0, Ldk4;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ljava/text/SimpleDateFormat;

    .line 10
    .line 11
    const-string v0, "MMM d, yyyy"

    .line 12
    .line 13
    invoke-direct {p1, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Ldk4;->b:Ljava/lang/Object;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance p1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Ldk4;->b:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    invoke-static {v0, v0, p0}, Ljava/text/DateFormat;->getDateTimeInstance(IILjava/util/Locale;)Ljava/text/DateFormat;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1, p0}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-nez p0, :cond_0

    .line 48
    .line 49
    invoke-static {v0, v0}, Ljava/text/DateFormat;->getDateTimeInstance(II)Ljava/text/DateFormat;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    :cond_0
    sget p0, Lo22;->a:I

    .line 57
    .line 58
    const/16 v1, 0x9

    .line 59
    .line 60
    if-lt p0, v1, :cond_1

    .line 61
    .line 62
    invoke-static {v0, v0}, Lg12;->z(II)Ljava/text/SimpleDateFormat;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    :cond_1
    return-void

    .line 70
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    new-instance p1, Ljava/text/SimpleDateFormat;

    .line 74
    .line 75
    const-string v0, "hh:mm:ss a"

    .line 76
    .line 77
    invoke-direct {p1, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iput-object p1, p0, Ldk4;->b:Ljava/lang/Object;

    .line 81
    .line 82
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Ll32;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Ldk4;->a:I

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ll32;->e0()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Ll32;->a0()V

    .line 16
    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    invoke-virtual {p1}, Ll32;->c0()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Ldk4;->b:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v3, v1

    .line 26
    check-cast v3, Ljava/util/ArrayList;

    .line 27
    .line 28
    monitor-enter v3

    .line 29
    :try_start_0
    iget-object p0, p0, Ldk4;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 v4, 0x0

    .line 38
    move v5, v4

    .line 39
    :catch_0
    if-ge v5, v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    add-int/lit8 v5, v5, 0x1

    .line 46
    .line 47
    check-cast v6, Ljava/text/DateFormat;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    :try_start_1
    invoke-virtual {v6, v0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 50
    .line 51
    .line 52
    move-result-object p0
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    :try_start_2
    monitor-exit v3

    .line 54
    :goto_0
    move-object v2, p0

    .line 55
    goto :goto_1

    .line 56
    :catchall_0
    move-exception p0

    .line 57
    goto :goto_2

    .line 58
    :cond_1
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    :try_start_3
    new-instance p0, Ljava/text/ParsePosition;

    .line 60
    .line 61
    invoke-direct {p0, v4}, Ljava/text/ParsePosition;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0, p0}, Lfv1;->b(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;

    .line 65
    .line 66
    .line 67
    move-result-object p0
    :try_end_3
    .catch Ljava/text/ParseException; {:try_start_3 .. :try_end_3} :catch_1

    .line 68
    goto :goto_0

    .line 69
    :catch_1
    move-exception p0

    .line 70
    const-string v1, "Failed parsing \'"

    .line 71
    .line 72
    const-string v3, "\' as Date; at path "

    .line 73
    .line 74
    invoke-static {v1, v0, v3}, Lxa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {p1}, Ll32;->H()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {v0, p1, p0}, Loi0;->a(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    :goto_1
    return-object v2

    .line 86
    :goto_2
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 87
    throw p0

    .line 88
    :pswitch_0
    invoke-virtual {p1}, Ll32;->e0()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-ne v0, v1, :cond_2

    .line 93
    .line 94
    invoke-virtual {p1}, Ll32;->a0()V

    .line 95
    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_2
    invoke-virtual {p1}, Ll32;->c0()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    :try_start_5
    monitor-enter p0
    :try_end_5
    .catch Ljava/text/ParseException; {:try_start_5 .. :try_end_5} :catch_2

    .line 103
    :try_start_6
    iget-object v1, p0, Ldk4;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v1, Ljava/text/SimpleDateFormat;

    .line 106
    .line 107
    invoke-virtual {v1, v0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    new-instance v3, Ljava/sql/Time;

    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    .line 114
    .line 115
    .line 116
    move-result-wide v4

    .line 117
    invoke-direct {v3, v4, v5}, Ljava/sql/Time;-><init>(J)V

    .line 118
    .line 119
    .line 120
    monitor-exit p0

    .line 121
    move-object v2, v3

    .line 122
    goto :goto_3

    .line 123
    :catchall_1
    move-exception v1

    .line 124
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 125
    :try_start_7
    throw v1
    :try_end_7
    .catch Ljava/text/ParseException; {:try_start_7 .. :try_end_7} :catch_2

    .line 126
    :catch_2
    move-exception p0

    .line 127
    const-string v1, "Failed parsing \'"

    .line 128
    .line 129
    const-string v3, "\' as SQL Time; at path "

    .line 130
    .line 131
    invoke-static {v1, v0, v3}, Lxa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {p1}, Ll32;->H()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-static {v0, p1, p0}, Loi0;->a(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    :goto_3
    return-object v2

    .line 143
    :pswitch_1
    invoke-virtual {p1}, Ll32;->e0()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-ne v0, v1, :cond_3

    .line 148
    .line 149
    invoke-virtual {p1}, Ll32;->a0()V

    .line 150
    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_3
    invoke-virtual {p1}, Ll32;->c0()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    :try_start_8
    monitor-enter p0
    :try_end_8
    .catch Ljava/text/ParseException; {:try_start_8 .. :try_end_8} :catch_3

    .line 158
    :try_start_9
    iget-object v1, p0, Ldk4;->b:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v1, Ljava/text/SimpleDateFormat;

    .line 161
    .line 162
    invoke-virtual {v1, v0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 167
    :try_start_a
    new-instance p0, Ljava/sql/Date;

    .line 168
    .line 169
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    .line 170
    .line 171
    .line 172
    move-result-wide v3

    .line 173
    invoke-direct {p0, v3, v4}, Ljava/sql/Date;-><init>(J)V
    :try_end_a
    .catch Ljava/text/ParseException; {:try_start_a .. :try_end_a} :catch_3

    .line 174
    .line 175
    .line 176
    move-object v2, p0

    .line 177
    goto :goto_5

    .line 178
    :catch_3
    move-exception p0

    .line 179
    goto :goto_4

    .line 180
    :catchall_2
    move-exception v1

    .line 181
    :try_start_b
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 182
    :try_start_c
    throw v1
    :try_end_c
    .catch Ljava/text/ParseException; {:try_start_c .. :try_end_c} :catch_3

    .line 183
    :goto_4
    const-string v1, "Failed parsing \'"

    .line 184
    .line 185
    const-string v3, "\' as SQL Date; at path "

    .line 186
    .line 187
    invoke-static {v1, v0, v3}, Lxa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {p1}, Ll32;->H()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-static {v0, p1, p0}, Loi0;->a(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 196
    .line 197
    .line 198
    :goto_5
    return-object v2

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lq32;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Ldk4;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p2, Ljava/util/Date;

    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Lq32;->F()Lq32;

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Ldk4;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/text/DateFormat;

    .line 24
    .line 25
    iget-object p0, p0, Ldk4;->b:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v1, p0

    .line 28
    check-cast v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    monitor-enter v1

    .line 31
    :try_start_0
    invoke-virtual {v0, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    invoke-virtual {p1, p0}, Lq32;->W(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    return-void

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw p0

    .line 43
    :pswitch_0
    check-cast p2, Ljava/sql/Time;

    .line 44
    .line 45
    if-nez p2, :cond_1

    .line 46
    .line 47
    invoke-virtual {p1}, Lq32;->F()Lq32;

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    monitor-enter p0

    .line 52
    :try_start_2
    iget-object v0, p0, Ldk4;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Ljava/text/SimpleDateFormat;

    .line 55
    .line 56
    invoke-virtual {v0, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 61
    invoke-virtual {p1, p2}, Lq32;->W(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    return-void

    .line 65
    :catchall_1
    move-exception p1

    .line 66
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 67
    throw p1

    .line 68
    :pswitch_1
    check-cast p2, Ljava/sql/Date;

    .line 69
    .line 70
    if-nez p2, :cond_2

    .line 71
    .line 72
    invoke-virtual {p1}, Lq32;->F()Lq32;

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_2
    monitor-enter p0

    .line 77
    :try_start_4
    iget-object v0, p0, Ldk4;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Ljava/text/SimpleDateFormat;

    .line 80
    .line 81
    invoke-virtual {v0, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 86
    invoke-virtual {p1, p2}, Lq32;->W(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :goto_2
    return-void

    .line 90
    :catchall_2
    move-exception p1

    .line 91
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 92
    throw p1

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
