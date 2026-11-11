.class public final Lok1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Lu21;

.field public final b:I

.field public final c:I

.field public final d:Ljava/util/HashMap;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public final g:I

.field public final h:I

.field public final i:Z

.field public j:Z

.field public final k:Z

.field public final l:I

.field public final m:I

.field public final n:Ljava/util/LinkedList;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lu21;->p:Lu21;

    .line 5
    .line 6
    iput-object v0, p0, Lok1;->a:Lu21;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput v0, p0, Lok1;->b:I

    .line 10
    .line 11
    iput v0, p0, Lok1;->c:I

    .line 12
    .line 13
    new-instance v1, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lok1;->d:Ljava/util/HashMap;

    .line 19
    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Lok1;->e:Ljava/util/ArrayList;

    .line 26
    .line 27
    new-instance v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lok1;->f:Ljava/util/ArrayList;

    .line 33
    .line 34
    const/4 v1, 0x2

    .line 35
    iput v1, p0, Lok1;->g:I

    .line 36
    .line 37
    iput v1, p0, Lok1;->h:I

    .line 38
    .line 39
    iput-boolean v0, p0, Lok1;->i:Z

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    iput-boolean v2, p0, Lok1;->j:Z

    .line 43
    .line 44
    iput-boolean v0, p0, Lok1;->k:Z

    .line 45
    .line 46
    iput v0, p0, Lok1;->l:I

    .line 47
    .line 48
    iput v1, p0, Lok1;->m:I

    .line 49
    .line 50
    new-instance v0, Ljava/util/LinkedList;

    .line 51
    .line 52
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lok1;->n:Ljava/util/LinkedList;

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;Lg32;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    new-instance v2, Lux4;

    .line 19
    .line 20
    invoke-direct {v2, p2, v0, v1}, Lux4;-><init>(Lg32;Lcom/google/gson/reflect/TypeToken;Z)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Lok1;->e:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    instance-of v0, p2, Lbz4;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-static {p1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p2, Lbz4;

    .line 37
    .line 38
    sget-object v0, Lhz4;->a:Ldz4;

    .line 39
    .line 40
    new-instance v0, Ldz4;

    .line 41
    .line 42
    const/4 v1, 0x2

    .line 43
    invoke-direct {v0, p1, p2, v1}, Ldz4;-><init>(Ljava/lang/Object;Lbz4;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    :cond_1
    return-void
.end method
