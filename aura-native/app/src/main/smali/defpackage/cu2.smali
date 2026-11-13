.class public final Ldefpackage/cu2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/sh0;


# static fields
.field public static final q:[Ljava/lang/String;


# instance fields
.field public final synthetic n:I

.field public final o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "_data"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ldefpackage/cu2;->q:[Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/cu2;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/cu2;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Ldefpackage/cu2;->p:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ldefpackage/i80;)V
    .locals 0

    const/4 p2, 0x2

    iput p2, p0, Ldefpackage/cu2;->n:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Ldefpackage/cu2;->o:Ljava/lang/Object;

    return-void
.end method

.method private final b()V
    .locals 0

    .line 1
    return-void
.end method

.method private final f()V
    .locals 0

    .line 1
    return-void
.end method

.method private final g()V
    .locals 0

    .line 1
    return-void
.end method

.method private final h()V
    .locals 0

    .line 1
    return-void
.end method

.method private final i()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/cu2;->n:I

    .line 2
    .line 3
    const-class v1, Ljava/io/InputStream;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    return-object v1

    .line 9
    :pswitch_0
    iget-object p0, p0, Ldefpackage/cu2;->p:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ldefpackage/pa;

    .line 12
    .line 13
    iget p0, p0, Ldefpackage/pa;->n:I

    .line 14
    .line 15
    packed-switch p0, :pswitch_data_1

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :pswitch_1
    const-class v1, Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    :goto_0
    return-object v1

    .line 22
    :pswitch_2
    const-class p0, Ljava/io/File;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
    .end packed-switch

    .line 26
    :pswitch_data_1
    .packed-switch 0x15
        :pswitch_1
    .end packed-switch
.end method

.method public final c()V
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/cu2;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object p0, p0, Ldefpackage/cu2;->p:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/io/ByteArrayInputStream;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    :catch_0
    :pswitch_0
    return-void

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final cancel()V
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/cu2;->n:I

    .line 2
    .line 3
    return-void
.end method

.method public final d(Ldefpackage/eq3;Ldefpackage/rh0;)V
    .locals 7

    .line 1
    iget p1, p0, Ldefpackage/cu2;->n:I

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/cu2;->o:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :try_start_0
    check-cast v0, Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0}, Ldefpackage/i80;->q(Ljava/lang/String;)Ljava/io/ByteArrayInputStream;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Ldefpackage/cu2;->p:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-interface {p2, p1}, Ldefpackage/rh0;->f(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catch_0
    move-exception v0

    .line 21
    move-object p0, v0

    .line 22
    invoke-interface {p2, p0}, Ldefpackage/rh0;->b(Ljava/lang/Exception;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :pswitch_0
    iget-object p0, p0, Ldefpackage/cu2;->p:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Ldefpackage/pa;

    .line 29
    .line 30
    check-cast v0, [B

    .line 31
    .line 32
    iget p0, p0, Ldefpackage/pa;->n:I

    .line 33
    .line 34
    packed-switch p0, :pswitch_data_1

    .line 35
    .line 36
    .line 37
    new-instance p0, Ljava/io/ByteArrayInputStream;

    .line 38
    .line 39
    invoke-direct {p0, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :pswitch_1
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    :goto_1
    invoke-interface {p2, p0}, Ldefpackage/rh0;->f(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_2
    check-cast v0, Landroid/content/Context;

    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object p1, p0, Ldefpackage/cu2;->p:Ljava/lang/Object;

    .line 58
    .line 59
    move-object v2, p1

    .line 60
    check-cast v2, Landroid/net/Uri;

    .line 61
    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v6, 0x0

    .line 64
    sget-object v3, Ldefpackage/cu2;->q:[Ljava/lang/String;

    .line 65
    .line 66
    const/4 v4, 0x0

    .line 67
    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const/4 v0, 0x0

    .line 72
    if-eqz p1, :cond_1

    .line 73
    .line 74
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_0

    .line 79
    .line 80
    const-string v0, "_data"

    .line 81
    .line 82
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    goto :goto_2

    .line 91
    :catchall_0
    move-exception v0

    .line 92
    move-object p0, v0

    .line 93
    goto :goto_3

    .line 94
    :cond_0
    :goto_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 95
    .line 96
    .line 97
    goto :goto_4

    .line 98
    :goto_3
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 99
    .line 100
    .line 101
    throw p0

    .line 102
    :cond_1
    :goto_4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_2

    .line 107
    .line 108
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 109
    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v1, "Failed to find file path for: "

    .line 113
    .line 114
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iget-object p0, p0, Ldefpackage/cu2;->p:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p0, Landroid/net/Uri;

    .line 120
    .line 121
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-direct {p1, p0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-interface {p2, p1}, Ldefpackage/rh0;->b(Ljava/lang/Exception;)V

    .line 132
    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_2
    new-instance p0, Ljava/io/File;

    .line 136
    .line 137
    invoke-direct {p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-interface {p2, p0}, Ldefpackage/rh0;->f(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :goto_5
    return-void

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
    .end packed-switch

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    :pswitch_data_1
    .packed-switch 0x15
        :pswitch_1
    .end packed-switch
.end method

.method public final e()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/cu2;->n:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :pswitch_0
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :pswitch_1
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
