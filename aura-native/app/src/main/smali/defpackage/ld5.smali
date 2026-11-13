.class public final synthetic Ldefpackage/ld5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ldefpackage/td5;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/td5;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/ld5;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/ld5;->b:Ldefpackage/td5;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Ldefpackage/ld5;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Ldefpackage/ld5;->b:Ldefpackage/td5;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/td5;->i:Ldefpackage/fd5;

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/td5;->c:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ldefpackage/fd5;->g(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ne v2, v1, :cond_0

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-virtual {v0, v2, p0}, Ldefpackage/fd5;->n(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v2, v0, Ldefpackage/fd5;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 24
    .line 25
    invoke-virtual {v2}, Ldefpackage/s24;->b()V

    .line 26
    .line 27
    .line 28
    iget-object v3, v0, Ldefpackage/fd5;->i:Ldefpackage/aq4;

    .line 29
    .line 30
    invoke-virtual {v3}, Ldefpackage/rx1;->a()Ldefpackage/df1;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-interface {v4, v1, p0}, Ldefpackage/vo4;->h(ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :try_start_0
    invoke-virtual {v2}, Ldefpackage/s24;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    :try_start_1
    invoke-virtual {v4}, Ldefpackage/df1;->b()I

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ldefpackage/s24;->t()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 44
    .line 45
    .line 46
    :try_start_2
    invoke-virtual {v2}, Ldefpackage/s24;->o()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v4}, Ldefpackage/rx1;->h(Ldefpackage/df1;)V

    .line 50
    .line 51
    .line 52
    const/16 v2, -0x100

    .line 53
    .line 54
    invoke-virtual {v0, v2, p0}, Ldefpackage/fd5;->o(ILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :catchall_0
    move-exception p0

    .line 59
    goto :goto_0

    .line 60
    :catchall_1
    move-exception p0

    .line 61
    :try_start_3
    invoke-virtual {v2}, Ldefpackage/s24;->o()V

    .line 62
    .line 63
    .line 64
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 65
    :goto_0
    invoke-virtual {v3, v4}, Ldefpackage/rx1;->h(Ldefpackage/df1;)V

    .line 66
    .line 67
    .line 68
    throw p0

    .line 69
    :cond_0
    const/4 v1, 0x0

    .line 70
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_0
    iget-object v0, p0, Ldefpackage/td5;->a:Ldefpackage/dd5;

    .line 76
    .line 77
    iget v2, v0, Ldefpackage/dd5;->b:I

    .line 78
    .line 79
    iget-object v3, v0, Ldefpackage/dd5;->c:Ljava/lang/String;

    .line 80
    .line 81
    if-eq v2, v1, :cond_1

    .line 82
    .line 83
    sget-object p0, Ldefpackage/ud5;->a:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {}, Ldefpackage/cx;->f()Ldefpackage/cx;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    new-instance v1, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v2, " is not in ENQUEUED state. Nothing more to do"

    .line 98
    .line 99
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v0, p0, v1}, Ldefpackage/cx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_1
    invoke-virtual {v0}, Ldefpackage/dd5;->d()Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-nez v2, :cond_2

    .line 117
    .line 118
    iget v2, v0, Ldefpackage/dd5;->b:I

    .line 119
    .line 120
    if-ne v2, v1, :cond_3

    .line 121
    .line 122
    iget v1, v0, Ldefpackage/dd5;->k:I

    .line 123
    .line 124
    if-lez v1, :cond_3

    .line 125
    .line 126
    :cond_2
    iget-object p0, p0, Ldefpackage/td5;->f:Ldefpackage/xi4;

    .line 127
    .line 128
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 132
    .line 133
    .line 134
    move-result-wide v1

    .line 135
    invoke-virtual {v0}, Ldefpackage/dd5;->a()J

    .line 136
    .line 137
    .line 138
    move-result-wide v4

    .line 139
    cmp-long p0, v1, v4

    .line 140
    .line 141
    if-gez p0, :cond_3

    .line 142
    .line 143
    invoke-static {}, Ldefpackage/cx;->f()Ldefpackage/cx;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    sget-object v0, Ldefpackage/ud5;->a:Ljava/lang/String;

    .line 148
    .line 149
    new-instance v1, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    const-string v2, "Delaying execution for "

    .line 152
    .line 153
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const-string v2, " because it is being executed before schedule."

    .line 160
    .line 161
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {p0, v0, v1}, Ldefpackage/cx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_3
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 175
    .line 176
    :goto_2
    return-object p0

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
