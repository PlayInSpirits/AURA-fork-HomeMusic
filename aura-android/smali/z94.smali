.class public final Lz94;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lq81;


# instance fields
.field public final n:Ly94;


# direct methods
.method public constructor <init>(Lrq3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz94;->n:Ly94;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lvd0;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lz94;->n:Ly94;

    .line 2
    .line 3
    invoke-interface {p0, p2, p1}, Ly94;->a(Lvd0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lxe0;->n:Lxe0;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lj15;->a:Lj15;

    .line 13
    .line 14
    return-object p0
.end method
