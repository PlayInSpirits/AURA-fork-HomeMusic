.class public final Lk0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final n:Lu0;

.field public final o:Lic2;


# direct methods
.method public constructor <init>(Lu0;Lic2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk0;->n:Lu0;

    .line 5
    .line 6
    iput-object p2, p0, Lk0;->o:Lic2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lk0;->n:Lu0;

    .line 2
    .line 3
    iget-object v0, v0, Lu0;->n:Ljava/lang/Object;

    .line 4
    .line 5
    if-eq v0, p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lk0;->o:Lic2;

    .line 9
    .line 10
    invoke-static {v0}, Lu0;->h(Lic2;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Lu0;->s:Lg12;

    .line 15
    .line 16
    iget-object v2, p0, Lk0;->n:Lu0;

    .line 17
    .line 18
    invoke-virtual {v1, v2, p0, v0}, Lg12;->h(Lu0;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object p0, p0, Lk0;->n:Lu0;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-static {p0, v0}, Lu0;->d(Lu0;Z)V

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    return-void
.end method
