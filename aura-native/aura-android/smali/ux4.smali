.class public final Lux4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcz4;


# instance fields
.field public final n:Lcom/google/gson/reflect/TypeToken;

.field public final o:Z

.field public final p:Lg32;


# direct methods
.method public constructor <init>(Lg32;Lcom/google/gson/reflect/TypeToken;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lux4;->p:Lg32;

    .line 5
    .line 6
    iput-object p2, p0, Lux4;->n:Lcom/google/gson/reflect/TypeToken;

    .line 7
    .line 8
    iput-boolean p3, p0, Lux4;->o:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lnk1;Lcom/google/gson/reflect/TypeToken;)Lbz4;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lux4;->n:Lcom/google/gson/reflect/TypeToken;

    .line 3
    .line 4
    if-eqz v1, :cond_2

    .line 5
    .line 6
    invoke-virtual {v1, p2}, Lcom/google/gson/reflect/TypeToken;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-nez v2, :cond_1

    .line 11
    .line 12
    iget-boolean v2, p0, Lux4;->o:Z

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-ne v1, v2, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-object v0

    .line 28
    :cond_1
    :goto_0
    new-instance v3, Lvx4;

    .line 29
    .line 30
    iget-object v4, p0, Lux4;->p:Lg32;

    .line 31
    .line 32
    const/4 v8, 0x1

    .line 33
    move-object v7, p0

    .line 34
    move-object v5, p1

    .line 35
    move-object v6, p2

    .line 36
    invoke-direct/range {v3 .. v8}, Lvx4;-><init>(Lg32;Lnk1;Lcom/google/gson/reflect/TypeToken;Lux4;Z)V

    .line 37
    .line 38
    .line 39
    return-object v3

    .line 40
    :cond_2
    move-object v6, p2

    .line 41
    invoke-virtual {v6}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    throw v0
.end method
