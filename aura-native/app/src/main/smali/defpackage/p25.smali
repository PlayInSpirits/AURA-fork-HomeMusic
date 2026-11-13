.class public final Ldefpackage/p25;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:J

.field public final b:Ldefpackage/gn2;

.field public final c:Ljava/lang/String;

.field public final d:Ldefpackage/jw4;


# direct methods
.method public constructor <init>(JLdefpackage/gn2;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, Ldefpackage/p25;->a:J

    .line 8
    .line 9
    iput-object p3, p0, Ldefpackage/p25;->b:Ldefpackage/gn2;

    .line 10
    .line 11
    iput-object p4, p0, Ldefpackage/p25;->c:Ljava/lang/String;

    .line 12
    .line 13
    sget-object v0, Ldefpackage/q25;->Q:Ljava/util/Set;

    .line 14
    .line 15
    iget-object p3, p3, Ldefpackage/gn2;->d:Ldefpackage/do2;

    .line 16
    .line 17
    iget-object p3, p3, Ldefpackage/do2;->I:Landroid/os/Bundle;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    if-eqz p3, :cond_0

    .line 21
    .line 22
    const-string v1, "type"

    .line 23
    .line 24
    invoke-virtual {p3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v1, v0

    .line 30
    :goto_0
    if-eqz v1, :cond_4

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const v3, -0x182c7cfc

    .line 37
    .line 38
    .line 39
    if-eq v2, v3, :cond_2

    .line 40
    .line 41
    const v3, 0x636ee25

    .line 42
    .line 43
    .line 44
    if-eq v2, v3, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string v2, "music"

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    const-string v2, "podcast"

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_4

    .line 63
    .line 64
    :cond_3
    if-eqz p4, :cond_4

    .line 65
    .line 66
    invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 67
    .line 68
    .line 69
    move-result-object p4

    .line 70
    if-eqz p4, :cond_4

    .line 71
    .line 72
    const-string v1, "format"

    .line 73
    .line 74
    invoke-virtual {p4, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p4

    .line 78
    goto :goto_2

    .line 79
    :cond_4
    :goto_1
    move-object p4, v0

    .line 80
    :goto_2
    if-eqz p4, :cond_6

    .line 81
    .line 82
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-lez v1, :cond_5

    .line 87
    .line 88
    const-string v1, "raw"

    .line 89
    .line 90
    invoke-virtual {p4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_5

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_5
    move-object p4, v0

    .line 98
    :goto_3
    if-nez p4, :cond_9

    .line 99
    .line 100
    :cond_6
    invoke-static {p3}, Ldefpackage/e03;->p(Landroid/os/Bundle;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    if-eqz p3, :cond_7

    .line 105
    .line 106
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 107
    .line 108
    .line 109
    move-result p4

    .line 110
    if-lez p4, :cond_7

    .line 111
    .line 112
    move-object v0, p3

    .line 113
    :cond_7
    if-nez v0, :cond_8

    .line 114
    .line 115
    const-string p3, "audio/x-unknown"

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_8
    move-object p4, v0

    .line 119
    :cond_9
    const-string p3, "audio/"

    .line 120
    .line 121
    invoke-virtual {p3, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    :goto_4
    new-instance p4, Ldefpackage/sb1;

    .line 126
    .line 127
    invoke-direct {p4}, Ldefpackage/sb1;-><init>()V

    .line 128
    .line 129
    .line 130
    const-string v0, "upnp"

    .line 131
    .line 132
    iput-object v0, p4, Ldefpackage/sb1;->a:Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {p3}, Ldefpackage/lw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p3

    .line 138
    iput-object p3, p4, Ldefpackage/sb1;->m:Ljava/lang/String;

    .line 139
    .line 140
    new-instance p3, Ldefpackage/tb1;

    .line 141
    .line 142
    invoke-direct {p3, p4}, Ldefpackage/tb1;-><init>(Ldefpackage/sb1;)V

    .line 143
    .line 144
    .line 145
    new-instance p4, Ldefpackage/sv4;

    .line 146
    .line 147
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    filled-new-array {p3}, [Ldefpackage/tb1;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    invoke-direct {p4, p1, p2}, Ldefpackage/sv4;-><init>(Ljava/lang/String;[Ldefpackage/tb1;)V

    .line 156
    .line 157
    .line 158
    new-instance p1, Ldefpackage/jw4;

    .line 159
    .line 160
    new-instance p2, Ldefpackage/iw4;

    .line 161
    .line 162
    const/4 p3, 0x4

    .line 163
    filled-new-array {p3}, [I

    .line 164
    .line 165
    .line 166
    move-result-object p3

    .line 167
    const/4 v0, 0x1

    .line 168
    new-array v1, v0, [Z

    .line 169
    .line 170
    const/4 v2, 0x0

    .line 171
    aput-boolean v0, v1, v2

    .line 172
    .line 173
    invoke-direct {p2, p4, v2, p3, v1}, Ldefpackage/iw4;-><init>(Ldefpackage/sv4;Z[I[Z)V

    .line 174
    .line 175
    .line 176
    invoke-static {p2}, Ldefpackage/gb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    invoke-direct {p1, p2}, Ldefpackage/jw4;-><init>(Ljava/util/List;)V

    .line 181
    .line 182
    .line 183
    iput-object p1, p0, Ldefpackage/p25;->d:Ldefpackage/jw4;

    .line 184
    .line 185
    return-void
.end method
