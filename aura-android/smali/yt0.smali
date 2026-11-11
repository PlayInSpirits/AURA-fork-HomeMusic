.class public final synthetic Lyt0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ljava/util/LinkedHashMap;

.field public final synthetic o:Landroid/content/Context;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Z

.field public final synthetic s:Landroid/os/Handler;

.field public final synthetic t:Ljava/util/function/IntConsumer;


# direct methods
.method public synthetic constructor <init>(Ljava/util/LinkedHashMap;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLandroid/os/Handler;Ljava/util/function/IntConsumer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyt0;->n:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    iput-object p2, p0, Lyt0;->o:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lyt0;->p:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lyt0;->q:Ljava/lang/String;

    .line 11
    .line 12
    iput-boolean p5, p0, Lyt0;->r:Z

    .line 13
    .line 14
    iput-object p6, p0, Lyt0;->s:Landroid/os/Handler;

    .line 15
    .line 16
    iput-object p7, p0, Lyt0;->t:Ljava/util/function/IntConsumer;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    invoke-static {}, Lg51;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lyt0;->n:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lc7;

    .line 15
    .line 16
    const/16 v2, 0x9

    .line 17
    .line 18
    invoke-direct {v1, v2}, Lc7;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/util/List;

    .line 34
    .line 35
    new-instance v1, Lzt0;

    .line 36
    .line 37
    iget-object v2, p0, Lyt0;->o:Landroid/content/Context;

    .line 38
    .line 39
    iget-object v3, p0, Lyt0;->p:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v4, p0, Lyt0;->q:Ljava/lang/String;

    .line 42
    .line 43
    iget-boolean v5, p0, Lyt0;->r:Z

    .line 44
    .line 45
    invoke-direct {v1, v2, v3, v4, v5}, Lzt0;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0, v1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 49
    .line 50
    .line 51
    new-instance v1, Lk6;

    .line 52
    .line 53
    const/16 v2, 0x17

    .line 54
    .line 55
    iget-object v3, p0, Lyt0;->t:Ljava/util/function/IntConsumer;

    .line 56
    .line 57
    invoke-direct {v1, v2, v3, v0}, Lk6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p0, p0, Lyt0;->s:Landroid/os/Handler;

    .line 61
    .line 62
    invoke-virtual {p0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 63
    .line 64
    .line 65
    return-void
.end method
