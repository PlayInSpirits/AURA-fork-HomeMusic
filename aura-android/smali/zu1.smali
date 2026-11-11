.class public final Lzu1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lsh0;


# instance fields
.field public final n:Lo83;

.field public final o:Ljava/lang/String;

.field public p:Lbv3;

.field public q:Lk14;


# direct methods
.method public constructor <init>(Lo83;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzu1;->n:Lo83;

    .line 5
    .line 6
    iput-object p2, p0, Lzu1;->o:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 0

    .line 1
    const-class p0, Ljava/io/InputStream;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()V
    .locals 0

    .line 1
    iget-object p0, p0, Lzu1;->q:Lk14;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lk14;->close()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final cancel()V
    .locals 0

    .line 1
    iget-object p0, p0, Lzu1;->p:Lbv3;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lbv3;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final d(Leq3;Lrh0;)V
    .locals 3

    .line 1
    const-string p1, "Request failed with status code: "

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lzu1;->n:Lo83;

    .line 4
    .line 5
    new-instance v1, Lnz3;

    .line 6
    .line 7
    invoke-direct {v1}, Lnz3;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, Lzu1;->o:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Lnz3;->d(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Loz3;

    .line 16
    .line 17
    invoke-direct {v2, v1}, Loz3;-><init>(Lnz3;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v1, Lbv3;

    .line 24
    .line 25
    invoke-direct {v1, v0, v2}, Lbv3;-><init>(Lo83;Loz3;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lzu1;->p:Lbv3;

    .line 29
    .line 30
    invoke-virtual {v1}, Lbv3;->c()Lk14;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lzu1;->q:Lk14;

    .line 35
    .line 36
    iget-boolean v1, v0, Lk14;->C:Z

    .line 37
    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    new-instance v0, Ljava/io/IOException;

    .line 41
    .line 42
    new-instance v1, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, Lzu1;->q:Lk14;

    .line 48
    .line 49
    iget p0, p0, Lk14;->q:I

    .line 50
    .line 51
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p2, v0}, Lrh0;->b(Ljava/lang/Exception;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :catch_0
    move-exception p0

    .line 66
    goto :goto_0

    .line 67
    :catch_1
    move-exception p0

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    iget-object p0, v0, Lk14;->t:Ln14;

    .line 70
    .line 71
    if-nez p0, :cond_1

    .line 72
    .line 73
    new-instance p0, Ljava/io/IOException;

    .line 74
    .line 75
    const-string p1, "Image response has no body"

    .line 76
    .line 77
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-interface {p2, p0}, Lrh0;->b(Ljava/lang/Exception;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_1
    invoke-virtual {p0}, Ln14;->byteStream()Ljava/io/InputStream;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-interface {p2, p0}, Lrh0;->f(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :goto_0
    invoke-interface {p2, p0}, Lrh0;->b(Ljava/lang/Exception;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final e()I
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    return p0
.end method
