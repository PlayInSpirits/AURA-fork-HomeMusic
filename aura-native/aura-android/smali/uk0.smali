.class public final Luk0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ly71;


# instance fields
.field public a:Lui0;

.field public final b:Lsq0;


# direct methods
.method public constructor <init>(Lui0;)V
    .locals 1

    .line 1
    sget-object v0, Lv64;->b:Lsq0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Luk0;->a:Lui0;

    .line 7
    .line 8
    iput-object v0, p0, Luk0;->b:Lsq0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lc74;FLvd0;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Ltk0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p2, p0, p1, v1}, Ltk0;-><init>(FLuk0;Lc74;Lvd0;)V

    .line 5
    .line 6
    .line 7
    check-cast p3, Lwd0;

    .line 8
    .line 9
    iget-object p0, p0, Luk0;->b:Lsq0;

    .line 10
    .line 11
    invoke-static {p0, v0, p3}, Lfu;->P(Lne0;Lwf1;Lwd0;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
