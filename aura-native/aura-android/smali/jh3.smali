.class public final synthetic Ljh3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:Z

.field public final synthetic o:Z

.field public final synthetic p:Z

.field public final synthetic q:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ZZZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Ljh3;->n:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Ljh3;->o:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Ljh3;->p:Z

    .line 9
    .line 10
    iput-object p4, p0, Ljh3;->q:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getRejected()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    iget-boolean v0, p0, Ljh3;->n:Z

    .line 13
    .line 14
    iget-boolean v1, p0, Ljh3;->o:Z

    .line 15
    .line 16
    iget-boolean v2, p0, Ljh3;->p:Z

    .line 17
    .line 18
    invoke-virtual {p1, v0, v1, v2}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->supported(ZZZ)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getAccount()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getAccount()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p0, p0, Ljh3;->q:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {p1, p0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    :cond_0
    const/4 p0, 0x1

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 p0, 0x0

    .line 45
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method
