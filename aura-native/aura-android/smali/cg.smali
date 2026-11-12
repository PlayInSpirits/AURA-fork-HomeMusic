.class public final synthetic Lcg;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lh42;


# instance fields
.field public final synthetic n:Ldg;


# direct methods
.method public synthetic constructor <init>(Ldg;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcg;->n:Ldg;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcg;->n:Ldg;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldg;->g(Landroid/view/KeyEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
