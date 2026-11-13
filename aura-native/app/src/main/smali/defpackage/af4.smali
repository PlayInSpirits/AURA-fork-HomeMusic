.class public final Ldefpackage/af4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:I

.field public b:Landroid/content/Context;

.field public c:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Ldefpackage/af4;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ldefpackage/af4;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/af4;->b:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Ldefpackage/af4;->c:Landroid/net/Uri;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/af4;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Ldefpackage/af4;->b:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object p0, p0, Ldefpackage/af4;->c:Landroid/net/Uri;

    .line 14
    .line 15
    invoke-static {v0, p0}, Landroid/provider/DocumentsContract;->deleteDocument(Landroid/content/ContentResolver;Landroid/net/Uri;)Z

    .line 16
    .line 17
    .line 18
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    :catch_0
    return v1

    .line 20
    :pswitch_0
    :try_start_1
    iget-object v0, p0, Ldefpackage/af4;->b:Landroid/content/Context;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object p0, p0, Ldefpackage/af4;->c:Landroid/net/Uri;

    .line 27
    .line 28
    invoke-static {v0, p0}, Landroid/provider/DocumentsContract;->deleteDocument(Landroid/content/ContentResolver;Landroid/net/Uri;)Z

    .line 29
    .line 30
    .line 31
    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 32
    :catch_1
    return v1

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/af4;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldefpackage/af4;->b:Landroid/content/Context;

    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/af4;->c:Landroid/net/Uri;

    .line 9
    .line 10
    invoke-static {v0, p0}, Ldefpackage/h12;->o(Landroid/content/Context;Landroid/net/Uri;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    iget-object v0, p0, Ldefpackage/af4;->b:Landroid/content/Context;

    .line 16
    .line 17
    iget-object p0, p0, Ldefpackage/af4;->c:Landroid/net/Uri;

    .line 18
    .line 19
    invoke-static {v0, p0}, Ldefpackage/h12;->o(Landroid/content/Context;Landroid/net/Uri;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/af4;->a:I

    .line 2
    .line 3
    const-string v1, "_display_name"

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ldefpackage/af4;->b:Landroid/content/Context;

    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/af4;->c:Landroid/net/Uri;

    .line 11
    .line 12
    invoke-static {v0, p0, v1}, Ldefpackage/h12;->K(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    iget-object v0, p0, Ldefpackage/af4;->b:Landroid/content/Context;

    .line 18
    .line 19
    iget-object p0, p0, Ldefpackage/af4;->c:Landroid/net/Uri;

    .line 20
    .line 21
    invoke-static {v0, p0, v1}, Ldefpackage/h12;->K(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Landroid/net/Uri;
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/af4;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/af4;->c:Landroid/net/Uri;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object p0, p0, Ldefpackage/af4;->c:Landroid/net/Uri;

    .line 10
    .line 11
    return-object p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e()Z
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/af4;->a:I

    .line 2
    .line 3
    const-string v1, "mime_type"

    .line 4
    .line 5
    const-string v2, "vnd.android.document/directory"

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Ldefpackage/af4;->b:Landroid/content/Context;

    .line 11
    .line 12
    iget-object p0, p0, Ldefpackage/af4;->c:Landroid/net/Uri;

    .line 13
    .line 14
    invoke-static {v0, p0, v1}, Ldefpackage/h12;->K(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :pswitch_0
    iget-object v0, p0, Ldefpackage/af4;->b:Landroid/content/Context;

    .line 24
    .line 25
    iget-object p0, p0, Ldefpackage/af4;->c:Landroid/net/Uri;

    .line 26
    .line 27
    invoke-static {v0, p0, v1}, Ldefpackage/h12;->K(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f()J
    .locals 4

    .line 1
    iget v0, p0, Ldefpackage/af4;->a:I

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const-string v3, "_size"

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Ldefpackage/af4;->b:Landroid/content/Context;

    .line 11
    .line 12
    iget-object p0, p0, Ldefpackage/af4;->c:Landroid/net/Uri;

    .line 13
    .line 14
    invoke-static {v0, p0, v3, v1, v2}, Ldefpackage/h12;->J(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;J)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    return-wide v0

    .line 19
    :pswitch_0
    iget-object v0, p0, Ldefpackage/af4;->b:Landroid/content/Context;

    .line 20
    .line 21
    iget-object p0, p0, Ldefpackage/af4;->c:Landroid/net/Uri;

    .line 22
    .line 23
    invoke-static {v0, p0, v3, v1, v2}, Ldefpackage/h12;->J(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    return-wide v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public g()[Ldefpackage/af4;
    .locals 11

    .line 1
    iget-object v1, p0, Ldefpackage/af4;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget-object p0, p0, Ldefpackage/af4;->c:Landroid/net/Uri;

    .line 8
    .line 9
    invoke-static {p0}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p0, v0}, Landroid/provider/DocumentsContract;->buildChildDocumentsUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    new-instance v8, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    :try_start_0
    const-string v0, "document_id"

    .line 25
    .line 26
    filled-new-array {v0}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v5, 0x0

    .line 33
    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 34
    .line 35
    .line 36
    move-result-object v10

    .line 37
    :goto_0
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    invoke-interface {v10, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {p0, v0}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    move-object p0, v0

    .line 57
    goto :goto_4

    .line 58
    :catch_0
    move-exception v0

    .line 59
    move-object p0, v0

    .line 60
    goto :goto_1

    .line 61
    :cond_0
    :try_start_1
    invoke-static {v10}, Ldefpackage/xa3;->p(Landroid/database/Cursor;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :catch_1
    move-exception v0

    .line 66
    move-object p0, v0

    .line 67
    throw p0

    .line 68
    :goto_1
    :try_start_2
    const-string v0, "DocumentFile"

    .line 69
    .line 70
    new-instance v2, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v3, "Failed query: "

    .line 76
    .line 77
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {v0, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 88
    .line 89
    .line 90
    if-eqz v10, :cond_1

    .line 91
    .line 92
    :try_start_3
    invoke-static {v10}, Ldefpackage/xa3;->p(Landroid/database/Cursor;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :catch_2
    move-exception v0

    .line 97
    move-object p0, v0

    .line 98
    throw p0

    .line 99
    :catch_3
    :cond_1
    :goto_2
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    new-array p0, p0, [Landroid/net/Uri;

    .line 104
    .line 105
    invoke-virtual {v8, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    check-cast p0, [Landroid/net/Uri;

    .line 110
    .line 111
    array-length v0, p0

    .line 112
    new-array v0, v0, [Ldefpackage/af4;

    .line 113
    .line 114
    :goto_3
    array-length v2, p0

    .line 115
    if-ge v9, v2, :cond_2

    .line 116
    .line 117
    new-instance v2, Ldefpackage/af4;

    .line 118
    .line 119
    aget-object v3, p0, v9

    .line 120
    .line 121
    invoke-direct {v2, v1, v3}, Ldefpackage/af4;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    .line 122
    .line 123
    .line 124
    aput-object v2, v0, v9

    .line 125
    .line 126
    add-int/lit8 v9, v9, 0x1

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_2
    return-object v0

    .line 130
    :goto_4
    if-eqz v10, :cond_3

    .line 131
    .line 132
    :try_start_4
    invoke-static {v10}, Ldefpackage/xa3;->p(Landroid/database/Cursor;)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5

    .line 133
    .line 134
    .line 135
    goto :goto_5

    .line 136
    :catch_4
    move-exception v0

    .line 137
    move-object p0, v0

    .line 138
    throw p0

    .line 139
    :catch_5
    :cond_3
    :goto_5
    throw p0
.end method
