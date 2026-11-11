.class public final Ljm4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lci0;


# instance fields
.field public final n:Llx;

.field public o:Lii0;

.field public p:Ljava/lang/String;


# direct methods
.method public constructor <init>(Llx;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljm4;->n:Llx;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Lii0;)J
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ljm4;->n:Llx;

    .line 5
    .line 6
    iget-object v1, v0, Llx;->r:Lpx;

    .line 7
    .line 8
    invoke-interface {v1, p1}, Lpx;->d(Lii0;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iput-object v1, p0, Ljm4;->p:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Llx;->b(Lii0;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iput-object p1, p0, Ljm4;->o:Lii0;

    .line 19
    .line 20
    return-wide v0
.end method

.method public final c(Lrw4;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ljm4;->n:Llx;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Llx;->c(Lrw4;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final close()V
    .locals 6

    .line 1
    iget-object v0, p0, Ljm4;->n:Llx;

    .line 2
    .line 3
    iget-object v1, v0, Llx;->n:Lse4;

    .line 4
    .line 5
    invoke-virtual {v0}, Llx;->close()V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Ljm4;->o:Lii0;

    .line 9
    .line 10
    if-eqz v2, :cond_2

    .line 11
    .line 12
    iget-object p0, p0, Ljm4;->p:Ljava/lang/String;

    .line 13
    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    iget-object p0, v0, Llx;->r:Lpx;

    .line 17
    .line 18
    invoke-interface {p0, v2}, Lpx;->d(Lii0;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {v1, p0}, Lse4;->i(Ljava/lang/String;)Lyj0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lnd0;->a(Lnd0;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    const-wide/16 v4, -0x1

    .line 34
    .line 35
    cmp-long v0, v2, v4

    .line 36
    .line 37
    const-string v2, "StreamingCacheDataSource"

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    const-string v0, "Removing partial cache for "

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p0}, Lse4;->m(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v1, "Key "

    .line 57
    .line 58
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string p0, " has been fully cached"

    .line 65
    .line 66
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {v2, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    :cond_2
    return-void
.end method

.method public final m()Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, Ljm4;->n:Llx;

    .line 2
    .line 3
    iget-object p0, p0, Llx;->v:Landroid/net/Uri;

    .line 4
    .line 5
    return-object p0
.end method

.method public final read([BII)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ljm4;->n:Llx;

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, p3}, Llx;->read([BII)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method
