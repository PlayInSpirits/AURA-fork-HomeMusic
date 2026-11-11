.class public final synthetic Lh51;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Landroid/content/Context;

.field public final synthetic o:Lgn2;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Lcom/eddyizm/tempus/subsonic/models/Child;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Ljava/lang/String;

.field public final synthetic t:Lnt0;

.field public final synthetic u:Z


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lgn2;Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/Child;Ljava/lang/String;Ljava/lang/String;Lnt0;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh51;->n:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lh51;->o:Lgn2;

    .line 7
    .line 8
    iput-object p3, p0, Lh51;->p:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lh51;->q:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 11
    .line 12
    iput-object p5, p0, Lh51;->r:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lh51;->s:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Lh51;->t:Lnt0;

    .line 17
    .line 18
    iput-boolean p8, p0, Lh51;->u:Z

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-object v0, p0, Lh51;->n:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lh51;->o:Lgn2;

    .line 4
    .line 5
    iget-object v2, p0, Lh51;->p:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lh51;->q:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 8
    .line 9
    iget-object v4, p0, Lh51;->r:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lh51;->s:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, p0, Lh51;->t:Lnt0;

    .line 14
    .line 15
    iget-boolean v7, p0, Lh51;->u:Z

    .line 16
    .line 17
    sget-object p0, Li51;->b:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 18
    .line 19
    :try_start_0
    invoke-static/range {v0 .. v7}, Li51;->f(Landroid/content/Context;Lgn2;Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/Child;Ljava/lang/String;Ljava/lang/String;Lnt0;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p0, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    throw v0
.end method
