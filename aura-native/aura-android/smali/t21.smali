.class public final Lt21;
.super Lbz4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Lbz4;

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Lnk1;

.field public final synthetic e:Lcom/google/gson/reflect/TypeToken;

.field public final synthetic f:Lu21;


# direct methods
.method public constructor <init>(Lu21;ZZLnk1;Lcom/google/gson/reflect/TypeToken;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt21;->f:Lu21;

    .line 5
    .line 6
    iput-boolean p2, p0, Lt21;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lt21;->c:Z

    .line 9
    .line 10
    iput-object p4, p0, Lt21;->d:Lnk1;

    .line 11
    .line 12
    iput-object p5, p0, Lt21;->e:Lcom/google/gson/reflect/TypeToken;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Ll32;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lt21;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ll32;->k0()V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v0, p0, Lt21;->a:Lbz4;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    iget-object v0, p0, Lt21;->f:Lu21;

    .line 16
    .line 17
    iget-object v1, p0, Lt21;->e:Lcom/google/gson/reflect/TypeToken;

    .line 18
    .line 19
    iget-object v2, p0, Lt21;->d:Lnk1;

    .line 20
    .line 21
    invoke-virtual {v2, v0, v1}, Lnk1;->h(Lcz4;Lcom/google/gson/reflect/TypeToken;)Lbz4;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lt21;->a:Lbz4;

    .line 26
    .line 27
    :goto_0
    invoke-virtual {v0, p1}, Lbz4;->a(Ll32;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public final b(Lq32;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lt21;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lq32;->F()Lq32;

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lt21;->a:Lbz4;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    iget-object v0, p0, Lt21;->f:Lu21;

    .line 15
    .line 16
    iget-object v1, p0, Lt21;->e:Lcom/google/gson/reflect/TypeToken;

    .line 17
    .line 18
    iget-object v2, p0, Lt21;->d:Lnk1;

    .line 19
    .line 20
    invoke-virtual {v2, v0, v1}, Lnk1;->h(Lcz4;Lcom/google/gson/reflect/TypeToken;)Lbz4;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lt21;->a:Lbz4;

    .line 25
    .line 26
    :goto_0
    invoke-virtual {v0, p1, p2}, Lbz4;->b(Lq32;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
