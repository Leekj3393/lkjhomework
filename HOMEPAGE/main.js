const select = (el, all = false) => {
    el = el.trim()
    if (all) {
      return [...document.querySelectorAll(el)]
    } else {
      return document.querySelector(el)
    }
  }
  const onscroll = (el, listener) => {
    el.addEventListener('scroll', listener)
  }

let skilsContent = select('.skills-content');
  if (skilsContent) {
    new Waypoint({
      element: skilsContent,
      offset: '80%',
      handler: function(direction) {
        let progress = select('.progress .progress-bar', true);
        progress.forEach((el) => {
          el.style.width = el.getAttribute('aria-valuenow') + '%'
        });
      }
    })
  }
  
  const docStyle = document.documentElement.style
  const aElem = document.querySelector('a')
  const boundingClientRect = aElem.getBoundingClientRect()
  
  aElem.onmousemove = function(e) {
  
    const x = e.clientX - boundingClientRect.left
    const y = e.clientY - boundingClientRect.top
    
    const xc = boundingClientRect.width/2
    const yc = boundingClientRect.height/2
    
    const dx = x - xc
    const dy = y - yc
    
    docStyle.setProperty('--rx', `${ dy/-1 }deg`)
    docStyle.setProperty('--ry', `${ dx/10 }deg`)
    
  }
  
  aElem.onmouseleave = function(e) {
    
    docStyle.setProperty('--ty', '0')
    docStyle.setProperty('--rx', '0')
    docStyle.setProperty('--ry', '0')
    
  }
  
  aElem.onmousedown = function(e) {
    
    docStyle.setProperty('--tz', '-25px')
    
  }
  
  document.body.onmouseup = function(e) {
    
    docStyle.setProperty('--tz', '-12px')
    
  }