.class public final Lvx4;
.super Lja4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Lg32;

.field public final b:Lnk1;

.field public final c:Lcom/google/gson/reflect/TypeToken;

.field public final d:Lcz4;

.field public final e:Lsi1;

.field public final f:Z

.field public volatile g:Lbz4;


# direct methods
.method public constructor <init>(Lg32;Lnk1;Lcom/google/gson/reflect/TypeToken;Lux4;Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lsi1;

    .line 5
    .line 6
    const/16 v1, 0x1d

    .line 7
    .line 8
    invoke-direct {v0, v1, p0}, Lsi1;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lvx4;->e:Lsi1;

    .line 12
    .line 13
    iput-object p1, p0, Lvx4;->a:Lg32;

    .line 14
    .line 15
    iput-object p2, p0, Lvx4;->b:Lnk1;

    .line 16
    .line 17
    iput-object p3, p0, Lvx4;->c:Lcom/google/gson/reflect/TypeToken;

    .line 18
    .line 19
    iput-object p4, p0, Lvx4;->d:Lcz4;

    .line 20
    .line 21
    iput-boolean p5, p0, Lvx4;->f:Z

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(Ll32;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lvx4;->a:Lg32;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lvx4;->g:Lbz4;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lvx4;->b:Lnk1;

    .line 11
    .line 12
    iget-object v1, p0, Lvx4;->d:Lcz4;

    .line 13
    .line 14
    iget-object v2, p0, Lvx4;->c:Lcom/google/gson/reflect/TypeToken;

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Lnk1;->h(Lcz4;Lcom/google/gson/reflect/TypeToken;)Lbz4;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lvx4;->g:Lbz4;

    .line 21
    .line 22
    :goto_0
    invoke-virtual {v0, p1}, Lbz4;->a(Ll32;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_1
    invoke-static {p1}, Lfh0;->q(Ll32;)Lh32;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-boolean v1, p0, Lvx4;->f:Z

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    instance-of v1, p1, Li32;

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    return-object p0

    .line 44
    :cond_2
    iget-object v1, p0, Lvx4;->c:Lcom/google/gson/reflect/TypeToken;

    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object p0, p0, Lvx4;->e:Lsi1;

    .line 51
    .line 52
    invoke-interface {v0, p1, v1, p0}, Lg32;->a(Lh32;Ljava/lang/reflect/Type;Lsi1;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method

.method public final b(Lq32;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lvx4;->g:Lbz4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lvx4;->b:Lnk1;

    .line 7
    .line 8
    iget-object v1, p0, Lvx4;->d:Lcz4;

    .line 9
    .line 10
    iget-object v2, p0, Lvx4;->c:Lcom/google/gson/reflect/TypeToken;

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Lnk1;->h(Lcz4;Lcom/google/gson/reflect/TypeToken;)Lbz4;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lvx4;->g:Lbz4;

    .line 17
    .line 18
    :goto_0
    invoke-virtual {v0, p1, p2}, Lbz4;->b(Lq32;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final c()Lbz4;
    .locals 3

    .line 1
    iget-object v0, p0, Lvx4;->g:Lbz4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lvx4;->b:Lnk1;

    .line 7
    .line 8
    iget-object v1, p0, Lvx4;->d:Lcz4;

    .line 9
    .line 10
    iget-object v2, p0, Lvx4;->c:Lcom/google/gson/reflect/TypeToken;

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Lnk1;->h(Lcz4;Lcom/google/gson/reflect/TypeToken;)Lbz4;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lvx4;->g:Lbz4;

    .line 17
    .line 18
    return-object v0
.end method
