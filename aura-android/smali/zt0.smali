.class public final synthetic Lzt0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzt0;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lzt0;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lzt0;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-boolean p4, p0, Lzt0;->d:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lzt0;->d:Z

    .line 2
    .line 3
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 4
    .line 5
    iget-object v1, p0, Lzt0;->a:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v2, p0, Lzt0;->b:Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Lzt0;->c:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v1, p1, v2, p0, v0}, Li51;->b(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
