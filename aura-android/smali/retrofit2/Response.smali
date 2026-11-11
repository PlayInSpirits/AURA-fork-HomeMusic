.class public final Lretrofit2/Response;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final body:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final errorBody:Ln14;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final rawResponse:Lk14;


# direct methods
.method private constructor <init>(Lk14;Ljava/lang/Object;Ln14;)V
    .locals 0
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ln14;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk14;",
            "TT;",
            "Ln14;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lretrofit2/Response;->rawResponse:Lk14;

    .line 5
    .line 6
    iput-object p2, p0, Lretrofit2/Response;->body:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lretrofit2/Response;->errorBody:Ln14;

    .line 9
    .line 10
    return-void
.end method

.method public static error(ILn14;)Lretrofit2/Response;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Ln14;",
            ")",
            "Lretrofit2/Response<",
            "TT;>;"
        }
    .end annotation

    .line 1
    move/from16 v4, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v1, "body == null"

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    const/16 v1, 0x190

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-lt v4, v1, :cond_1

    .line 14
    .line 15
    sget-object v1, Lxe5;->a:[B

    .line 16
    .line 17
    sget-object v16, Lgq1;->q:Lgq1;

    .line 18
    .line 19
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    const/16 v3, 0x14

    .line 22
    .line 23
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    new-instance v7, Lretrofit2/OkHttpCall$NoContentResponseBody;

    .line 27
    .line 28
    invoke-virtual {v0}, Ln14;->contentType()Lhu2;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v0}, Ln14;->contentLength()J

    .line 33
    .line 34
    .line 35
    move-result-wide v5

    .line 36
    invoke-direct {v7, v3, v5, v6}, Lretrofit2/OkHttpCall$NoContentResponseBody;-><init>(Lhu2;J)V

    .line 37
    .line 38
    .line 39
    new-instance v3, Lnz3;

    .line 40
    .line 41
    invoke-direct {v3}, Lnz3;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v5, "http://localhost/"

    .line 45
    .line 46
    invoke-virtual {v3, v5}, Lnz3;->d(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    new-instance v5, Loz3;

    .line 50
    .line 51
    invoke-direct {v5, v3}, Loz3;-><init>(Lnz3;)V

    .line 52
    .line 53
    .line 54
    if-ltz v4, :cond_0

    .line 55
    .line 56
    new-instance v6, Ltl1;

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    new-array v2, v2, [Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, [Ljava/lang/String;

    .line 66
    .line 67
    invoke-direct {v6, v1}, Ltl1;-><init>([Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Lk14;

    .line 71
    .line 72
    sget-object v2, Lpr3;->q:Lpr3;

    .line 73
    .line 74
    const-string v3, "Response.error()"

    .line 75
    .line 76
    move-object v1, v5

    .line 77
    const/4 v5, 0x0

    .line 78
    const/4 v8, 0x0

    .line 79
    const/4 v9, 0x0

    .line 80
    const/4 v10, 0x0

    .line 81
    const-wide/16 v11, 0x0

    .line 82
    .line 83
    const-wide/16 v13, 0x0

    .line 84
    .line 85
    const/4 v15, 0x0

    .line 86
    invoke-direct/range {v0 .. v16}, Lk14;-><init>(Loz3;Lpr3;Ljava/lang/String;ILjl1;Ltl1;Ln14;Lk14;Lk14;Lk14;JJLy10;Lgf1;)V

    .line 87
    .line 88
    .line 89
    move-object v1, v0

    .line 90
    move-object/from16 v0, p1

    .line 91
    .line 92
    invoke-static {v0, v1}, Lretrofit2/Response;->error(Ln14;Lk14;)Lretrofit2/Response;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    return-object v0

    .line 97
    :cond_0
    const-string v0, "code < 0: "

    .line 98
    .line 99
    invoke-static {v4, v0}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v0}, Lnz2;->f(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    return-object v2

    .line 107
    :cond_1
    const-string v0, "code < 400: "

    .line 108
    .line 109
    invoke-static {v4, v0}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v0}, Lkf2;->n(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-object v2
.end method

.method public static error(Ln14;Lk14;)Lretrofit2/Response;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ln14;",
            "Lk14;",
            ")",
            "Lretrofit2/Response<",
            "TT;>;"
        }
    .end annotation

    .line 117
    const-string v0, "body == null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 118
    const-string v0, "rawResponse == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 119
    iget-boolean v0, p1, Lk14;->C:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 120
    new-instance v0, Lretrofit2/Response;

    invoke-direct {v0, p1, v1, p0}, Lretrofit2/Response;-><init>(Lk14;Ljava/lang/Object;Ln14;)V

    return-object v0

    .line 121
    :cond_0
    const-string p0, "rawResponse should not be successful response"

    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    return-object v1
.end method

.method public static success(ILjava/lang/Object;)Lretrofit2/Response;
    .locals 17
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(ITT;)",
            "Lretrofit2/Response<",
            "TT;>;"
        }
    .end annotation

    .line 1
    move/from16 v4, p0

    .line 2
    .line 3
    const/16 v0, 0xc8

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-lt v4, v0, :cond_1

    .line 7
    .line 8
    const/16 v0, 0x12c

    .line 9
    .line 10
    if-ge v4, v0, :cond_1

    .line 11
    .line 12
    sget-object v7, Lxe5;->e:Lfv3;

    .line 13
    .line 14
    sget-object v16, Lgq1;->q:Lgq1;

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/16 v2, 0x14

    .line 19
    .line 20
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    new-instance v2, Lnz3;

    .line 24
    .line 25
    invoke-direct {v2}, Lnz3;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v3, "http://localhost/"

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Lnz3;->d(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    move-object v3, v1

    .line 34
    new-instance v1, Loz3;

    .line 35
    .line 36
    invoke-direct {v1, v2}, Loz3;-><init>(Lnz3;)V

    .line 37
    .line 38
    .line 39
    if-ltz v4, :cond_0

    .line 40
    .line 41
    new-instance v6, Ltl1;

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    new-array v2, v2, [Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, [Ljava/lang/String;

    .line 51
    .line 52
    invoke-direct {v6, v0}, Ltl1;-><init>([Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    new-instance v0, Lk14;

    .line 56
    .line 57
    sget-object v2, Lpr3;->q:Lpr3;

    .line 58
    .line 59
    const-string v3, "Response.success()"

    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    const/4 v8, 0x0

    .line 63
    const/4 v9, 0x0

    .line 64
    const/4 v10, 0x0

    .line 65
    const-wide/16 v11, 0x0

    .line 66
    .line 67
    const-wide/16 v13, 0x0

    .line 68
    .line 69
    const/4 v15, 0x0

    .line 70
    invoke-direct/range {v0 .. v16}, Lk14;-><init>(Loz3;Lpr3;Ljava/lang/String;ILjl1;Ltl1;Ln14;Lk14;Lk14;Lk14;JJLy10;Lgf1;)V

    .line 71
    .line 72
    .line 73
    move-object v1, v0

    .line 74
    move-object/from16 v0, p1

    .line 75
    .line 76
    invoke-static {v0, v1}, Lretrofit2/Response;->success(Ljava/lang/Object;Lk14;)Lretrofit2/Response;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    return-object v0

    .line 81
    :cond_0
    const-string v0, "code < 0: "

    .line 82
    .line 83
    invoke-static {v4, v0}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v0}, Lnz2;->f(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    return-object v3

    .line 91
    :cond_1
    move-object v3, v1

    .line 92
    const-string v0, "code < 200 or >= 300: "

    .line 93
    .line 94
    invoke-static {v4, v0}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v0}, Lkf2;->n(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-object v3
.end method

.method public static success(Ljava/lang/Object;)Lretrofit2/Response;
    .locals 17
    .param p0    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lretrofit2/Response<",
            "TT;>;"
        }
    .end annotation

    .line 117
    sget-object v7, Lxe5;->e:Lfv3;

    .line 118
    sget-object v16, Lgq1;->q:Lgq1;

    .line 119
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 120
    new-instance v1, Lnz3;

    invoke-direct {v1}, Lnz3;-><init>()V

    const-string v2, "http://localhost/"

    .line 121
    invoke-virtual {v1, v2}, Lnz3;->d(Ljava/lang/String;)V

    .line 122
    new-instance v2, Loz3;

    invoke-direct {v2, v1}, Loz3;-><init>(Lnz3;)V

    .line 123
    new-instance v6, Ltl1;

    const/4 v1, 0x0

    .line 124
    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 125
    invoke-direct {v6, v0}, Ltl1;-><init>([Ljava/lang/String;)V

    .line 126
    new-instance v0, Lk14;

    move-object v1, v2

    sget-object v2, Lpr3;->q:Lpr3;

    const-string v3, "OK"

    const/16 v4, 0xc8

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v0 .. v16}, Lk14;-><init>(Loz3;Lpr3;Ljava/lang/String;ILjl1;Ltl1;Ln14;Lk14;Lk14;Lk14;JJLy10;Lgf1;)V

    move-object v1, v0

    move-object/from16 v0, p0

    .line 127
    invoke-static {v0, v1}, Lretrofit2/Response;->success(Ljava/lang/Object;Lk14;)Lretrofit2/Response;

    move-result-object v0

    return-object v0
.end method

.method public static success(Ljava/lang/Object;Lk14;)Lretrofit2/Response;
    .locals 2
    .param p0    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lk14;",
            ")",
            "Lretrofit2/Response<",
            "TT;>;"
        }
    .end annotation

    .line 102
    const-string v0, "rawResponse == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 103
    iget-boolean v0, p1, Lk14;->C:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 104
    new-instance v0, Lretrofit2/Response;

    invoke-direct {v0, p1, p0, v1}, Lretrofit2/Response;-><init>(Lk14;Ljava/lang/Object;Ln14;)V

    return-object v0

    .line 105
    :cond_0
    const-string p0, "rawResponse must be successful response"

    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    return-object v1
.end method

.method public static success(Ljava/lang/Object;Ltl1;)Lretrofit2/Response;
    .locals 18
    .param p0    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ltl1;",
            ")",
            "Lretrofit2/Response<",
            "TT;>;"
        }
    .end annotation

    .line 106
    const-string v0, "headers == null"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 107
    sget-object v8, Lxe5;->e:Lfv3;

    .line 108
    sget-object v17, Lgq1;->q:Lgq1;

    .line 109
    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0x14

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 110
    invoke-virtual {v1}, Ltl1;->d()Lsl1;

    move-result-object v0

    .line 111
    new-instance v1, Lnz3;

    invoke-direct {v1}, Lnz3;-><init>()V

    const-string v2, "http://localhost/"

    .line 112
    invoke-virtual {v1, v2}, Lnz3;->d(Ljava/lang/String;)V

    .line 113
    new-instance v2, Loz3;

    invoke-direct {v2, v1}, Loz3;-><init>(Lnz3;)V

    .line 114
    invoke-virtual {v0}, Lsl1;->c()Ltl1;

    move-result-object v7

    .line 115
    new-instance v1, Lk14;

    sget-object v3, Lpr3;->q:Lpr3;

    const-string v4, "OK"

    const/16 v5, 0xc8

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v1 .. v17}, Lk14;-><init>(Loz3;Lpr3;Ljava/lang/String;ILjl1;Ltl1;Ln14;Lk14;Lk14;Lk14;JJLy10;Lgf1;)V

    move-object/from16 v0, p0

    .line 116
    invoke-static {v0, v1}, Lretrofit2/Response;->success(Ljava/lang/Object;Lk14;)Lretrofit2/Response;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public body()Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 1
    iget-object p0, p0, Lretrofit2/Response;->body:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public code()I
    .locals 0

    .line 1
    iget-object p0, p0, Lretrofit2/Response;->rawResponse:Lk14;

    .line 2
    .line 3
    iget p0, p0, Lk14;->q:I

    .line 4
    .line 5
    return p0
.end method

.method public errorBody()Ln14;
    .locals 0
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 1
    iget-object p0, p0, Lretrofit2/Response;->errorBody:Ln14;

    .line 2
    .line 3
    return-object p0
.end method

.method public headers()Ltl1;
    .locals 0

    .line 1
    iget-object p0, p0, Lretrofit2/Response;->rawResponse:Lk14;

    .line 2
    .line 3
    iget-object p0, p0, Lk14;->s:Ltl1;

    .line 4
    .line 5
    return-object p0
.end method

.method public isSuccessful()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lretrofit2/Response;->rawResponse:Lk14;

    .line 2
    .line 3
    iget-boolean p0, p0, Lk14;->C:Z

    .line 4
    .line 5
    return p0
.end method

.method public message()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lretrofit2/Response;->rawResponse:Lk14;

    .line 2
    .line 3
    iget-object p0, p0, Lk14;->p:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0
.end method

.method public raw()Lk14;
    .locals 0

    .line 1
    iget-object p0, p0, Lretrofit2/Response;->rawResponse:Lk14;

    .line 2
    .line 3
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lretrofit2/Response;->rawResponse:Lk14;

    .line 2
    .line 3
    invoke-virtual {p0}, Lk14;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
